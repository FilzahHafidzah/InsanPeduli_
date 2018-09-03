package com.filzah.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Home_Program extends AppCompatActivity {

    GridView gridView;

    int imgprogram [] = {
      R.drawable.pro_kesehat,
      R.drawable.pro_pendidikan,
      R.drawable.pro_kepokok,
      R.drawable.pro_ankasuh,
      R.drawable.pro_anakyati,
      R.drawable.pro_zakat,
    };

    String judulprogram [] = {
       "Kesehatan",
       "Pendidikan",
       "Kebutuhan Pokok",
       "Santunan Anak Asuh",
       "Santunan Anak Yatim",
       "Konsultasi Zakat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_program);

        gridView = (GridView)findViewById(R.id.gv_program);

        Adapter_Program adapter_program = new Adapter_Program(this, judulprogram, imgprogram);
        gridView.setAdapter(adapter_program);




    }
}
