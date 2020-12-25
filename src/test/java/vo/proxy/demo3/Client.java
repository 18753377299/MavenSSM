package vo.proxy.demo3;

//租客
public class Client {
  public static void main(String []args) {
	  // 真实角色
	  Host host = new Host();
	  // 代理角色
	  ProxyInvocationHandler proxyInvocationHandler=
			  new ProxyInvocationHandler();
	  //通过调用程序处理角色来处理我们要调用的接口对象
	  proxyInvocationHandler.setRent(host);
	 // 这里的proxy就是动态生成的，我们并没有写
	  Rent rent =(Rent)proxyInvocationHandler.getProxy();
	  rent.rent();
	  
	  // 工具类形式的动态代理
	  ProxyInvocationHandlerUtils  piHandlerUtils= 
			  new ProxyInvocationHandlerUtils();
	  piHandlerUtils.setTarget(rent);
	  Rent rentTwo =    (Rent)piHandlerUtils.getProxy();
	  rentTwo.rent();
	  
  }
}
