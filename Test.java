import example1.*;

public class Test{
 
	public static void main(String args[]){
           (new Thread(new HelloTask())).start();
	}

}
