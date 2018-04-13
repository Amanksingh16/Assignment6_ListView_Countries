package com.example.amansingh.listview_countries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView view;
    ArrayList<String> list;
    String []country = {"India","USA","Australia","China"};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (ListView)findViewById(R.id.countries);

        getcountries();
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),Cities.class);
                Log.i("h:",""+country[position]);
                i.putExtra("country",country[position]);
                startActivity(i);
            }
        });
    }
    public void getcountries()
    {
        list = new ArrayList<String>();
        for(int i=0;i<country.length;i++)
        {
            list.add(country[i]);
        }
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        view.setAdapter(adapter);
    }
}
