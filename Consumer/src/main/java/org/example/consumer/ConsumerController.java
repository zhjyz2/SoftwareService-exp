package org.example.consumer;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired(required = false)
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String consumertest() {
        return consumerService.test();
    }
}