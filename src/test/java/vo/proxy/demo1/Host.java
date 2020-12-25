package vo.proxy.demo1;

//房东
public class Host implements Rent{

	@Override
	public void rent() {
		System.out.println("出租房子");
	}

}
