package com.dudko.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.UUID;


@Document(indexName = "items")
public record Item(
        @Id UUID id,
        @Field(type = FieldType.Text, name = "content") String content) {}
