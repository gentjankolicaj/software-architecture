package org.software.architecture.monolithic.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OderItemId oderItemId;
    private Double unitPrice;
    private Double quantity;




}

