package com.dudko.example.domain.repository;

import com.dudko.example.domain.entity.ItemEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ItemRepository extends ElasticsearchRepository<ItemEntity, UUID> {

    List<ItemEntity> findAllByContent(String term);

}
