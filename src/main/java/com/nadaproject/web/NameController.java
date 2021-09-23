package com.nadaproject.web;

import com.nadaproject.service.posts.PostsService;
import com.nadaproject.web.dto.GpsInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NameController {

    private final PostsService postsService;

    @PutMapping("/add/friend/{id}")
    public String addFriendId(@PathVariable Long id, @RequestBody GpsInfoDto gpsInfoDto) {
        //id는 자기 자신의 id.
        boolean answer = false;
        String myId = postsService.gpsAddUpdate(id,gpsInfoDto); //시간, gps데이터 저장

        return myId;
    }

}
