package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Let's take a sport what about you want to know more");
        System.out.println("1.Basketball\n2.Football\n3.Volleyball");
        GameFeaturesFactory basketball= new BasketballFeaturesFactory();
        GameFeaturesFactory football= new FootballFeaturesFactory();
        GameFeaturesFactory volleyball= new VolleyballFeaturesFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose:");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                Rules basketballRules = basketball.showRules();
                basketballRules.writeRules();
                BallType basketballBall = basketball.showBallType();
                basketballBall.writeBallCharacteristics();
                ShoesType basketballShoes =basketball.showShoesType();
                basketballShoes.writeShoesType();
                break;
            case 2:
                Rules footballRules = football.showRules();
                footballRules.writeRules();
                BallType footballBall = football.showBallType();
                footballBall.writeBallCharacteristics();
                ShoesType footballShoes =football.showShoesType();
                footballShoes.writeShoesType();
                break;
            case 3:
                Rules volleyballRules = volleyball.showRules();
                volleyballRules.writeRules();
                BallType volleyballBall = volleyball.showBallType();
                volleyballBall.writeBallCharacteristics();
                ShoesType volleyballShoes =volleyball.showShoesType();
                volleyballShoes.writeShoesType();
                break;
            default:
                System.out.println("Please, refresh the program and choose number between 1-3 only.");
        }
    }
}
