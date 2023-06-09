package com.sh.chicken.domain.user.api.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersSignUpReqDto {
    private String username;
    private String pw;
    private String nickname;
    private int sex;

    public UsersSignUpReqDto(String username, String pw, String nickname, int sex) {
        this.username = username;
        this.pw = pw;
        this.nickname = nickname;
        this.sex = sex;
    }
}
