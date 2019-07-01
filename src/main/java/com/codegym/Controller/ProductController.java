package com.codegym.Controller;

import com.codegym.Model.Product;
import com.codegym.Service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

    @GetMapping(value = "show-products")
    public String showProducts(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("product", products);
        return "/product/list";
    }
    @GetMapping("/")
     public String showHome(){
        return "/product/home";
    }
}
