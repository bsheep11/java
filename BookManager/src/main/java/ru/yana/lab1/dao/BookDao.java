package ru.yana.lab1.dao;

import ru.yana.lab1.model.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
