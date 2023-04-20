package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class firstone extends AppCompatActivity {
private TextView noms;
private TextView compteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstone);


        //center toolbar:
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
///////
        compteur=findViewById(R.id.comp);
        Thread thread2=new Thread(){
            public void run(){
                for(int j =0;j<=10;j++){
                    try{
                        sleep(1000);
                    } catch (Exception e) {
                        System.out.println("niyet");
                    }
                    compteur.setText("Bienvenu"+"\n"+"attendez un peu: "+j+"/10");
                }
            }



        };
           thread2.start();





        String nom="Beji Bassem"+"\n"+"Mbarki israa"+"\n"+"Khdir Yasmin";
        SpannableString ss = new SpannableString(nom);
        noms=findViewById(R.id.noms);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 0, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);



                noms.setText(ss);



        Thread thread =new Thread() {
            public void run() {

                try {
                    sleep(11000);
                    Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);





                    finish();

                }catch (Exception e){
                    System.out.println("sorry");
                }


            }


        };
        thread.start();


    }



}

