package com.example.dxf.mybutton;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout li = (LinearLayout)findViewById(R.id.linear);
        final ChooseButton cbtn = new ChooseButton(this,500,500,200,80,10);
        li.addView(cbtn);
        cbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//当点击画架按钮时
                Toast.makeText(MainActivity.this, " "+cbtn.state, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
