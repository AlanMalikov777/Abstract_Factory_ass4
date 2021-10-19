package com.company;

public class FootballBall implements BallType{
    @Override
    public void writeBallCharacteristics() {
        System.out.println(" Football ball's characteristics:\n Diameter(cm): 21,65 - 22,28\n Weight(gram): 410 - 450\n Color: White and Black(may have other variations)\n");
    }
}
