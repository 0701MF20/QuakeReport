package com.example.quakereport;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

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
        t1.setText(""+adapter.getMag());
        TextView t2=(TextView)listview.findViewById(R.id.name_id);
        t2.setText(adapter.getName());
        TextView t3=(TextView)listview.findViewById(R.id.date_id);
        t3.setText(""+adapter.getDate());
        return listview;
    }
}
