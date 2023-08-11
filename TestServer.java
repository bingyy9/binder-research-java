

//add service
//while(true) { read data, parse data, invoke function, reply }



public class TestServer {
	public static void main(String args[]){
		ServiceManager.addService("hello", new HelloService());


		//app_process创建进程的时候会创建2个binder线程，Binder_1, Binder_2来{ read data, parse data, invoke function, reply }， 所以这里不需要再创建binder线程。
		while(true){
			Thread.sleep(1000);   
		}
	}
}