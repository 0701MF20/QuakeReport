package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   ArrayList<Quakesinfo> a1=new ArrayList<Quakesinfo>();
        a1.add(new Quakesinfo(2.5f,"THJ","2-FEB-2020"));
        a1.add(new Quakesinfo(3.5f,"RDJ","4-JAN-2020"));
        a1.add(new Quakesinfo(3.5f,"YGJ","3-MAR-2020"));
        a1.add(new Quakesinfo(5.5f,"GJJ","3-JAN-2020"));
        a1.add(new Quakesinfo(4.5f,"YGJ","3-APRIL-2020"));
        a1.add(new Quakesinfo(6.5f,"YGJ","3-MAY-2020"));*/
        ArrayList<Quakesinfo> a1=QueryUtils.extractEarthquakes();
        QuakesinfoAdapter adapter1=new QuakesinfoAdapter(this,a1);
        ListView lv1=(ListView)findViewById(R.id.listview1);
        lv1.setAdapter(adapter1);
    }
}