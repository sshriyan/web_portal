package com.shriyan.service;

import com.shriyan.domain.Item;

import java.util.List;

public interface ItemService {
    Item findById(String id);
    List<Item> findByPriceContaining(String price);
    Iterable<Item> findAll();
    List<Item> findByTitleIgnoreCaseContaining(String tile);
    Item save(Item item);
}

