/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.domain.model.users;

import ed.cracken.code.infrastructure.QueryCommand;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author edcracken
 */
@Service
public class UserFindAllCommand implements QueryCommand<List<User>> {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public void execute(List<User> result) {
        System.out.println("trx..........");
        result = usersRepository.findAll();
    }

}
