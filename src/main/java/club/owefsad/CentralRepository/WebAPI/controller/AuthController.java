package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.entity.User;
import club.owefsad.CentralRepository.WebAPI.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author owefsad
 */
@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService service;

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user) {
        User loginUser = service.login(user);
        if (loginUser == null) {
            return "login failed";
        }
        return "login success, uid: ";// + loginUser.getId();
    }
}
