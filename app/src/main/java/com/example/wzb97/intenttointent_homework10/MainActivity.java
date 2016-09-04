package com.example.wzb97.intenttointent_homework10;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.message);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final View v=View.inflate(MainActivity.this,R.layout.message,null);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setView(v).setPositiveButton("发送", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText t=(EditText)v.findViewById(R.id.editText);
                        Intent intent=new Intent(MainActivity.this,Activity2.class);
                        intent.putExtra("Message",t.getText().toString());
                        startActivity(intent);
                    }
                }).setNegativeButton("取消",null).show();
            }
        });
        Button btn2=(Button)findViewById(R.id.number);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final View v=View.inflate(MainActivity.this,R.layout.number,null);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setView(v).setPositiveButton("发送", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText t=(EditText)v.findViewById(R.id.editText2);
                        Intent intent=new Intent(MainActivity.this,Activity2.class);
                        intent.putExtra("Number",Integer.parseInt(t.getText().toString().trim()));
                        startActivity(intent);
                    }
                }).setNegativeButton("取消",null).show();
            }
        });
    }
}
