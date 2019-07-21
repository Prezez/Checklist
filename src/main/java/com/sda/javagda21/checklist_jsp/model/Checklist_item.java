package com.sda.javagda21.checklist_jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Checklist_item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean completed;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Checklist checklist;

}
