package com.example.assemalturifi.exercisecontentproviders.table_activity;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.assemalturifi.exercisecontentproviders.EmployeesProvider;
import com.example.assemalturifi.exercisecontentproviders.R;
import com.example.assemalturifi.exercisecontentproviders.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        //step38
        RecyclerView rvEmployees = findViewById( R.id.rvEmployees );


        //step40
        EmployeeAdapter adapter = new EmployeeAdapter( retrieveEmployees() );
        rvEmployees.setLayoutManager( new LinearLayoutManager(this));
        rvEmployees.setAdapter(adapter);
    }

    //step39
    public List<Employee> retrieveEmployees(){
        String URL = "content://com.example.assemalturifi.exercisecontentproviders.EmployeesProvider/employees";

        Uri u= Uri.parse(URL);
        Cursor c = getContentResolver().query(u, null, null, null, EmployeesProvider.LAST_NAME);

        ArrayList<Employee> employees = new ArrayList<>();

        if ( c!=null && c.moveToFirst()) {
            do{
                employees.add( new Employee(
                        c.getString( c.getColumnIndex( EmployeesProvider._ID ) ),
                        c.getString( c.getColumnIndex( EmployeesProvider.FIRST_NAME ) ),
                        c.getString( c.getColumnIndex( EmployeesProvider.LAST_NAME ) ),
                        c.getString( c.getColumnIndex( EmployeesProvider.SALARY ) ),
                        c.getString( c.getColumnIndex( EmployeesProvider.DAYS_ON_JOB ) )
                ) );
            } while (c.moveToNext());

            c.close();
        }

        return employees;
    }



}