package com.example.pratik.room_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pratik on 04-03-2018.
 */

public class ListAdapter extends BaseAdapter {
    Context myctx;
    List<UserData>mydata;
    LayoutInflater inflater;
    ListAdapter(Context ctx, List<UserData>data){
        this.myctx=ctx;
        this.mydata=data;

    }
    @Override
    public int getCount() {
        return mydata.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=(LayoutInflater)myctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View views=inflater.inflate(R.layout.list_item,null);
        TextView tv_id=(TextView)views.findViewById(R.id.tv_id);
        TextView tv_fname=(TextView)views.findViewById(R.id.tv_fname);
        TextView tv_lname=(TextView)views.findViewById(R.id.tv_lname);
        TextView tv_phone=(TextView)views.findViewById(R.id.tv_phone);
        tv_id.setText(mydata.get(i).getId()+"");
        tv_fname.setText(mydata.get(i).getFirtName());
        tv_lname.setText(mydata.get(i).getLastName());
        tv_phone.setText(mydata.get(i).getPhone()+"");

        return views;
    }
}
