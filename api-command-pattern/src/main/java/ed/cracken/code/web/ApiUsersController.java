/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.web;

import ed.cracken.code.domain.model.products.Product;
import ed.cracken.code.domain.model.products.ProductsRepository;
import ed.cracken.code.domain.model.users.User;
import ed.cracken.code.domain.model.users.UserFindAllCommand;
import ed.cracken.code.infrastructure.QueryCommandHandler;
import ed.cracken.code.infrastructure.QueryCommand;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author edcracken
 */
@RestController
@RequestMapping(value = "/v1/api/users")
public class ApiUsersController {

    @Autowired
    UserFindAllCommand usersFindAllCommand;
    @Autowired
    ProductsRepository productsRepository;

    @RequestMapping(method = GET)
    public List<User> index() {
        final List<User> l = new LinkedList<>();
        (new QueryCommandHandler() {

            @Override
            public void handle(QueryCommand cmd) {
                cmd.execute(l);
            }
        }).handle(usersFindAllCommand);
        return l;
    }

    
}
