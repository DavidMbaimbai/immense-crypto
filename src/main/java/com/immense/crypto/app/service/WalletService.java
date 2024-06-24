package com.immense.crypto.app.service;


import com.immense.crypto.app.exception.WalletException;
import com.immense.crypto.app.model.Order;
import com.immense.crypto.app.model.User;
import com.immense.crypto.app.model.Wallet;



import java.math.BigDecimal;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
