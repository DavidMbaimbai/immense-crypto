package com.immense.crypto.app.service;


import com.immense.crypto.app.model.Coin;
import com.immense.crypto.app.model.User;
import com.immense.crypto.app.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin, User user) throws Exception;
}
