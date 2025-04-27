package com.igorcalabraro.qrcode.generator.controller;

import com.igorcalabraro.qrcode.generator.dto.QrCodeGenerateResponse;
import com.igorcalabraro.qrcode.generator.dto.QrcodeGenerateRequest;
import com.igorcalabraro.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeService;

    public QrCodeController(QrCodeGeneratorService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrcodeGenerateRequest request) {
        try {
            QrCodeGenerateResponse response = this.qrCodeService.generateAndUploadQrcode(request.text());

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
