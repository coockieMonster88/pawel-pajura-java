package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
public final List<ForumUser> theUserList = new ArrayList<>();

public Forum() {
    theUserList.add(new ForumUser(0,"Julia Baran",'F', LocalDate.of(2011, 3, 11), 5));
    theUserList.add((new ForumUser(1, "Jan Kowalski",'M', LocalDate.of(1987,5,21),0)));
    theUserList.add(new ForumUser(2, "Anna Kowalska",'F', LocalDate.of(1785,1,11),4));
    theUserList.add(new ForumUser(3,"Piotr Puzon", 'M', LocalDate.of(1884, 6, 8),10));

}

public List<ForumUser> getList() {
    return new ArrayList<>(theUserList);
}
}
