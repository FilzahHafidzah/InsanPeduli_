package com.filzah.insanpeduli;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by smktimq04 on 4/27/18.
 */

public class Adapter_Program extends ArrayAdapter{

    private final Activity context;
    private final String[] judul;
    private final int[] image;

    public Adapter_Program (Activity context, String[] txt, int[] img ) {
        super(context, R.layout.item_program, txt);
        this.context = context;
        this.judul = txt;
        this.image = img;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();

        View v = layoutInflater.inflate(R.layout.item_program, null, true);

        TextView t = v.findViewById(R.id.item_txtprogram);
        t.setText(judul[position]);

        ImageView  i = v.findViewById(R.id.item_imgprogram);
        i.setImageResource(image[position]);

        return v;


    }
}
