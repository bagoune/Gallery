package com.example.asus.animaltraining.GalleryImage;

/**
 * Created by ASUS on 2018/01/31.
 */

public class Animal {
    int imgAnimalPic;
    String txtName;


    public Animal(){

    }

    public Animal(int imgAnimalPic, String txtName) {
        this.imgAnimalPic = imgAnimalPic;
        this.txtName = txtName;
    }

    public int getImgAnimalPic() {
        return imgAnimalPic;
    }

    public void setImgAnimalPic(int imgAnimalPic) {
        this.imgAnimalPic = imgAnimalPic;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

}
