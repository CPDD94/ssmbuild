package com.example.service;

import com.example.pojo.Books;
import java.util.List;

public interface BookService {

    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(int id);
    // 修改一本书
    int updateBook(Books books);
    // 根据id查询一本书
    Books queryBookById(int id);
    // 查询全部书籍
    List<Books> getAllBook();

}
