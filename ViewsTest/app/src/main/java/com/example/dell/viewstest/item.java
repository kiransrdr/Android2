package com.example.dell.viewstest;

/**
 * Created by DELL on 9/11/2018.
 */

public class item {
    String birdListName;
    int birdListImage;

    public item(String birdName,int birdImage)
    {
        this.birdListImage=birdImage;
        this.birdListName=birdName;
    }
    public String getbirdName()
    {
        return birdListName;
    }
    public int getbirdImage()
    {
        return birdListImage;
    }

    public String getBirdListName() {
        return birdListName;
    }

    public void setBirdListName(String birdListName) {
        this.birdListName = birdListName;
    }

    public int getBirdListImage() {
        return birdListImage;
    }

    public void setBirdListImage(int birdListImage) {
        this.birdListImage = birdListImage;
    }
}
