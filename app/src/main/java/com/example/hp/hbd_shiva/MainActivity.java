package com.example.hp.hbd_shiva;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button app_layer = (Button) findViewById (R.id.b);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });




        listView=(ListView)findViewById(R.id.listsiva);

        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("Happy Birthday Shiva", "Tum jiyo hazaron sal sal ki ye din ho pachas hazar. God bless u and fulfill all ur wishes", R.drawable.b1));
        dataModels.add(new DataModel("My best brother", "You are the best brother in this world.", R.drawable.b2));

        dataModels.add(new DataModel("We are twinning in this pic.", "You are a jolly person. You always try to bring smile on my face. Thanks for everything.", R.drawable.b3));
        dataModels.add(new DataModel("Forgive if i have ever hurt u ", "Be with me always.", R.drawable.b4));
        dataModels.add(new DataModel("Ette  khao ni, peta bahari jiba :)", "I pray this lovely bro n sis relation get stronger day by day", R.drawable.c1));
        dataModels.add(new DataModel("A perfect human", "You are sincere, cool, understanding and everything a person should be. ", R.drawable.c2));
        dataModels.add(new DataModel(":) Hulk (:", "Remain this childish forever  :)", R.drawable.c3));
        dataModels.add(new DataModel("Keep Smiling :)", "Stay happy and healthy", R.drawable.c4));



        adapter= new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);

    }
    public void openActivity2(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }


}


