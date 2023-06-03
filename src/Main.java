import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n,k,l;
        Pascal_triangle obj1 = new Pascal_triangle();
        n= 7;
        k= 2;
        System.out.println("Numarul de combinari de " + n + " luate cate " + k + " este:");
        System.out.println(obj1.C(n,k));
        l = 7;
        System.out.println("Triunghiul lui Pascal de " + l + " linii este:");
        obj1.printPascal(l);
        Long_incr_seq obj2 = new Long_incr_seq();
        int[] A = obj2.Longest_Increasing_Sequence();
        System.out.println("Sirul crescator de lungime maxima:");
        for (int i : A) {
            System.out.print(i + " ");
        }
        List<Point> points = new ArrayList<>();
        points.add(new Point(0,0));
        points.add(new Point(1,0));
        points.add(new Point(2,1));
        points.add(new Point(1,2));
        points.add(new Point(0,2));
        Max_triang obj3 = new Max_triang();
        System.out.println("\nSuma minima a perimetrelor triunghiurilor este: " + obj3.Maximum_Triangulation(points));
    }
}