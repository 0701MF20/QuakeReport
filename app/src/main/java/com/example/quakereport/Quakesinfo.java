package com.example.quakereport;

public class Quakesinfo{
    private float mMag;
    private String mName;
    private String mDate;
    Quakesinfo(float mag,String name,String date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }
    public float getMag()
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
