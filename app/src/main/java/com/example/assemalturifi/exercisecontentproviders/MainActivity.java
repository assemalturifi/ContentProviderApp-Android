package com.example.assemalturifi.exercisecontentproviders;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.assemalturifi.exercisecontentproviders.table_activity.TableActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstName;
    private EditText etLastName;
    private EditText etSalary;
    private EditText etDaysEmployed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2
        bindViews();

    }
    //step2
    public void bindViews(){
        etFirstName = findViewById( R.id.etFirstName );
        etLastName = findViewById( R.id.etLastName );
        etSalary = findViewById( R.id.etSalary );
        etDaysEmployed = findViewById( R.id.etDaysEmployed );

    }

    //step3
    public void onClear(View view) {
        etFirstName.setText("");
        etLastName.setText("");
        etSalary.setText("");
        etDaysEmployed.setText("");
    }

    //step25
    public void onAdd(View view) {
        ContentValues values = new ContentValues();

        values.put( EmployeesProvider.FIRST_NAME, etFirstName.getText().toString() );
        values.put( EmployeesProvider.LAST_NAME, etLastName.getText().toString() );
        values.put( EmployeesProvider.SALARY, etSalary.getText().toString() );
        values.put( EmployeesProvider.DAYS_ON_JOB, etDaysEmployed.getText().toString() );

        Uri uri = getContentResolver().insert(
                EmployeesProvider.CONTENT_URI, values);

        Toast.makeText(getBaseContext(),
                "added", Toast.LENGTH_LONG).show();
    }

    public void onSeeResults(View view) {
        Intent intent = new Intent(getApplicationContext(), TableActivity.class);
        startActivity( intent );
    }
}
