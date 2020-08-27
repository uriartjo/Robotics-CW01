package com.company;

public class Main {

    public static void main(String[] args) {

        //Dev Note 1: Outputs keeps coming out on one line...need to fix

        System.out.print("Greetings, meatbag.");
        System.out.print("That isn't your name? Sigh, what IS your name then?"); //Dev Note 2: Customer should be able to provide their name on the next line

        System.out.print("FEIGNED INTEREST: Oh my, what a WONDERFUL name it is, meat-...I mean");     //Dev Note3: Buildatron should then say the customer's name at the end of this sentence
        System.out.print("Do you want to order something now?");
        System.out.print("We have the following items available:");

        //Dev Note 4: Buildatron wants the following information for each item:
        // The item SKU, the item name, the item cost, and the final cost for purchasing the entire stock. All money items should be represented with $ before the value.

        string item1SKU = 'REV-41-1595'
        String Item1Name = "Control Hub"
        String item1description = "where do i even find this"
        int item1cost = 5.50;
        double item1Quantity = 1.0;
    }
}


/*

--------Items In Stock--------

Control System and Sensors:
QTY 1 - Control Hub (REV-41-1595)
QTY 1 - Android Driver's Station Device
QTY 1 - Touch Sensor (REV-31-1425)
QTY 1 - Color Sensor V3 (REV-31-1557)
QTY 1 - Logitech USB Gamepad (REV-39-1647)
QTY 1 - USB Female A to Micro USB Adapter (REV-31-1426)
QTY 4 - 4-Pin JST PH Sensor Cable, 50CM (REV-31-1408)


*/