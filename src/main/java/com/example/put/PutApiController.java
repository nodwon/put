package com.example.put;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController{
    @PutMapping("/put")
    public  PostRequsetDto put(@RequestBody PostRequsetDto requestDto){
        System.out.println(requestDto);
        return requestDto;
    }

}
