package com.example.demo.controller

import com.example.demo.model.MessageResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExistingController {

    @GetMapping("/greeting")
    fun getGreeting(): MessageResponse {
        return MessageResponse(message = "Hello, World!", status = "success")
    }
}
