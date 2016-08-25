package com.example.cozoo.a1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    boolean ans = false;
    int n;
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        n = rand.nextInt(1000) + 1;
        String s = new String("Is this a prime no. ");
        s = s + Integer.toString(n);
        TextView t1 = (TextView) findViewById(R.id.textView);
        t1.setText(s);
        ans = isPrime(n);

        final Button buttonc = (Button) findViewById(R.id.button);
        buttonc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (ans) {
                    Context context = getApplicationContext();
                    CharSequence text = "answer is correct";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "answer is incorrect";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });

        final Button buttoninc = (Button) findViewById(R.id.button3);
        buttoninc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (ans) {
                    Context context = getApplicationContext();
                    CharSequence text = "answer is incorrect";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "answer is correct";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });

        final Button buttonnext = (Button) findViewById(R.id.button2);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });

        final Button buttonHint = (Button) findViewById(R.id.button4);
        buttonHint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i4 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i4);
            }
            });

        final Button buttonCheat = (Button) findViewById(R.id.button6);
        buttonCheat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent i5 = new Intent(MainActivity.this,Main3Activity.class);
                i5.putExtra("check",n);
                    startActivity(i5);
            }
        });



    }

    boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
