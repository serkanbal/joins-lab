package net.serkanbal.joinslab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private JoinsAdapter mAdapter;
    private Button mButton1, mButton2, mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mButton1 = (Button) findViewById(R.id.buttonsamecompany);
        mButton2 = (Button) findViewById(R.id.buttonboston);
        mButton3 = (Button) findViewById(R.id.buttonsalary);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));

        final DatabaseOpenHelper databaseOpenHelper = DatabaseOpenHelper.getInstance(MainActivity.this);

        EmployeeObject e1 = new EmployeeObject(123045678, "John", "Smith", 1973, "NY");
        EmployeeObject e2 = new EmployeeObject(123045679, "David", "McWill", 1982, "Seattle");
        EmployeeObject e3 = new EmployeeObject(123045680, "Katerina", "Wise", 1973, "Boston");
        EmployeeObject e4 = new EmployeeObject(123045681, "Donald", "Lee", 1992, "London");
        EmployeeObject e5 = new EmployeeObject(123045682, "Gary", "Henwood", 1987, "Las Vegas");
        EmployeeObject e6 = new EmployeeObject(123045683, "Anthony", "Bright", 1963, "Seattle");
        EmployeeObject e7 = new EmployeeObject(123045684, "William", "Newey", 1995, "Boston");
        EmployeeObject e8 = new EmployeeObject(123045685, "Melony", "Smith", 1970, "Chicago");

        JobObject j1 = new JobObject(123045678, "Fuzz", 60, 1);
        JobObject j2 = new JobObject(123045679, "GA", 70, 2);
        JobObject j3 = new JobObject(123045680, "Little Place", 120, 5);
        JobObject j4 = new JobObject(123045681, "Macy's", 78, 3);
        JobObject j5 = new JobObject(123045682, "New Life", 65, 1);
        JobObject j6 = new JobObject(123045683, "Believe", 158, 6);
        JobObject j7 = new JobObject(123045684, "Macy's", 200, 8);
        JobObject j8 = new JobObject(123045685, "Stop", 299, 12);

        databaseOpenHelper.insertEmployee(e1);
        databaseOpenHelper.insertEmployee(e2);
        databaseOpenHelper.insertEmployee(e3);
        databaseOpenHelper.insertEmployee(e4);
        databaseOpenHelper.insertEmployee(e5);
        databaseOpenHelper.insertEmployee(e6);
        databaseOpenHelper.insertEmployee(e7);
        databaseOpenHelper.insertEmployee(e8);

        databaseOpenHelper.insertJob(j1);
        databaseOpenHelper.insertJob(j2);
        databaseOpenHelper.insertJob(j3);
        databaseOpenHelper.insertJob(j4);
        databaseOpenHelper.insertJob(j5);
        databaseOpenHelper.insertJob(j6);
        databaseOpenHelper.insertJob(j7);
        databaseOpenHelper.insertJob(j8);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> sameCompany = databaseOpenHelper.getSameCompany();
                mAdapter = new JoinsAdapter(sameCompany);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> bostonCompany = databaseOpenHelper.getBostonCompanies();
                mAdapter = new JoinsAdapter(bostonCompany);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> highestSalary = databaseOpenHelper.getHighestSalary();
                mAdapter = new JoinsAdapter(highestSalary);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }
        });

    }

}
