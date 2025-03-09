package com.dudko.example.repository;

import com.dudko.example.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ItemRepository extends ElasticsearchRepository<Item, UUID> {

    List<Item> findAllByContent(String term);

}
