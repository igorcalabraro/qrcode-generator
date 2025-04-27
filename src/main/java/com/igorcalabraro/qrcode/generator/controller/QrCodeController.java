package com.igorcalabraro.qrcode.generator.controller;

import com.igorcalabraro.qrcode.generator.dto.QrCodeGenerateResponse;
import com.igorcalabraro.qrcode.generator.dto.QrcodeGenerateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrcodeGenerateRequest request) {
        return null;
    }
}
