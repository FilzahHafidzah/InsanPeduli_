package com.filzah.insanpeduli;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class navHome extends Fragment {


    ImageView program, kegiatan, help, kutipan, verifikator, donasi, peta, donasikan, chat;


    ViewFlipper v_flipper;
    Context s = getContext();
    Button tnhomedonate;

    public navHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_home, container, false);

        int images [] = {
                R.drawable.flipimageone, R.drawable.flipimagetwo, R.drawable.flipimagethree
        };

        v_flipper = v.findViewById(R.id.vfhome);

//        for (int i = 0; 1 < images.length; i++){
//            flipperImages(images[i]);
//
//        }

        for (int image : images){
            flipperImages(image);
        }


        tnhomedonate = v.findViewById(R.id.tnhome_donate);

        tnhomedonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getActivity(),Home_Donasikan.class);
                startActivity(s);
            }
        });


        program = v.findViewById(R.id.home_program);
        kutipan = v.findViewById(R.id.home_kutipan);
        help = v.findViewById(R.id.home_help);
        kegiatan = v.findViewById(R.id.home_kegiatan);
        verifikator = v.findViewById(R.id.home_verifikator);
        donasi = v.findViewById(R.id.home_donasi);
        peta = v.findViewById(R.id.home_peta);
        donasikan = v.findViewById(R.id.home_donasikan);
        chat = v.findViewById(R.id.home_chat);


        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Program.class);
                startActivity(a);
            }
        });

        kegiatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Kegiatan.class);
                startActivity(a);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Help.class);
                startActivity(a);
            }
        });

        kutipan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Kutipan.class);
                startActivity(a);
            }
        });

        verifikator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Verifikator.class);
                startActivity(a);
            }
        });

        donasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Donasi.class);
                startActivity(a);
            }
        });

        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Map.class);
                startActivity(a);
            }
        });

        donasikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Donasikan.class);
                startActivity(a);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getContext(),Home_Chat.class);
                startActivity(a);
            }
        });
        return v;
    }

    public void flipperImages (int image){

        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);//3 sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(getActivity(), android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(getActivity(), android.R.anim.slide_out_right);
    }

}
