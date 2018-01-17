package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class PoxyTest {

	public static void main(String[] args) {
		final ArrayList<String> list = new ArrayList<>();
		List<String> proxyInstance = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(),
				list.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						return method.invoke(list, args);
					}
				});
			proxyInstance.add("你好");
			System.out.println(list);
			
		
	}
}
