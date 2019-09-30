import java.util.Scanner;

public class ProgCube {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.print("Введите количество квадратов: ");
        int n1=in.nextInt();

        System.out.print("Введите количество кубов: ");
        int n2=in.nextInt();

        Square squares [] = new Square [n1];
        Cube cubes [] = new Cube [n2];
        double valSquare [] = new double [n1];
        double valCube [] = new double [n2];

        double sum=0,sredKv=0,sredCub=0;
        for (int i=0; i<n1;i++){
            squares [i] = new Square(i+1);
            sum=sum+squares[i].Area();
        }
        sredKv=sum/n1;
        System.out.println();
        sum=0;
        for (int i=0; i<n2; i++){
            cubes [i] = new Cube(i+1);
            sum=sum+cubes[i].Area();
        }
        sredCub=sum/n2;

        int k=0;
        for (int i=0; i<n2; i++){
            if (cubes[i].Area()>=sredCub)
                k++;
        }

        System.out.println("\tСведения о квадратах: ");
        for (int i=0; i<n1; i++){
            System.out.println("Квадрат №"+(i+1)+"(а="+(i+1)+"):");
            squares[i].Display();
            System.out.println();
        }
        System.out.println();
        System.out.println("\tСведения о кубах: ");
        for (int i=0; i<n2; i++){
            System.out.println("Куб №"+(i+1)+"(а="+(i+1)+"):");
            cubes[i].Display();
            System.out.println();
        }

        System.out.println();
        System.out.println("Средняя площадь "+n1+" квадратов равна: "+sredKv);
        System.out.println("Количество кубов с наибольшей площадью равно: "+k);
    }
}

