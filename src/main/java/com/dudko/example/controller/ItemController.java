package com.dudko.example.controller;

import com.dudko.example.model.Item;
import com.dudko.example.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/items", produces = "application/vnd.api.v1+json")
public class ItemController {

    private final ItemService itemService;


    @PostMapping
    public Item addDoc(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/{term}")
    public List<Item> findByContent(@PathVariable String term) {
        return itemService.findByContent(term);
    }

    @GetMapping
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        itemService.delete(id);
    }

}
