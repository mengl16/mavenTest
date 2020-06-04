package designPatterns.simpeFactoryPattern;

public class AddData extends BaseData{
    @Override
    public int getResult() {
        return getX()+getY();
    }
}
