package com.designPatterns.simpeFactoryPattern;

public class Division extends BaseData {
    @Override
    public int getResult() {
        return getX()/getY();
    }
}
