import java.util.Scanner;
public class executavel {
  
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Microondas microondas;
        microondas = new Microondas();
        System.out.println("digite a marca: ");
        microondas.setmarca(scan.next());
        System.out.println("digite o pre�o: ");
        microondas.setpre�o(scan.nextDouble());
        System.out.println("digite a voltagem: ");
        microondas.setvoltagem(scan.nextDouble());
        microondas.setstatus(microondas.ligamicro());
        System.out.println("microndas esta "+microondas.getstatus());
        System.out.println("a marca � "+microondas.getmarca());
        System.out.println("o pre�o do microondas � "+microondas.getpre�o());
        System.out.println("A voltagem � "+microondas.getvoltagem());
	}

}
