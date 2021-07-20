package com.example.quakereport;

public class Quakesinfo{
    private final double mMag;
    private final String mName;
   // private final String mDate;
    private final long mDate;
    /*Quakesinfo(double mag,String name,String date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }*/
    Quakesinfo(double mag,String name,long date)
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
    /*public String getDate()
    {
        return mDate;
    }
    */
    public long getDate()
    {
        return mDate;
    }
}
