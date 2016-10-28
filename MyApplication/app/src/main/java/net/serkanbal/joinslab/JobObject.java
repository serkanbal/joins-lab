package net.serkanbal.joinslab;

/**
 * Created by Serkan on 28/10/16.
 */

public class JobObject {
    private String mCompany;
    private int mSalary, mExperience, mSSNJob;

    public JobObject(int SSNJob, String company, int salary, int experience ) {
        mCompany = company;
        mSalary = salary;
        mExperience = experience;
        mSSNJob = SSNJob;
    }

    public String getCompany() {
        return mCompany;
    }

    public int getSalary() {
        return mSalary;
    }

    public int getExperience() {
        return mExperience;
    }

    public int getSSNJob() {
        return mSSNJob;
    }
}
