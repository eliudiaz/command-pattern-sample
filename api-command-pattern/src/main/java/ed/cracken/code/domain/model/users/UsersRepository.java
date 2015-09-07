/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.domain.model.users;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author edcracken
 */
@Component
public class UsersRepository{

    public List<User> findAll() {
        return Arrays.asList(new User[]{new User("u1", "p1", "user 1"),
            new User("u2", "p2", "user 2")});
    }

}
