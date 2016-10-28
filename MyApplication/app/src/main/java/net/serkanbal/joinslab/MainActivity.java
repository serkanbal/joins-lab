package net.serkanbal.joinslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseOpenHelper databaseOpenHelper = DatabaseOpenHelper.getInstance(MainActivity.this);

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
    }



}
