package Tree.binary;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String [] names = {"kofi", "ama", "yaw"};
        String [] scannerInput = getInput();
        System.out.println(fbLikes(scannerInput));



//        BTree b = new BTree(3);
//        b.Insert(8);
//        b.Insert(9);
//        b.Insert(10);
//        b.Insert(11);
//        b.Insert(15);
//        b.Insert(20);
//        b.Insert(17);
//
//
//
//        b.Show();
//
//        b.Remove(15);
//        System.out.println();
//        b.Show();























//        Java Memory Management
//        String kofi = "kofi";
//        String kofi2 = "kofi";
//
//
//        System.err.println(kofi.hashCode());
//        System.err.println(kofi2.hashCode());
//        System.out.println();

        /**
         *
         * Using the right data structure
         * Using JMM
         * Memory leak
         * Garbage collection
         * Monitor Memory Usage
         *
         *
         * |   |    |
         * --  --  --
         * ---------------------------
         */

//        System.out.println(nestParen.);

    }


    public static int bunny(int numberOfBunies) {
        int sum;
        if (numberOfBunies == 0) {
            return 0;
        } else return bunny(numberOfBunies * 2);
    }

    public static boolean evenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }


    public static boolean nestParen(String str) {
        if(str.isEmpty()){
            return true;
        }

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1));
        }
        return false;
    }

    public int strDist(String str, String sub) {
        if(!str.contains(sub)){
           return 0;
        }
        if(str.startsWith(sub) && str.endsWith(sub)){
            return str.length();
        }
        return strDist(str.substring(1,str.length()-1), sub);
    }

    public int count11(){
//        if()
        return 0;
    }

    public static String fbLikes(String[] names){
        int n = names.length;
        if(n == 0){
            return "No one like this";
        }
        if(n == 1){
            return names[0] + " likes this";
        }
        if(n == 2){
            return names[0] + " and " + names[1] + " like this";
        }
        if(n == 3){
            return names[0] + " , " + names[1] + " and " + names[2] + " like this";

        }
        return names[0] + " , " + names[1] + " and " + (n-2) + " others like this";
    }

    public static String[] getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people who like the fb post");
        int totalNumber = scanner.nextInt();
        String[] names = new String[totalNumber];
        System.out.println("Enter the names ");
        for(int i=0; i<names.length; i++){
            names[i] = scanner.next();
        }
        scanner.close();
        return names;
    }



}