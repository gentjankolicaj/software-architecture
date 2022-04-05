package org.software.architecture.monolithic.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Integer mode;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    private Integer status;
    private Double total;
    private Long salesRepId;
    private Integer promotionId;

}
