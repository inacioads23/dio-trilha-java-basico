
public class SmartTv {
	boolean ligada = true;
	int canal = 1;
	int volume = 25;
	
	public void ligarTv() {
		ligada = true;
	}
	
	public void desligarTv() {
		ligada = false;
	}
	
	public void digitarCanal(int newChanel) {
		canal = newChanel;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}

}
