package com.example.assemalturifi.exercisecontentproviders.table_activity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.assemalturifi.exercisecontentproviders.R;
import com.example.assemalturifi.exercisecontentproviders.model.Employee;

import java.util.List;

//step28
public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {


    //step29
    List<Employee> employees;

    //step30
    public EmployeeAdapter( List<Employee> employees ){
        this.employees = employees;
    }

    //step35
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.employee_adapter_item, viewGroup, false );
        return new ViewHolder(v);
    }

    //step36
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Employee e = employees.get(i);

        viewHolder.tvId.setText( e.getId( ) );
        viewHolder.tvFirstName.setText( e.getFirstName() );
        viewHolder.tvLastName.setText( e.getLastName() );
        viewHolder.tvSalary.setText( e.getSalary() );
        viewHolder.tvDaysOnJob.setText( e.getDaysEmplyed() );
    }

    //step37
    @Override
    public int getItemCount() {
        return employees.size();
    }

    //step32
    public class ViewHolder extends RecyclerView.ViewHolder {

        //step33
        TextView tvId;
        TextView tvFirstName;
        TextView tvLastName;
        TextView tvSalary;
        TextView tvDaysOnJob;

        //step34
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById( R.id.tvId );
            tvFirstName = itemView.findViewById( R.id.tvFirstName );
            tvLastName = itemView.findViewById( R.id.tvLastName );
            tvSalary = itemView.findViewById( R.id.tvSalary );
            tvDaysOnJob = itemView.findViewById( R.id.tvDaysOnJob );
        }

    }
}