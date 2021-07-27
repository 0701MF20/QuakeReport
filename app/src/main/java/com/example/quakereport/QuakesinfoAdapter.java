package com.example.quakereport;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class QuakesinfoAdapter extends ArrayAdapter<Quakesinfo> {
    QuakesinfoAdapter(Activity context,ArrayList<Quakesinfo> quake)
    {
        super(context,0,quake);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listview=convertView;
        if(listview==null)
        {
            listview=LayoutInflater.from(getContext()).inflate(R.layout.simple_item_layout,parent,false);
        }
        Quakesinfo adapter=getItem(position);
        TextView t1=(TextView)listview.findViewById(R.id.mag_id);
        //Decimal-Format(Concrete class) is extendition of Number-Format(Abstract class)
        DecimalFormat formatter=new DecimalFormat("0.0");
        String output=formatter.format(adapter.getMag());
        t1.setText(output);
//Gradient dREAWABLE for graphics which is circle
        GradientDrawable magnitudecircle=(GradientDrawable)t1.getBackground();
        //floor is math class function
        int magg=(int)Math.floor(adapter.getMag());
        int color;
        switch(magg)
        {
            case 0:
            case 1:
                //in order to convvert the reference id of color to integer number for color
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color1);
                break;
            case 2:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color2);
                break;
            case 3:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color3);
                break;
            case 4:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color4);
                break;
            case 5:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color5);
                break;
            case 6:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color6);
                break;
            case 7:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color7);
                break;
            case 8:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color8);
                break;
            case 9:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color9);
                break;
            default:
                color=ContextCompat.getColor(getContext(),R.color.magnitude_color10);
                break;
        }
        //for setting the color on the background
        magnitudecircle.setColor(color);
        /*TextView t2=(TextView)listview.findViewById(R.id.name_id);
        t2.setText(adapter.getName());*/
        TextView t2=(TextView)listview.findViewById(R.id.name_id);
        TextView t22=(TextView)listview.findViewById(R.id.name2_id);
        String place=adapter.getName();
        if(place.contains("of"))
        {
            String[] place_array=place.split("of");
            String place1=place_array[0];
            String place2=place_array[1];
            t2.setText(place1);
            t22.setText(place2);
        }
        else
        {
            t2.setText("Near the ");
            t22.setText(place);
        }
        /*String[] place_array=place.split("of");
        String place1=place_array[0];
        String place2=place_array[1];
        t2.setText(place1);
        t22.setText(place2);*/
        /*TextView t3=(TextView)listview.findViewById(R.id.date_id);
        Date dates=new Date(adapter.getDate());
        SimpleDateFormat formatted=new SimpleDateFormat("dd-mm-yyyy, HH:MM:SS a");
        String outputs=formatted.format(dates);
        t3.setText(outputs);*/
        TextView t3=(TextView)listview.findViewById(R.id.date_id);
        TextView t33=(TextView)listview.findViewById(R.id.date2_id);
        //Date class object is to created in which single argument constructor in which value is passed which is long
        Date dates=new Date(adapter.getDate());
        SimpleDateFormat formatted=new SimpleDateFormat("dd-mm-yyyy,HH:MM:SS a");
        String final_date=formatted.format(dates);
        String[] array_date=final_date.split(",");
        String date_1=array_date[0];
        String date_2=array_date[1];
        t3.setText(date_1);
        t33.setText(date_2);

        return listview;
    }
}
