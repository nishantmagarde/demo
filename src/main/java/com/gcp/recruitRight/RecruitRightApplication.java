package com.gcp.recruitRight;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcp.recruitRight.dao.UserRespository;
import com.gcp.recruitRight.entities.User;


@SpringBootApplication
public class RecruitRightApplication {

	public static void main(String[] args) {
		
		//JPA
		ApplicationContext context = SpringApplication.run(RecruitRightApplication.class, args);
		CrudRepository userRepository = context.getBean(UserRespository.class);
		User user = new User();
		user.setName("Nishnt");
		user.setCity("BHopal");
		user.setStatus("hd");
		User save = (User) userRepository.save(user);
		System.out.println(save);
		
		//jdbcTemplate
		ApplicationContext context1 = new AnnotationConfigApplicationContext(JdbcConfig.class);
		JdbcTemplate template =context.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="insert into user(id,name,city,status) values(?,?,?,?)";
		int result = template.update(query,15,"Nishant","ssdf","sdf");
		System.out.println("inserted row : "+result);
	}

}
