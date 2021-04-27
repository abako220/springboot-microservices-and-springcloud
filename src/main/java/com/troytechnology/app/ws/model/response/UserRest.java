package com.troytechnology.app.ws.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UserRest {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
    

}
