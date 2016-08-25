package com.example.cozoo.a1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button buttonhint = (Button) findViewById(R.id.button5);
        buttonhint.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
              Context context = getApplicationContext();
               CharSequence text = "A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Context hcontext = getApplicationContext();
        CharSequence htext = "hint has been taken";
        int hduration = Toast.LENGTH_SHORT;
        Toast htoast = Toast.makeText(hcontext,htext,hduration);
        htoast.show();

        super.onBackPressed();
    }


}
