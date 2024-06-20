package org.software.architecture.monolithic.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String categoryId;
    private Integer weightClass;
    private Double weight;
    private Integer warrantyPeriod;
    private Long supplierId;
    private Integer status;
    private Double listPrice;
    private Double minPrice;
    private String catalogUrl;


}
