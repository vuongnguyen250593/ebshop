package com.example.ebshop.controller;

import com.example.ebshop.entity.EBook;
import com.example.ebshop.service.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ebook")
public class EBookController {
    @Autowired
    private EBookService eBookService;

    @GetMapping("/show")
    public ResponseEntity<Iterable<EBook>> showAllEBook() {
        Iterable<EBook> eBooks = eBookService.findAll();
        return new ResponseEntity<>(eBooks, HttpStatus.OK);
    }


    @PostMapping ("/create")
    public ResponseEntity<EBook> createEbook(@RequestBody EBook eBook) {
         EBook eBooks = eBookService.createEBook(eBook);
        return new ResponseEntity<>(eBooks, HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<EBook> deleteEbook(@PathVariable Long id) {
        EBook eBooks = eBookService.deleteEBook(id);
        return new ResponseEntity<>(eBooks, HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<EBook> editBook(@PathVariable Long id,@RequestBody EBook eBook){
        EBook eBook1 = eBookService.updateEBook(id,eBook);
        return  new ResponseEntity<>(eBook1,HttpStatus.OK);
    }

}
