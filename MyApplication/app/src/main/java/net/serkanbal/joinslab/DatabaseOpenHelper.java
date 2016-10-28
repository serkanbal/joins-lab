package net.serkanbal.joinslab;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Serkan on 28/10/16.
 */

public class DatabaseOpenHelper extends SQLiteOpenHelper {
    public static final String EMPLOYEE_TABLE_NAME = "Employee";
    public static final String COL_SSN = "SSN";
    public static final String COL_FIRST_NAME = "First";
    public static final String COL_LAST_NAME = "Last";
    public static final String COL_YEAR_OF_BIRTH = "year of birth";
    public static final String COL_CITY = "city";

    public static final String CREATE_EMPLOYEE_TABLE = "CREATE TABLE " +
            EMPLOYEE_TABLE_NAME + " (" +
            COL_SSN + " INTEGER PRIMARY KEY," +
            COL_FIRST_NAME + " TEXT," +
            COL_LAST_NAME + " TEXT," +
            COL_YEAR_OF_BIRTH + " INT," +
            COL_CITY + " TEXT)";

    public static final String DROP_EMPLOYEE = "DROP TABLE IF EXISTS " + EMPLOYEE_TABLE_NAME;

    public static final String JOB_TABLE_NAME = "Job";
    public static final String COL_SSN_JOB = "SSN";
    public static final String COL_COMPANY = "Company";
    public static final String COL_SALARY = "Salary";
    public static final String COL_EXPERIENCE = "Experience";

    public static final String CREATE_JOB_TABLE = "CREATE TABLE " +
            JOB_TABLE_NAME + " (" +
            COL_SSN_JOB + " INTEGER PRIMARY KEY," +
            COL_COMPANY + " TEXT," +
            COL_SALARY + "INT," +
            COL_EXPERIENCE + "INT)";

    public static final String DROP_JOB = "DROP TABLE IF EXISTS " + JOB_TABLE_NAME;

    private DatabaseOpenHelper(Context context) {
        super(context, "db", null, 1);

    }

    private static DatabaseOpenHelper sIntance;

    public static DatabaseOpenHelper getInstance(Context context) {
        if (sIntance == null) {
            sIntance = new DatabaseOpenHelper(context.getApplicationContext());
        }
    return sIntance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_EMPLOYEE_TABLE);
        sqLiteDatabase.execSQL(CREATE_JOB_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_EMPLOYEE);
        sqLiteDatabase.execSQL(DROP_JOB);
        onCreate(sqLiteDatabase);
    }

    public void insertEmployee(EmployeeObject employeeObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_SSN, employeeObject.getSSN());
        values.put(COL_FIRST_NAME, employeeObject.getFirstName());
        values.put(COL_LAST_NAME, employeeObject.getLastName());
        values.put(COL_YEAR_OF_BIRTH, employeeObject.getYearOfBirth());
        values.put(COL_CITY, employeeObject.getCity());
        db.insertOrThrow(EMPLOYEE_TABLE_NAME, null, values);
    }

    public void insertJob(JobObject jobObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_SSN_JOB, jobObject.getSSNJob());
        values.put(COL_COMPANY, jobObject.getCompany());
        values.put(COL_SALARY, jobObject.getSalary());
        values.put(COL_EXPERIENCE, jobObject.getExperience());
        db.insertOrThrow(JOB_TABLE_NAME, null, values);
    }
}
