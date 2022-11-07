package recursion;

public class Print1ToNUsingTAILrecursion {

    static void print1ToNUsingTAILrecursion(int num, int startingNumber) {

        if (num < 1) return;

        System.out.println(startingNumber);

        //tail recursion: This runs faster than a NON-TAIL recursion solution. As in the tail recursion solution the records
        //in stack does not have to return the control to the parent program.
        //If the records have to return the control to the parent program for further execution the state of the program has to be
        //saved by compiler/memory(?). Here it is not the case.
        print1ToNUsingTAILrecursion(num - 1, startingNumber + 1);
    }

    public static void main(String[] args) {
        print1ToNUsingTAILrecursion(10, 1);
    }
}
