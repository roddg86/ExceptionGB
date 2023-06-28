package lesson2.example;

import java.util.Collections;
import java.util.List;

/**
 * Попытка выполнения нереализованного метода
 */
public class UnsupportedOperationException {
    public static void main(String[] args) {
        List<Object> emptyList =  Collections.emptyList();
        emptyList.add(new Object());
    }
}
