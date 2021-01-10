package lesson6;

public class lesson6 {
    public static void main(String[]args) {
        cat cat1 = new cat("sound_1", "move_1", "mouth_1");
        cat1.make_sounds();
        cat1.move();
        cat1.to_eat();
        cat1.climb_trees();

        dog dog1 = new dog("sound_2", "move_2", "mouth_2");
        dog1.make_sounds();
        dog1.move();
        dog1.to_eat();
        dog1.swim();
    }
}

