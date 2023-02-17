package com.example.dell.viewstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 9/11/2018.
 */
public class MyAdapter extends ArrayAdapter {
    ArrayList<item> birdList = new ArrayList<>();
    public MyAdapter(Context context, int textViewResourceId, ArrayList bird_List){
        super(context, textViewResourceId, bird_List);
        birdList=bird_List;
    }
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_grid_view__custom_arrayadapter_items, null);
        TextView textView = (TextView) v.findViewById(R.id.tv4);
        ImageView imageView = (ImageView) v.findViewById(R.id.iv4);
        textView.setText(birdList.get(position).getbirdImage());
        imageView.setImageResource(birdList.get(position).getbirdImage());
        return v;

    }

}
