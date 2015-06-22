package org.acacia.frontend;


@x10.runtime.impl.java.X10Generated
public class AcaciaFrontEnd extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaFrontEnd> $RTT = 
        x10.rtt.NamedType.<AcaciaFrontEnd> make("org.acacia.frontend.AcaciaFrontEnd",
                                                AcaciaFrontEnd.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEnd $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaFrontEnd.class + " calling"); } 
        $_obj.runFlag = $deserializer.readBoolean();
        $_obj.sessions = $deserializer.readObject();
        $_obj.srv = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.frontend.AcaciaFrontEnd $_obj = new org.acacia.frontend.AcaciaFrontEnd((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.runFlag);
        $serializer.write(this.sessions);
        $serializer.write(this.srv);
        
    }
    
    // constructor just for allocation
    public AcaciaFrontEnd(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    public boolean runFlag;
    
    //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    public java.net.ServerSocket srv;
    
    //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    public x10.util.ArrayList<org.acacia.frontend.AcaciaFrontEndServiceSession> sessions;
    
    
    //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    public void run() {
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        try {{
            
            //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)("Starting the frontend")));
            
            //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final int t$17144 = org.acacia.util.java.Conts_Java.ACACIA_FRONTEND_PORT;
            
            //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.net.ServerSocket t$17145 = ((java.net.ServerSocket)(new java.net.ServerSocket(((int)(t$17144)))));
            
            //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            this.srv = ((java.net.ServerSocket)(t$17145));
            
            //#line 31 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)("Done creating frontend")));
            
            //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final x10.lang.PlaceGroup t$17146 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
            
            //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final long t$17147 = t$17146.size$O();
            
            //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.lang.String t$17148 = (("Place count : ") + ((x10.core.Long.$box(t$17147))));
            
            //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$17148)));
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            while (true) {
                
                //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                final boolean t$17151 = this.runFlag;
                
                //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                if (!(t$17151)) {
                    
                    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                    break;
                }
                
                //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                final java.net.ServerSocket t$17159 = ((java.net.ServerSocket)(this.srv));
                
                //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                java.net.Socket socket$17160 = t$17159.accept();
                
                //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                final java.net.Socket skt$17161 = ((java.net.Socket)(socket$17160));
                
                //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                final org.acacia.frontend.AcaciaFrontEndServiceSession session$17162 = new org.acacia.frontend.AcaciaFrontEndServiceSession((java.lang.System[]) null).org$acacia$frontend$AcaciaFrontEndServiceSession$$init$S(((java.net.Socket)(skt$17161)));
                
                //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                final x10.util.ArrayList t$17163 = ((x10.util.ArrayList)(this.sessions));
                
                //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                ((x10.util.ArrayList<org.acacia.frontend.AcaciaFrontEndServiceSession>)t$17163).add__0x10$util$ArrayList$$T$O(((org.acacia.frontend.AcaciaFrontEndServiceSession)(session$17162)));
                
                //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
                session$17162.run();
            }
        }}catch (java.net.BindException e) {
            
            //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.net.BindException t$17152 = ((java.net.BindException)(e));
            
            //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.lang.String t$17153 = t$17152.getMessage();
            
            //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.lang.String t$17154 = (("Error : ") + (t$17153));
            
            //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$17154)));
        }catch (java.io.IOException e) {
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.io.IOException t$17155 = ((java.io.IOException)(e));
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.lang.String t$17156 = t$17155.getMessage();
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            final java.lang.String t$17157 = (("Error : ") + (t$17156));
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$17157)));
        }
    }
    
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    final public org.acacia.frontend.AcaciaFrontEnd org$acacia$frontend$AcaciaFrontEnd$$this$org$acacia$frontend$AcaciaFrontEnd() {
        
        //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        return org.acacia.frontend.AcaciaFrontEnd.this;
    }
    
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaFrontEnd() {
        this((java.lang.System[]) null);
        org$acacia$frontend$AcaciaFrontEnd$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.frontend.AcaciaFrontEnd org$acacia$frontend$AcaciaFrontEnd$$init$S() {
         {
            
            //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            
            
            //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
            this.__fieldInitializers_org_acacia_frontend_AcaciaFrontEnd();
        }
        return this;
    }
    
    
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
    final public void __fieldInitializers_org_acacia_frontend_AcaciaFrontEnd() {
        
        //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        this.runFlag = true;
        
        //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        this.srv = null;
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        final x10.util.ArrayList t$17158 = ((x10.util.ArrayList)(new x10.util.ArrayList<org.acacia.frontend.AcaciaFrontEndServiceSession>((java.lang.System[]) null, org.acacia.frontend.AcaciaFrontEndServiceSession.$RTT).x10$util$ArrayList$$init$S()));
        
        //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEnd.x10"
        this.sessions = t$17158;
    }
}

