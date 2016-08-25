package com.example.cozoo.a1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    boolean ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Button buttoncheat = (Button) findViewById(R.id.button7);
        buttoncheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iin = getIntent();
                int n = iin.getIntExtra("check",0);
                ans = isPrime(n);
                String s = new String(" is Prime");
                String s1 = new String(" is not Prime");
                s = Integer.toString(n) + s;
                s1 = Integer.toString(n) + s1;
                Context context = getApplicationContext();
                CharSequence text = s;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,text,duration);

                Context context1 = getApplicationContext();
                CharSequence text1 = s1;
                Toast toast1 = Toast.makeText(context1,text1,duration);
               if(ans) {
                   toast.show();
               }
                else
               {
                   toast1.show();
               }
            }


        });
    }
        @Override
        public void onBackPressed() {
            Context bcontext = getApplicationContext();
            CharSequence btext = "Cheat has been used";
            int bduration = Toast.LENGTH_SHORT;
            Toast btoast = Toast.makeText(bcontext,btext,bduration);
            btoast.show();

            super.onBackPressed();
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
