package com.webapi.webapi.repository;

import com.webapi.webapi.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebRepository extends CrudRepository<Item, Long> {
    Item findItemById(Long id);
    List<Item> findAllByNameNotNull();
}
