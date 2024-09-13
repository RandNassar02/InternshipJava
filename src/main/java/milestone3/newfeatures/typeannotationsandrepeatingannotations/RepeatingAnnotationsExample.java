package milestone3.newfeatures.typeannotationsandrepeatingannotations;

import java.lang.annotation.Repeatable;// Declaring repeatable annotation type
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
@interface Game{
    String name();
    String day();
}

// Declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games{
    Game[] value();
}
// Repeating annotation
@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")

public class RepeatingAnnotationsExample {
    public static void main(String[] args) {
        Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);
        for (Game game2 : game) {    // Iterating values
            System.out.println(game2.name()+" on "+game2.day());
        }
    }
}
