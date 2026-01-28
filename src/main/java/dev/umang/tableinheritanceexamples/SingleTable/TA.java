package dev.umang.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "TA")

public class TA extends User{
    private Integer helpRequests;

}
