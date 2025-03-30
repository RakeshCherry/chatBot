package com.springboot.ChatBot.dto;

import java.util.List;


public record ChatGPTResponse(List<Choice> choices) {

        public static record Choice(ChatGPTRequest.Message message) {

            public static record Message(String role, String content) {

            }

        }


}
