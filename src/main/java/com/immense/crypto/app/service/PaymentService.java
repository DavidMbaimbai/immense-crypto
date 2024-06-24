package com.immense.crypto.app.service;

import com.immense.crypto.app.domain.PaymentMethod;
import com.immense.crypto.app.model.PaymentOrder;
import com.immense.crypto.app.model.User;
import com.immense.crypto.app.response.PaymentResponse;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;


public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
