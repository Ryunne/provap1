public class Microondas {
	// atributos
	public boolean status,porta;
	public String marca,Status;
	public double voltagem, pre�o;

	// construtor

	public Microondas() {
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public double getvoltagem() {
		return voltagem;
	}

	public void setvoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

	public double getpre�o() {
		return pre�o;
	}

	public void setpre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public boolean getstatus() {
		return status;
	}

	boolean ligamicro() {
		status = true;
		return status;
	}

	boolean desligamicro() {
		status = false;
		return status;
	}

	public void setstatus(boolean status) {
		if (status == true) {
			Status="ligado";
		} else {
			Status="desligado";
		}
		this.status = status;
	}
	
	public boolean getporta(){
		return porta;
	}
	public void setporta(boolean porta){
		if (status==true){
		porta = true;
		System.out.println("A porta est� fechada");
		}else{
			porta = false;
		System.out.println("A porta est� aberta");
		}
		this.porta = porta;
	}
}
