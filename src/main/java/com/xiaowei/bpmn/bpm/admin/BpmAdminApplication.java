package com.xiaowei.bpmn.bpm.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author a
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xiaowei.*")
@MapperScan({"com.xiaowei.bpmn.bpm.admin.mapper","com.xiaowei.bpmn.mysql.database.dao"})
public class BpmAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(BpmAdminApplication.class, args);
	}

}
