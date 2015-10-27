package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Administrator on 2015/10/19.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            String str = "String" + String.valueOf(value);
            InvocationHandler handler = new TraceHandler(str);

            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;
        String strk = String.valueOf(key);

        int result = Arrays.binarySearch(elements, strk);

        if (result >= 0)
            System.out.println(elements[result]);

        System.out.println(elements[333]);
        // 代理类实际上相当于在原来的类上面加上了一层壳，可以用来跟踪所有施加于其上的动作
    }
}

class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object t) {
        this.target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.println(", ");
            }
        }
        System.out.println(")");
        return method.invoke(target, args);
    }
}
