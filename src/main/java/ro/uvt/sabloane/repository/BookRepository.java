package ro.uvt.sabloane.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.uvt.sabloane.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
