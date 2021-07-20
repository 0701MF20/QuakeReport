package com.example.quakereport;

public class Quakesinfo{
    private double mMag;
    private String mName;
    private String mDate;
    Quakesinfo(double mag,String name,String date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }
    public double getMag()
    {
        return mMag;
    }
    public String getName()
    {
        return mName;
    }
    public String getDate()
    {
        return mDate;
    }
}
