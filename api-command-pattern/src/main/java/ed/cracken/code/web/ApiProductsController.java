/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.web;

import ed.cracken.code.domain.model.products.Product;
import ed.cracken.code.domain.model.products.ProductsRepository;
import java.util.Arrays;
import java.util.List;
import org.elasticsearch.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author edcracken
 */
@RestController
@RequestMapping(value = "/v1/api/products")
public class ApiProductsController {

    @Autowired
    ProductsRepository productsRepository;

    @RequestMapping(method = GET)
    public List<Product> index() {
        productsRepository.save(Arrays.asList(new Product[]{new Product("prod2", "prod2", "prod", Integer.SIZE, "prod2"),
            new Product("prod3", "prod3", "prod3", Integer.SIZE, "prod3")}));
        return Lists.newArrayList(productsRepository.findAll());
    }

    @RequestMapping(method = GET, value = "/byName/{name}")
    public List<Product> getProductsByName(@PathVariable("name") String name) {
        
        return Lists.newArrayList(productsRepository.findByName(name));
    }

}
