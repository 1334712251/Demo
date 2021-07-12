package demo8;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class dd {

    aa a = new aa();
    public void ss(){
        Object o = Proxy.newProxyInstance(a.getClass().getClassLoader(), a.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("ddd");
                Object invoke = method.invoke(a, args);
                return invoke;
            }
        });
    }
}
