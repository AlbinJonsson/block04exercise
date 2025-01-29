public class TestOverlaps {
    public static void main(String[] args){
        // TODO: Step 1b: Note the static and dynamic types of these variables
        Square square       = new Square(1,1);
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle   = new Triangle(1,3);


        // TODO: Step 1c: Predict what the result of these method calls will be.
        //   Fill in the blanks in the comment for each line before running the program.
//        square.overlaps(triangle);      // ___.overlaps:___{} vs ___{} // Square Square Triangle
//        square.overlaps(square);        // ___.overlaps:___{} vs ___{} // Polygon Square Square
//        triangle.overlaps(rectangle);   // ___.overlaps:___{} vs ___{} // Triangle triangle Rectangle
//        triangle.overlaps(triangle);    // ___.overlaps:___{} vs ___{} //Polygon Triangle Triangle

        // TODO: Step 2b: After you have uncommented all three overridden implementations
        //   of the method 'overlaps' in the subclasses, as per step 2a,
        //   again predict the result of the same method calls above.
        //   Fill in the blanks below before running the program.
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}

        // TODO: Step 3: Now we introduce a variable with static type Polygon. What will
        //   the results be this time? Fill in the blanks as before, then uncomment all
        //   the lines below (mark all the lines and choose
        //           Code -> Comment with Block Comment
        //   from the top IntelliJ menu.
        //   You can comment out the lines from above (10-13) using the same command.
        //   Then run the program again, and see if your predictions were correct.
        //   Can you explain these outputs in terms of static and dynamic types?

        Polygon polyTriangle = new Triangle(1,4);

        square.overlaps(polyTriangle);          // ___.overlaps:___{} vs ___{} Square Square Triangle
        triangle.overlaps(polyTriangle);        // ___.overlaps:___{} vs ___{} Triangle Triangle Triangle
        polyTriangle.overlaps(triangle);        // ___.overlaps:___{} vs ___{} Triangle2 Triangle Triangle
        polyTriangle.overlaps(polyTriangle);    // ___.overlaps:___{} vs ___{} Triangle
        triangle.overlaps(triangle);            // ___.overlaps:___{} vs ___{} Triangle2


        // TODO: Step 4b: After you have uncommented the overloaded declaration and
        //   implementation of the method 'overlaps' in the Triangle subclass,
        //   as per step 4a, again predict the output of the five lines above.
        //   Then run the program and see if your predictions were correct.
        //   Can you still explain the outputs in terms of static and dynamic types?
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}
        // ___.overlaps:___{} vs ___{}

    }//main

}//TestOverlaps
