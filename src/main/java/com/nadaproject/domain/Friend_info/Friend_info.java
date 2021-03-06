package com.nadaproject.domain.Friend_info;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Friend_info {
    @Id
    private Long userId;

    @Column(nullable=false)
    private Long friendId;

    @Column
    private String meetTime;
    private double meetLatitude;
    private double meetLongitude;

    @Column
    private String memo;
    private String picture;

    @Builder
    public Friend_info(Long userId, Long friendId, String meetTime, double meetLatitude, double meetLongitude, String memo, String picture){
        this.userId = userId;
        this.friendId = friendId;
        this.meetTime = meetTime;
        this.meetLatitude = meetLatitude;
        this.meetLongitude = meetLongitude;
        this.memo = memo;
        this.picture = picture;
    }
}
