import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {
        //        && (and) || (or)
        //Prompt a user to input the weather (weather "rainy", "sunny", "cloudy", "snow")
        System.out.println("Are Looking For: Accessory / Tops / Bottoms / Shoes?");

        //8, 18, 28 degrees
        //Collect user input
        Scanner reader = new Scanner(System.in); // creates scanner object
        String clothingArticle = reader.nextLine();

        if (clothingArticle.equals("Accessory")) {
            System.out.println("What is The Weather Like?");
        }


        String weather = reader.nextLine();

        if (weather.equals("Sunny")) {
            System.out.println("Sun Hat");
        }
        System.out.println("What Is The Temperature Like? Outside");

//        int temperature = Integer.parseInt(reader.nextLine();
        String userTemp = reader.nextLine();
        if( userTemp > temperature ) {
            System.out.println("Sun Hat");


//        else {
//            System.out.println("Brolly");
//        }

//        if weather is sunny + temp more than 15 degrees, print "Sun Hat"
//        if weather is rainy, print "brolly"
//
//        System.out.println("Now: What Is The Temperature Like Outside?");
//
//
//        if( userTemp > ) {
//        System.out.println("too high");

        }




//        boolean Sunny = true; // ADDED
//        boolean Rainy = false;  // ADDED
//
//        if (Sunny || Rainy){  // ADDED
//            System.out.println("Sun Hat");






//Accessory + Tops + Bottoms + Shoes


//       Clothing:
//        Sun hat + UV400 Sun glasses + Your favourite T-shirt + Shorts + Low-tops
//        Raincoat + Brolly + Boots + lightweight Jumper + jeans
//        Hoodie + Jeans + Trainers + Puffer Vest
//        Jumper + Jacket + Scarf + Gloves + Winter Boots + Beanie



    }
}