package com.example.kom.zestaw5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private String[] lang;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.list);
        initResources();
        initLanguagesListView();
    }

    private void initResources()
    {
        Resources res = getResources();
        lang=res.getStringArray(R.array.teleofny);

    }
    private void initLanguagesListView()
    {
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
        android.R.layout.simple_list_item_1,lang));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
         {
             public void onItemClick(AdapterView<?> parent, View v, int pos, long id)
             {
                 Intent intent = new Intent(MainActivity.this,Nowa.class);
                 intent.putExtra("nazwa", lang[pos]);
                 startActivity(intent);
             }

         });

    }

}
