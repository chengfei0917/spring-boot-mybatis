package ggcc.mybatis;

import ggcc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ggcc.mybatis.domain.User;

@SpringBootApplication
public class ApplicationMain implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationMain.class, args);
	}

    @Autowired
    private UserService userService;

	@Override
	public void run(String... args) {
//        System.out.println("Adding User");
//		User newUser = new User("ggcc@qq.com", "mybatis test");
//        userService.addUser(newUser);
//        System.out.println("Getting User:"+newUser.getId());
        User user = userService.getUser(1);
        System.out.println(user.getUserName());
	}

}
