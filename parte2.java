package t9.pkg2;
    class Veiculo
    {
        public char tipo;
        public String placa;
        public Veiculo(char cm, String pl)
        {
            tipo = cm;
            placa = pl;
        }
    }

    class Estacionamento
    {
        private long horac;
        private long horas;
        private char tipo;
        public double h2;
        
        public Estacionamento(long x, Veiculo v)
        {
            horac = x;
            horas = x + 7199999;
            tipo = v.tipo;
            long ms = horas - horac;
            double h = ms/3600000;
            h2 = Math.round (h);
        }
        public double calculapreco()
        {
            if(tipo=='c')
            {
                return h2*3;
            }else
            {
                return h2*1.5;
            }
        }
    }
public class T92 {

    public static void main(String[] args) 
    {
        Veiculo v1 = new Veiculo('c', "abc123");
        Veiculo v2 = new Veiculo('m', "aaa111");
        Estacionamento e1 = new Estacionamento(System.currentTimeMillis(), v1);
        Estacionamento e2 = new Estacionamento(System.currentTimeMillis(), v2);
        System.out.printf("O veiculo 1 ficou %f horas e ira pagar R$", e1.h2);
        System.out.println(e1.calculapreco());
        System.out.printf("\nO veiculo 2 ficou %f horas e ira pagar R$", e2.h2);
        System.out.println(e2.calculapreco());
    }
}
