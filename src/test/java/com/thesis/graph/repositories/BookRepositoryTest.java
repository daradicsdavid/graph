package com.thesis.graph.repositories;

import com.thesis.graph.model.entities.Book;
import com.thesis.graph.model.entities.Person;
import com.thesis.graph.model.relationships.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testFindByTitle() {
        insertBook("1984");

        String title = "1984";
        Book result = bookRepository.findByTitle(title);
        assertNotNull(result);
        assertEquals(title, result.getTitle());
    }

    @Test
    public void testFindByTitleLike() {
        insertBook("19");
        insertBook("1984");
        insertBook("198");
        insertBook("1819");

        String title = "19*";
        Collection<Book> result = bookRepository.findByTitleLike(title);
        assertNotNull(result);
        assertEquals(3, result.size());
    }

    @Test
    public void testGraph() {
        Book book = insertBook("1984");
        Person person = insertPerson("George Orwell");

        Author author = new Author(book, person);
        book.addAuthor(author);
        bookRepository.save(book);

        Collection<Book> graph = bookRepository.graph(5);

        assertEquals(1, graph.size());

        Book resultBook = graph.iterator().next();

        assertEquals(1, resultBook.getAuthors().size());

        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthors().iterator().next().getPerson().getName());
    }

    private Person insertPerson(String name) {
        Person person = new Person();
        person.setName(name);
        return personRepository.save(person);
    }

    private Book insertBook(String title) {
        Book newBook = new Book();
        newBook.setTitle(title);
        return bookRepository.save(newBook);
    }

}