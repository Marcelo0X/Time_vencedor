public class TimeVencedor{

    private String time1;
    private String time2;
    private int golsTime1;
    private int golsTime2;

    public TimeVencedor(String time1, String time2, int golsTime1, int golsTime2){
	setTime1(time1);
	setTime2(time2);
	setGolsTime1(golsTime1);
	setGolsTime2(golsTime2);
    }
    public void setTime1(String time1){
	this.time1 = time1;
    }
    public String getTime1(){
	return time1;
    }
    public void setTime2(String time2){
	this.time2 = time2;
    }
    public String getTime2(){
	return time2;
    }
    public void setGolsTime1(int golsTime1){
	this.golsTime1 = golsTime1;
    }
    public int getGolsTime1(){
	return golsTime1;
    }
    public void setGolsTime2(int golsTime2){
	this.golsTime2 = golsTime2;
    }
    public int getGolsTime2(){
	return golsTime2;
    }
    public void mostrarVencedor(){
	if(golsTime1 > golsTime2){
	    System.out.println(time1+" vencedor com "+golsTime1+" gols");
	}else if(golsTime2 > golsTime1){
	    System.out.println(time2+" vencedor com "+golsTime2+" gols");
	}else{
	    System.out.println(time1+" gols "+golsTime1+" empate "+time2+" gols "+golsTime2);
	}
    }

}
