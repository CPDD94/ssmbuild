package com.example.service;

import com.example.dao.BookMapper;
import com.example.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    // service调dao层，此次需组合dao
    private BookMapper bookMapper;
    // 来个set方法，便于spring托管
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> getAllBook() {
        return bookMapper.getAllBook();
    }
}
