package test.acacia.server.x10;


@x10.runtime.impl.java.X10Generated
public class TestAcaciaInstance extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<TestAcaciaInstance> $RTT = 
        x10.rtt.NamedType.<TestAcaciaInstance> make("test.acacia.server.x10.TestAcaciaInstance",
                                                    TestAcaciaInstance.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(test.acacia.server.x10.TestAcaciaInstance $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + TestAcaciaInstance.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        test.acacia.server.x10.TestAcaciaInstance $_obj = new test.acacia.server.x10.TestAcaciaInstance((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public TestAcaciaInstance(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
    public static int main__0$1x10$lang$String$2$O(final x10.core.Rail<java.lang.String> args) {
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final java.lang.String t$33454 = java.lang.System.getProperty(((java.lang.String)("logFileName")));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final boolean t$33456 = ((t$33454) == (null));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        if (t$33456) {
            
            //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            final java.lang.String t$33455 = java.lang.System.getenv(((java.lang.String)("HOSTNAME")));
            
            //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            java.lang.System.setProperty(((java.lang.String)("logFileName")), ((java.lang.String)(t$33455)));
        }
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final java.lang.String t$33457 = java.lang.System.getProperty(((java.lang.String)("ACACIA_INSTANCE_PORT")));
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final boolean t$33458 = ((t$33457) == (null));
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        if (t$33458) {
            
            //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)("Could not find the port number to run Acacia Instance. Now exitting ")));
            
            //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            return 0;
        }
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final java.lang.String t$33459 = java.lang.System.getProperty(((java.lang.String)("ACACIA_INSTANCE_DATA_PORT")));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        final boolean t$33460 = ((t$33459) == (null));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        if (t$33460) {
            
            //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)("Could not find the port number for Acacia Instance\'s data transfer service. Now exitting ")));
            
            //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            return 0;
        }
        
        //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new test.acacia.server.x10.TestAcaciaInstance.$Closure$17())));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new test.acacia.server.x10.TestAcaciaInstance.$Closure$18())));
        
        //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        try {{
            
            //#line 114 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            final java.net.InetAddress t$33461 = java.net.InetAddress.getLocalHost();
            
            //#line 114 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            final java.lang.String t$33462 = t$33461.getHostName();
            
            //#line 114 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            final java.lang.String t$33463 = (("Started AcaciaInstance service at ") + (t$33462));
            
            //#line 114 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$33463)));
        }}catch (final java.net.UnknownHostException e) {
            
            //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            e.printStackTrace();
        }
        
        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        return 0;
    }
    
    
    //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
    final public test.acacia.server.x10.TestAcaciaInstance test$acacia$server$x10$TestAcaciaInstance$$this$test$acacia$server$x10$TestAcaciaInstance() {
        
        //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
        return test.acacia.server.x10.TestAcaciaInstance.this;
    }
    
    
    //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
    // creation method for java code (1-phase java constructor)
    public TestAcaciaInstance() {
        this((java.lang.System[]) null);
        test$acacia$server$x10$TestAcaciaInstance$$init$S();
    }
    
    // constructor for non-virtual call
    final public test.acacia.server.x10.TestAcaciaInstance test$acacia$server$x10$TestAcaciaInstance$$init$S() {
         {
            
            //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            
            
            //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            this.__fieldInitializers_test_acacia_server_x10_TestAcaciaInstance();
        }
        return this;
    }
    
    
    
    //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
    final public void __fieldInitializers_test_acacia_server_x10_TestAcaciaInstance() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$17 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$17> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$17> make($Closure$17.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(test.acacia.server.x10.TestAcaciaInstance.$Closure$17 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$17.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            test.acacia.server.x10.TestAcaciaInstance.$Closure$17 $_obj = new test.acacia.server.x10.TestAcaciaInstance.$Closure$17((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$17(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            try {{
                
                //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                final org.acacia.server.AcaciaInstance server = new org.acacia.server.AcaciaInstance();
                
                //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                try {{
                    
                    //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                    server.start_running();
                }}catch (final java.net.UnknownHostException e) {
                    
                    //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                    e.printStackTrace();
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public $Closure$17() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$18 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$18> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$18> make($Closure$18.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(test.acacia.server.x10.TestAcaciaInstance.$Closure$18 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$18.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            test.acacia.server.x10.TestAcaciaInstance.$Closure$18 $_obj = new test.acacia.server.x10.TestAcaciaInstance.$Closure$18((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$18(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
            try {{
                
                //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                final org.acacia.server.AcaciaInstanceFileTransferService service = new org.acacia.server.AcaciaInstanceFileTransferService();
                
                //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                try {{
                    
                    //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                    service.start_running();
                }}catch (final java.net.UnknownHostException e) {
                    
                    //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                    e.printStackTrace();
                }
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/test/acacia/server/x10/TestAcaciaInstance.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public $Closure$18() {
             {
                
            }
        }
        
    }
    
}

