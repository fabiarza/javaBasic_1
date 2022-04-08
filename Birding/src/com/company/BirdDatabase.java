package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirdDatabase {



    public static void createBird(){
        Bird b1 = new Bird("kkk","hhh",1);
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(b1);
        birds.add(new Bird("nnn","lll", 2));
        System.out.println(birds);

    }

    //createBirds()


    //addBirds()


    //listBirds()

}

