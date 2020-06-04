package com.offer.reverse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName saveMoney
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/26 16:02
 * Version 1.0
 **/
public class saveMoney {

    public static Map<BigDecimal,List<Point>> saveMoney(BigDecimal chargingDemand, List<Point> Points,int startIndex){
        Map<BigDecimal,List<Point>> decimalListMap =null;

        if(chargingDemand==null || chargingDemand.compareTo(BigDecimal.ZERO)<=0){
            return decimalListMap;
        }
        if(Points !=null&& Points.size()>0){
            List<Point> points=new ArrayList<>();
            //当前指针
//            int index=startIndex;
            int i=startIndex;
            boolean endFlag=false;
            BigDecimal currentELe=BigDecimal.ZERO;
            BigDecimal currentMoney=BigDecimal.ZERO;
            while(i<=(Points.size()-1)&&!endFlag){
                currentELe=currentELe.add(Points.get(i).getElectricQuantity()).setScale(2,BigDecimal.ROUND_HALF_UP);
                currentMoney=currentMoney.add(Points.get(i).getElectricQuantity().multiply(Points.get(i).getElectricPrice())).setScale(2,BigDecimal.ROUND_HALF_UP);
                points.add(Points.get(i));
                if(currentELe.compareTo(chargingDemand)>=0){
                    endFlag=true;
                    break;
                }
                i++;
            }
            if(endFlag&&i<Points.size()){
                decimalListMap =new HashMap<>();
                decimalListMap.put(currentMoney,points);
                Map<BigDecimal, List<Point>> listMap = saveMoney(chargingDemand, Points, i);
                if(listMap!=null&&listMap.size()>0){
                    //比较金额
                    BigDecimal money=listMap.keySet().iterator().next();
                    System.out.println("算出的金额为"+money);
                    System.out.println("比较的金额为"+currentMoney);
                    if(money!=null&&money.compareTo(BigDecimal.ZERO)>0&&currentMoney!=null&&currentMoney.compareTo(BigDecimal.ZERO)>0){
                        if(money.compareTo(currentMoney)<=0){
                            return listMap;
                        }else{
                            return decimalListMap;
                        }
                    }
                }
            }

        }
        return decimalListMap;
    }

    public static void main(String[] args) {
        List<Point> Points = new ArrayList<>();
        BigDecimal rate=new BigDecimal(5).divide(new BigDecimal(60),2,BigDecimal.ROUND_HALF_UP);
        BigDecimal low=new BigDecimal(1);
        BigDecimal p=new BigDecimal(1);
        BigDecimal price=new BigDecimal(0.1);
        BigDecimal lowPrice=new BigDecimal(0.2);
        BigDecimal high=new BigDecimal(7);
        BigDecimal highPrice=new BigDecimal(0.5);
        for(int i=0;i<64;i++){
            Point point = new Point();
            BigDecimal power=low;
            BigDecimal electricPrice=lowPrice;
            BigDecimal electricQuantity=BigDecimal.ZERO;
            if(i/10==0){
                 power=low;
                 electricPrice=highPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
                 electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }else if(i/10==1){
                 power=low.add(p.multiply(new BigDecimal(1))).setScale(2,BigDecimal.ROUND_HALF_UP);
                 electricPrice=lowPrice.add(price.multiply(new BigDecimal(3))).setScale(2,BigDecimal.ROUND_HALF_UP);
                 electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }else if(i/10==2){
                power=low.add(p.multiply(new BigDecimal(2))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricPrice=lowPrice.add(price.multiply(new BigDecimal(2))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }else if(i/10==3){
                power=low.add(p.multiply(new BigDecimal(3))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricPrice=lowPrice.add(price.multiply(new BigDecimal(1))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }else if(i/10==4){
                power=low.add(p.multiply(new BigDecimal(4))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricPrice=lowPrice.add(price.multiply(new BigDecimal(1))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }else if(i/10==5){
                power=low.add(p.multiply(new BigDecimal(5)).setScale(2,BigDecimal.ROUND_HALF_UP));
                electricPrice=lowPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
                electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }
            else if(i/10==6){
                power=low.add(p.multiply(new BigDecimal(6))).setScale(2,BigDecimal.ROUND_HALF_UP);
                electricPrice=lowPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
                electricQuantity=power.multiply(rate).setScale(2,BigDecimal.ROUND_HALF_UP);
            }
            point.setElectricPrice(electricPrice);
            point.setElectricQuantity(electricQuantity);
            Points.add(point);
        }
        Map<BigDecimal, List<Point>> bigDecimalListMap = saveMoney(new BigDecimal(2), Points, 0);
        System.out.println(bigDecimalListMap.keySet().iterator().next());
    }
}
