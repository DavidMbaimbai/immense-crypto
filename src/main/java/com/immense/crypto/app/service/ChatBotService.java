package com.immense.crypto.app.service;


import com.immense.crypto.app.model.CoinDTO;
import com.immense.crypto.app.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
