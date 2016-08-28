package com.example.yintangwen.homedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup container = (RadioGroup)findViewById(R.id.container);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        for (int i=0;i<2;i++) {
//            RadioButton item = new RadioButton(this);
            RadioButton item = (RadioButton)LayoutInflater.from(this).inflate(R.layout.radiobutton_item,null);

            item.setText("菜单\n"+i);
            layoutParams.weight = 1;
            container.addView(item,i,layoutParams);
            /*RadioGroup 父类LinearLayout的添加方法*/
//            container.addView(item);
        }
    }
}
