package com.example.asus.animaltraining.GalleryImage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.animaltraining.R;

public class ShowImageInfoActivity extends AppCompatActivity {
Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_show_image_info );
        context=this;
        ImageView imgAnimal = (ImageView) findViewById(R.id.imageGallery);
        TextView nameAnimal = (TextView) findViewById(R.id.nameAnimal);
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        int pic=bundle.getInt("pic");
        imgAnimal.setImageResource(pic);
        nameAnimal.setText( name );
    }

}
