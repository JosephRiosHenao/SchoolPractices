package Practices.Java;
import java.util.*;    

public class a {
    static void ImprimirLG(List l)
    {
        for(int a=0;a<l.size();a++)
        {
            System.out.println(l.get(a));
        }
        System.out.println("_______________");
    }
    
    public static void main(String[] args) {
      
        List lista1=new ArrayList();
        lista1.add("Hola");
        lista1.add(2);
        lista1.add(3);
        lista1.add("Gato");
        lista1.add(false);
        ImprimirLG(lista1);
        lista1.remove(lista1.size()-1);
        ImprimirLG(lista1);
        lista1.remove(0);
        ImprimirLG(lista1);
        lista1.remove((Object) 2);
        ImprimirLG(lista1);
        lista1.add("Miguel");
        lista1.add(3.1416);
        lista1.add("Java");
        ImprimirLG(lista1);
        System.out.println(lista1.get(3));
        System.out.println("_________________");
        System.out.println(lista1.indexOf("Java"));
        System.out.println("_________________");
        if(lista1.contains("Java")) System.out.println("Contiene la lista el elemento 'Java'");
        else System.out.println("No contiene el Elemento Java");
        System.out.println("_________________");
        lista1.remove("Java");
        if(lista1.contains("Java")) System.out.println("Contiene la lista el elemento 'Java'");
        else System.out.println("No contiene el Elemento Java");
        System.out.println("_________________");
        if(lista1.isEmpty()) System.out.println("No contiene datos la lista");
        else System.out.println("Tiene datos la lista");
        System.out.println("_________________");
        lista1.clear();
        if(lista1.isEmpty()) System.out.println("No contiene datos la lista");
        else System.out.println("Tiene datos la lista");
        System.out.println("_________________"); 
        lista1.add("Misael");
        lista1.add("Chair");
        lista1.add("Pablo");
        lista1.add("Cheis");
        lista1.add("Pedro pedrito");
        ImprimirLG(lista1);
        lista1.add(5,"Balta");
        Iterator it=lista1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}


