package modelo;

public class vendedores
{
    private static int salario_minimo = 1000000;
    private String Nombre;
    private int numCarrosVendidos;
    private int valorCarro;
    private double nominaMensual;

    public vendedores(String pNombre, int pnumCarrosVendidos, int pValorCarro)
    {
        this.Nombre = "";
        this.numCarrosVendidos = 0;
        this.valorCarro = 0;
        this.nominaMensual = 0;
    }

    public static int getSalarioMinimo()
    {
        return salario_minimo;
    }

    public String getNombre()
    {
        return this.Nombre;
    }

    public void setNombre(String pNombre)
    {
        this.Nombre = pNombre;
    }

    public int getnumCarrosVendidos()
    {
        return this.numCarrosVendidos;
    }

    public void setnumCarrosVendidos(int pnumCarrosVendidos)
    {
        this.numCarrosVendidos = pnumCarrosVendidos;
    }

    public int getValorCarro()
    {
        return this.valorCarro;
    }

    public void setValorCarro(int pValorCarro)
    {
        this.valorCarro= pValorCarro;
    }

    public double getnominaMensual()
    {
        return nominaMensual;
    }

    public void setNominaMensual(double pNominaMensual)
    {
        this.nominaMensual = pNominaMensual;
    }

    public void nomina_mensual(String pNombre, int pnumCarrosVendidos, int pValorCarro)
    {
        if(pnumCarrosVendidos == 0)
        {
            setNombre(pNombre + " no vendió ningun carro");
        }

        else
        {
            setNominaMensual(nominaMensual = salario_minimo + (pnumCarrosVendidos * 100000) + (pValorCarro * 0.2));
        }

    }

    public String toString()
    {
        return "Datos del vendedor:  \nNombre: " + getNombre() + "\nNumero de carros vendidos: " + getnumCarrosVendidos() + "\nValor de carros vendidos: " + getValorCarro() + "\nNomina Mensual: " + nominaMensual;
    }


}