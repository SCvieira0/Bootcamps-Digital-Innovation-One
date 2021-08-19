package com.dio.java.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class TimeBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class TimeBankId implements Serializable{
        private long idTimeBank;
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private TimeBankId id;
    private LocalDateTime workDate;
    private BigDecimal workTime;
    private BigDecimal workTimeBalance;
}
