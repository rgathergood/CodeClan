package com.example.rgathergood.sqlite3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActivity extends AppCompatActivity {

    DatabaseManager mDatabase;

    List<Employee> employeeList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        mDatabase = new DatabaseManager(this);

        employeeList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listViewEmployees);

        loadEmployeesFromDatabase();
    }

    private void loadEmployeesFromDatabase() {
        Cursor cursor = mDatabase.getAllEmployees();

        if (cursor.moveToFirst()) {
            do {
                employeeList.add(new Employee(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getDouble(4)

                ));

            } while (cursor.moveToNext());

            EmployeeAdapter adapter = new EmployeeAdapter(this, R.layout.list_layout_employees, employeeList, mDatabase);
            listView.setAdapter(adapter);
        }
    }
}
