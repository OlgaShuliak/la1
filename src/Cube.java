public class Cube extends Square {

    Cube(double a){
        super(a);
    }

    double Volume(){
        return a*super.Area();
    }

    double Area(){
        return 6*super.Area();
    }

    double Diagonal(){
        return Math.sqrt(super.Diagonal()*super.Diagonal()+a*a);
    }

    double Perimeter(){
        return 3*super.Perimeter();
    }

    void Display(){
        System.out.println("Периметр: "+Perimeter());
        System.out.println("Площадь: "+Area());
        System.out.println("Диагональ: "+Diagonal());
        System.out.println("Объем: "+Volume());
    }
}

