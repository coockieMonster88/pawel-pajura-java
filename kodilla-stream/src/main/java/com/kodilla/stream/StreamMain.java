package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an exmple text"));
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify((s1) -> System.out.println(s1.toUpperCase()));
        poemBeautifier.beautify((s1) -> System.out.println(s1.toLowerCase()));
        poemBeautifier.beautify((s1) -> System.out.println(s1.substring(0,3)));

        Forum theForum= new Forum();
//        List<ForumUser> theResultOfUsers= theForum.getList().stream()
//                .filter(user -> user.getUserSex() == 'M')
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultOfUsers.size());
//        theResultOfUsers.stream()
//                .forEach(System.out::println);

        List<ForumUser> theResultofUsers = theForum.getList().stream()
                .filter(user -> user.getDateOfBirthUser().getYear() <= 1998)
                .collect(Collectors.toList());
        System.out.println("# elements: " + theResultofUsers.size());
      theResultofUsers.stream()
               .forEach(System.out::println);

//        List<ForumUser> theListOfUsers = theForum.getList().stream()
//                .filter(user -> user.getPostsQuantity() >= 1)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theListOfUsers.size());
//                 theListOfUsers.stream()
//               .forEach(System.out::println);

        Map<Integer, Object> theList = theForum.getList().stream()
                .filter(user -> user.getPostsQuantity() >= 1)
                .filter(user -> user.getDateOfBirthUser().getYear() > 1998)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println("# elements: " + theList.size());
        theList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }


}
