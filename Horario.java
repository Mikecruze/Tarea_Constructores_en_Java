public class Horario {
private int hora;
private int min;
private int seg;

public Time(){
	hora=00;
	min=00;
	seg=00;
}
public Time(int hora, int minu, int segu){
	this.hora=hora;
	this.min=min;
	this.seg=seg;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}
public int getSeg() {
	return seg;
}
public void setSeg(int seg) {
	this.seg = seg;
}
public String mensaje(){
	String mensaje = "La hora es: ";
	return mensaje;
}
public void SetTime(int hora, int min, int seg){
	this.hora=hora;
	this.min=min;
	this.seg=seg;
}
public int nextSecond(){
	int nextSecond=seg+1;
	return nextSecond;
}
}
