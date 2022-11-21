import java.util.Random;

//enum levels = {Easy, Medium, Hard}

public class Levels {
    //instance method, requires you to make an instance of the class (object) before it can be called
    //static method on other hand can be called without creating object of class, can't interact with instance field
    //static field only created once during execution, associated with class, uses "static" key word
    //instance field lives with object, new instance field created every time object is instantiated
        public int difficulty(int d) {
            int target;


            if (d == 1) {
                // generates a random number between 0 and 10
                Random r = new Random();
                target = r.nextInt(11);

            } else if (d == 2) {
                // generates a random number between 0 and 100
                Random r = new Random();
                target = r.nextInt(101);

            } else {
                // generates a random number between 0 and 1000
                Random r = new Random();
                target = r.nextInt(1001);

            }
            return target;

        }

}


