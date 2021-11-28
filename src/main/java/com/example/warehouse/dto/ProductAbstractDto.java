package com.example.warehouse.dto;

import lombok.Data;
import lombok.ToString;

public interface ProductAbstractDto {
    String getType();
    int getCount();

}
