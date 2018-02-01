package com.example.asus.animaltraining.GalleryImage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.asus.animaltraining.ColorsActivity;
import com.example.asus.animaltraining.GalleryImage.GalleryImageActivity;
import com.example.asus.animaltraining.R;


public class HomePageActivity extends AppCompatActivity {
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_page );
        context=this;
        LinearLayout lnrAnimal=(LinearLayout) findViewById(R.id.lnrAnimal);
        lnrAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, GalleryImageActivity.class));
            }
        });

        LinearLayout lnrColors=(LinearLayout) findViewById(R.id.lnrColors);
        lnrColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ColorsActivity.class));
            }
        });
    }
}
