package designPatterns.CopyDesign;

/**
 * @ClassName ShallowCopyPattern
 * @Description TODO
 * @Author Administrator
 * @Date 2018/11/23 16:31
 * Version 1.0
 **/
public class ShallowCopyPattern implements Cloneable {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public ShallowCopyPattern clone() throws CloneNotSupportedException {
        ShallowCopyPattern shallowCopyPattern=null;
        shallowCopyPattern=(ShallowCopyPattern) super.clone();
        return shallowCopyPattern;
    }

    public static void main(String[] args) {
        ShallowCopyPattern copyPattern=new ShallowCopyPattern();
        copyPattern.setName("11");
        copyPattern.setPhone("112");
        try {
            ShallowCopyPattern c=copyPattern.clone();
            c.setName("111");
            System.out.println(copyPattern.getName());
            System.out.println(c.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
