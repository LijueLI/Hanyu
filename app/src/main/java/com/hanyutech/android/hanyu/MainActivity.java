package com.hanyutech.android.hanyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Enterinfo;
    private Intent EnterinfoAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN); //將螢幕設為全螢幕並且隱藏title

        Enterinfo = findViewById(R.id.EnterInfo);
        EnterinfoAct = new Intent();
        EnterinfoAct.setClass(this,Enterinfo.class);
        Enterinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(EnterinfoAct);
            }
        });
    }
}
