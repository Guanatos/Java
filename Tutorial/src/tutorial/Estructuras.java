/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author danunora
 */
public class Estructuras {
    public static void displayAnItem(Items anItemX) {
        System.out.println(anItemX.name + " comes in "+ anItemX.price + " unit packages "+ anItemX.qty + " per package ");
    }
    public static void main(String[] args) {
        Items anItem1 = new Items();
        anItem1.name = "Testing";
        anItem1.price = 250;
        anItem1.qty = 50;
        
        Items anItem2 = new Items();
        anItem2.name = "Testing";
        anItem2.price = 550;
        anItem2.qty = 50;
        
        displayAnItem(anItem1);
        displayAnItem(anItem2);
        // System.out.println(anItem1.name + " comes in "+ anItem1.price + " unit packages "+ anItem1.qty + " per package ");
        // System.out.println(anItem2.name + " comes in "+ anItem2.price + " unit packages "+ anItem2.qty + " per package ");
    }
    
