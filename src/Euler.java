public class Euler
{
    public static double step(double x, double y, double h, Function f, int n)
    {
        return f.calculateValue(x,y,n)*h+y;
    }
}