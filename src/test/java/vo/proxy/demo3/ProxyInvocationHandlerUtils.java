package vo.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandlerUtils  implements InvocationHandler{

	//被代理的接口
	public Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	//	生成得到代理类
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

//处理代理实例，并返回结果
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		// 动态代理的本质，就是使用反射机制实现
		 Object result = method.invoke(target, args);
		 
		return  result;
	}

}
