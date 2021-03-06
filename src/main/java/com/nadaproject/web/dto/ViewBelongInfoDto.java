package com.nadaproject.web.dto;

import com.nadaproject.domain.belonginfo.Belong_info;
import lombok.Getter;

@Getter
public class ViewBelongInfoDto {
    private String belong_data;
    private String position_data;
    private String tel_data;
    private String start_data;
    private String fin_data;

    public ViewBelongInfoDto (Belong_info entity) {
        this.belong_data = entity.getBelong_data();
        this.position_data = entity.getPosition_data();
        this.tel_data = entity.getTel_data();
        this.start_data = entity.getStart_data();
        this.fin_data = entity.getFin_data();
    }
}
