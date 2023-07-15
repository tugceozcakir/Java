public class App {
    public static void main(String[] args) throws Exception {
        //Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

        int[][] matris = {
            {1,5,3},
            {4,8,6},
            {7,3,9},
            {1,3,5}
        };

        System.out.println("Matris: ");
        for(int[] row: matris){
            for(int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozu: ");
        int column = matris[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < matris.length; j++){
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}
