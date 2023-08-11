


public class HelloService extends IHelloService.Stub {

  public void sayHello() throws android.os.RemoteException{
  	Slog.i(TAG, "sayHello");
  }

  public int sayHelloTo(java.lang.String name) throws android.os.RemoteException{
    Slog.i(TAG, "sayHelloTo");
    return 888;
  }

}