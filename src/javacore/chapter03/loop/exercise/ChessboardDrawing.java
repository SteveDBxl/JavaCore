package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args){

        int chessBoardSize = 5;
        char previousChar = '#';
        int countCase = 1;
        /*
        for(int lineOfBoard = 0; lineOfBoard < chessBoardSize; lineOfBoard++){
            int columnOfBoard = 0;
            while(columnOfBoard < chessBoardSize){
                System.out.print(previousChar);
                if(columnOfBoard > 0 || columnOfBoard < 5){
                    System.out.print(" ");
                }

                if(previousChar == '#'){
                    previousChar = '.';
                }
                else{
                    previousChar = '#';
                }
                columnOfBoard ++;
            }
            System.out.println();
        }
        */


        /****    Nouvelle version corrigé avec l'utilisation du modulo et remplacement par chessBoardSize dans la condition du 1er if   ****/
        for(int countLine = 0; countLine < chessBoardSize; countLine++){
            for(int countColumn = 0; countColumn < chessBoardSize; countColumn++){
                if(countColumn > 0 || countColumn < chessBoardSize){
                    System.out.print(" ");
                }

                if(countCase % 2 == 0){
                    System.out.print('#');
                }
                else{
                    System.out.print('.');
                }
                countCase++;
            }
            System.out.println();
        }
    }
}
