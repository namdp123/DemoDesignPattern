package creationalpattern;

public class ComputerBuilder {
	public String HDD;
	public String Ram;
	public String Pin;
	public String Mainboard;
	public boolean isGraphicCardEnable;
	public boolean isBluetoothEnable;
	public ComputerBuilder(String HDD, String Ram, String Pin, String Mainboard) {
		this.HDD = HDD;
		this.Ram = Ram;
		this.Pin= Pin;
		this.Mainboard = Mainboard;
	}
	public ComputerBuilder setGraphicCardEnable (boolean isGraphicCardEnable) {
		this.isGraphicCardEnable = isGraphicCardEnable;
		return this;
	}
	public ComputerBuilder setBuletoothEnable (boolean isBluetoothEnable) {
		this.isBluetoothEnable = isBluetoothEnable;
		return this;
	}
}
