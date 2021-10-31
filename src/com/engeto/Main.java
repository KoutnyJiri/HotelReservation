package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    public static <Hosts> void main(String[] args) {

        // Vytvoření hostů:
        Host hostAdelaMalikova = new Host("Adela","Malikova", LocalDate.of(1993, 3,13));

        Host hostJanDvoracek = new Host("Jan", "Dvoracek", LocalDate.of(1995, 5, 5));

        Host hostJiri = new Host("Jiri", "Koutny",LocalDate.of(1990,5,17));


        // Seznam hostů pro následný výpis.
        ArrayList<Host> hostList = new ArrayList<>();
        hostList.add(hostJiri);
        hostList.add(hostAdelaMalikova);
        hostList.add(hostJanDvoracek);

        for (Host host : hostList) {
            System.out.println(host.getDescription());
        }

        //Výpis hostů v.1
        //System.out.println(hostAdelaMalikova.getDescription() + hostJanDvoracek.getDescription());


        //Vytvoření pokojů:
        Room room1 = new Room(1,1,true,
                1000,true);

        Room room2 = new Room (2,1,true,
                1000,true);

        Room room3 = new Room(3,3,false,
                2400,true);

        //Výpis pokojů:
        System.out.println(room1.getDescription() +room2.getDescription() +room3.getDescription());

        //Rezervace:
        Reservation reservation1 = new Reservation(room1,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),hostAdelaMalikova);

        Reservation reservation2 = new Reservation(room3,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),hostJanDvoracek);
        reservation2.addHost(hostAdelaMalikova);
        reservation2.addHost(hostJiri);

        //Výpis rezervací
        System.out.println(reservation1.getDescription());
        System.out.println(reservation2.getDescription());
    }

}
