package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Michael on 2017/6/20.
 */


@RestController
class ImageController{
    @RequestMapping("/image/a")
    fun getImageA():String{
        return "<img src=\"/images/when_we_young.jpg\">"
    }

}
