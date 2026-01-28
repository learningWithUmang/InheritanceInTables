package dev.umang.tableinheritanceexamples.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_instructors")
public class Instuctor extends User{
    private Double ratings;
}
