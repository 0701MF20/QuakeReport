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
        //just about string split with split function
       //case 1 about the split of 123 and 678899
     /*   String s1="1234-678899";
        String[] array=s1.split("-");
        String element1=array[0];
        String element2=array[1];*/
        //case 2 for splitting of 2345 and -788999
        /*String s2="2345-788999";
        String[] array2=s2.split("?=-");
        String element3=array2[0];
        String element4=array2[1];*/
        //Case 3 for splitting of 2345- and 788999
        /*String s3="2345-788999";
        String[] array3=s3.split("?<=-");
        String element5=array3[0];
        String element6=array3[1];*/
        //Case 4 for split- with character and setting limit as well
        /*String s4="2366-6788-67889";
        String[] array4=s4.split("-",2);
        String elemnt6=array4[0];
        String elemet7=array4[1];*/
    }
}