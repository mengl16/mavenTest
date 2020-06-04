package designPatterns.BuliderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 14:30
 * Version 1.0
 **/
public class Product {
    private List<String> parts = new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }
    public void remove(String part){
        parts.remove(part);
    }
    
    
    
     
     /*
     * @Description:
     * @Param: 
     * @return: 
     * @Author: menglei
     * @Date: 2020/6/3
     */
     
     
    public void show(){
        System.out.println("产品创建");
        if(parts.size()>0){
            for(String part:parts){
                System.out.println(part);
            }
        }

    }

}
