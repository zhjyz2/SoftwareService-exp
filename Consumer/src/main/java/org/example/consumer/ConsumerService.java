package org.example.consumer;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "nacos-provider")
@LoadBalancerClient(name = "nacos-provider",configuration = RandomLoadBalancer.class)
public interface ConsumerService {
    @GetMapping( "/provider/echo")
    public String test();
}
