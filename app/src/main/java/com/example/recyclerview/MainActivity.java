package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.ImageView;



import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerView;

    private List<Listitem> listitems;
   // private RecyclerView.Adapter adapter;
    private ImageView grammaire;
private MyAdapter myAdapter;


/**/SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerviewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
grammaire=findViewById(R.id.grammaire);

//center toolbar:
getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
getSupportActionBar().setCustomView(R.layout.action_bar);
///////




/**/searchView=findViewById(R.id.search_view);

searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
       filter(newText);
        return true;
    }
});


//searchbar

    /**    EditText editText=findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
filter(s.toString());
            }
        });**/

//

//bich tnajem temchi ki teklicki 3al image
        grammaire.setOnClickListener(this);


        listitems =new ArrayList<>();



        Listitem listitem =new Listitem(
                    "aller" ,
                    "-Verbe du 3ème groupe"+"\n"+"-Le verbe aller se conjugue avec l'auxiliaire être",
                    "*je vais"+"\n"+"*tu vas"+"\n"+"*il/elle/on va" +"\n"+"*nous allons"+"\n"+"*vous allez"+"\n" +"*ils/elles vont"+"\n",
                    "*j'irai" +"\n"+"*tu iras" +"\n"+"*il/elle/on ira"+"\n"+"*nous irons"+"\n"+"*vous irez"+"\n"+"*ils/elles iront"+"\n",
                   "*je suis allé/e" +"\n"+"*tu es allé/e"+"\n"+"*il/elle/on est allé/e"+"\n"+"*nous sommes allé/e/s" +"\n"+"*vous êtes allé/e/s"+"\n"+"*ils/elles sont allé/e/s"+"\n"

                      );
            listitems.add(listitem);



        Listitem listitem6 =new Listitem(
                "abattre" ,
                "-Verbe du 3ème groupe" + "\n"+"-Le verbe abattre se conjugue avec l'auxiliaire avoir",
                "*j'abats" +"\n" +
                        "*tu abats" + "\n" +
                        "*il/elle/on abat" + "\n" +
                        "*nous abattons" + "\n" +
                        "*vous abattez" + "\n" +
                        "*ils/elles abattent"+ "\n",
                "*j'abattrai" +"\n" +
                        "*tu abattras" +"\n" +
                        "*il/elle/on abattra" + "\n" +
                        "*nous abattrons" + "\n" +
                        "*vous abattrez" + "\n" +
                        "*ils/elles abattront"+ "\n",
                "*j'ai abattu " +"\n"+
                        "*tu as abattu" +"\n"+
                        "*il/elle/on a abattu" +"\n"+
                        "*nous avons abattu" +"\n"+
                        "*vous avez abattu"+"\n"+
                        "*ils/elles ont abattu"+"\n"

        );
        listitems.add(listitem6);





        Listitem listitem7 =new Listitem(
                "boire" ,
                "-Verbe du 3ème groupe"+"\n"+"-Le verbe boire se conjugue avec l'auxiliaire avoir",
                "je bois"+"\n" +
                        "tu bois"+"\n" +
                        "il/elle/on boit"+"\n" +
                        "nous buvons"+"\n" +
                        "vous buvez"+"\n" +
                        "ils/elles boivent"+"\n",
                "je boirai"+"\n" +
                        "tu boiras"+"\n" +
                        "il/elle/on boira"+"\n" +
                        "nous boirons"+"\n" +
                        "vous boirez"+"\n" +
                        "ils/elles boiront"+"\n",
                "j'ai bu"+"\n" +
                        "tu as bu"+"\n" +
                        "il/elle/on a  bu"+"\n" +
                        "nous avons bu"+"\n" +
                        "vous avez bu"+"\n" +
                        "ils/elles ont bu"+"\n"


        );

        listitems.add(listitem7);



        Listitem listitem8 =new Listitem(
                "devoir" ,
                "-Verbe du 3ème groupe "+"\n"+"-Le verbe devoir se conjugue avec l'auxiliaire avoir",
                "je dois"+"\n" +
                        "tu dois"+"\n" +
                        "il/elle/on doit"+"\n" +
                        "nous devons"+"\n" +
                        "vous devez"+"\n" +
                        "ils/elles doivent"+"\n",
                "je devrai"+"\n" +
                        "tu devras"+"\n" +
                        "il/elle/on devra"+"\n" +
                        "nous devrons"+"\n" +
                        "vous devrez"+"\n" +
                        "ils/elles devront"+"\n",
                "j'ai dû"+"\n" +
                        "tu as dû"+"\n" +
                        "il/elle/on a dû"+"\n" +
                        "nous avons dû"+"\n" +
                        "vous avez dû"+"\n" +
                        "ils/elles ont dû"+"\n"


        );

        listitems.add(listitem8);


        Listitem listitem2 =new Listitem(
                "manger" ,
                "-Verbe du 1er groupe"+"\n"+"-Le verbe manger se conjugue avec l'auxiliaire avoir",
                "*je mange" +"\n" +
                        "*tu manges" +"\n" +
                        "*il/elle/on mange" + "\n" +
                        "*nous mangeons" + "\n" +
                        "*vous mangez" + "\n" +
                        "*ils/elles mangent"+ "\n",
                "*je mangerai" +"\n" +
                        "*tu mangeras" +"\n" +
                        "*il/elle/on mangera" + "\n" +
                        "*nous mangerons" + "\n" +
                        "*vous mangerez" + "\n" +
                        "*ils/elles mangeront"+ "\n",
                "*j'ai mangé" + "\n" +
                        "*tu as mangé" + "\n" +
                        "*il/elle/on a mangé" + "\n" +
                        "*nous avons mangé" + "\n" +
                        "*vous avez mangé" + "\n" +
                        "*ils/elles ont mangé" + "\n"


        );
        listitems.add(listitem2);




        Listitem listitem5 =new Listitem(
                "tenir" ,
                "-Verbe du 3ème groupe"+"\n"+"-Le verbe tenir se conjugue avec l'auxiliaire avoir",
                "je tiens"+"\n" +
                        "tu tiens"+"\n" +
                        "il/elle/on tient"+"\n" +
                        "nous tenons"+"\n" +
                        "vous tenez"+"\n" +
                        "ils/elles tiennent"+"\n" ,
                "je tiendrai"+"\n" +
                        "tu tiendras"+"\n" +
                        "il/elle/on tiendra"+"\n" +
                        "nous tiendrons"+"\n" +
                        "vous tiendrez"+"\n" +
                        "ils/elles tiendront"+"\n" ,
                "j'ai tenu"+"\n" +
                        "tu as tenu"+"\n" +
                        "il/elle/on a tenu"+"\n" +
                        "nous avons tenu"+"\n" +
                        "vous avez tenu"+"\n" +
                        "ils/elles ont tenu"+"\n"


        );
        listitems.add(listitem5);


      Listitem listitem3 =new Listitem(
                "voir" ,
                "-Verbe du 3ème groupe"+"\n"+"-Le verbe voir se conjugue avec l'auxiliaire avoir",
              "je vois"+"\n" +"tu vois"
                      +"\n" +"il/elle/on voit"
                      +"\n" +"nous voyons"
                      +"\n" +"vous voyez"
                      +"\n" +"ils/elles voient"+ "\n" ,
              "je verrai"+ "\n" +
              "tu verras"+ "\n" +
              "il/elle/on verra"+ "\n" +
              "nous verrons"+ "\n" +
              "vous verrez"+ "\n" +
              "ils/elles verront"+ "\n" ,
             "j'ai vu"+"\n" +
        "tu as vu"+"\n" +
        "il/elle/on a vu"+"\n" +
        "nous avons vu"+"\n" +
        "vous avez vu"+"\n" +
        "ils/elles ont vu"+"\n"

        );


        listitems.add(listitem3);









        myAdapter =new MyAdapter(this,listitems);
        recyclerView.setAdapter(myAdapter);




    }

//searchbar
    private  void filter(String text){
        ArrayList<Listitem> filteredList =new ArrayList<>();
        for (Listitem item:listitems){
            if(item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        myAdapter.filterList(filteredList);
    }
//



    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,image.class);
        intent.putExtra("details","Apprenez à conjuguer tous les verbes de la langue française a l'aide de notre application developpée par des étudiants de l'ENSI: "+"\n"+"Yasmine khdir"+"\n"+"israa mbarki" +"\n"+"Beji Bassem");
startActivity(intent);
    }



}