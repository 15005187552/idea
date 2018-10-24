package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TestHashTable {
    public static void main(String[] args) {
        HashSet<Name> set = new HashSet<>();
        set.add(new Name("kevin","age"));
        System.out.println(set.contains(new Name("kevin","age")));
    }
    static class  Name{
        private String first;
        private String last;

        public Name(String first, String last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o.getClass() == Name.class){
                Name name = (Name)o;
                return name.first.equals(first) && name.last.equals(last);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return first.hashCode();
        }
    }
}
