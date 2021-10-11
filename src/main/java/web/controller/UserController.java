package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(ModelMap model){
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/new-user")
    public String createUserForm (ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        modelMap.addAttribute("title", "Add new User");
        return "user-form";
    }

    @PostMapping("/new-user")
    public String saveUser (User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/user-delete/{id}")
    public String deleteUser (@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user-edit/{id}")
    public String updateUserForm (@PathVariable("id") Long id, ModelMap modelMap) {
        User user = userService.getById(id);
        modelMap.addAttribute("user", user);
        modelMap.addAttribute("title", "Update User");
        return "user-form";
    }

    @PostMapping("/user-edit")
    public String updateUser (User user) {
        userService.update(user);
        return "redirect:/users";
    }
}
