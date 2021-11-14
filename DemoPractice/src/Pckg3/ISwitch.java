package Pckg3;

 interface ISwitch {
	int x = 0;
	void switchON();
	default void switchOFF() {}
	ISwitch i = new Boat();
}