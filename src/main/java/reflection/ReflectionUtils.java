package reflection;


import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ReflectionUtils
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/12 16:15
 * Version 1.0
 **/
public class ReflectionUtils {
    static Logger logger = Logger.getLogger(ReflectionUtils.class);

    /**
     * 循环向上转型, 获取对象的 DeclaredMethod
     *
     * @param object         : 子类对象
     * @param methodName     : 父类中的方法名
     * @param parameterTypes : 父类中的方法参数类型
     * @return 父类中的方法对象
     */
    public static Method getDeclaredMethod(Object object, String methodName,
                                           Class<?>... parameterTypes) {
        Method m = null;
        Class<?> c = null;
        for (c = object.getClass(); c.getSuperclass() != Object.class; c = c.getSuperclass()) {
        }
        if (c != null) {
            try {
                m = c.getDeclaredMethod(methodName, parameterTypes);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return m;
    }

    /**
     * 获取对象的 DeclaredMethod
     *
     * @param object     : 类对象
     * @param methodName : 类中的方法名
     */
    public static Method getDeclaredMethod(Object object, String methodName) {
        Class c = object.getClass();
        Method[] methods = c.getDeclaredMethods();
        if (methods.length > 0) {
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    return method;
                }
            }
        }
        return null;
    }

    /**
     * 获取共有的方法的list集合
     *
     * @param clazz
     * @return
     */
    public static List<Method> getDeclaredMethods(Class<?> clazz) {
        return Arrays.asList(clazz.getMethods());
    }


    /**
     * 循环向上转型, 获取对象的 DeclaredFields
     *
     * @param object : 子类对象
     * @return 对象所有的属性
     */

    public static List<Field> getDeclaredFields(Object object) {
        List<Field> list = new ArrayList<>();
        Class c = null;
        for (c = object.getClass(); c.getSuperclass() != Object.class; c = c.getSuperclass()) {
            Field[] fields = c.getDeclaredFields();
            if (fields.length > 0) {
                for (Field f : fields) {
                    list.add(f);
                }
            }
        }
        return list;
    }

    /**
     * 循环向上转型, 获取对象的 DeclaredField
     *
     * @param object    : 子类对象
     * @param fieldName : 父类中的属性名
     * @return 父类中的属性对象
     */

    public static Field getDeclaredField(Object object, String fieldName) {
        Class c = null;
        Field f = null;
        for (c = object.getClass(); c.getSuperclass() != Object.class; c = c.getSuperclass()) {
            try {
                f = c.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    //无Exception的newInstance方法
    public static Object newInstance(String className) {

        try {
            Class c = Class.forName(className);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //无Exception的newInstance方法
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            logger.error(e, e);
            return null;
        }
    }

    // 获取List泛型类型的泛型参数
    public static Type getListType(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            Type[] types = pt.getActualTypeArguments();
            return types[0];
        } else {
            throw new RuntimeException("the type is not List.");
        }
    }

    // 获取map泛型类型的值的泛型参数
    public static Type getMapValueType(Type type) {
        if (type instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            if (types.length > 0) {
                return types[1];
            }
            return null;
        } else {
            throw new RuntimeException("the type is not Map");
        }
    }

    //获取递归方法
    public static Method recursiveMethod(Object o, String methodName,
                                         Class<?>... type) {
        Class<?> oClass = o.getClass();
        while (oClass != null) {
            try {
                return oClass.getDeclaredMethod(methodName, type);
            } catch (Exception e) {
                oClass = oClass.getSuperclass();
            }
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String methodName, Object... args) {
        Class<?> objClass = obj.getClass();
        Method m = null;
        try {
            Class<?>[] type = new Class<?>[args.length];
            for (int i = 0; i < args.length; i++) {
                type[i] = args[i].getClass();
            }
            m = recursiveMethod(obj, methodName, type);
            Object o = m.invoke(obj, args);
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ReflectionUtils.getDeclaredMethod(new ExampleObject(), "doSomething", null);
    }


}
