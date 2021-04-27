
package com.troytechnology.app.ws.controller;

import com.troytechnology.app.ws.model.response.UserRest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {

    @GetMapping(path = "/{id}")
    public String getUser(@PathVariable("id") String userId) {
        
        return "get user method " + userId;
    }

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "limit", defaultValue = "50") int limit) {

        return page + " " + limit;
    }

    @PostMapping(
        produces = { 
                MediaType.APPLICATION_XML_VALUE, 
                MediaType.APPLICATION_JSON_VALUE, 
        })
    public UserRest createUser() {
        UserRest user = new UserRest();
        user.setFirstName("Troy");
        user.setLastName("Doe");
        user.setEmail("test1234@gmail.com");
        user.setUserId("001");
        return user;
    }

    @PutMapping
    public String updateUser() {
        return "update user method was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user method was called";
    }

}