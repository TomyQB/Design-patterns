package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class prototypeFactory {
    private Map<String, Item> items = new HashMap<String, Item>();

    public prototypeFactory() {
        loadItems();
    }

    public Item createItem (String type) {
        return items.get(type).clone();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Los vengadores");
        movie.setPrice(20);
        movie.setRuntime("2 horas");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Los 10 negritos");
        book.setPrice(10);
        book.setNumberOfPages(300);
        items.put("Book", book);
    }

}
