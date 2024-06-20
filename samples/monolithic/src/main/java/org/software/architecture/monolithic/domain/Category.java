package org.software.architecture.monolithic.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="category")
public class Category implements Serializable {

    @Id
    private String name;
    private String description;

}
