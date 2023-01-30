package tatiana.me.springweb.coursework3.model;

import org.springframework.lang.Nullable;

public enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK,
    WHITE;

    @Nullable
    public static Color parse(String color) {
        for(Color c: values()) {
            if(c.name().equals(color)) {
                return c;
            }
        }
        return null;
    }
}
