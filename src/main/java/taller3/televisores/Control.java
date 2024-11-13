package taller3.televisores;

public class Control {
	private TV tv;
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int i) {
		tv.setCanal(i);
	}
	public void setVolumen(int j) {
		tv.setVolumen(j);
	}
	public void enlazar(TV televisor) {
		tv = televisor;
		televisor.setControl(this);
	}
	public void setTv(TV televisor) {
		this.enlazar(televisor);
	}
	public TV getTv() {
		return tv;
	}

}