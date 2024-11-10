public class LettersWithStars {
    public static void main(String[] args) {
        String[][] letter2 = new String[9][6];
        for(int i = 0; i < letter2.length; i++){//length satir sayisi
            for(int j = 0; j < letter2[i].length; j++){
                if(i == 0 || i == 8 || (i == 4 && j != 4 && j != 5)){
                    letter2[i][j] = " * ";
                }else if ((j == 0) || j == 5 && i != 3 && i != 4 && i != 5) {
                    letter2[i][j] = " * ";
                } else if(i == 3 && j == 4 || i == 5 && j == 4){
                    letter2[i][j] = " * ";
                } else {
                    letter2[i][j] = "   ";
                }
            }
        }

        for(String[] row : letter2){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}


