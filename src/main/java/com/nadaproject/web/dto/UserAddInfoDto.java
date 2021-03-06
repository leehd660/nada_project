package com.nadaproject.web.dto;

import com.nadaproject.domain.userinfo.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserAddInfoDto {
    private String name;
    private String phone_num;
    private String bluetooth_data;
    private String birth_data;

    @Builder
    public UserAddInfoDto(User_info entity){
        this.name = entity.getName();
        this.phone_num = entity.getPhone_num();
        this.bluetooth_data = entity.getBluetooth_data();
        this.birth_data = entity.getBirth_data();
    }

    public User_info toEntity(){
        return User_info.builder().name(name).phone_num(phone_num).bluetooth_data(bluetooth_data).birth_data(birth_data).build();
    }

}
