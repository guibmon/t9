package t9;
    class Ponto
    {
        public double x;
        public double y;
        
        public Ponto()
        {
            x = 0.0;
            y = 0.0;
        }
        public Ponto(double a, double b)
        {
            x = a;
            y = b;
        }
        void move(double dx, double dy)
        {
            x += dx;
            y += dy;
        }
        public static double distancia(Ponto p1, Ponto p2)
        {
            double x2 = p2.x - p1.x;
            double y2 = p2.y - p1.y;
            return Math.sqrt(x2*x2 + y2*y2);
        }
    }

    class Circle
    {
        public double cx;
        public double cy;
        public double raio;
        
        public Circle()
        {
            raio = 0;
            cx = 0;
            cy = 0;
        }
        public Circle(Ponto c)
        {
            raio = 0;
            cx = c.x;
            cy = c.y;
        }
        public Circle(Ponto c, double r)
        {
            raio = r;
            cx = c.x;
            cy = c.y;
        }
        public double getArea()
        {
            return 3.1415*(raio*raio);
        }
        public double getDiameter()
        {
            return 2*raio;
        }
    }

public class T9 {

    public static void main(String[] args) 
    {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(3.5, 5.0);
        Circle c1 = new Circle();
        Circle c2 = new Circle(p1, 2.0);
        Circle c3 = new Circle(p2, 3.0);
        p1.move(0.5, 1.0);
        System.out.println(Ponto.distancia(p1, p2));
        System.out.println(c3.getArea());
        System.out.println(c3.getDiameter());
        System.out.println(c1.raio);
        System.out.println(c3.cx);
    }
}
