/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.infrastructure;

/**
 *
 * @author edcracken
 */
public interface QueryCommandHandler {

    public abstract void handle(QueryCommand cmd);
}
