package org.springframework.tx.xml.service;

import org.springframework.tx.xml.dao.BookDao;

public class BookService {

    BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void checkout(String username,int id){

        try {
            bookDao.updateStock(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}