package ca.lenguyen.bookauthorjpa.databases;

import ca.lenguyen.bookauthorjpa.beans.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
