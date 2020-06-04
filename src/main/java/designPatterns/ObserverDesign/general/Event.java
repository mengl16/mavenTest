package designPatterns.ObserverDesign.general;

import java.lang.reflect.Method;

/**
 * @ClassName Event 事件类
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/29 10:12
 * Version 1.0
 **/
public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramType;

    public Event(Object object, String methodName, Object[] params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamType() {
        return paramType;
    }

    public void setParamType(Class[] paramType) {
        this.paramType = paramType;
    }

    private void contractParamTypes(Object[] params){
        if(params.length>0){
            this.paramType=new Class[params.length];
            for(int i =0;i<params.length;i++){
               this.paramType[i] = params[i].getClass();
            }
        }
    }
    public void invoke(){
        Class  c =object.getClass();
        try {
            Method m = c.getDeclaredMethod(this.methodName,this.paramType);
            m.invoke(object,params);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
