package com.nadaproject.web;

import com.google.gson.Gson;
import com.nadaproject.service.posts.PostsService;
import com.nadaproject.web.dto.UserAddInfoDto;
import com.nadaproject.web.dto.UserListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class JsonController {

    private final PostsService postsService;

    @GetMapping("/view/info")
    public String viewInfo(){
        String post_list = new Gson().toJson(postsService.findAllDesc());
        return post_list;
    }

    @GetMapping("/view/post/{id}")
    public String viewPost(@PathVariable Long id) {
        String id_post_list = new Gson().toJson(postsService.findById(id));
        return id_post_list;
    }

//    @GetMapping("/now/user")
//    public String viewNowUser(@LoginUser SessionUser user){
//        String nowUserInfo = new Gson().toJson(user);
//        return nowUserInfo;
//    }

    @PostMapping("/user/login/google")
    public String saveUser (@RequestBody UserListDto userdto) {
        String saveResult = postsService.userSave(userdto);
        String[] result = saveResult.split(" ");
        Map<String, Object> map = new HashMap();
        map.put("id", result[0]);
        map.put("result", result[1]);
        String id_list = new Gson().toJson(map);
        return id_list;
    }

    @PutMapping("/user/login/addinfo/{id}")
    public String saveAddInfo (@PathVariable Long id, @RequestBody UserAddInfoDto userAddInfoDto){
        boolean answer = false;
        String strId = Long.toString(id);
        String str = postsService.userAddUpdate(id,userAddInfoDto);
        if (str.equals(strId)){
            answer = true;
        }
        Map<String, Object> map = new HashMap();
        map.put("result", answer);
        String result_list = new Gson().toJson(map);

        return result_list;
    }

}
