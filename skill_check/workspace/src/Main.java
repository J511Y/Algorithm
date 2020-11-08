import java.util.*;

class Main {
	public static void main(String[] ar) {
		Main m = new Main();
		func(1);
	}
    
    static void func(int n){
    	if(n == 200000) return;
    	func(n + 1);
    }
}