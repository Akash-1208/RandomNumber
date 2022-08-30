package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class gamepage extends AppCompatActivity {

    TextView hello;
    TextView Numberid;
    TextView EnterNumber;
    EditText NumberHere;
    Random random= new Random();
    int randomNumber=random.nextInt(5);
    int numberTries=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);
        hello=findViewById(R.id.textHello1);
        EnterNumber=findViewById(R.id.EnterNumber);

        Numberid=findViewById(R.id.numberid);

        String nameP=getIntent().getStringExtra("keyname");
        hello.setText("Hello "+nameP);


    }
    public void onBtnClick(View view) throws InterruptedException {
        NumberHere=findViewById(R.id.NumberHere);
        int num = Integer.parseInt(NumberHere.getText().toString());
        Numberid.setText(String.valueOf(num));

            if (num == randomNumber) {
                makeToast("YOU WON in "+numberTries);
                Thread.sleep(2000);
                finish();
            } else if (num < randomNumber) {
                makeToast("Increase Your Number");
            } else {
                makeToast("Decrease Your Number");
            }
        numberTries++;
        if(numberTries>=5){
            makeToast("You Lost");
            finish();
        }


    }

    public void makeToast(String str)
    {
        Toast.makeText(gamepage.this,str,Toast.LENGTH_SHORT).show();
    }


}