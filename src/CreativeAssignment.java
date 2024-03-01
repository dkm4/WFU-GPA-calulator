/**************************************************************************************************************************************
 * @file    CreativeAssignment.java
 * @brief   This program implements a program that suggest martial arts that best fits the user based on user's answer to the question
 * @author  Kyung mo Doh
 * @data    September 19, 2023
 **************************************************************************************************************************************/

import java.util.Scanner;   //import Scanner in the program

public class CreativeAssignment {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  //new scanner command program "scnr"

        String yesOrNo;         //Contain yes or true
        String firstAnswer;     //Answer to the first question about prefer martial arts fighting against different weight class
        String secondAnswer;    //Answer to the second question about the preference over stand-up martial art
        String thirdAnswer;     //Answer to the third question about the preference of using legs over arms
        int age;                //Age of the user
        boolean fightDifferentClass = false;    //Change value to true if user prefer to fight against different weight class
        boolean standUpMartialArt = false;      //Change value to ture if user prefer to learn stand-up martial art
        boolean useFoot = false;                //Change value to true if user prefer to use leg over arm

        System.out.println("Hi, I'm UFCFAN, a program designed to find the best martial art that suit your aptitude!");
        System.out.println("\nTo find the best martial art for you, I need to ask few questions. Is it okay? (Answer by yes or no)");
        yesOrNo = scnr.next();

        //if yes ask the next question. If no end the program
        if(yesOrNo.equals("yes")){
            System.out.println("\nOkay let's get started!");
            System.out.println("\nHow old are you?");
            age = scnr.nextInt();
            //if the age is 80 or order, end the program
            if(age >= 80){
                System.out.println("Sorry, you might be too old to start new martial art");
            }
            else{
                System.out.println("It's your time to start new martial art!");
                System.out.println("\n*****Answer all the following question in yes or no*****\n");
                System.out.println("Do you want to learn a martial art design to fight against people in different weight class?");
                firstAnswer = scnr.next();
                if(firstAnswer.equals("yes")){
                    fightDifferentClass = true;
                }

                System.out.println("Do you prefer stand-up fighting?");
                secondAnswer = scnr.next();
                if(secondAnswer.equals("yes")){
                    standUpMartialArt = true;
                }
                System.out.println("Do you prefer using leg instead of arms?");
                thirdAnswer = scnr.next();
                if(thirdAnswer.equals("yes")){
                    useFoot = true;
                }

                //assign appropriate martial arts based on users input
                if(fightDifferentClass){
                    if((standUpMartialArt) && (useFoot)){
                        System.out.println("You should learn Taekwondo");
                    }
                    else if(useFoot){
                        System.out.println("You should learn brazilian Jiu Jitsu");
                    }
                    else if(standUpMartialArt){
                        System.out.println("You should learn Baguajang");
                    }
                    else{
                        System.out.println("You should learn Judo");
                    }
                }
                else {
                    if ((standUpMartialArt) && (useFoot)) {
                        System.out.println("You should learn Kick Boxing");
                    } else if (useFoot) {
                        System.out.println("You should learn Modern Jiu Jitsu");
                    } else if (standUpMartialArt) {
                        System.out.println("You should learn Boxing");
                    } else {
                        System.out.println("You should learn Wrestling");
                    }
                }

            }
        }
        else if(yesOrNo.equals("no")){
            System.out.println("\nSorry, see you next time...");
        
        }
    }

}
