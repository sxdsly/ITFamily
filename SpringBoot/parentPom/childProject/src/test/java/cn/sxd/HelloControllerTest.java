package cn.sxd;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.sxd.controller.HelloController;
import junit.framework.TestCase;

@SpringBootTest(classes=StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloControllerTest {
	
	@Resource
	private HelloController helloController;

	@Test
	public void testHome() {
		TestCase.assertEquals(this.helloController.helloWorld(), "Hello, World!");
	}

}
