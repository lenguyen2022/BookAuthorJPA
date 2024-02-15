package ca.lenguyen.bookauthorjpa.databases;

import ca.lenguyen.bookauthorjpa.beans.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}
