package beans;

public class SimpleBean {
   private int compteure ;
   public SimpleBean (){
	   setCompteure(0);
   }
public int getCompteure() {
	return compteure ; 
}
public void setCompteure(int compteure) {
	this.compteure = compteure;
}
public void increment(){
	compteure++;
}
	
}

