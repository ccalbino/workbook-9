package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

        @RequestMapping(path="/categories", method = RequestMethod.GET)
        public List<Category> getCategories (){
            ArrayList<Category> categories = new ArrayList<>();
            categories.add(new Category(1, "Food"));
            categories.add(new Category(2, "Drink"));
            categories.add(new Category(3, "Clothing"));

            return categories;
        }



        @RequestMapping(path="/categories/{id}", method = RequestMethod.GET)
        public List<Category> getCategories( @PathVariable int id){
            ArrayList<Category> categories = new ArrayList<>();
            categories.add(new Category(1, "Food"));
            categories.add(new Category(2, "Drink"));
            categories.add(new Category(3, "Clothing"));

            for(Category c : categories){
                if(c.getCategoryId() == id){
                    ArrayList<Category> resultingCategories = new ArrayList<>();
                    resultingCategories.add(c);
                    return resultingCategories;
                }

                //use stream as another option-- return categories.stream(). filter(c -> c.getCategoryID() == category.toList();
            }

            return new ArrayList<Category>();

        }
    }


