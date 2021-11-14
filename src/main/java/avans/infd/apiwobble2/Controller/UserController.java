package avans.infd.apiwobble2.Controller;

import avans.infd.apiwobble2.Domain.User;
import avans.infd.apiwobble2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/user")
public class UserController {


    private final UserService service;

    //Connect automatically to the User service layer.
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(path = "list")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }


}
