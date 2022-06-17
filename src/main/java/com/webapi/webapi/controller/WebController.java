package com.webapi.webapi.controller;

import com.webapi.webapi.model.Item;
import com.webapi.webapi.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items")
public class WebController {
    @Autowired
    private WebService webService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Item> getItemsList() {
        return webService.getAllItems();
    }

    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Item getItemByCode(@PathVariable("id") Long id) {
        return webService.getItemById(id);
    }
}
