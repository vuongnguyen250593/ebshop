package com.example.ebshop.repository;

import com.example.ebshop.entity.EBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EBookRepository extends JpaRepository<EBook, Long> {
    @Query(nativeQuery = true,value = "UPDATE ebook SET deleted = true where id = :id")
    public void updateBook(@Param("id") Long id);

    @Query(nativeQuery = true,value = "SELECT * from ebook where id = :id")
    public EBook findId(@Param("id") Long id);
    public Iterable<EBook> findAllByTitleOrAthorIdOrPublisherIdOrIsbnOrPrice(String a, String b, String c, String d, Long e);

}
