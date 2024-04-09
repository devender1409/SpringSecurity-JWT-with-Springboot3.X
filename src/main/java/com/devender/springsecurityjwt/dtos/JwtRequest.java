package com.devender.springsecurityjwt.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
