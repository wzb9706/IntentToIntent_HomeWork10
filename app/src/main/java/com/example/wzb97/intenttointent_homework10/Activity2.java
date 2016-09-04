package com.example.wzb97.intenttointent_homework10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by wzb97 on 2016/9/4.
 */
public class Activity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Button btn=(Button)findViewById(R.id.re);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity2.this,MainActivity.class);
                startActivity(i);
            }
        });
        Intent i=getIntent();

        try{
            String s=i.getStringExtra("Message");
            if(s.equals("")==false)Toast.makeText(Activity2.this,s,Toast.LENGTH_LONG).show();
        }
        catch (Exception e){

        }
        try{
            int num=i.getIntExtra("Number",0);
            Toast.makeText(Activity2.this,Integer.toString(num),Toast.LENGTH_LONG).show();
        }
        catch (Exception e){

        }
    }
}
