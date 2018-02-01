package com.example.asus.animaltraining.GalleryImage;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.asus.animaltraining.R;

import java.util.ArrayList;

public class GalleryImageActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_gallery_image );
        context=this;
        GridView gridView = (GridView) findViewById(R.id.grdGalleryImage);
        ArrayList<Animal> animals =new ArrayList<>();
        Animal item1=new Animal();
        item1.setTxtName("ببر");
        item1.setImgAnimalPic(R.drawable.img2);
        animals.add( item1 );
        Animal item2=new Animal(R.drawable.img3,"پلنگ");
        animals.add( item2);
        Animal item3=new Animal(R.drawable.img4,"پاندا");
        animals.add( item3);
        Animal item4=new Animal(R.drawable.img5,"آهو");
        animals.add( item4);

        gridView.setAdapter(new itemGalleryCustomAdapter(context,animals));
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
//                                    long arg3) {
//                Intent i = new Intent(context, ShowImageInfoActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
