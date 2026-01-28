package dev.umang.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "Mentor")

public class Mentor extends User {
    private String company;

}
