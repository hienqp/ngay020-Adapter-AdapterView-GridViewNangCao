package com.hienqp.gridviewnangcao;

public class Picture {
    private String pictureName;
    private int pictureID;

    public Picture(String pictureName, int pictureID) {
        this.pictureName = pictureName;
        this.pictureID = pictureID;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }
}
