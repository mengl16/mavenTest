package reflection;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ExampleObject
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/12 16:00
 * Version 1.0
 **/
public class ExampleObject extends FatherObject{
    public int age = 30;
    public String name = "byhieg";
    private Integer score = 60;

    private List<String> strings=null;

    private Map<Integer,String> map=null;


    public void printName(){
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


    public ExampleObject(){

    }

    public ExampleObject(String name){

    }

    public ExampleObject(int age,Integer score){

    }

    @Override
    public void doSomething() {
        super.doSomething();
    }

    @Override
    public void run() {
        System.out.println("run......");
    }


    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
