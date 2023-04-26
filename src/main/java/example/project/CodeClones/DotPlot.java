package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {

        System.out.print("\t");
        for (char c : sequence2) {
            System.out.print(c + "\t");
        }
        System.out.println();

        for (char rowChar : sequence1) {
            System.out.print(rowChar + "\t");
            for (char colChar : sequence2) {
                if (rowChar == colChar) {
                    System.out.print("+\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
