package com.sabinghost19.openfeign_clientcaller.proxy;

import com.sabinghost19.openfeign_clientcaller.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentProxy {
    @PostMapping("/payment")
    public ResponseEntity<Payment> payment(@RequestHeader String requestId, @RequestBody Payment payment);
}
