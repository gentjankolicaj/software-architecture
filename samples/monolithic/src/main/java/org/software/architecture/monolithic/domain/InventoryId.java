package org.software.architecture.monolithic.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class InventoryId implements Serializable {
    private Long productId;
    private Long warehouseId;


}