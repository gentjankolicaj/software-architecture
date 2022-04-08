package org.software.architecture.monolithic.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="warehouse")
public class Warehouse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String spec;
    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

}
