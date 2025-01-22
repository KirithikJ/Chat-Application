package com.Chat1.chatApplication01.controller;


import com.Chat1.chatApplication01.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class chatController {

	  @MessageMapping("/app/sendMessage")
	    @SendTo("/topic/messages")
	    public ChatMessage sendMessage(ChatMessage message) {
	        return message;
	    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}