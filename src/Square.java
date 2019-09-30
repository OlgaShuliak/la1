public class Square {
    protected double a;

    Square(double a){
        this.a=a;
    }

    double Perimeter(){
        return 4*a;
    }

    double Area(){
        return a*a;
    }

    double Diagonal(){
        return Math.sqrt(2*a*a);
    }

    void Display(){
        System.out.println("Периметр: "+Perimeter());
        System.out.println("Площадь: "+Area());
        System.out.println("Диагональ: "+Diagonal());
    }
}

