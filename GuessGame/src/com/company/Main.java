package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){

        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){

        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Your guesses is right.It was %d\n You guess it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low.......");
        }
        else if(inputNumber>number){
            System.out.println("Too high.......");
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args){
       Game g = new Game();
       boolean b = false;
       while(!b){
           g.takeUserInput();
           b= g.isCorrectNumber();
       }
    }
}
