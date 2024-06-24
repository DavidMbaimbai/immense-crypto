package com.immense.crypto.app.service;


import com.immense.crypto.app.model.PaymentDetails;
import com.immense.crypto.app.model.User;
import jakarta.persistence.OneToOne;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails(String accountNumber,
                                            String accountHolderName,
                                            String ifsc,
                                            String bankName,
                                            User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
