package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class rate_us extends AppCompatActivity {

private Button bouttonret;
private Button accueil;

    Button show;
    TextView result;
    RatingBar rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);


    ///retourner boutton
bouttonret=findViewById(R.id.open);
bouttonret.setOnClickListener(new View.OnClickListener(){

    @Override
    public void onClick(View v) {
Intent intent =new Intent(rate_us.this,image.class);
startActivity(intent);
    }
});

/////
//accueil
        bouttonret=findViewById(R.id.accueil);
        bouttonret.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(rate_us.this,MainActivity.class);
                startActivity(intent);
            }
        });





        show =findViewById(R.id.showme);
        result=findViewById(R.id.textView5);
        rate=findViewById(R.id.ratingBar);

        //center toolbar:
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
///////




        show.setOnClickListener(v -> {

            int rating = (int) rate.getRating();



        if( rating<=2   ){



           String text="Merci pour votre contribution"+"\n"+"nous sommes désolés pour ce rating: "+rating;

           SpannableString ss = new SpannableString(text);
            SpannableStringBuilder ssb = new SpannableStringBuilder(text);
            ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
            ssb.setSpan(fcsRed, 0, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);



            result.setText(ssb);




        }
        else if (2<rating && rating<=3.5){
            String text="merci pour votre contribution:"+"\n"+"Merci pour le rating: "+rating+"\n"+"i hope that we could improve our application";
            SpannableString ss = new SpannableString(text);
            SpannableStringBuilder ssb = new SpannableStringBuilder(text);
            ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
            ssb.setSpan(fcsRed, 0, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            result.setText(ssb);
        }
        else{
            String text ="merci de votre contribution:"+"\n"+"Thank you for rating us: "+rating;
            SpannableString ss = new SpannableString(text);
            SpannableStringBuilder ssb = new SpannableStringBuilder(text);
            ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
            ssb.setSpan(fcsRed, 0, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            result.setText(ssb);
        }
        });
    }
}