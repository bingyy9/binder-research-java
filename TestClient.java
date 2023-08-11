

//get service
//invoke function
import android.os.IBinder;


public class TestServer {
	public static void main(String args[]){
		IBinder binder = ServiceManager.getService("hello");

		IHelloService service = IHelloService.Stub.asInterface(binder);
		service.sayHello();
		int ret = service.sayHelloTo("test");
	}
}