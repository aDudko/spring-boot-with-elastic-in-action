package com.dudko.example.service;

import com.dudko.example.model.Item;

import java.util.List;


public interface ItemService {

    Item save(Item item);

    List<Item> findByContent(String term);

    List<Item> findAll();

    void delete(String id);

}
