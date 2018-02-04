package com.shriyan.service;

import com.shriyan.controller.ListingController;
import com.shriyan.domain.Item;
import com.shriyan.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ItemServiceImpl implements ItemService {
    private static final Logger LOG = Logger.getLogger(ItemServiceImpl.class.getName());

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item findById(String id) {
        Item i = itemRepository.findById(id);
        return i;
    }

    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> findByTitleIgnoreCaseContaining(String tile) {
        return itemRepository.findByTitleIgnoreCaseContaining(tile);
    }

    public List<Item> findByPriceContaining(String  price) {
        return itemRepository.findByTitleIgnoreCaseContaining(price);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
