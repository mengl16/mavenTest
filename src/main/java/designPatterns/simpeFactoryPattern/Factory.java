package designPatterns.simpeFactoryPattern;

public class Factory {
    public static BaseData createObject(String type){
        BaseData data=null;
        switch (type){
           case "add":
               data=new AddData();
               break;
           case "sub":
                data=new SubtractionData();
                break;
            case "mutil":
                data=new MutilPlicationData();
                break;
            case "divi":
                data=new Division();
                break;
                default:
                    break;
        }
        return data;
    }
}
