package com.example.demo3.api;

import com.example.demo3.bean.User;
import com.example.demo3.service.UserMessagingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/user",
        produces="application/json")
@CrossOrigin(origins="*")
public class UserApiController {
    private UserMessagingService messageService;
    public UserApiController(
            UserMessagingService messageService) {
        this.messageService = messageService;
    }
    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void postOrder(@RequestBody User user) {
        System.out.println(user);
        messageService.sendOrder(user);
    }
    @GetMapping
    public User getUser() {
        return new User();
    }
}