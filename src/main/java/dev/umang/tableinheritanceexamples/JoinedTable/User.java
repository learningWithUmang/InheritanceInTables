package dev.umang.tableinheritanceexamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.lang.annotation.Inherited;
import java.util.UUID;


@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private String name;

    @Id
    private UUID id;
}
/*
Sorting, searching
 */

/*
User
id name
 */
/*
Assignment:- Setup this and run the spring appn
please do it. and see all tables created per strategy.
 */