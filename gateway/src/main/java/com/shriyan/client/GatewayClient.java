package com.shriyan.client;

import com.shriyan.domain.Item;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("listing-service")
public interface GatewayClient {

    @RequestMapping(method = RequestMethod.GET, value = "/listing/items")
    List<Item> getAllItems();

}
