package sho.java8.playground.lambdas;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name = "sho.java8.playground.lambdas", immediate = true)
public class MyLambdas
{
	private static Logger LOG = LoggerFactory.getLogger(MyLambdas.class);

	@Activate
	void activate()
	{
		System.out.println("Test");
		LOG.info("Test");
	}
}
