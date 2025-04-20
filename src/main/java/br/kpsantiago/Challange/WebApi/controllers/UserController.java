package br.kpsantiago.Challange.WebApi.controllers;

import br.kpsantiago.Challange.domain.entities.User;
import br.kpsantiago.Challange.domain.interfaces.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
@Tag(name = "Users")
public class UserController
{
    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> getAll()
    {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Long id)
    {
        return userService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody User user)
    {
        userService.create(user);
    }
}
