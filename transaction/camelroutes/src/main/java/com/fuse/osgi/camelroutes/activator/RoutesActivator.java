package com.fuse.osgi.camelroutes.activator;

import org.apache.camel.impl.DefaultCamelContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.fuse.osgi.camelroutes.routes.MyRoute;

public class RoutesActivator implements BundleActivator {

	private DefaultCamelContext camelContext;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new MyRoute());
		camelContext.start();
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (camelContext != null) {
			camelContext.stop();
		}
	}

}
