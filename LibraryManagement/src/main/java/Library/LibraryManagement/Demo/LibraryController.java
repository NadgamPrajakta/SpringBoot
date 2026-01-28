package Library.LibraryManagement.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService service;

    @GetMapping("/library")
    public String libraryInfo() {
        return service.status();
    }
    
    @GetMapping("/get-id")
	public String getId()
	{
		 return service.getid();
	}

    @PostMapping("/library/book")
    public String addBook(@RequestBody Book book) {
        return "Book added: " + book.getTitle();
    }
}
