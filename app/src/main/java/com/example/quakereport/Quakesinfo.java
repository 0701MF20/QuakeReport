package com.example.quakereport;

public class Quakesinfo{
    private final double mMag;
    private final String mName;
    private final String mDate;
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
