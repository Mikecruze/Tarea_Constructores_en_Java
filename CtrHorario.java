public class CtrHorario {
public static void main(String [] args){
	Horario h1 = new Horario);
	System.out.println(h1.mensaje()+h1.getHora()+":"
	+h1.getMin()+":"+h1.getSeg());
	int scta = h1.nextSecond();
	System.out.println("Al paso de un segundo la hora es "+h1.getHora()+":"+h1.getMin()+":"+ scta);
	
	Horario h2 = new Horario(10,00,00);
	System.out.println(h2.mensaje()+h2.getHora()+":"
	+h2.getMin()+":"+h2.getSeg());
	int sctb = h2.nextSecond();
	System.out.println("Al paso de un segundo la hora es "+h2.getHora()+":"+h2.getMin()+":"+ sctb);
	
	Horario h3 = new Horario(22,00,00);
	System.out.println(t3.mensaje()+h3.getHora()+":"
	+h3.getMinu()+":"+h3.getSegu());
	int sctc = h3.nextSecond();
	System.out.println("Al paso de un segundo la hora es "+h3.getHora()+":"+h3.getMin()+":"+ sctc);
}
}
