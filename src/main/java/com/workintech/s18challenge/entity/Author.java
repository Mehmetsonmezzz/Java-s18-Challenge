package com.workintech.s18challenge.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author",schema = "fsweb")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;



    @OneToMany(mappedBy = "author",cascade =CascadeType.ALL)
    private List<Book> books;


    public void addBook(Book book){
        if(books==null){
            books=new ArrayList<>();
        }
        books.add(book);
    }


}
