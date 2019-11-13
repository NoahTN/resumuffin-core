package resu.muffin.users_and_comments.users.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import resu.muffin.users_and_comments.users.db.RoleRepo;
import resu.muffin.users_and_comments.users.db.UserRepo;
import resu.muffin.users_and_comments.users.entities.User;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private RoleRepo roleRepo;

    @GetMapping("/getUser")
    @ResponseBody
    User getUser() {
        User user = new User();
        return user;    
    }

    @GetMapping("/addUser")
    void addUser(User user) {
        userRepo.save(user);
    }
}