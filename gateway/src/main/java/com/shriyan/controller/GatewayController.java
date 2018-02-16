package com.shriyan.controller;

import com.shriyan.client.GatewayClient;
import com.shriyan.domain.Item;
import com.shriyan.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class GatewayController {
    private static final Logger LOG = Logger.getLogger(GatewayController.class.getName());


    @Autowired
    private GatewayService gatewayService;

    private List<Item> item;

    @RequestMapping("/api/item")
    public List<Item> findAll() {
        LOG.info(" List Find All items 2");


        return gatewayService.findAll();
    }

}
