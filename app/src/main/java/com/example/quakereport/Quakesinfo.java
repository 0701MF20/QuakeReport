package com.example.quakereport;

public class Quakesinfo{
    private double mMag;
    private String mName;
   // private final String mDate;
    private long mDate;
    private String mUrl;
    /*Quakesinfo(double mag,String name,String date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }*/
    Quakesinfo(double mag,String name,long date,String urll)
    {
        mMag=mag;
        mName=name;
        mDate=date;
        mUrl=urll;
    }
    public String getUrl()
    {
        return mUrl;
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
