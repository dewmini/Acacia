package org.acacia.util;

@x10.runtime.impl.java.X10Generated
public class Conts extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Conts> $RTT = 
        x10.rtt.NamedType.<Conts> make("org.acacia.util.Conts",
                                       Conts.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.util.Conts $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Conts.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.util.Conts $_obj = new org.acacia.util.Conts((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Conts(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public static java.lang.String BATCH_UPLOAD_FILE_LIST = "conf/batch-upload.txt";
    
    //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public static java.lang.String ACACIA_SERVER_PROPS_FILE = "conf/acacia-server.properties";
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public static java.lang.String ACACIA_SERVER_PUBLIC_HOSTS_FILE = "machines_public.txt";
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public static java.lang.String ACACIA_SERVER_PRIVATE_HOSTS_FILE = "machines.txt";
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public org.acacia.util.Conts org$acacia$util$Conts$$this$org$acacia$util$Conts() {
        
        //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
        return org.acacia.util.Conts.this;
    }
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    // creation method for java code (1-phase java constructor)
    public Conts() {
        this((java.lang.System[]) null);
        org$acacia$util$Conts$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.util.Conts org$acacia$util$Conts$$init$S() {
         {
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
            
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
            this.__fieldInitializers_org_acacia_util_Conts();
        }
        return this;
    }
    
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Conts.x10"
    final public void __fieldInitializers_org_acacia_util_Conts() {
        
    }
    
    public static java.lang.String get$BATCH_UPLOAD_FILE_LIST() {
        return org.acacia.util.Conts.BATCH_UPLOAD_FILE_LIST;
    }
    
    public static java.lang.String get$ACACIA_SERVER_PROPS_FILE() {
        return org.acacia.util.Conts.ACACIA_SERVER_PROPS_FILE;
    }
    
    public static java.lang.String get$ACACIA_SERVER_PUBLIC_HOSTS_FILE() {
        return org.acacia.util.Conts.ACACIA_SERVER_PUBLIC_HOSTS_FILE;
    }
    
    public static java.lang.String get$ACACIA_SERVER_PRIVATE_HOSTS_FILE() {
        return org.acacia.util.Conts.ACACIA_SERVER_PRIVATE_HOSTS_FILE;
    }
}

