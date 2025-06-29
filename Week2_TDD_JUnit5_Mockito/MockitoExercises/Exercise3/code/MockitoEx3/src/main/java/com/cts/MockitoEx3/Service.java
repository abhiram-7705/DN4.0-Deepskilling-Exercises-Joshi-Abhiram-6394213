package com.cts.MockitoEx3;

public class Service {
	private ExternalApi external;

	public Service(ExternalApi external) {
		this.external = external;
	}
	
	public boolean getData(int a)
	{
		return external.getData(a);
	}

}
