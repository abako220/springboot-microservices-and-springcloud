
package com.troytechnology.app.ws.controller;

import com.troytechnology.app.ws.model.request.UserDetailsRequestModel;
import com.troytechnology.app.ws.model.response.UserRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {

    @GetMapping(path = "/{id}", 
    produces = { 
            MediaType.APPLICATION_XML_VALUE, 
         MediaType.APPLICATION_JSON_VALUE, 
})
    public ResponseEntity<UserRest> getUser(@PathVariable("id") String userId) {
        UserRest user = new UserRest();
        user.setFirstName("troy");
        user.setLastName("Doe");
        user.setEmail("abc@amazon.come");
        user.setUserId("001");
        return new ResponseEntity<UserRest>(user, HttpStatus.OK);
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
        },
        consumes  = { 
            MediaType.APPLICATION_XML_VALUE, 
            MediaType.APPLICATION_JSON_VALUE, 
    }
        )
    public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel u) {
        UserRest user = new UserRest();
        user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        user.setEmail(u.getEmail());
        user.setUserId("001");
        return new ResponseEntity<UserRest>(user, HttpStatus.OK);
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