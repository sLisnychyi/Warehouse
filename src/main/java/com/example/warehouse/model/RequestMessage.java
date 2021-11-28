package com.example.warehouse.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestMessage {
    private String payload;
    private String topicURI;
}
