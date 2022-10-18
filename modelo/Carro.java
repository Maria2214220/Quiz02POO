package modelo;

public class Carro 
{
    //---------------------
    //------Atributos------
    //---------------------
    private double precio;

    //---------------------
    //------Metodos--------
    //---------------------
    public Carro(double pPrecio)
    {
        this.precio = pPrecio;
    }

    public double getPrecio()
    {
        return precio;
    }
}