package com.company;

public class FootballFeaturesFactory implements GameFeaturesFactory {
    @Override
    public Rules showRules() {
        return new FootballRules();
    }

    @Override
    public BallType showBallType() {
        return new FootballBall();
    }

    @Override
    public ShoesType showShoesType() {
        return new FootballShoes();
    }
}
