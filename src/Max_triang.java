import java.util.List;

public class Max_triang {
    public double Maximum_Triangulation(List<Point> points){
        int n = points.size();
        if (n < 3)
            return 0;
        double[][] MWT = new double[n][n];
        for (int i = n-2; i >= 0; i--){
            for (int j = i+1; j < n; j++){
                if (j < i+2)
                    MWT[i][j] = 0;
                else{
                    MWT[i][j] = Double.MAX_VALUE;
                    for (int k = i+1; k < j; k++){
                        double val = MWT[i][k] + MWT[k][j] + points.get(i).dist(points.get(j)) + points.get(j).dist(points.get(k)) + points.get(k).dist(points.get(i));
                        if (val < MWT[i][j])
                            MWT[i][j] = val;
                    }
                }
            }
        }
        return MWT[0][n-1];
    }
}
