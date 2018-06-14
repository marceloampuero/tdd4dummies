package io.twentythreepeople.training.tdd4dummies;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.twentythreepeople.training.tdd4dummies.controllers.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTests {

	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();

	}

}
