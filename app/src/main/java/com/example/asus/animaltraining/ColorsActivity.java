package com.example.asus.animaltraining;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ColorsActivity extends AppCompatActivity {
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_colors );
        context=this;
        ImageView imgColor = (ImageView) findViewById(R.id.imgColor);
        imgColor.setImageResource(R.drawable.coloritem);
    }
}
