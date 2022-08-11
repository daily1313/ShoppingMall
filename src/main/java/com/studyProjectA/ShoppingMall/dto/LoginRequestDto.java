package com.studyProjectA.ShoppingMall.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LoginRequestDto {
    @NotNull(message = "아이디를 입력해주세요")
    private String username;

    @NotNull(message = "비밀번호를 입력해주세요")
    private String password;
}
