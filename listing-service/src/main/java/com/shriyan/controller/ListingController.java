package com.shriyan.controller;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import com.shriyan.domain.GreetingProperties;
import com.shriyan.domain.Item;
import com.shriyan.repository.ItemRepository;
import com.shriyan.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;


@RefreshScope
@RestController
public class ListingController {
    private static final Logger LOG = Logger.getLogger(ListingController.class.getName());

    @Autowired
    private ItemService itemService;


    @Value("${greeting:Hello default}")
    private String message;

    @RequestMapping(path ="/item/price/{price}", method = RequestMethod.GET)
    List<Item>  getItemByPrice(@PathVariable String price) {
        return itemService.findByTitleIgnoreCaseContaining(price);
    }

    @RequestMapping(path ="/items",  method = RequestMethod.GET)
    Iterable<Item> getMessage() {
        return itemService.findAll();
    }

    @RequestMapping(path ="/item/{title}", method = RequestMethod.GET)
    List<Item> getItemSearchByTitle(@PathVariable String title) {
        return itemService.findByTitleIgnoreCaseContaining(title);
    }

    @RequestMapping(path ="/item",  method = RequestMethod.POST)
    Item addItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @RequestMapping(path ="/item",  method = RequestMethod.PUT)
    Item updateItem(@RequestBody Item item) {
        LOG.info("Item tile " + item.getPrice());
        return itemService.save(item);
    }

}
