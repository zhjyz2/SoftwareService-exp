package org.example.provider_backup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProviderBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBackupApplication.class, args);
    }
    @Value("${server.port}")
    private String server;
    @RestController
    public class ProviderController{
        @GetMapping(value = "/provider/echo")
        public String doEcho(){
            return "p2 say:Hello Nacos Discovery";
        }
    }

}
