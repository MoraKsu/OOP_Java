package Seminar04HW;

import java.util.Collections;
import java.util.List;

public class UserComparator<T extends Comparable<T>> {
    public List<T> sortUsers(List<T> users) {
        Collections.sort(users);
        return users;
    }
}
