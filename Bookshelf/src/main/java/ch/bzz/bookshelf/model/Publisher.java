package ch.bzz.bookshelf.model;

import ch.bzz.bookshelf.model.Book;

import java.util.List;

/**
 * the publisher of one or more Books
 */


public class Publisher {

    private String publisherUUID;
    private String publisher;
    private List<Book> Booklist;

    public String getPublisherUUID() {
        return publisherUUID;
    }

    public void setPublisherUUID(String publisherUUID) {
        this.publisherUUID = publisherUUID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Book> getBooklist() {
        return Booklist;
    }

    public void setBooklist(List<Book> booklist) {
        Booklist = booklist;
    }
}
