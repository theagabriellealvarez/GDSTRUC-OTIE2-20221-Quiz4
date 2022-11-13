package com.gdstruc.otie2.module5;

public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 1);
        Player celebi = new Player(251, "Celebi", 2);
        Player hitmonchan = new Player(107, "Hitmonchan", 3);
        Player mankey = new Player(56, "Mankey", 4);
        Player starmie = new Player(175, "Starmie", 4);


        SimpleHashtable hashtable = new SimpleHashtable();

        // add initial players
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(starmie.getUserName(), starmie);


        // print before removal
        System.out.println("BEFORE REMOVING");
        hashtable.printHashtable();
        System.out.println("\n");

        //removal of keys
        System.out.println("KEY REMOVAL");
        hashtable.removeKey("Celebi");
        hashtable.removeKey("Mankey"); //same amt of letters as Celebi
        hashtable.removeKey("Hitmonchan");
        hashtable.removeKey("Eevee"); //trial for if not in the table
        System.out.println("\n");

        //print after removal
        System.out.println("AFTER REMOVING");
        hashtable.printHashtable();

    }
}