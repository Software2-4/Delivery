package deu.cse.software2_4.ADR;

public interface Publisher{ 
	public void registerObserver(Observer observer); 
	public void removeObserver(Observer observer); 
	public void notifyObservers(); 
}
