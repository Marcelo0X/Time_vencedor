import java.util.Scanner;

public class TimeVencedorTest{

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args){
	vencedor();
    }
    public static void vencedor(){
	try{
	    System.out.print("Time 1 ");
	    String time1 = ent.nextLine();
	    System.out.print("Gols ");
	    int gols1 = ent.nextInt();
	    ent.nextLine();
	    System.out.print("Time 2 ");
	    String time2 = ent.nextLine();
	    System.out.print("Gols ");
	    int gols2 = ent.nextInt();
	    TimeVencedor time = new TimeVencedor(time1, time2, gols1, gols2);
	    time.mostrarVencedor();
	}catch(Exception e){
	    System.out.println("Erro - "+e);
	    ent.nextLine();
	}
    }

}
