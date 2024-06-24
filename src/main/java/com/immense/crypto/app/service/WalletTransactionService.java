package com.immense.crypto.app.service;


import com.immense.crypto.app.domain.WalletTransactionType;
import com.immense.crypto.app.model.Wallet;
import com.immense.crypto.app.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
