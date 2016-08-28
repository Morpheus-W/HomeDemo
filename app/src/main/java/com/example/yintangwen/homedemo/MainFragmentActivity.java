package com.example.yintangwen.homedemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainFragmentActivity extends AppCompatActivity {

    private RelativeLayout locLayout;
    private RelativeLayout naviLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
        locLayout = (RelativeLayout)findViewById(R.id.loc_layout);
        naviLayout = (RelativeLayout)findViewById(R.id.navi_layout);

    }

    public void onSwitch(View view){
        if (locLayout.getVisibility() == View.VISIBLE){
            locLayout.setVisibility(View.GONE);
            naviLayout.setVisibility(View.VISIBLE);
        }else{
            locLayout.setVisibility(View.VISIBLE);
            naviLayout.setVisibility(View.GONE);
        }
    }
}
