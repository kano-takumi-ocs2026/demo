package com.example.demo.chat;

import org.springframework.web.bind.annotation.*;

import com.example.demo.chat.message.ChatMessage;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
@CrossOrigin
public class ChatController {

    private final List<ChatMessage> messages = new ArrayList<>();

    // メッセージ送信
    @PostMapping
    public void sendMessage(@RequestBody String message) {
        ChatMessage chatMessage = new ChatMessage(message, 1L, 1L, 1L);
        messages.add(chatMessage);
    }

    // メッセージ取得
    @GetMapping
    public List<ChatMessage> getMessages() {
        return messages;
    }
}