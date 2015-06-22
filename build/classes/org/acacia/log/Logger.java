package org.acacia.log;


@x10.runtime.impl.java.X10Generated
public class Logger extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Logger> $RTT = 
        x10.rtt.NamedType.<Logger> make("org.acacia.log.Logger",
                                        Logger.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.log.Logger $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Logger.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.log.Logger $_obj = new org.acacia.log.Logger((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Logger(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void trace(final java.lang.String message) {
        
        //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.trace(message);
    }
    
    
    //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void debug(final java.lang.String message) {
        
        //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.debug(message);
    }
    
    
    //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void info(final java.lang.String message) {
        
        //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.info(message);
    }
    
    
    //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void warn(final java.lang.String message) {
        
        //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.warn(message);
    }
    
    
    //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void error(final java.lang.String message) {
        
        //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.error(message);
    }
    
    
    //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void fatal(final java.lang.String message) {
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        org.acacia.log.java.Logger_Java.fatal(message);
    }
    
    
    //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_trace(final java.lang.String id$65) {
        try {
            org.acacia.log.java.Logger_Java.trace(id$65);
        }
        catch (java.lang.Throwable exc$33602) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33602);
        }
        
    }
    
    
    
    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_debug(final java.lang.String id$66) {
        try {
            org.acacia.log.java.Logger_Java.debug(id$66);
        }
        catch (java.lang.Throwable exc$33603) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33603);
        }
        
    }
    
    
    
    //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_info(final java.lang.String id$67) {
        try {
            org.acacia.log.java.Logger_Java.info(id$67);
        }
        catch (java.lang.Throwable exc$33604) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33604);
        }
        
    }
    
    
    
    //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_warn(final java.lang.String id$68) {
        try {
            org.acacia.log.java.Logger_Java.warn(id$68);
        }
        catch (java.lang.Throwable exc$33605) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33605);
        }
        
    }
    
    
    
    //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_error(final java.lang.String id$69) {
        try {
            org.acacia.log.java.Logger_Java.error(id$69);
        }
        catch (java.lang.Throwable exc$33606) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33606);
        }
        
    }
    
    
    
    //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    public static void call_fatal(final java.lang.String id$70) {
        try {
            org.acacia.log.java.Logger_Java.fatal(id$70);
        }
        catch (java.lang.Throwable exc$33607) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33607);
        }
        
    }
    
    
    
    //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    final public org.acacia.log.Logger org$acacia$log$Logger$$this$org$acacia$log$Logger() {
        
        //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
        return org.acacia.log.Logger.this;
    }
    
    
    //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    // creation method for java code (1-phase java constructor)
    public Logger() {
        this((java.lang.System[]) null);
        org$acacia$log$Logger$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.log.Logger org$acacia$log$Logger$$init$S() {
         {
            
            //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
            
            
            //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
            this.__fieldInitializers_org_acacia_log_Logger();
        }
        return this;
    }
    
    
    
    //#line 5 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/log/Logger.x10"
    final public void __fieldInitializers_org_acacia_log_Logger() {
        
    }
}

