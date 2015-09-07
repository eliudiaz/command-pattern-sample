/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.domain.model.products;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author edcracken
 */
public interface ProductsRepository extends ElasticsearchRepository<Product, Serializable> {

    public Product findByName(String name);

    public List<Product> findByFullName();
}
