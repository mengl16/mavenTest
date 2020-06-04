package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/12 16:03
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = ExampleObject.class;
        System.out.println("类全名:" + c.getName());
        System.out.println("类名:" + c.getSimpleName());
        Class c1 = Class.forName(c.getName());
        System.out.println(c1.getSimpleName());
        System.out.println("父类全名:" + c.getSuperclass().getName());
        System.out.println("父类是不是抽象类:" + Modifier.isAbstract(c.getSuperclass().getModifiers()));
        Constructor[] constructors = c.getConstructors();
        if (constructors.length > 0) {
            for (Constructor constructor : constructors) {
                System.out.println("构造函数方法：" + constructor.toString());
                System.out.println("构造函数的方法名：" + constructor.getName());
                System.out.println("构造函数的修饰符:" + Modifier.toString(constructor.getModifiers()));
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length > 0) {
                    for (Class aClass : parameterTypes) {
                        System.out.println("构造函数的参数:" + aClass.getName());
                    }
                }

            }
        }

        Field[] f = c.getDeclaredFields();
        if (f.length > 0) {
            for (Field field : f) {
                System.out.println("变量 :" + field.toString());
                System.out.println("变量的名称 :" + field.getName());
                System.out.println("变量的类型:" + field.getType().getName());
                field.setAccessible(true);
                System.out.println("变量的值 :" + field.get(c.newInstance()));
                System.out.println("变量的修饰符 :" + Modifier.toString(field.getModifiers()));
            }
        }

        Method[] m = c.getDeclaredMethods();
        if (m.length > 0) {
            for (Method method : m) {
                System.out.println("方法 :" + method.toString());
                System.out.println("方法的名称 :" + method.getName());
                Type[] types = method.getGenericParameterTypes();
                System.out.println("方法 入参 getGenericParameterTypes:" + types);

                if (types.length > 0) {
                    for (Type type : types) {
                        if (type instanceof ParameterizedType) {
                            ParameterizedType t = (ParameterizedType) type;
                            System.out.println("方法 入参ParameterizedType:" + t);
                            Type[] tp = t.getActualTypeArguments();
                            if (tp.length > 0) {
                                for (Type tt : tp) {
                                    System.out.println("方法的入参类型:" + ((Class) tt).getName());
                                }
                            }
                        }

                    }
                }

                Type typess = method.getGenericReturnType();
                System.out.println("方法 出参 getGenericParameterTypes:" + typess);

                if (typess != null) {
                    if (typess instanceof ParameterizedType) {
                        ParameterizedType t = (ParameterizedType) typess;
                        System.out.println("方法 出参ParameterizedType:" + t);
                        Type[] tp = t.getActualTypeArguments();
                        if (tp.length > 0) {
                            for (Type tt : tp) {
                                System.out.println("方法的出参类型:" + ((Class) tt).getName());
                            }
                        }
                    }

                }
                System.out.println("方法的修饰符 :" + Modifier.toString(method.getModifiers()));
            }

        }
    }
}
