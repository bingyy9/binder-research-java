/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.cisco.webex.meetings;
// Declare any non-default types here with import statements

public interface IHelloService extends android.os.IInterface
{
  /** Default implementation for IHelloService. */
  public static class Default implements com.cisco.webex.meetings.IHelloService
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         */
    @Override public void sayHello() throws android.os.RemoteException
    {
    }
    @Override public int sayHelloTo(java.lang.String name) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.cisco.webex.meetings.IHelloService
  {
    private static final java.lang.String DESCRIPTOR = "com.cisco.webex.meetings.IHelloService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.cisco.webex.meetings.IHelloService interface,
     * generating a proxy if needed.
     */
    public static com.cisco.webex.meetings.IHelloService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.cisco.webex.meetings.IHelloService))) {
        return ((com.cisco.webex.meetings.IHelloService)iin);
      }
      return new com.cisco.webex.meetings.IHelloService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_sayHello:
        {
          data.enforceInterface(descriptor);
          this.sayHello();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sayHelloTo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.sayHelloTo(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.cisco.webex.meetings.IHelloService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Demonstrates some basic types that you can use as parameters
           * and return values in AIDL.
           */
      @Override public void sayHello() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayHello, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sayHello();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int sayHelloTo(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayHelloTo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sayHelloTo(name);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.cisco.webex.meetings.IHelloService sDefaultImpl;
    }
    static final int TRANSACTION_sayHello = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sayHelloTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(com.cisco.webex.meetings.IHelloService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.cisco.webex.meetings.IHelloService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       */
  public void sayHello() throws android.os.RemoteException;
  public int sayHelloTo(java.lang.String name) throws android.os.RemoteException;
}
