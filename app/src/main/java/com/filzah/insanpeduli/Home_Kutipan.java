package com.filzah.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Home_Kutipan extends AppCompatActivity {

    ListView listView;

    int image [] = {
            R.drawable.flipimageone,
            R.drawable.flipimagethree,
            R.drawable.flipimagetwo
    };

    String text [] = {
            "Kutipan Ke-158",
            "Kutipan Ke-151",
            "Kutipan Ke-157"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_kutipan);

        listView = (ListView)findViewById(R.id.lv_kutipan);

        Adapter_Kutipan adapter_kutipan = new Adapter_Kutipan(this, text, image);
        listView.setAdapter(adapter_kutipan);


    }
}
