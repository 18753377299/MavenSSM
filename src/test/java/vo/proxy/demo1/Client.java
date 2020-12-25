package vo.proxy.demo1;

import vo.proxy.demo2.UserServiceImpl;
import vo.proxy.demo2.UserServiceProxy;

//租客
public class Client {
  public static void main(String []args) {
	  Host host = new Host();
	  // 代理，一般会有以下附属操作
	  Proxy proxy =new Proxy(host);
	  //不用面对房东，就可以租到房子。
	  proxy.rent();
	  
	  UserServiceImpl impl = new UserServiceImpl();
	  UserServiceProxy userServiceProxy = new UserServiceProxy();
	  userServiceProxy.setUserService(impl);
	  userServiceProxy.add();
  }
}
