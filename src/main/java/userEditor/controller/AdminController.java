package userEditor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import userEditor.model.User;
import userEditor.service.UserService;

import java.util.List;

@Controller
public class AdminController {
    private UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public ModelAndView addUser(@RequestParam String name,
                                @RequestParam String email,
                                @RequestParam String password) {
        ModelAndView modelAndView = new ModelAndView();
        User user;
        modelAndView.setViewName("redirect:/list");
        user = new User(name, email, password);

        try {
            userService.add(user);
        } catch (Exception e) {
            System.out.println("User with this email exists");
        }
        return modelAndView;
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/list");
        userService.delete(id);
        return modelAndView;
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editPage(@PathVariable("id") int id) {
        User user = userService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping(value = "/edit")
    public ModelAndView editUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/list");
        userService.edit(user);
        return modelAndView;
    }

    @GetMapping(value = "/list")
    public ModelAndView listPage() {
        List<User> userList = userService.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
}
