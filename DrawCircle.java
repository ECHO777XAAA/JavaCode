/*
  Java Code
  Christian Ortiz-Blanco

  Program to "draw" a circle of X size on a Canvas
 */



import java.util.*;
public class DrawCircle {

    public static void drawCircle(String[] grid, int centerX, int centerY, int radius, int diameter) {
        int x = radius;
        int y = 0;
        int decisionOver2 = 1 - x; // Decision criterion divided by 2 evaluated at x=r, y=0

        while (y <= x) {
            // These points are symmetrical in all eight octants
            plot(grid, centerX + x, centerY + y, diameter);
            plot(grid, centerX + y, centerY + x, diameter);
            plot(grid, centerX - x, centerY + y, diameter);
            plot(grid, centerX - y, centerY + x, diameter);
            plot(grid, centerX - x, centerY - y, diameter);
            plot(grid, centerX - y, centerY - x, diameter);
            plot(grid, centerX + x, centerY - y, diameter);
            plot(grid, centerX + y, centerY - x, diameter);
            y++;
            if (decisionOver2 <= 0) {
                decisionOver2 += 2 * y + 1; // Change in decision criterion for y -> y+1
            } else {
                x--;
                decisionOver2 += 2 * (y - x) + 1; // Change for y -> y+1, x -> x-1
            }
        }
    }

    /**
     * Plots a point on the 1D array grid.
     *
     * @param grid    the 1D array grid
     * @param x       the x-coordinate of the point
     * @param y       the y-coordinate of the point
     * @param diameter the diameter of the grid (width and height)
     */
    private static void plot(String[] grid, int x, int y, int diameter) {
        if (x >= 0 && x < diameter && y >= 0 && y < diameter) {
            grid[y * diameter + x] = "1";
        }
    }

    /**
     * Prints the 1D array grid as a 2D grid.
     *
     * @param grid the 1D array to print
     * @param diameter the diameter of the grid (width and height)
     */
    public static void printGrid(String[] grid, int diameter) {

        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {

        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {

                System.out.print(grid[i * diameter + j]);
            }
            System.out.println();
        }
    }

    /* 
    public static void printNewLine(ArrayList<Integer>arrayList, int x) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
            // Start a new line after every X elements
            if ((i + 1) % x == 0) {
                System.out.println();
            }
        }
        // Print a new line if the last line was not completed
        if (arrayList.size() % x != 0) {
            System.out.println();
        }
    }
    */
    
    public static String[] IntToStringArrayString(ArrayList<String> arrayList) {
        // Create a String array of the same size as the ArrayList
        String[] stringArray = new String[arrayList.size()];

        // Use the toArray method to convert the ArrayList to a String array
        arrayList.toArray(stringArray);

        return stringArray;
    }


    
    public static ArrayList<String> IntToString(ArrayList<Integer> intList){
    ArrayList<String> strList = new ArrayList<>();
        for (Integer number : intList) {
            strList.add(String.valueOf(number));
        }
        return strList;
    }

    
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arraylistCircle= new ArrayList<>();

        System.out.println("Input a Radius");
        int size=scanner.nextInt();

        //For loop to create an array list of zeros
            int totalsize=((size+1)*(size+1)*4);
            for (int i=0;i<(totalsize);i++){
                arraylistCircle.add(0);
            }
        
        
        String[] FinArray = IntToStringArrayString(IntToString(arraylistCircle));

        drawCircle(FinArray,size,size,size,((size*2)+1));
        //printNewLine(arraylistCircle,size);
        printGrid(FinArray,((size*2)+1));

        drawCircle(FinArray,size,size,size,((size*2)-1));
        //printNewLine(arraylistCircle,size);
        printGrid(FinArray,((size*2)-1));


        scanner.close();

    }
        
        //printing the cordinates of the cicle
       // System.out.println("Points on the circle with radius " + size + " in a grid")
}
        

    

