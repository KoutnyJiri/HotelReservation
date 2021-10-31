package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation<typeOfStay> {

    int numOfReservation;
    LocalDate startReservation;
    LocalDate endReservation;
    Room room;
    Host host;
    ArrayList<Host> addHost = new ArrayList<>();


    public Reservation(Room room, LocalDate startReservation, LocalDate endReservation
            , Host host) {
        this.room = room;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
        this.host = host;

    }

    public String getDescription() {
        return "\nRoom number: " +room.getNumOfRoom()+
                "\nReservation: " +host.getName()+" "+host.getSurname()+"" + roomateName()+
                "\nStart of reservation: " + startReservation +
                "\nEnd of reservation: " + endReservation;
    }


    public void addHost(Host roommate) {
        addHost.add(roommate);
    }

    public String roomateName() {
        StringBuilder result = new StringBuilder();

        for (Host host : addHost) {
            result.append(" ,").append(host.getName()).append(" ")
                    .append(host.getSurname());
        }
        return result.toString();
    }

    public int getNumOfReservation() {
        return numOfReservation;
    }

    public void setNumOfReservation(int numOfReservation) {
        this.numOfReservation = numOfReservation;
    }

    public LocalDate getStartReservation() {
        return startReservation;
    }

    public void setStartReservation(LocalDate startReservation) {
        this.startReservation = startReservation;
    }

    public LocalDate getEndReservation() {
        return endReservation;
    }

    public void setEndReservation(LocalDate endReservation) {
        this.endReservation = endReservation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}

