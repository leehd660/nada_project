package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserListDto {
    private String name;
    private String email;
//    private Role role;

    @Builder
    public UserListDto(User_info entity){
        this.name= entity.getName();
        this.email = entity.getEmail();
//        this.role = entity.getRole();
    }

    public User_info toEntity(){
        return User_info.builder().name(name).email(email).build();
    }

}
