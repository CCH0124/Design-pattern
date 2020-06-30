package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    /**
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }
    
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
            new InvocationHandler(){
                /**
                 * 調用方法
                 */
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // TODO Auto-generated method stub
                    
                    System.out.println("JDK Proxy...");
                    Object result = method.invoke(target, args);
                    System.out.println("JDK end....");
                    return result;
                }
            }
        );
    }
}