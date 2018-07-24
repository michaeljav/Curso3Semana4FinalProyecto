package com.exampleandroiddemottest.petagramrecyclerview;

public class Pets {

    public int getImageMain() {
        return imageMain;
    }

    public void setImageMain(int imageMain) {
        this.imageMain = imageMain;
    }

    private int imageMain;
    private String namePets;
    private int countRating;


    public Pets(int imageMain,String namePets, int countRating) {
        this.imageMain = imageMain;
        this.namePets = namePets;
        this.countRating = countRating;
    }

    public String getNamePets() {
        return namePets;
    }

    public void setNamePets(String namePets) {
        this.namePets = namePets;
    }

    public int getCountRating() {
        return countRating;
    }

    public void setCountRating(int countRating) {
        this.countRating = countRating;
    }



}
