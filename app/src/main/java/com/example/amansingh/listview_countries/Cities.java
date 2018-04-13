package com.example.amansingh.listview_countries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cities extends AppCompatActivity {

    ListView city;
    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    String India[] = {"Mumbai","Delhi","Lucknow","Kolkata","Bangalore"};
    String USA[] = {"Newyork","California","San Francisco","Boston","Los Angeles"};
    String Australia [] = {"Sydney","Melbourne","Perth","Brisbane"};
    String China[] = {"Beijing","Shanghai","Tibet","Macau"};
    Intent i;
    String country="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        city = (ListView)findViewById(android.R.id.list);
        i = getIntent();
            if(i.hasExtra("country"))
            {
                country = i.getStringExtra("country");
                Log.i("h",""+country);
                getcities(country);
            }
            }

    public void getcities(String Country)
    {
        arrayList = new ArrayList<String>();
        if(Country.equals("India"))
        {
            for(int i=0;i<India.length;i++)
            {
                arrayList.add(India[i]);
            }
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
            city.setAdapter(adapter);
        }
        else
        if(Country.equals("USA"))
        {
            for(int i=0;i<USA.length;i++)
            {
                arrayList.add(USA[i]);
            }
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
            city.setAdapter(adapter);
        }
        else
        if(Country.equals("Australia"))
        {
            for(int i=0;i<Australia.length;i++)
            {
                arrayList.add(Australia[i]);
            }
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
            city.setAdapter(adapter);
        }
        else
        if(Country.equals("China"))
        {
            for(int i=0;i<China.length;i++)
            {
                arrayList.add(China[i]);
            }
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
            city.setAdapter(adapter);
        }
    }
}
