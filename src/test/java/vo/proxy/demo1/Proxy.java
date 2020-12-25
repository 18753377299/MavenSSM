package vo.proxy.demo1;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.ietf.jgss.Oid;

//中介
public class Proxy implements Rent{
    
	// 中介代理房东
	private Host host;
	
	public Proxy() {
		super();
	}

	public Proxy(Host host) {
		super();
		this.host = host;
	}
	

	@Override
	public void rent() {
		seeHouse();
		host.rent();
	}
	
	// 看房
	public void seeHouse() {
		System.out.println("看房");
	}

}
