package figures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("PROGRAM z konsoli");
//        GraphicObject[] graphicObjects = new GraphicObject[2];
//
//        GraphicObject line = new Line(10,20);
//        graphicObjects[0] = line;
//        GraphicObject circle = new Circle(20,20);
//        graphicObjects[1] = circle;
//
//        Calc[] myCalculactorTable = new Calc[10];
//        myCalculactorTable[0] = new CalcImpl();
//        myCalculactorTable[1] = new AdvancedCalcImpl();
//
//
//        for(int i =0; i < graphicObjects.length; i++ ){
//            System.out.print(graphicObjects[i].getX());
//            System.out.print(graphicObjects[i].getY());
//            graphicObjects[i].present();
//        }

//
//        int[] wspolrzedne = {1,2,3,45,67,8,67,67};
//        Kwadrat kwadrat = new Kwadrat(wspolrzedne);
//
//
//        zczytac z
//        klawiatury cyfre i utworzyc odpowiedni obiekt
//                1 - kolo i policzyc pole
//                2 - kwadrat i policzyc pole
//                3- trojkat - nic nie liczyc bo nie ma,
//                wyswietlic ze nie istnieje

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if( choice == Figures.KOLO.getValue() ) {
            enumComparison(Figures.KOLO);
        }

    }

    public static void enumComparison(Figures figure) {
        switch (figure) {
            case KOLO:
                break;
            case KWADRAT:
                break;
            case TROJKAT:
            default:
                break;
        }
    }

}
