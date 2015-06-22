package org.acacia.frontend;

@x10.runtime.impl.java.X10Generated
public class AcaciaFrontEndProtocol extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaFrontEndProtocol> $RTT = 
        x10.rtt.NamedType.<AcaciaFrontEndProtocol> make("org.acacia.frontend.AcaciaFrontEndProtocol",
                                                        AcaciaFrontEndProtocol.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndProtocol $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaFrontEndProtocol.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.frontend.AcaciaFrontEndProtocol $_obj = new org.acacia.frontend.AcaciaFrontEndProtocol((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public AcaciaFrontEndProtocol(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String ADGR = "adgr";
    
    //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String RMGR = "rmgr";
    
    //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String TRUNCATE = "trnc";
    
    //#line 13 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String DONE = "done";
    
    //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String ENVI = "envi";
    
    //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String RUOK = "ruok";
    
    //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String IMOK = "imok";
    
    //#line 17 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String EXIT = "exit";
    
    //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String EXIT_ACK = "bye";
    
    //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String SHTDN = "shdn";
    
    //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String LIST = "list";
    
    //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String VCOUNT = "vcnt";
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String ECOUNT = "ecnt";
    
    //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String SEND = "send";
    
    //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String ERROR = "emsg";
    
    //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String DEBUG = "debg";
    
    //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String GREM = "grem";
    
    //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String GREM_ACK = "grem-ack";
    
    //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String GREM_SEND = "grem-send";
    
    //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String GREM_DONE = "grem-done";
    
    //#line 31 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String PAGERANK = "pagerank";
    
    //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String OUT_DEGREE = "odeg";
    
    //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String IN_DEGREE = "ideg";
    
    //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String IN_DEGREE_SEND = "ideg-send";
    
    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String AVERAGE_OUT_DEGREE = "aodeg";
    
    //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String AVERAGE_IN_DEGREE = "aideg";
    
    //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String TOP_K_PAGERANK = "tkpagerank";
    
    //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String TOP_K_SEND = "k-send";
    
    //#line 40 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String FREE_DATA_DIR_SPACE = ((java.lang.String)("dfdt"));
    
    //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String GRAPHID_SEND = ((java.lang.String)("graphid-send"));
    
    //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public static java.lang.String TRIANGLES = ((java.lang.String)("trian"));
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public org.acacia.frontend.AcaciaFrontEndProtocol org$acacia$frontend$AcaciaFrontEndProtocol$$this$org$acacia$frontend$AcaciaFrontEndProtocol() {
        
        //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
        return org.acacia.frontend.AcaciaFrontEndProtocol.this;
    }
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaFrontEndProtocol() {
        this((java.lang.System[]) null);
        org$acacia$frontend$AcaciaFrontEndProtocol$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.frontend.AcaciaFrontEndProtocol org$acacia$frontend$AcaciaFrontEndProtocol$$init$S() {
         {
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
            
            
            //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
            this.__fieldInitializers_org_acacia_frontend_AcaciaFrontEndProtocol();
        }
        return this;
    }
    
    
    
    //#line 6 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndProtocol.x10"
    final public void __fieldInitializers_org_acacia_frontend_AcaciaFrontEndProtocol() {
        
    }
    
    public static java.lang.String get$ADGR() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.ADGR;
    }
    
    public static java.lang.String get$RMGR() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.RMGR;
    }
    
    public static java.lang.String get$TRUNCATE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.TRUNCATE;
    }
    
    public static java.lang.String get$DONE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.DONE;
    }
    
    public static java.lang.String get$ENVI() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.ENVI;
    }
    
    public static java.lang.String get$RUOK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.RUOK;
    }
    
    public static java.lang.String get$IMOK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.IMOK;
    }
    
    public static java.lang.String get$EXIT() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.EXIT;
    }
    
    public static java.lang.String get$EXIT_ACK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.EXIT_ACK;
    }
    
    public static java.lang.String get$SHTDN() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.SHTDN;
    }
    
    public static java.lang.String get$LIST() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.LIST;
    }
    
    public static java.lang.String get$VCOUNT() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.VCOUNT;
    }
    
    public static java.lang.String get$ECOUNT() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.ECOUNT;
    }
    
    public static java.lang.String get$SEND() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.SEND;
    }
    
    public static java.lang.String get$ERROR() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.ERROR;
    }
    
    public static java.lang.String get$DEBUG() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.DEBUG;
    }
    
    public static java.lang.String get$GREM() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.GREM;
    }
    
    public static java.lang.String get$GREM_ACK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.GREM_ACK;
    }
    
    public static java.lang.String get$GREM_SEND() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.GREM_SEND;
    }
    
    public static java.lang.String get$GREM_DONE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.GREM_DONE;
    }
    
    public static java.lang.String get$PAGERANK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.PAGERANK;
    }
    
    public static java.lang.String get$OUT_DEGREE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.OUT_DEGREE;
    }
    
    public static java.lang.String get$IN_DEGREE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.IN_DEGREE;
    }
    
    public static java.lang.String get$IN_DEGREE_SEND() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.IN_DEGREE_SEND;
    }
    
    public static java.lang.String get$AVERAGE_OUT_DEGREE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.AVERAGE_OUT_DEGREE;
    }
    
    public static java.lang.String get$AVERAGE_IN_DEGREE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.AVERAGE_IN_DEGREE;
    }
    
    public static java.lang.String get$TOP_K_PAGERANK() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.TOP_K_PAGERANK;
    }
    
    public static java.lang.String get$TOP_K_SEND() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.TOP_K_SEND;
    }
    
    public static java.lang.String get$FREE_DATA_DIR_SPACE() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.FREE_DATA_DIR_SPACE;
    }
    
    public static java.lang.String get$GRAPHID_SEND() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND;
    }
    
    public static java.lang.String get$TRIANGLES() {
        return org.acacia.frontend.AcaciaFrontEndProtocol.TRIANGLES;
    }
}

