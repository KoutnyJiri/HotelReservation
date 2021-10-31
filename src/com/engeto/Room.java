package com.engeto;

public class Room {

    private int numOfRoom;
    private int numOfBeds;
    private boolean balcony;
    private double price;
    private boolean viewOnSea;

    public Room(int numOfRoom,int numOfBeds,boolean balcony,
                double price,boolean viewOnSea) {
        this.numOfRoom = numOfRoom;
        this.numOfBeds = numOfBeds;
        this.balcony =  balcony;
        this.price = price;
        this.viewOnSea = viewOnSea;

    }

    public String getDescription() {
        return "\n" +"Room number: " + numOfRoom +"\nNumber of beds: " + numOfBeds
                + "\nBalcony: " + balcony + "\nView on the sea: " + viewOnSea
                + "\nPrice: " + price + "Kc/noc" +"\n";
    }



    public int getNumOfRoom() {
        return numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
    }

    public boolean isViewOnSea() {
        return viewOnSea;
    }

    public void setViewOnSea(boolean viewOnSea) {
        this.viewOnSea = viewOnSea;
    }
}

