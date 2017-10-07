package com.example.pcgur.szinesgombok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button piros;
    private Button kek;
    private Button sarga;
    private Button zold;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piros = (Button) findViewById(R.id.button);
        kek = (Button) findViewById(R.id.button2);
        sarga = (Button) findViewById(R.id.button3);
        zold = (Button) findViewById(R.id.button4);
        piros.setBackgroundColor(Color.parseColor("#FF0000"));
        kek.setBackgroundColor(Color.parseColor("#0000FF"));
        sarga.setBackgroundColor(Color.parseColor("#FFFF00"));
        zold.setBackgroundColor(Color.parseColor("#008000"));
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));

        piros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                if (i == 1)
                {
                    piros.setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (i == 2) {
                    piros.setBackgroundColor(Color.parseColor("#0000FF"));
                } else if (i == 3) {
                    piros.setBackgroundColor(Color.parseColor("#FFFF00"));
                } else if (i == 4) {
                    piros.setBackgroundColor(Color.parseColor("#008000"));
                }
                i=1;
            }
        });
        kek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                if (i == 1)
                {
                    kek.setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (i == 2) {
                    kek.setBackgroundColor(Color.parseColor("#0000FF"));
                } else if (i == 3) {
                    kek.setBackgroundColor(Color.parseColor("#FFFF00"));
                } else if (i == 4) {
                    kek.setBackgroundColor(Color.parseColor("#008000"));
                }
                i=2;
            }
        });
        sarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                if (i == 1)
                {
                    sarga.setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (i == 2) {
                    sarga.setBackgroundColor(Color.parseColor("#0000FF"));
                } else if (i == 3) {
                    sarga.setBackgroundColor(Color.parseColor("#FFFF00"));
                } else if (i == 4) {
                    sarga.setBackgroundColor(Color.parseColor("#008000"));
                }
                i=3;
            }
        });
        zold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#008000"));
                if (i == 1)
                {
                    zold.setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (i == 2) {
                    zold.setBackgroundColor(Color.parseColor("#0000FF"));
                } else if (i == 3) {
                    zold.setBackgroundColor(Color.parseColor("#FFFF00"));
                } else if (i == 4) {
                    zold.setBackgroundColor(Color.parseColor("#008000"));
                }
                i=4;
            }
        });
    }
}
