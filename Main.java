package pe.edu.upeu;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Producto> prod = new ArrayList<>();

        prod.add(new Producto("POO1 ", "televisor" , 4000, 20));
        prod.add(new Producto( "POO2", " LAVADORA", 4500 ,15));

        var px = (new Producto( "POO3", "celular", 1500 , 45  ));
        var cantidad = 54.5;

        for ( Producto p : prod){
            System.out.println(p.nombre+"\t"+p.precio+"\t"+ p.stock+"\t"+p.igv);

        }
        System.out.println(px.getClass());

        System.out.println(cantidad instanceof double);
    }
}