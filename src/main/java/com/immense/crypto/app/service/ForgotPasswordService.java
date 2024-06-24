package com.immense.crypto.app.service;

import com.immense.crypto.app.domain.VerificationType;
import com.immense.crypto.app.model.ForgotPasswordToken;
import com.immense.crypto.app.model.User;

;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType, String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
