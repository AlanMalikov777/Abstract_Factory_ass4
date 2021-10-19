package com.company;

public class BasketballBall implements BallType{
    @Override
    public void writeBallCharacteristics() {
        System.out.println(" Basketball ball's characteristics:\n Diameter(cm): 23,85 - 24,84\n Weight(gram): 567 - 650\n Color: Orange(may have other variations)\n");
    }
}
