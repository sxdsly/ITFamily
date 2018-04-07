package cn.sxd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @SpringBootApplication配置更加简洁
 * @SpringBootApplication = @EnableAutoConfiguration + @ComponentScan("cn.sxd") + 其他配置
 * 
 * @author Administrator
 *
 */

@SpringBootApplication
public class StartSpringBootMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartSpringBootMain.class, args);
    }
}
