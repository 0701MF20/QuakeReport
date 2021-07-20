package com.example.quakereport;

public class Quakesinfo{
    private final Double mMag;
    private final String mName;
   // private final String mDate;
   private final Long mDate;
    /*Quakesinfo(double mag,String name,String date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }*/
    Quakesinfo(Double mag,String name,Long date)
    {
        mMag=mag;
        mName=name;
        mDate=date;
    }
    public Double getMag()
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
