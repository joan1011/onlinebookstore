package com.anand.onlinebookstore.repository;

import com.anand.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference
@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {
}
