package net.serkanbal.joinslab;

/**
 * Created by Serkan on 28/10/16.
 */

public class EmployeeObject {
    private String mFirstName, mLastName, mCity;
    private int mYearOfBirth, mSSN;

    public EmployeeObject(int SSN, String firstName, String lastName, int yearOfBirth, String city ) {
        mFirstName = firstName;
        mLastName = lastName;
        mCity = city;
        mYearOfBirth = yearOfBirth;
        mSSN = SSN;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getCity() {
        return mCity;
    }

    public int getYearOfBirth() {
        return mYearOfBirth;
    }

    public int getSSN() {
        return mSSN;
    }
}
