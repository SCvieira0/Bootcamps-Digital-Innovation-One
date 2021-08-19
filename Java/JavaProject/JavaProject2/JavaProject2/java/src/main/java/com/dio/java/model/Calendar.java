package com.dio.java.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Calendar {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private DataType dataType;
    private String description;
    private LocalDateTime specialDate;
}
