package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {

    private TextView name,conjug,conjug2,conjug3;
private Bundle extras;
private Button bouttonret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        ///retourner boutton
        bouttonret=findViewById(R.id.open);
        bouttonret.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(infoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



        //center toolbar:
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
///////

        conjug = findViewById(R.id.present);
        conjug2= findViewById(R.id.future);
        conjug3=findViewById(R.id.passé);

        name = findViewById(R.id.nom);
        extras = getIntent().getExtras();
//les info dispo
        if (extras != null){
//////////
//            SpannableString ss = new SpannableString(extras.getString("present"));
//            SpannableStringBuilder ssb = new SpannableStringBuilder(extras.getString("present"));
//
//            ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
//            ForegroundColorSpan fcsRed1 = new ForegroundColorSpan(Color.RED);
//            ForegroundColorSpan fcsRed2 = new ForegroundColorSpan(Color.RED);
//            ForegroundColorSpan fcsRed3 = new ForegroundColorSpan(Color.RED);
//            ForegroundColorSpan fcsRed4 = new ForegroundColorSpan(Color.RED);
//            ForegroundColorSpan fcsRed5 = new ForegroundColorSpan(Color.RED);
//
//            ssb.setSpan(fcsRed, 3, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            ssb.setSpan(fcsRed1, 13, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            ssb.setSpan(fcsRed2, 30, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            ssb.setSpan(fcsRed3, 39, 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            ssb.setSpan(fcsRed4, 51, 57, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            ssb.setSpan(fcsRed5, 69, 73, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//            conjug.setText(ssb);
/////////

          name.setText(extras.getString("name"));
           conjug.setText(extras.getString("present"));
            conjug2.setText(extras.getString("future"));
            conjug3.setText(extras.getString("passé"));
        }
    }
}