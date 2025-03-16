package com.dudko.example.domain.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.UUID;

@Data
@Builder
@Document(indexName = "items")
public class ItemEntity {

    @Id
    private final UUID id;

    @Field(type = FieldType.Text, name = "content")
    private final String content;

}
