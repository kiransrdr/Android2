package com.example.dell.viewstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL on 9/11/2018.
 */

public class CustomAdapter extends BaseAdapter{
    String[] countrynamelist;
    int[] countryflags;
    Context contxt;
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, String[] countrylist, int[] flags) {
        this.contxt=applicationContext;
        this.countrynamelist=countrylist;
        this.countryflags=flags;
        inflter=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countrynamelist.length;
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
        view = inflter.inflate(R.layout.activity_list_view2,null);
        TextView country=(TextView)view.findViewById(R.id.tv2);
        ImageView imgview=(ImageView) view.findViewById(R.id.icon);
        country.setText(countrynamelist[i]);
        imgview.setImageResource(countryflags[i]);
        return view;
    }
}


