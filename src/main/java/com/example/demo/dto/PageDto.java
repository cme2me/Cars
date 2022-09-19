package com.example.demo.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageDto<T> {
    private int size;
    private long totalElements;
    private int totalPages;
    private List<T> content;
}
