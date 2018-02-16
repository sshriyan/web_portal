package com.shriyan.service;

import com.shriyan.client.GatewayClient;
import com.shriyan.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayServiceImpl implements GatewayService {
    @Autowired
    private GatewayClient gatewayClient;

    @Override
    public List<Item> findAll() {
        return gatewayClient.getAllItems();
    }
}
