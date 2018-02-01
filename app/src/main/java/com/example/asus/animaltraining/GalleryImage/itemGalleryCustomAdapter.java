package com.example.asus.animaltraining.GalleryImage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.animaltraining.R;

import java.util.ArrayList;

/**
 * Created by ASUS on 2018/01/24.
 */

public class itemGalleryCustomAdapter extends BaseAdapter {
    Context context;
    private ArrayList<Animal> items;
    private static LayoutInflater inflater=null;

   public itemGalleryCustomAdapter(Context context) {
       this.context=context;
       inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   }


    public itemGalleryCustomAdapter(Context context, ArrayList<Animal> items) {
        this.context=context;
        this.items=items;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView name;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate( R.layout.activity_item_gallery_grd, null);
        holder.name=(TextView) rowView.findViewById(R.id.txtimgGallery);
        holder.img=(ImageView) rowView.findViewById(R.id.imgGallery);
        final Animal item = items.get(position);
        holder.name.setText(item.getTxtName());
        holder.img.setImageResource(item.getImgAnimalPic());
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ShowImageInfoActivity.class);
                i.putExtra("name",item.getTxtName());
                i.putExtra("pic",item.getImgAnimalPic());
                context.startActivity(i);
            }
        });
        return rowView;


    }
}
