public class CtrPlano {
public static void main(String [] args){
	Punto p1 = new Punto();
	System.out.println(p1.mensaje()+ " x= "
			+p1.getX()+", y= "+p1.getY());
	p1.Distancia(6,9);
	double Distancia = p1.Distancia(6,9);
	System.out.println("La distancia del origen al punto uno es de: "+Distancia);
	
	
	
	
	Punto p2 = new Punto(12,8);
	System.out.println(p2.mensaje()+" x= "
			+p2.getX()+", y= "+p2.getY());
	p2.Distancia(12,8);
	double Distancia1 = p2.Distancia(12,8);
	System.out.println("La distancia del origen al punto uno es de: "+Distancia1);
	
	Punto p3 = new Punto(6,6);
	System.out.println( p3.mensaje()+" x= "
			+p3.getX()+", y= "+p3.getY());
	p3.Distancia(6,6);
	double Distancia2 = p3.Distancia(6,6);
	System.out.println("La distancia del origen al punto uno es de: "+Distancia2);
	
}
}
