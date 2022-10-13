package ejecutable;

import modelo.vendedores;

public class Test
{
    public static void main(String[] args) 
    {
        vendedores Vendedor1 = new vendedores("Yo", 2, 1000);
        System.out.println("Nombre del vendedor:" + Vendedor1.getNombre());
        System.out.println("Salario minimo: " + vendedores.getSalarioMinimo());
        System.out.println("Nomina Mensual: " + Vendedor1.getnominaMensual());
        System.out.println("Numero de carros vendidos: " + Vendedor1.getnumCarrosVendidos());

        System.out.println(Vendedor1);

        System.out.println("------------------------------");

        vendedores Vendedor2 = new vendedores("Fernanda" , 2, 1000000);
        Vendedor2.nomina_mensual("Fernanda ", 2, 1000000);
        System.out.println(Vendedor2);

    }   
}