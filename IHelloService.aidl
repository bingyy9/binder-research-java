// IHelloService.aidl
package com.cisco.webex.meetings;

// Declare any non-default types here with import statements

interface IHelloService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void sayHello();
    int sayHelloTo(String name);
}