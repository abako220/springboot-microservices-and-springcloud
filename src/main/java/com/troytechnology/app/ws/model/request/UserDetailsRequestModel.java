package com.troytechnology.app.ws.model.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDetailsRequestModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
