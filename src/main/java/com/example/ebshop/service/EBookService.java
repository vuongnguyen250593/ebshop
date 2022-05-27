package com.example.ebshop.service;
import com.example.ebshop.entity.EBook;

import java.util.Optional;

public interface EBookService {
    Iterable<EBook> findAll();


    EBook createEBook(EBook eBook);
    Optional<EBook> findById(Long id);


    EBook updateEBook(Long id, EBook eBookUpdate);

    EBook deleteEBook(Long id);
    Iterable<EBook> findByTitle(String title,String author,String inbs,String publish,Long pri);

}
