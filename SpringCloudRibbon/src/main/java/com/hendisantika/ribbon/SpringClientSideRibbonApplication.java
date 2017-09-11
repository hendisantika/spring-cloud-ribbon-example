package com.hendisantika.ribbon;
/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/10/17
 * Time: 8:07 AM
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.hendisantika.ribbon.config.Configuration;

@SpringBootApplication
@RibbonClient(name = "helloworld", configuration = Configuration.class)
public class SpringClientSideRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientSideRibbonApplication.class, args);
	}
}