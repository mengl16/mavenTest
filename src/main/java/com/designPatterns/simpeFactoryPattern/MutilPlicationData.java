package com.designPatterns.simpeFactoryPattern;

public class MutilPlicationData extends BaseData {
    @Override
    public int getResult() {
        return getX()*getY();
    }
}
