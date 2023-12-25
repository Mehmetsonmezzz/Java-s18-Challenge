package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Category;
import com.workintech.s18challenge.repository.BookRepository;
import com.workintech.s18challenge.repository.CategoryRepository;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

   private final CategoryRepository categoryRepository;
    @Override
    public Category findById(long id) {
        Optional<Category> optionalCategory=categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
          return   optionalCategory.get();
        }
        throw new RuntimeException("Category with given id is not found:"+id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
