package designPatterns.ObserverDesign.base;

/**
 * @ClassName StockObserver
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/26 9:44
 * Version 1.0
 **/
public class StockObserver {
    private  String name;
    private Secretary secretary;

    public StockObserver(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void update(){
        System.out.println( "关闭股票详情"+secretary.getAction()+name);
    }
}
