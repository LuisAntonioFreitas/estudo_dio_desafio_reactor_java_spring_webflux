package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<List<User>> countAdmins(final List<User> users){
        return Mono.just(users)
                .filter(u -> u.get(0).isAdmin() == true);
    }

}
