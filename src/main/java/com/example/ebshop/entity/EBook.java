package com.example.ebshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table (name = "ebook")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EBook {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    @Column(unique = true)
    private String isbn;

    @NotNull
    private String description;

    @ManyToOne
    private Author athorId;

    @ManyToOne
    private Publisher publisherId;

    @NotNull
    private Date publicationDate;

    @NotNull
    private int pages;

    @NotNull
    private Long price;

    @NotNull
    @Min(0)
    private int quantity;

    @NotNull
    private boolean deleted;
}
