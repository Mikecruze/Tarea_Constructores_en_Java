public class NumCta {
private int NumberCta;
private double balance;

public Cuenta(){
	NumberCta=88665438;
	balance=0.0;
}
public Cuenta(int NumberCta, double balance){
	this.NumberCta= NumberCta ;
	this.balance=balance;
}
public Cuenta(int a){
	NumberCta=a;
}

public int getNumberCta(){
	return NumberCta;
}
public double getBalance(){
	return balance;
}
public void setBalace(double b){
	this.balance=balance;
}
public void credito(double amount1){
	amount1 = 5000;
}
public void debito(double amount2){
	amount2= 8000;
}
public String mensaje(){
	String mensaje = "Fin del proceso.";
	return mensaje;
}
}
