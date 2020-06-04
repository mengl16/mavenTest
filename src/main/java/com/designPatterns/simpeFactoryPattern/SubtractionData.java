package com.designPatterns.simpeFactoryPattern;

public class SubtractionData extends BaseData{
    @Override
    public int getResult() {
        return getX()-getY();
    }
}
