package org.software.architecture.monolithic.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class OderItemId implements Serializable {
    private Long orderId;
    private Long productId;
}
