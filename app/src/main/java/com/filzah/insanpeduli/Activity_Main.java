package com.filzah.insanpeduli;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

public class Activity_Main extends AppCompatActivity {

    ImageView program, kegiatan, help, kutipan, verifikator, donasi, peta, donasikan, chat;

    ViewFlipper v_flipper;
    Button tnhomedonate;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new navHome()).commit();
                    return true;
                case R.id.navigation_tentang:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new navTentang()).commit();
                    return true;
                case R.id.navigation_profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new navProfile()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images [] = {
                R.drawable.flipimageone, R.drawable.flipimagetwo, R.drawable.flipimagethree
        };

        v_flipper = (ViewFlipper)findViewById(R.id.vfhome);

        for (int image : images){
            flipperImages(image);
        }


        tnhomedonate = (Button)findViewById(R.id.tnhome_donate);

        tnhomedonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getApplicationContext(),Home_Donasikan.class);
                startActivity(s);
            }
        });


        program = (ImageView)findViewById(R.id.home_program);
        kutipan = (ImageView)findViewById(R.id.home_kutipan);
        help = (ImageView)findViewById(R.id.home_help);
        kegiatan = (ImageView)findViewById(R.id.home_kegiatan);
        verifikator = (ImageView)findViewById(R.id.home_verifikator);
        donasi = (ImageView)findViewById(R.id.home_donasi);
        peta = (ImageView)findViewById(R.id.home_peta);
        donasikan = (ImageView)findViewById(R.id.home_donasikan);
        chat = (ImageView)findViewById(R.id.home_chat);


        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Program.class);
                startActivity(a);
            }
        });

        kegiatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Kegiatan.class);
                startActivity(a);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Help.class);
                startActivity(a);
            }
        });

        kutipan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Kutipan.class);
                startActivity(a);
            }
        });

        verifikator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Verifikator.class);
                startActivity(a);
            }
        });

        donasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Donasi.class);
                startActivity(a);
            }
        });

        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Map.class);
                startActivity(a);
            }
        });

        donasikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Donasikan.class);
                startActivity(a);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Home_Chat.class);
                startActivity(a);
            }
        });


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);//3 sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}
