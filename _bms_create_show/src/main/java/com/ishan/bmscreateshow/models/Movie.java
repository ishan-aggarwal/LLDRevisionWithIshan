package com.ishan.bmscreateshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "movies")
public class Movie extends BaseModel{
    private String name;
    private String description;
}
