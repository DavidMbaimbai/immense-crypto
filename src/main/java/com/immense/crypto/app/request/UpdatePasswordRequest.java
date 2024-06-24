package com.immense.crypto.app.request;


import com.immense.crypto.app.domain.VerificationType;
import lombok.Data;

@Data
public class UpdatePasswordRequest {
    private String sendTo;
    private VerificationType verificationType;
}
