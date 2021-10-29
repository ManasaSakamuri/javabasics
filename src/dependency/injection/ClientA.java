package dependency.injection;

import java.security.Provider;
import java.security.Provider.Service;

import javax.xml.stream.events.Comment;

public abstract class ClientA implements Comment{
	
	private static final char[] Info = null;
	Service service;
	
	public ClientA(Service serv) {
		service = serv;
		
	}
	public void doSomething() {

		System.out.println(Info);
	}

}
