package com.designPatterns.simpeFactoryPattern;

public class Factory {
    


 
    
    
    

    





    /**
     * @功能描述:
     * @param   :@param type:  
     * @return  :com.designPatterns.simpeFactoryPattern.BaseData 
     * @Author  : menglei
     * @Date    : 2020/6/3 
     */
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
        }
        return data;
    }
}
