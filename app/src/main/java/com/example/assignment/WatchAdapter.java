package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WatchAdapter extends BaseAdapter {
    Context context;
    int listImage[];
    String listWatch[];
    int listPrice[];
    LayoutInflater inflater;

    public WatchAdapter(Context ctx, int listImage[], String listWatch[], int listPrice[]){
        this.context = ctx;
        this.listImage = listImage;
        this.listWatch = listWatch;
        this.listPrice = listPrice;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listWatch.length;
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
        view = inflater.inflate(R.layout.watch, null);
        TextView watch = view.findViewById(R.id.txtName);
        TextView price = view.findViewById(R.id.txtPrice);
        ImageView image = view.findViewById(R.id.imgView);
        watch.setText(listWatch[i]);
        price.setText(listPrice[i] + "$");
        image.setImageResource(listImage[i]);
        return view;
    }
}
