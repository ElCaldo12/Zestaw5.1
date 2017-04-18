package com.example.kom.zestaw5;

import android.app.Notification;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Kom on 2017-04-09.
 */

public class Nowa extends AppCompatActivity {
    private ListView lv;
    private String[] nazwa;
    String akt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowa);


        akt = getIntent().getStringExtra("nazwa"); // retrieve the data using keyName
        if(akt.equals("Nokia 3310"))
        {nokia();}
        else if(akt.equals("LG G6"))
        {lg();}
        else if(akt.equals("Samsung Galaxy s8"))
        {sam();}
        else if(akt.equals("Huawei p10"))
        {huw();}
       // initLanguagesListView();
    }
    public void powrot(View v)
    {
        this.finish();
    }

    private void nokia() {
        Resources res = getResources();
        nazwa = res.getStringArray(R.array.Nokia);
        lv = (ListView) findViewById(R.id.lista);
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, nazwa));
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.nokia);
    }
    private void lg() {
        Resources res = getResources();
        nazwa = res.getStringArray(R.array.LG);
        lv = (ListView) findViewById(R.id.lista);
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, nazwa));
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.lg);
    }
    private void sam() {
        Resources res = getResources();
        nazwa = res.getStringArray(R.array.Samsung);
        lv = (ListView) findViewById(R.id.lista);
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, nazwa));
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.sam);
    }
    private void huw() {
        Resources res = getResources();
        nazwa = res.getStringArray(R.array.Huawei);
        lv = (ListView) findViewById(R.id.lista);
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, nazwa));
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.hua);
    }


}