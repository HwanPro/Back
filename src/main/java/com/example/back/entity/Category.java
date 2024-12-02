package com.example.back.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="VC_TBCA")
public class Category {
    

    @Id
    @Getter @Setter
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCategory;

    @Getter @Setter
    @Column(nullable = false)
    private String name;

    @Getter @Setter
    @Column(nullable = false)
    private LocalTime timeSpan;

    @Getter @Setter
    @Column(nullable = false)
    private int capacity;
    
    @Getter @Setter
    @Column(nullable = false, length = 1)
    private char status = '1';


}
