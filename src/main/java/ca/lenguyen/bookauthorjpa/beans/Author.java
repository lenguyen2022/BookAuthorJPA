package ca.lenguyen.bookauthorjpa.beans;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;



@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="author")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private Long id;
    @Column(name="name")
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    @ToString.Exclude
    private Set<Book> books;
}
