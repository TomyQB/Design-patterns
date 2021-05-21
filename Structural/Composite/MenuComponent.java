package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    
    protected String name;
    protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
