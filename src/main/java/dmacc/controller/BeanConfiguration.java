package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Contribution;
import dmacc.beans.Contributor;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contributor contributor() {
		Contributor bean = new Contributor("Name", "Username");
		return bean;
	}
	
	@Bean
	public Contribution contribution() {
		Contribution bean = new Contribution("User", "does this", "to achieve this", "priority");
		return bean;
	}

}
