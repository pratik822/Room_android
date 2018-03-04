package com.example.pratik.room_android;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class User_Listing_Activity extends AppCompatActivity {
    private ListView listView;
    Appdatabase db= Room.databaseBuilder(User_Listing_Activity.this,Appdatabase.class,"userdata").allowMainThreadQueries().build();
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__listing_);
        listView=(ListView)findViewById(R.id.listView);
        setlist();
    }

    public void setlist(){
        adapter=new ListAdapter(User_Listing_Activity.this,db.userDao().getallusers());
        listView.setAdapter(adapter);
    }

}
