package com.codegym.Persistence;

import com.codegym.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductPersistenceImpl implements GeneralPersistence<Product> {
    ArrayList<Product> listProduct = new ArrayList<>();
    {
        listProduct.add(new Product(1,"Iphone", 1000));
        listProduct.add(new Product(2,"Sony", 300));;
        listProduct.add(new Product(3,"Huawei", 200));
    }
    @Override
    public List<Product> findAll() {
        return listProduct;
    }
}
