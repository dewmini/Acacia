package org.acacia.server;

@x10.runtime.impl.java.X10Generated
public class GraphStatus extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GraphStatus> $RTT = 
        x10.rtt.NamedType.<GraphStatus> make("org.acacia.server.GraphStatus",
                                             GraphStatus.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.GraphStatus $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + GraphStatus.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.server.GraphStatus $_obj = new org.acacia.server.GraphStatus((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public GraphStatus(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    final public static int LOADING = 1;
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    final public static int OPERATIONAL = 2;
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    final public static int DELETED = 3;
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    final public org.acacia.server.GraphStatus org$acacia$server$GraphStatus$$this$org$acacia$server$GraphStatus() {
        
        //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
        return org.acacia.server.GraphStatus.this;
    }
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    // creation method for java code (1-phase java constructor)
    public GraphStatus() {
        this((java.lang.System[]) null);
        org$acacia$server$GraphStatus$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.server.GraphStatus org$acacia$server$GraphStatus$$init$S() {
         {
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
            
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
            this.__fieldInitializers_org_acacia_server_GraphStatus();
        }
        return this;
    }
    
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/GraphStatus.x10"
    final public void __fieldInitializers_org_acacia_server_GraphStatus() {
        
    }
    
    public static int get$LOADING() {
        return org.acacia.server.GraphStatus.LOADING;
    }
    
    public static int get$OPERATIONAL() {
        return org.acacia.server.GraphStatus.OPERATIONAL;
    }
    
    public static int get$DELETED() {
        return org.acacia.server.GraphStatus.DELETED;
    }
}

