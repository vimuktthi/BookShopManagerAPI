package com.BookShopManager.BookShopManager.repo;

import com.BookShopManager.BookShopManager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {

}
