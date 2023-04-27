package br.com.dio.desafioreactor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        List<Long> list1 = List.of(1L, 2L, 3L, 4L, 5L, 6L);
        question1.inc(list1)
                .doOnNext(n -> System.out.println(n))
                .subscribe();

        User user1 = new User( 1L, "Teste1", "Email1", "12345678", true );
        User user2 = new User( 2L, "Teste2", "Email2", "123456", false );

        Question2 question2 = new Question2();
        List<User> list2 = List.of(user1, user2);
        question2.countAdmins(list2)
                .doOnNext(u -> System.out.println(u))
                .doOnNext(u -> System.out.println(u.size()))
                .subscribe();

        Question3 question3 = new Question3();
        question3.userIsValid(user1)
                .doOnNext(u -> System.out.println(u))
                .subscribe();
//        question3.userIsValid(user2)
//                .doOnNext(u -> System.out.println(u))
//                .subscribe();
    }

}
