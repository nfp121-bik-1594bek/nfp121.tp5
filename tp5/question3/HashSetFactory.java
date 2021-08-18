package question3;

import java.util.Set;
import java.util.HashSet;

public class HashSetFactory<T> implements Factory<HashSet<T>>{
    public class HashSet create(){
        return new HashSet<T>();
    }
}