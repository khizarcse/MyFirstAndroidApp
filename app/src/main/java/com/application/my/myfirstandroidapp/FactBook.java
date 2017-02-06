package com.application.my.myfirstandroidapp;

import java.util.Random;

/**
 * Created by sony on 1/4/2017.
 */

public class FactBook {

    //member variables(properties about the object)
    public String[] mFacts ={
            "Banging your head against a wall burns 150 calories an hour.",
            "In the UK, it is illegal to eat mince pies on Christmas Day!",
            "When hippos are upset, their sweat turns red.",
            "A flock of crows is known as a murder.",
            "Facebook Addiction Disorder” is a mental disorder identified by Psychologists.",
            "he average woman uses her height in lipstick every 5 years." ,
            "Cherophobia is the fear of fun.",
            "Human saliva has a boiling point three times that of regular water.",
            "If you lift a kangaroo’s tail off the ground it can’t hop.",
            "Billy goats urinate on their own heads to smell more attractive to females.",
            "The person who invented the Frisbee was cremated and made into frisbees after he died!",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "If Pinokio says “My Noes Will Grow Now”, it would cause a paradox. Details here.",
            "Polar bears can eat as many as 86 penguins in a single sitting. (If they lived in the same place)",
            "King Henry VIII slept with a gigantic axe beside him.",
            "Bikinis and tampons invented by men.",
            "An eagle can kill a young deer and fly away with it."};
    // methods(abilities: things that object can do)
    public String getFact(){

        String fact = "";
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];


        return fact;

    }

}
