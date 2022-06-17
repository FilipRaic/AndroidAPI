package com.webapi.webapi.service;

import com.webapi.webapi.model.Item;
import com.webapi.webapi.repository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {
    @Autowired
    private WebRepository webRepository;

    public List<Item> getAllItems() {
        return webRepository.findAllByNameNotNull();
    }

    public Item getItemById(Long id) {
        return webRepository.findItemById(id);
    }
}
