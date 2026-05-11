package dev.umang.tableinheritanceexamples.MappedSupreClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_tas")
public class TA extends User {
    private Integer helpRequests;

}
