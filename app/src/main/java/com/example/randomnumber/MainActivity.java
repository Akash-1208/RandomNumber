package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import java.lang.*;


public class MainActivity extends AppCompatActivity {


    TextView hello;
    EditText name;
    TextView rules;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello=findViewById(R.id.textHello);
        name=findViewById(R.id.edit_text);
        rules=findViewById(R.id.rulesid);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namePerson=name.getText().toString();
                Intent intent= new Intent(MainActivity.this,gamepage.class);
                intent.putExtra("keyname",namePerson);
                startActivity(intent);
            }
        });

    }
    public void onBtnClick(View view){

        rules.setText("Here Are the Rules");
        hello.setText("Hello "+name.getText().toString());
        setRules(rules);
    }

    private void setRules(TextView rules) {
        rules.setText("Rules Are\n\n\n 1)Five Chances\n\n2)Try To Guess The Number With Me\n\n3)If Matched U Win or I Win\n\n4)Range of Numbers 0 to 5");

    }
}