import java.util.Scanner;
public class executavel {
  
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Microondas microondas;
        microondas = new Microondas();
        System.out.println("digite a marca: ");
        microondas.setmarca(scan.next());
        System.out.println("digite o preço: ");
        microondas.setpreço(scan.nextDouble());
        System.out.println("digite a voltagem: ");
        microondas.setvoltagem(scan.nextDouble());
        microondas.setstatus(microondas.ligamicro());
        System.out.println("microndas esta "+microondas.getstatus());
        System.out.println("a marca é "+microondas.getmarca());
        System.out.println("o preço do microondas é "+microondas.getpreço());
        System.out.println("A voltagem é "+microondas.getvoltagem());
	}

}
