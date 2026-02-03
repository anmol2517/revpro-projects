// 2D Array

public class Match {
    public static void main(String[] args) {
        int a[][][] = {
                {{11, 22, 33, 44}},
                {{5, 55, 555} , {8, 88}},
                {{6, 66, 666, 6666}}
        };

        // System.out.println(a.length);  // output is : 4

        //  System.out.println(a[0]); - default value [[ means 2 connected

        System.out.println(a[0].length);
        System.out.println(a[0][0].length);
        System.out.println("-=-=-=-=-=-=-==-=-=-");
        System.out.println(a[1].length);
        System.out.println(a[1][0].length);
        System.out.println(a[1][1].length);
        System.out.println("-=-=-=-=-=-=-==-=-=-");
        System.out.println(a[2][0].length);
        System.out.println("--=-==-=-=-=---=-=-==--");

        for (int x = 0; x < a.length; x++){
            for (int y = 0; y < a[x].length; y++){
                for (int z = 0; z <a[x][y].length; z++){

                    System.out.print(a[x][y][z] + " ");
                }
                System.out.println();
            }
        }
    }
}
