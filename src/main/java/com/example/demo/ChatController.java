package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatController {

    private final List<String> messages = new ArrayList<>();

    // メッセージ送信
    @PostMapping
    public void sendMessage(@RequestBody String message) {
        messages.add(message);
    }

    // メッセージ取得
    @GetMapping
    public List<String> getMessages() {
        return messages;
    }
}