package com.project.volunpeer_be.common.util;

import com.project.volunpeer_be.common.enums.KeyType;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KeyGeneratorUtil {
    public String generateKey(KeyType keyType) {
        return keyType.getName() + "_#" + UUID.randomUUID();
    }
}
