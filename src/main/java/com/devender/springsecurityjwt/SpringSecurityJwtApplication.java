package com.devender.springsecurityjwt;

//import com.devender.springsecurityjwt.model.entity.AppUser;
//import com.devender.springsecurityjwt.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJwtApplication implements CommandLineRunner {

//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(){
		return (args)->{
//			userService.addUser(AppUser.builder().userName("devender.kumar").password("dev123").build());
		};
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.addUser(AppUser.builder().userName("devender.kumar").password("dev123").build());

	}
}
