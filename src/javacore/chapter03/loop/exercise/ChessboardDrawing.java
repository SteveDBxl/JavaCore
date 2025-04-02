package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args){

        int chessBoardSize = 5;
        char previousChar = '#';
        int columnOfBoard = 0;

        for(int lineOfBoard = 0; lineOfBoard < chessBoardSize; lineOfBoard++){
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
            columnOfBoard = 0;
        }
    }
}
