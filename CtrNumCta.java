public class CtrNumCta{
public static void main(String [] args){
	Cuenta a1 = new Cuenta();
	
	System.out.println("Tu  Número de Cuenta= "
	+a1.getNumberCta ()+" Tiene un saldo de= "+ a1.getBalance()+ a1.mensaje());

	Account a2 = new Account(14238524,289.3);
	
	System.out.println("Tu Número de Cuenta= "
	+a2.getNumberCta ()+" Tiene un saldo de= "+ a2.getBalance()+ a1.mensaje());
	
Account a3 = new Account(12131231,345.4);
	
	System.out.println("Tu  Número de Cuenta= "
	+a3.getNumberCta ()+" Tiene un saldo de= "+ a3.getBalance()+ a1.mensaje());
}
}
