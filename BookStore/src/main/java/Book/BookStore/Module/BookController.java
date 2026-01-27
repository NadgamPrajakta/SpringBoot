package Book.BookStore.Module;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return service.addBook(book);
    }
}
