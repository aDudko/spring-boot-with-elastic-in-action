package com.dudko.example.service.impl;

import com.dudko.example.model.Item;
import com.dudko.example.repository.ItemRepository;
import com.dudko.example.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;


    @Override
    public Item save(Item item) {
        return repository.save(new Item(UUID.randomUUID(), item.content()));
    }

    @Override
    public List<Item> findByContent(String term) {
        return repository.findAllByContent(term);
    }

    @Override
    public List<Item> findAll() {
        return repository.findAll(PageRequest.of(0, 10)).getContent();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(UUID.fromString(id));
    }

}
