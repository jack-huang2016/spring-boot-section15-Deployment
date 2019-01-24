package com.springboot.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 现在可以直接运行 SpringBootSampleApplication的main方法，和执行普通java程序一样
 * 然后可以看到spring-boot 内置server容器（默认为Tomcat），这一切spring-boot 都帮我们做好了。
 * Started SpringBootSampleApplication in 4.895 seconds (JVM running for 5.532)
 * 
 * @author huang.yj
 * @date 2018.12.06
 *
 */

@MapperScan("com.springboot.sample.mapper") //扫描该包路径下的所有mapper
@SpringBootApplication
public class SpringBootSampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(this.getClass());
	}
}


