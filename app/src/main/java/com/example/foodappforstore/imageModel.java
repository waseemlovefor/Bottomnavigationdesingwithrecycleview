package com.example.foodappforstore;

public class imageModel {
   int image;
   String like;
   String share;

    public imageModel(int image, String like, String share) {
        this.image = image;
        this.like = like;
        this.share = share;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
