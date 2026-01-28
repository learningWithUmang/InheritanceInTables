package dev.umang.tableinheritanceexamples.TablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;


@Entity(name = "tbc_users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    private String name;

    @Id
    private UUID id;
}


/*
User Post
User has a post
Association = cadinalities
@OneToMany

 */
