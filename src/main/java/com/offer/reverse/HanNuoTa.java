package com.offer.reverse;

import java.math.BigDecimal;

/**
 * 汉诺塔
 * @ClassName HanNuoTa
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/21 9:41
 * Version 1.0
 **/
public class HanNuoTa {

    private  static  int num=1;
    public static void HanNuoTa(int n,char from ,char depend,char to){
        if(n ==1 ){
            move(n, from,to);
        }
        else{
            HanNuoTa(n-1,from,to,depend);
            move(n,from,to);
            HanNuoTa(n-1,depend,from,to);
        }
    }

    private static void move(int n, char from, char to) {
        System.out.println("第"+num+++"步通第"+n+"个环过"+from+"移动到"+to);
    }

    public static void main(String[] args) {
//        HanNuoTa(3,'A','B','C');


        System.out.println(new BigDecimal(0.2).multiply(new BigDecimal(0.45)).setScale(BigDecimal.ROUND_HALF_UP,2));


    }
}
