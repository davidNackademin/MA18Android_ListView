package com.example.david.androidlistlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] listItems = {"Jacob", "Per", "David", "Susan", "Lois", "Laura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView nameListView = findViewById(R.id.name_list);

       // ArrayAdapter adapter =
       //         new ArrayAdapter(this, android.R.layout.simple_list_item_1 , listItems );
        final PersonAdapter adapter = new PersonAdapter(this, listItems);

        nameListView.setAdapter(adapter);


        nameListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("AppTest","Radnr: " + position);
                listItems[position] = "clicked";
                adapter.notifyDataSetChanged();
            }
        });



    }
}
