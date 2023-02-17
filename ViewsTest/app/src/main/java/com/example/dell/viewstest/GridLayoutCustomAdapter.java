package com.example.dell.viewstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by DELL on 9/11/2018.
 */

public class GridLayoutCustomAdapter extends BaseAdapter{
    Context ctx;
    int[] logo;
    LayoutInflater inflater;
    public GridLayoutCustomAdapter(Context applicationContext, int[] logos){
        this.ctx=applicationContext;
        this.logo=logos;
        inflater=(LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return logo.length;
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
        view=inflater.inflate(R.layout.activity_grid__list_view2,null);
        ImageView icon=(ImageView)view.findViewById(R.id.gridicon);
        icon.setImageResource(logo[i]);

        return view;
    }
}

