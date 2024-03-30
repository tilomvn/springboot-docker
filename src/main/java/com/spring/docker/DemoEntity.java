package com.spring.docker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity {

    @Id
    Integer id;

    String centralName;

    String centralAddress;
}
