package vo.proxy.demo2;

//就是在原有的代码上包装一层，防止直接修改原来的代码导致出错。
//在不改变原有代码的基础上实现类的增强-->面向切面，进行横向切。
// 这个是静态代理
public class UserServiceProxy implements UserService {

	private UserServiceImpl userService;
	
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	@Override
	public void add() {
		log("add");
		userService.add();	
	}
	
	public void log(String msg) {
		System.out.println("[debug]"+msg+"信息");
	}

}
