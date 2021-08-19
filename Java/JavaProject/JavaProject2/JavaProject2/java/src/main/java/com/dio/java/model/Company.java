package com.dio.java.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {
    @Id
    private long id;
    private String cpnj;
    private String state;
    private String description;
    private  String district;
    private String address;
    private String city;
    private String telephone;
}
