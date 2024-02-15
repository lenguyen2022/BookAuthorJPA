package ca.lenguyen.bookauthorjpa.beans;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

/*
Note with  Lombok
*Avoid using @EqualsAndHashCode and @Data with JPA entities;
Always exclude lazy attributes when using @ToString;
Don’t forget to add @NoArgsConstructor to entities with @Builder or @AllArgsConstructor.
 */

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    Long id;
    @Column(name="title")
    String title;

    @ManyToMany(mappedBy = "books")
    @ToString.Exclude
    Set<Author> authors;
}
