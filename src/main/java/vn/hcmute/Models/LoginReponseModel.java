package vn.hcmute.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginReponseModel {
    private String token;

    private Long expiresIn;

    public String getToken() {
        return token;
    }
}

