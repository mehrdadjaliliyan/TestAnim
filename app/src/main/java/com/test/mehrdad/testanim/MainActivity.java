package com.test.mehrdad.testanim;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.mehrdad.testanim.chart.ChartFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button) findViewById(R.id.buttonshowChart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (savedInstanceState == null) {
                    getFragmentManager().beginTransaction()
                            .replace(R.id.container, new ChartFragment())
                            .commit();
                }
            }
        });


        Button button2 =(Button) findViewById(R.id.buttonMp);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(MainActivity.this,MpChartActivity.class);

                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);

                // Start Activity
                startActivity(intent);

            }
        });


    }







}