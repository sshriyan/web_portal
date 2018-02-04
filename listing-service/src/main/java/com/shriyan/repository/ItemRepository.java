package com.shriyan.repository;

import com.shriyan.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, String> {
    Item findById(String id);
    Item findByPrice(String name);
    Iterable<Item> findAll();
    List<Item> findByTitleIgnoreCaseContaining(String tile);
    Item save(Item item);
}
