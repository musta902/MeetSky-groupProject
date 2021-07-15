package day42_Interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean  HAS_BATTERIES2=false;//this is also public final static
	
	public abstract void charge();
	
	void charge2();//public abstract
	
	public default void methoda() {
		//code
	}
	public static void methodB() {
		
	}

}
