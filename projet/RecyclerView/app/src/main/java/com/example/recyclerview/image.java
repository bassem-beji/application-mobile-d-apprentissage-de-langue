package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class image extends AppCompatActivity {
private ImageView desc;
private TextView text;

private Button bouttonret;

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);


        ///retourner boutton
        bouttonret=findViewById(R.id.open);
        bouttonret.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(image.this,MainActivity.class);
                startActivity(intent);
            }
        });



        //center toolbar:
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
///////

        text = findViewById(R.id.textView4);
        Bundle recoit=getIntent().getExtras();
        if (recoit!=null){
            String resultat=recoit.getString("details");
            text.setText(resultat);

            button=findViewById(R.id.rateus);
            button.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(image.this,rate_us.class);
                   startActivity(intent);

                }
            });
        }
    }
}