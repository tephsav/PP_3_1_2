package app.config;

import app.model.User;
import app.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbInit {
    private final UserService userService;

    public DbInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void createUsers() {
        userService.addUser(new User("John", 25));
        userService.addUser(new User("Mary", 30));
        userService.addUser(new User("Alex", 22));
        userService.addUser(new User("Elena", 28));
    }
}
