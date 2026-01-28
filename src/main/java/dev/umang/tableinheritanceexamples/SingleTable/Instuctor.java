package dev.umang.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "Instructor")


public class Instuctor extends User{
    private Double ratings;
}
