package creationalpattern;

public class Computer {
	private String HDD;
	private String Ram;
	private String MainBoard;
	private String Pin;
	private boolean isGraphicCardEnable;
	private boolean isBluetoothEnnable;
	public String getHDD() {
		return HDD;
	}
	public void setHDD(String hDD) {
		HDD = hDD;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public String getMainBoard() {
		return MainBoard;
	}
	public void setMainBoard(String mainBoard) {
		MainBoard = mainBoard;
	}
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	public boolean isGraphicCardEnable() {
		return isGraphicCardEnable;
	}
	public boolean isBluetoothEnnable() {
		return isBluetoothEnnable;
	}
	public Computer (ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.Ram = builder.Ram;
		this.MainBoard = builder.Mainboard;
		this.Pin = builder.Pin;
		this.isBluetoothEnnable = builder.isBluetoothEnable;
		this.isGraphicCardEnable = builder.isGraphicCardEnable;
	}
	
}


