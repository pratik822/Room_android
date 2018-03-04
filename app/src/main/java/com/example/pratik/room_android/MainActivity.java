package com.example.pratik.room_android;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edt_fname, edt_lname, edt_age, edt_phone;
    private Button btn_insert,btn_list;

    Appdatabase db= Room.databaseBuilder(MainActivity.this,Appdatabase.class,"userdata").allowMainThreadQueries().build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();

    }

    public void setUI(){
        edt_fname=(EditText)findViewById(R.id.edt_fname);
        edt_lname=(EditText)findViewById(R.id.edt_lname);
        edt_age=(EditText)findViewById(R.id.edt_age);
        edt_phone=(EditText)findViewById(R.id.edt_phone);
        btn_insert=(Button)findViewById(R.id.btn_insert);
        btn_list=(Button)findViewById(R.id.btn_list);
        btn_list.setOnClickListener(this);
        btn_insert.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_insert:
                UserData data=new UserData();
                data.setFirtName(edt_fname.getText().toString());
                data.setLastName(edt_lname.getText().toString());
                data.setAge(Integer.parseInt(edt_age.getText().toString()));
                data.setPhone(edt_phone.getText().toString());
                db.userDao().insertUser(data);
                Toast.makeText(getApplicationContext(),"Record inserted",Toast.LENGTH_LONG).show();
                Intent passe=new Intent(MainActivity.this,User_Listing_Activity.class);
                startActivity(passe);
                break;

            case R.id.btn_list:
                Intent pass=new Intent(MainActivity.this,User_Listing_Activity.class);
                startActivity(pass);

                break;

        }

    }
}
