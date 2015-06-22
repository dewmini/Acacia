package org.acacia.frontend;


@x10.runtime.impl.java.X10Generated
public class AcaciaFrontEndServiceSession extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaFrontEndServiceSession> $RTT = 
        x10.rtt.NamedType.<AcaciaFrontEndServiceSession> make("org.acacia.frontend.AcaciaFrontEndServiceSession",
                                                              AcaciaFrontEndServiceSession.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaFrontEndServiceSession.class + " calling"); } 
        $_obj.IS_DISTRIBUTED = $deserializer.readBoolean();
        $_obj.gremlinInterpreter = $deserializer.readObject();
        $_obj.sessionSkt = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.frontend.AcaciaFrontEndServiceSession $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.IS_DISTRIBUTED);
        $serializer.write(this.gremlinInterpreter);
        $serializer.write(this.sessionSkt);
        
    }
    
    // constructor just for allocation
    public AcaciaFrontEndServiceSession(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public java.net.Socket sessionSkt;
    
    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public org.acacia.frontend.AcaciaGremlinInterpreter gremlinInterpreter;
    
    //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public boolean IS_DISTRIBUTED;
    
    
    //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaFrontEndServiceSession(final java.net.Socket socket) {
        this((java.lang.System[]) null);
        org$acacia$frontend$AcaciaFrontEndServiceSession$$init$S(socket);
    }
    
    // constructor for non-virtual call
    final public org.acacia.frontend.AcaciaFrontEndServiceSession org$acacia$frontend$AcaciaFrontEndServiceSession$$init$S(final java.net.Socket socket) {
         {
            
            //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            
            
            //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            this.__fieldInitializers_org_acacia_frontend_AcaciaFrontEndServiceSession();
            
            //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            this.sessionSkt = ((java.net.Socket)(socket));
        }
        return this;
    }
    
    
    
    //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public void run() {
        
        //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        try {{
            
            //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.net.Socket t$20698 = ((java.net.Socket)(this.sessionSkt));
            
            //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.InputStream t$20699 = t$20698.getInputStream();
            
            //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.InputStreamReader t$20700 = ((java.io.InputStreamReader)(new java.io.InputStreamReader(t$20699)));
            
            //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            java.io.BufferedReader buff = new java.io.BufferedReader(((java.io.Reader)(t$20700)));
            
            //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.net.Socket t$20701 = ((java.net.Socket)(this.sessionSkt));
            
            //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.OutputStream t$20702 = t$20701.getOutputStream();
            
            //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            java.io.PrintWriter out = new java.io.PrintWriter(t$20702);
            
            //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            java.lang.String msg = null;
            
            //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            while (true) {
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.io.BufferedReader t$20703 = ((java.io.BufferedReader)(buff));
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20704 = t$20703.readLine();
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20705 = msg = ((java.lang.String)(t$20704));
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$20725 = ((t$20705) != (null));
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (!(t$20725)) {
                    
                    //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    break;
                }
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21327 = ((java.lang.String)(msg));
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21328 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.EXIT));
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$21329 = (t$21327).equals(t$21328);
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (t$21329) {
                    
                    //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.io.PrintWriter t$21330 = ((java.io.PrintWriter)(out));
                    
                    //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21331 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.EXIT_ACK));
                    
                    //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    t$21330.println(((java.lang.String)(t$21331)));
                    
                    //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.io.PrintWriter t$21332 = ((java.io.PrintWriter)(out));
                    
                    //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    t$21332.flush();
                    
                    //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.net.Socket t$21333 = ((java.net.Socket)(this.sessionSkt));
                    
                    //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    t$21333.close();
                    
                    //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    break;
                } else {
                    
                    //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21334 = ((java.lang.String)(msg));
                    
                    //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21335 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.SHTDN));
                    
                    //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$21336 = (t$21334).equals(t$21335);
                    
                    //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (t$21336) {
                        
                        //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean result$21337 = org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(((java.lang.String)("SHUTDOWN;")));
                        
                        //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.io.PrintWriter t$21338 = ((java.io.PrintWriter)(out));
                        
                        //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$21339 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.EXIT_ACK));
                        
                        //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        t$21338.println(((java.lang.String)(t$21339)));
                        
                        //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.io.PrintWriter t$21340 = ((java.io.PrintWriter)(out));
                        
                        //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        t$21340.flush();
                        
                        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        try {{
                            
                            //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.net.Socket t$21341 = ((java.net.Socket)(this.sessionSkt));
                            
                            //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            t$21341.close();
                            
                            //#line 63 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            break;
                        }}catch (final java.io.IOException e$21342) {
                            
                            //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$21343 = e$21342.getMessage();
                            
                            //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$21344 = (("Error : ") + (t$21343));
                            
                            //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$21344)));
                        }
                    } else {
                        
                        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$21345 = ((java.lang.String)(msg));
                        
                        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.io.BufferedReader t$21346 = ((java.io.BufferedReader)(buff));
                        
                        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.io.PrintWriter t$21347 = ((java.io.PrintWriter)(out));
                        
                        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        this.process(((java.lang.String)(t$21345)), ((java.io.BufferedReader)(t$21346)), ((java.io.PrintWriter)(t$21347)));
                    }
                }
            }
        }}catch (final java.io.IOException e) {
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20726 = e.getMessage();
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20727 = (("Error : ") + (t$20726));
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20727)));
        }
    }
    
    
    //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public void process(final java.lang.String msg, final java.io.BufferedReader buff, final java.io.PrintWriter out) {
        
        //#line 80 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String response = "";
        
        //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String str = null;
        
        //#line 83 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$20728 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.LIST));
        
        //#line 83 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$20972 = (msg).equals(t$20728);
        
        //#line 83 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        if (t$20972) {
            
            //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail resultArr = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect("SELECT IDGRAPH,NAME,UPLOAD_PATH,GRAPH_STATUS_IDGRAPH_STATUS FROM ACACIA_META.GRAPH");
            
            //#line 85 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            response = ((java.lang.String)("|"));
            
            //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail rail$21358 = ((x10.core.Rail)(resultArr));
            
            //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long i$20557min$21359 = 0L;
            
            //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long i$20557max$21360 = ((x10.core.Rail<java.lang.String>)rail$21358).size;
            
            //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            long i$21355 = i$20557min$21359;
            {
                
                //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String[] resultArr$value$21728 = ((java.lang.String[])resultArr.value);
                
                //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21356 = i$21355;
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$21357 = ((t$21356) < (((long)(i$20557max$21360))));
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (!(t$21357)) {
                        
                        //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        break;
                    }
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long item$21352 = i$21355;
                    
                    //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21348 = ((java.lang.String)(response));
                    
                    //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21349 = ((java.lang.String)resultArr$value$21728[(int)item$21352]);
                    
                    //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21350 = ((t$21349) + ("|"));
                    
                    //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21351 = ((t$21348) + (t$21350));
                    
                    //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    response = ((java.lang.String)(t$21351));
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21353 = i$21355;
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21354 = ((t$21353) + (((long)(1L))));
                    
                    //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    i$21355 = t$21354;
                }
            }
            
            //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20738 = ((java.lang.String)(response));
            
            //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$20741 = (t$20738).equals("|");
            
            //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (t$20741) {
                
                //#line 91 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20739 = ((java.lang.String)(response));
                
                //#line 91 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20740 = ((t$20739) + ("|"));
                
                //#line 91 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                response = ((java.lang.String)(t$20740));
            }
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20742 = ((java.lang.String)(response));
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20743 = ((t$20742) + ("\r\n"));
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            response = ((java.lang.String)(t$20743));
            
            //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20744 = ((java.lang.String)(response));
            
            //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            out.println(((java.lang.String)(t$20744)));
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            out.flush();
        } else {
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$20745 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.VCOUNT));
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$20971 = (msg).equals(t$20745);
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (t$20971) {
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20746 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                out.println(((java.lang.String)(t$20746)));
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                out.flush();
                
                //#line 100 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    
                    //#line 101 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20747 = buff.readLine();
                    
                    //#line 101 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    str = ((java.lang.String)(t$20747));
                }}catch (final java.io.IOException e) {
                    
                    //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20748 = e.getMessage();
                    
                    //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20749 = (("Error : ") + (t$20748));
                    
                    //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20749)));
                }
                
                //#line 105 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20750 = ((java.lang.String)(str));
                
                //#line 105 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20751 = (("graph|") + (t$20750));
                
                //#line 105 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20752 = ((t$20751) + ("|"));
                
                //#line 105 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20752)));
                
                //#line 107 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20753 = ((java.lang.String)(str));
                
                //#line 107 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$20754 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20753)));
                
                //#line 107 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$20760 = !(t$20754);
                
                //#line 107 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (t$20760) {
                    
                    //#line 108 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20755 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                    
                    //#line 108 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20756 = "emsg:The specified graph id does not exist";
                    
                    //#line 108 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.println(((java.lang.String)(t$20756)));
                    
                    //#line 109 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.flush();
                } else {
                    
                    //#line 111 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20757 = ((java.lang.String)(str));
                    
                    //#line 111 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long vcnt = org.acacia.frontend.AcaciaFrontEndServiceSession.countVertices$O(((java.lang.String)(t$20757)));
                    
                    //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20758 = (("vertcount|") + ((x10.core.Long.$box(vcnt))));
                    
                    //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20759 = ((t$20758) + ("|"));
                    
                    //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20759)));
                    
                    //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.println((long)(vcnt));
                    
                    //#line 114 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.flush();
                }
            } else {
                
                //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$20761 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ADGR));
                
                //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$20970 = (msg).equals(t$20761);
                
                //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (t$20970) {
                    
                    //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20762 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.SEND));
                    
                    //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.println(((java.lang.String)(t$20762)));
                    
                    //#line 119 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    out.flush();
                    
                    //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    java.lang.String name = "";
                    
                    //#line 121 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    java.lang.String path = "";
                    
                    //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    try {{
                        
                        //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20763 = buff.readLine();
                        
                        //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        str = ((java.lang.String)(t$20763));
                    }}catch (final java.io.IOException e) {
                        
                        //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20764 = e.getMessage();
                        
                        //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20765 = (("Error : ") + (t$20764));
                        
                        //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20765)));
                    }
                    
                    //#line 127 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20766 = ((java.lang.String)(str));
                    
                    //#line 127 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final x10.core.Rail strArr = x10.lang.StringHelper.split("|", t$20766);
                    
                    //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$20767 = ((x10.core.Rail<java.lang.String>)strArr).size;
                    
                    //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$20770 = ((long) t$20767) != ((long) 2L);
                    
                    //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (t$20770) {
                        
                        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20768 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                        
                        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20769 = "emsg:Message format not recognized";
                        
                        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.println(((java.lang.String)(t$20769)));
                        
                        //#line 131 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.flush();
                        
                        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        return;
                    }
                    
                    //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20771 = ((java.lang.String[])strArr.value)[(int)0L];
                    
                    //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    name = ((java.lang.String)(t$20771));
                    
                    //#line 136 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20772 = ((java.lang.String[])strArr.value)[(int)1L];
                    
                    //#line 136 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    path = ((java.lang.String)(t$20772));
                    
                    //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20773 = ((java.lang.String)(path));
                    
                    //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$20787 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExists$O(((java.lang.String)(t$20773)));
                    
                    //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (t$20787) {
                        
                        //#line 139 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20774 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                        
                        //#line 139 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20775 = "emsg:Graph exists";
                        
                        //#line 139 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.println(((java.lang.String)(t$20775)));
                        
                        //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.flush();
                    } else {
                        
                        //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20776 = ((java.lang.String)(path));
                        
                        //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        x10.io.File file = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$20776);
                        
                        //#line 143 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final x10.io.File t$20777 = ((x10.io.File)(file));
                        
                        //#line 143 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$20786 = t$20777.exists$O();
                        
                        //#line 143 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$20786) {
                            
                            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$20783 = this.IS_DISTRIBUTED;
                            
                            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (t$20783) {
                                
                                //#line 145 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20778 = ((java.lang.String)(name));
                                
                                //#line 145 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20779 = ((java.lang.String)(path));
                                
                                //#line 145 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                org.acacia.server.AcaciaServer.uploadGraphDistributed(((java.lang.String)(t$20778)), ((java.lang.String)(t$20779)));
                            } else {
                                
                                //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final x10.io.Printer t$20780 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
                                //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                t$20780.println(((java.lang.Object)("Uploading the graph locally.")));
                                
                                //#line 148 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20781 = ((java.lang.String)(name));
                                
                                //#line 148 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20782 = ((java.lang.String)(path));
                                
                                //#line 148 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                org.acacia.server.AcaciaServer.uploadGraphLocally(((java.lang.String)(t$20781)), ((java.lang.String)(t$20782)));
                            }
                        } else {
                            
                            //#line 151 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20784 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                            
                            //#line 151 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20785 = "emsg:Graph data file does not exist on the specified path";
                            
                            //#line 151 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.println(((java.lang.String)(t$20785)));
                            
                            //#line 152 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.flush();
                        }
                    }
                } else {
                    
                    //#line 155 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$20788 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.RMGR));
                    
                    //#line 155 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$20969 = (msg).equals(t$20788);
                    
                    //#line 155 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (t$20969) {
                        
                        //#line 156 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20789 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.SEND));
                        
                        //#line 156 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.println(((java.lang.String)(t$20789)));
                        
                        //#line 157 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        out.flush();
                        
                        //#line 159 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        java.lang.String graphID = "";
                        
                        //#line 161 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        try {{
                            
                            //#line 162 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20790 = buff.readLine();
                            
                            //#line 162 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            graphID = ((java.lang.String)(t$20790));
                        }}catch (final java.io.IOException e) {
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20791 = e.getMessage();
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20792 = (("Error : ") + (t$20791));
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20792)));
                        }
                        
                        //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20793 = ((java.lang.String)(graphID));
                        
                        //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$20794 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20793)));
                        
                        //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$20801 = !(t$20794);
                        
                        //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$20801) {
                            
                            //#line 168 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20795 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                            
                            //#line 168 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20796 = "emsg:The specified graph id does not exist";
                            
                            //#line 168 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.println(((java.lang.String)(t$20796)));
                            
                            //#line 169 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.flush();
                        } else {
                            
                            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20797 = ((java.lang.String)(graphID));
                            
                            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final long t$20798 = org.acacia.frontend.AcaciaFrontEndServiceSession.removeGraph$O(((java.lang.String)(t$20797)));
                            
                            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20799 = (("") + ((x10.core.Long.$box(t$20798))));
                            
                            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            str = ((java.lang.String)(t$20799));
                            
                            //#line 172 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20800 = ((java.lang.String)(str));
                            
                            //#line 172 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.println(((java.lang.String)(t$20800)));
                            
                            //#line 173 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.flush();
                        }
                    } else {
                        
                        //#line 176 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final java.lang.String t$20802 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ECOUNT));
                        
                        //#line 176 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$20968 = (msg).equals(t$20802);
                        
                        //#line 176 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$20968) {
                            
                            //#line 177 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20803 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                            
                            //#line 177 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.println(((java.lang.String)(t$20803)));
                            
                            //#line 178 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            out.flush();
                            
                            //#line 180 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            try {{
                                
                                //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20804 = buff.readLine();
                                
                                //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                str = ((java.lang.String)(t$20804));
                            }}catch (final java.io.IOException e) {
                                
                                //#line 183 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20805 = e.getMessage();
                                
                                //#line 183 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20806 = (("Error : ") + (t$20805));
                                
                                //#line 183 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20806)));
                            }
                            
                            //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20807 = ((java.lang.String)(str));
                            
                            //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20808 = (("graph|") + (t$20807));
                            
                            //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20809 = ((t$20808) + ("|"));
                            
                            //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20809)));
                            
                            //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20810 = ((java.lang.String)(str));
                            
                            //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$20811 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20810)));
                            
                            //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$20818 = !(t$20811);
                            
                            //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (t$20818) {
                                
                                //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20812 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                
                                //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20813 = "emsg:The specified graph id does not exist";
                                
                                //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.println(((java.lang.String)(t$20813)));
                                
                                //#line 189 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.flush();
                            } else {
                                
                                //#line 191 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20814 = ((java.lang.String)(str));
                                
                                //#line 191 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final long ecnt = org.acacia.frontend.AcaciaFrontEndServiceSession.countEdges$O(((java.lang.String)(t$20814)));
                                
                                //#line 192 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20815 = ((java.lang.String)(str));
                                
                                //#line 192 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20816 = (("edge count|") + (t$20815));
                                
                                //#line 192 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20817 = ((t$20816) + ("|"));
                                
                                //#line 192 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20817)));
                                
                                //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.println((long)(ecnt));
                                
                                //#line 194 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.flush();
                            }
                        } else {
                            
                            //#line 196 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$20819 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.RUOK));
                            
                            //#line 196 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$20967 = (msg).equals(t$20819);
                            
                            //#line 196 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (t$20967) {
                                
                                //#line 197 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20820 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.IMOK));
                                
                                //#line 197 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.println(((java.lang.String)(t$20820)));
                                
                                //#line 198 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                out.flush();
                            } else {
                                
                                //#line 199 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$20821 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.TRUNCATE));
                                
                                //#line 199 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final boolean t$20966 = (msg).equals(t$20821);
                                
                                //#line 199 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                if (t$20966) {
                                    
                                    //#line 200 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    org.acacia.frontend.AcaciaFrontEndServiceSession.truncateAcacia();
                                    
                                    //#line 201 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    final java.lang.String t$20822 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.DONE));
                                    
                                    //#line 201 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    out.println(((java.lang.String)(t$20822)));
                                    
                                    //#line 202 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    out.flush();
                                } else {
                                    
                                    //#line 203 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    final java.lang.String t$20823 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.DEBUG));
                                    
                                    //#line 203 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    final boolean t$20965 = (msg).equals(t$20823);
                                    
                                    //#line 203 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    if (t$20965) {
                                        
                                        //#line 205 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        final java.lang.String t$20824 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.DONE));
                                        
                                        //#line 205 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        out.println(((java.lang.String)(t$20824)));
                                        
                                        //#line 206 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        out.flush();
                                    } else {
                                        
                                        //#line 207 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        final java.lang.String t$20825 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GREM));
                                        
                                        //#line 207 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        final boolean t$20964 = (msg).equals(t$20825);
                                        
                                        //#line 207 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                        if (t$20964) {
                                            
                                            //#line 208 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final java.lang.String t$20826 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GREM_ACK));
                                            
                                            //#line 208 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            out.println(((java.lang.String)(t$20826)));
                                            
                                            //#line 209 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final java.lang.String t$20827 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.SEND));
                                            
                                            //#line 209 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            out.println(((java.lang.String)(t$20827)));
                                            
                                            //#line 210 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            out.flush();
                                            
                                            //#line 213 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final org.acacia.frontend.AcaciaGremlinInterpreter t$20828 = ((org.acacia.frontend.AcaciaGremlinInterpreter)(new org.acacia.frontend.AcaciaGremlinInterpreter((java.lang.System[]) null).org$acacia$frontend$AcaciaGremlinInterpreter$$init$S(((java.io.BufferedReader)(buff)), ((java.io.PrintWriter)(out)))));
                                            
                                            //#line 213 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            this.gremlinInterpreter = ((org.acacia.frontend.AcaciaGremlinInterpreter)(t$20828));
                                            
                                            //#line 214 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final org.acacia.frontend.AcaciaGremlinInterpreter t$20829 = ((org.acacia.frontend.AcaciaGremlinInterpreter)(this.gremlinInterpreter));
                                            
                                            //#line 214 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            t$20829.run();
                                            
                                            //#line 215 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            out.println(((java.lang.String)("Exitted here...")));
                                            
                                            //#line 216 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            out.flush();
                                        } else {
                                            
                                            //#line 218 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final java.lang.String t$20830 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.PAGERANK));
                                            
                                            //#line 218 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            final boolean t$20963 = (msg).equals(t$20830);
                                            
                                            //#line 218 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                            if (t$20963) {
                                                
                                                //#line 219 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20831 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                                                
                                                //#line 219 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                out.println(((java.lang.String)(t$20831)));
                                                
                                                //#line 220 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                out.flush();
                                                
                                                //#line 222 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                try {{
                                                    
                                                    //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20832 = buff.readLine();
                                                    
                                                    //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    str = ((java.lang.String)(t$20832));
                                                }}catch (final java.io.IOException e) {
                                                    
                                                    //#line 225 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20833 = e.getMessage();
                                                    
                                                    //#line 225 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20834 = (("Error : ") + (t$20833));
                                                    
                                                    //#line 225 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20834)));
                                                }
                                                
                                                //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20835 = ((java.lang.String)(str));
                                                
                                                //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20836 = (("graph|") + (t$20835));
                                                
                                                //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20837 = ((t$20836) + ("|"));
                                                
                                                //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20837)));
                                                
                                                //#line 229 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20838 = ((java.lang.String)(str));
                                                
                                                //#line 229 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final boolean t$20839 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20838)));
                                                
                                                //#line 229 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final boolean t$20844 = !(t$20839);
                                                
                                                //#line 229 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                if (t$20844) {
                                                    
                                                    //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20840 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                                    
                                                    //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20841 = "emsg:The specified graph id does not exist";
                                                    
                                                    //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.println(((java.lang.String)(t$20841)));
                                                    
                                                    //#line 231 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.flush();
                                                } else {
                                                    
                                                    //#line 234 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20842 = ((java.lang.String)(str));
                                                    
                                                    //#line 234 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20843 = org.acacia.frontend.AcaciaFrontEndServiceSession.getPageRank(((java.lang.String)(t$20842)));
                                                    
                                                    //#line 234 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    str = ((java.lang.String)(t$20843));
                                                }
                                                
                                                //#line 236 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20845 = ((java.lang.String)(str));
                                                
                                                //#line 236 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20846 = (("result is |") + (t$20845));
                                                
                                                //#line 236 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20847 = ((t$20846) + ("|"));
                                                
                                                //#line 236 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                out.println(((java.lang.String)(t$20847)));
                                                
                                                //#line 237 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                out.flush();
                                            } else {
                                                
                                                //#line 238 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final java.lang.String t$20848 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.TOP_K_PAGERANK));
                                                
                                                //#line 238 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                final boolean t$20962 = (msg).equals(t$20848);
                                                
                                                //#line 238 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                if (t$20962) {
                                                    
                                                    //#line 239 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20849 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                                                    
                                                    //#line 239 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.println(((java.lang.String)(t$20849)));
                                                    
                                                    //#line 240 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.flush();
                                                    
                                                    //#line 242 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    try {{
                                                        
                                                        //#line 243 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20850 = buff.readLine();
                                                        
                                                        //#line 243 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        str = ((java.lang.String)(t$20850));
                                                        
                                                        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20851 = ((java.lang.String)(str));
                                                        
                                                        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final boolean t$20852 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20851)));
                                                        
                                                        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final boolean t$20865 = !(t$20852);
                                                        
                                                        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        if (t$20865) {
                                                            
                                                            //#line 246 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20853 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                                            
                                                            //#line 246 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20854 = "emsg:The specified graph id does not exist";
                                                            
                                                            //#line 246 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.println(((java.lang.String)(t$20854)));
                                                            
                                                            //#line 247 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.flush();
                                                        } else {
                                                            
                                                            //#line 252 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20855 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.TOP_K_SEND));
                                                            
                                                            //#line 252 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.println(((java.lang.String)(t$20855)));
                                                            
                                                            //#line 253 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.flush();
                                                            
                                                            //#line 254 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String str2 = buff.readLine();
                                                            
                                                            //#line 255 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final x10.io.Printer t$20857 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                            
                                                            //#line 255 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20856 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                            
                                                            //#line 255 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20858 = (("TK Pagerank start time: ") + (t$20856));
                                                            
                                                            //#line 255 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            t$20857.println(((java.lang.Object)(t$20858)));
                                                            
                                                            //#line 256 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20859 = ((java.lang.String)(str));
                                                            
                                                            //#line 256 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final int t$20860 = java.lang.Integer.parseInt(str2);
                                                            
                                                            //#line 256 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20861 = org.acacia.frontend.AcaciaFrontEndServiceSession.getTopKPageRank(((java.lang.String)(t$20859)), (int)(t$20860));
                                                            
                                                            //#line 256 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            str = ((java.lang.String)(t$20861));
                                                            
                                                            //#line 257 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final x10.io.Printer t$20863 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                            
                                                            //#line 257 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20862 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                            
                                                            //#line 257 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20864 = (("TK Pagerank end time: ") + (t$20862));
                                                            
                                                            //#line 257 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            t$20863.println(((java.lang.Object)(t$20864)));
                                                        }
                                                    }}catch (final java.io.IOException e) {
                                                        
                                                        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20866 = e.getMessage();
                                                        
                                                        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20867 = (("Error : ") + (t$20866));
                                                        
                                                        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20867)));
                                                    }
                                                    
                                                    //#line 262 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20868 = ((java.lang.String)(str));
                                                    
                                                    //#line 262 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20869 = (("graph|") + (t$20868));
                                                    
                                                    //#line 262 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20870 = ((t$20869) + ("|"));
                                                    
                                                    //#line 262 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20870)));
                                                    
                                                    //#line 263 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20871 = ((java.lang.String)(str));
                                                    
                                                    //#line 263 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20872 = (("result is |") + (t$20871));
                                                    
                                                    //#line 263 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20873 = ((t$20872) + ("|"));
                                                    
                                                    //#line 263 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.println(((java.lang.String)(t$20873)));
                                                    
                                                    //#line 264 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    out.flush();
                                                } else {
                                                    
                                                    //#line 265 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final java.lang.String t$20874 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.OUT_DEGREE));
                                                    
                                                    //#line 265 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    final boolean t$20961 = (msg).equals(t$20874);
                                                    
                                                    //#line 265 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                    if (t$20961) {
                                                        
                                                        //#line 266 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20875 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                                                        
                                                        //#line 266 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        out.println(((java.lang.String)(t$20875)));
                                                        
                                                        //#line 267 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        out.flush();
                                                        
                                                        //#line 270 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        try {{
                                                            
                                                            //#line 271 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20876 = buff.readLine();
                                                            
                                                            //#line 271 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            str = ((java.lang.String)(t$20876));
                                                        }}catch (final java.io.IOException e) {
                                                            
                                                            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20877 = e.getMessage();
                                                            
                                                            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20878 = (("Error : ") + (t$20877));
                                                            
                                                            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20878)));
                                                        }
                                                        
                                                        //#line 275 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20879 = ((java.lang.String)(str));
                                                        
                                                        //#line 275 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20880 = (("graph|") + (t$20879));
                                                        
                                                        //#line 275 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20881 = ((t$20880) + ("|"));
                                                        
                                                        //#line 275 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20881)));
                                                        
                                                        //#line 277 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20882 = ((java.lang.String)(str));
                                                        
                                                        //#line 277 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final boolean t$20883 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20882)));
                                                        
                                                        //#line 277 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final boolean t$20890 = !(t$20883);
                                                        
                                                        //#line 277 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        if (t$20890) {
                                                            
                                                            //#line 278 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20884 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                                            
                                                            //#line 278 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20885 = "emsg:The specified graph id does not exist";
                                                            
                                                            //#line 278 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.println(((java.lang.String)(t$20885)));
                                                            
                                                            //#line 279 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.flush();
                                                        } else {
                                                            
                                                            //#line 281 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final x10.io.Printer t$20886 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                            
                                                            //#line 281 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            t$20886.println(((java.lang.Object)("Out Degree distribution is ready....")));
                                                            
                                                            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final x10.io.Printer t$20888 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                            
                                                            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20887 = ((java.lang.String)(str));
                                                            
                                                            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20889 = org.acacia.frontend.AcaciaFrontEndServiceSession.getOutDegreeDistribution(((java.lang.String)(t$20887)));
                                                            
                                                            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            t$20888.println(((java.lang.Object)(t$20889)));
                                                        }
                                                    } else {
                                                        
                                                        //#line 284 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final java.lang.String t$20891 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.FREE_DATA_DIR_SPACE));
                                                        
                                                        //#line 284 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        final boolean t$20960 = (msg).equals(t$20891);
                                                        
                                                        //#line 284 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                        if (t$20960) {
                                                            
                                                            //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20892 = org.acacia.frontend.AcaciaFrontEndServiceSession.getFreeSpaceInfo();
                                                            
                                                            //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.println(((java.lang.String)(t$20892)));
                                                            
                                                            //#line 286 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            out.flush();
                                                        } else {
                                                            
                                                            //#line 287 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final java.lang.String t$20893 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.AVERAGE_OUT_DEGREE));
                                                            
                                                            //#line 287 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            final boolean t$20959 = (msg).equals(t$20893);
                                                            
                                                            //#line 287 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                            if (t$20959) {
                                                                
                                                                //#line 288 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final java.lang.String t$20894 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                                                                
                                                                //#line 288 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                out.println(((java.lang.String)(t$20894)));
                                                                
                                                                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                out.flush();
                                                                
                                                                //#line 292 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                try {{
                                                                    
                                                                    //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20895 = buff.readLine();
                                                                    
                                                                    //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    str = ((java.lang.String)(t$20895));
                                                                }}catch (final java.io.IOException e) {
                                                                    
                                                                    //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20896 = e.getMessage();
                                                                    
                                                                    //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20897 = (("Error : ") + (t$20896));
                                                                    
                                                                    //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20897)));
                                                                }
                                                                
                                                                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final java.lang.String t$20898 = ((java.lang.String)(str));
                                                                
                                                                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final boolean t$20899 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20898)));
                                                                
                                                                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final boolean t$20937 = !(t$20899);
                                                                
                                                                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                if (t$20937) {
                                                                    
                                                                    //#line 299 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20900 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                                                    
                                                                    //#line 299 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20901 = "emsg:The specified graph id does not exist";
                                                                    
                                                                    //#line 299 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.println(((java.lang.String)(t$20901)));
                                                                    
                                                                    //#line 300 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.flush();
                                                                } else {
                                                                    
                                                                    //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20902 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                                    
                                                                    //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20903 = (("Average out degree start time: ") + (t$20902));
                                                                    
                                                                    //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20903)));
                                                                    
                                                                    //#line 303 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20904 = ((java.lang.String)(str));
                                                                    
                                                                    //#line 303 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String outDegDist = org.acacia.frontend.AcaciaFrontEndServiceSession.getOutDegreeDistribution(((java.lang.String)(t$20904)));
                                                                    
                                                                    //#line 304 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    x10.util.HashMap outDegreeEntireGraph = new x10.util.HashMap<x10.core.Int, x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT, x10.rtt.Types.INT).x10$util$HashMap$$init$S();
                                                                    
                                                                    //#line 305 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    x10.core.Rail res1 = x10.lang.StringHelper.split(";", outDegDist);
                                                                    
                                                                    //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    x10.core.Rail intrmRes = null;
                                                                    
                                                                    //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final x10.core.Rail rail$21385 = ((x10.core.Rail)(res1));
                                                                    
                                                                    //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final long i$20576min$21386 = 0L;
                                                                    
                                                                    //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final long i$20576max$21387 = ((x10.core.Rail<java.lang.String>)rail$21385).size;
                                                                    
                                                                    //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    long i$21374 = i$20576min$21386;
                                                                    
                                                                    //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    for (;
                                                                         true;
                                                                         ) {
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21375 = i$21374;
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final boolean t$21376 = ((t$21375) < (((long)(i$20576max$21387))));
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        if (!(t$21376)) {
                                                                            
                                                                            //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                            break;
                                                                        }
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long item$21371 = i$21374;
                                                                        
                                                                        //#line 310 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.core.Rail t$21361 = ((x10.core.Rail)(res1));
                                                                        
                                                                        //#line 310 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$21362 = ((java.lang.String[])t$21361.value)[(int)item$21371];
                                                                        
                                                                        //#line 310 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.core.Rail t$21363 = x10.lang.StringHelper.split(":", t$21362);
                                                                        
                                                                        //#line 310 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        intrmRes = ((x10.core.Rail)(t$21363));
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.util.HashMap t$21364 = ((x10.util.HashMap)(outDegreeEntireGraph));
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.core.Rail t$21365 = ((x10.core.Rail)(intrmRes));
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$21366 = ((java.lang.String[])t$21365.value)[(int)0L];
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final int t$21367 = java.lang.Integer.parseInt(t$21366);
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.core.Rail t$21368 = ((x10.core.Rail)(intrmRes));
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$21369 = ((java.lang.String[])t$21368.value)[(int)1L];
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final int t$21370 = java.lang.Integer.parseInt(t$21369);
                                                                        
                                                                        //#line 311 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        ((x10.util.HashMap<x10.core.Int, x10.core.Int>)t$21364).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(x10.core.Int.$box(t$21367), x10.core.Int.$box(t$21370));
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21372 = i$21374;
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21373 = ((t$21372) + (((long)(1L))));
                                                                        
                                                                        //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        i$21374 = t$21373;
                                                                    }
                                                                    
                                                                    //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final x10.util.HashMap t$20920 = ((x10.util.HashMap)(outDegreeEntireGraph));
                                                                    
                                                                    //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final x10.util.Set t$20921 = ((x10.util.Set<x10.util.Map.Entry<x10.core.Int, x10.core.Int>>)
                                                                                                   ((x10.util.HashMap<x10.core.Int, x10.core.Int>)t$20920).entries());
                                                                    
                                                                    //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    x10.lang.Iterator itr = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Int, x10.core.Int>>)
                                                                                              ((x10.lang.Iterable<x10.util.Map.Entry<x10.core.Int, x10.core.Int>>)t$20921).iterator());
                                                                    
                                                                    //#line 316 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    long totalDeg = 0L;
                                                                    
                                                                    //#line 317 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    long vCount = 0L;
                                                                    
                                                                    //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    while (true) {
                                                                        
                                                                        //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.lang.Iterator t$20922 = ((x10.lang.Iterator)(itr));
                                                                        
                                                                        //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final boolean t$20930 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Int, x10.core.Int>>)t$20922).hasNext$O();
                                                                        
                                                                        //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        if (!(t$20930)) {
                                                                            
                                                                            //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                            break;
                                                                        }
                                                                        
                                                                        //#line 320 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.lang.Iterator t$21377 = ((x10.lang.Iterator)(itr));
                                                                        
                                                                        //#line 320 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.util.Map.Entry item$21378 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Int, x10.core.Int>>)t$21377).next$G();
                                                                        
                                                                        //#line 321 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21379 = totalDeg;
                                                                        
                                                                        //#line 321 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final int t$21380 = x10.core.Int.$unbox(((x10.util.Map.Entry<x10.core.Int, x10.core.Int>)item$21378).getValue$G());
                                                                        
                                                                        //#line 321 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21381 = ((long)(((int)(t$21380))));
                                                                        
                                                                        //#line 321 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21382 = ((t$21379) + (((long)(t$21381))));
                                                                        
                                                                        //#line 321 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        totalDeg = t$21382;
                                                                        
                                                                        //#line 322 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21383 = vCount;
                                                                        
                                                                        //#line 322 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long t$21384 = ((t$21383) + (((long)(1L))));
                                                                        
                                                                        //#line 322 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        vCount = t$21384;
                                                                    }
                                                                    
                                                                    //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final long t$20931 = totalDeg;
                                                                    
                                                                    //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final double t$20933 = ((double)(long)(((long)(t$20931))));
                                                                    
                                                                    //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final long t$20932 = vCount;
                                                                    
                                                                    //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final double t$20934 = ((double)(long)(((long)(t$20932))));
                                                                    
                                                                    //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final double aodeg = ((t$20933) / (((double)(t$20934))));
                                                                    
                                                                    //#line 326 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20935 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                                    
                                                                    //#line 326 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20936 = (("Average out degree end time: ") + (t$20935));
                                                                    
                                                                    //#line 326 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$20936)));
                                                                    
                                                                    //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.println((double)(aodeg));
                                                                    
                                                                    //#line 329 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.flush();
                                                                }
                                                                
                                                                //#line 331 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                org.acacia.log.java.Logger_Java.info(((java.lang.String)("********************* Done average out degree *****")));
                                                            } else {
                                                                
                                                                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final java.lang.String t$20938 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.TRIANGLES));
                                                                
                                                                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                final boolean t$20958 = (msg).equals(t$20938);
                                                                
                                                                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                if (t$20958) {
                                                                    
                                                                    //#line 333 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20939 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.GRAPHID_SEND));
                                                                    
                                                                    //#line 333 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.println(((java.lang.String)(t$20939)));
                                                                    
                                                                    //#line 334 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.flush();
                                                                    
                                                                    //#line 336 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    try {{
                                                                        
                                                                        //#line 337 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20940 = buff.readLine();
                                                                        
                                                                        //#line 337 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        str = ((java.lang.String)(t$20940));
                                                                    }}catch (final java.io.IOException e) {
                                                                        
                                                                        //#line 339 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20941 = e.getMessage();
                                                                        
                                                                        //#line 339 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20942 = (("Error : ") + (t$20941));
                                                                        
                                                                        //#line 339 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        org.acacia.log.java.Logger_Java.error(((java.lang.String)(t$20942)));
                                                                    }
                                                                    
                                                                    //#line 342 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20943 = ((java.lang.String)(str));
                                                                    
                                                                    //#line 342 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final boolean t$20944 = org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(t$20943)));
                                                                    
                                                                    //#line 342 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final boolean t$20956 = !(t$20944);
                                                                    
                                                                    //#line 342 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    if (t$20956) {
                                                                        
                                                                        //#line 343 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20945 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.ERROR));
                                                                        
                                                                        //#line 343 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20946 = "emsg:The specified graph id does not exist";
                                                                        
                                                                        //#line 343 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        out.println(((java.lang.String)(t$20946)));
                                                                        
                                                                        //#line 344 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        out.flush();
                                                                    } else {
                                                                        
                                                                        //#line 346 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.io.Printer t$20948 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                                        
                                                                        //#line 346 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20947 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                                        
                                                                        //#line 346 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20949 = (("Triangle counting start time: ") + (t$20947));
                                                                        
                                                                        //#line 346 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        t$20948.println(((java.lang.Object)(t$20949)));
                                                                        
                                                                        //#line 347 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20950 = ((java.lang.String)(str));
                                                                        
                                                                        //#line 347 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final long nTraingles = this.countTraingles$O(((java.lang.String)(t$20950)));
                                                                        
                                                                        //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.io.Printer t$20951 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                                        
                                                                        //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20952 = (("nTraingles : ") + ((x10.core.Long.$box(nTraingles))));
                                                                        
                                                                        //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        t$20951.println(((java.lang.Object)(t$20952)));
                                                                        
                                                                        //#line 349 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final x10.io.Printer t$20954 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                                                        
                                                                        //#line 349 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20953 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
                                                                        
                                                                        //#line 349 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        final java.lang.String t$20955 = (("Triangle counting end time: ") + (t$20953));
                                                                        
                                                                        //#line 349 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        t$20954.println(((java.lang.Object)(t$20955)));
                                                                        
                                                                        //#line 351 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        out.println((long)(nTraingles));
                                                                        
                                                                        //#line 352 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                        out.flush();
                                                                    }
                                                                } else {
                                                                    
                                                                    //#line 356 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    final java.lang.String t$20957 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.SEND));
                                                                    
                                                                    //#line 356 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.println(((java.lang.String)(t$20957)));
                                                                    
                                                                    //#line 357 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                                                    out.flush();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    //#line 361 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private long countTraingles$O(final java.lang.String graphID) {
        
        //#line 362 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long result = 0L;
        
        //#line 364 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 365 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$20973 = ((x10.core.Rail<java.lang.String>)hosts).size;
        
        //#line 365 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final int hostListLen = ((int)(long)(((long)(t$20973))));
        
        //#line 366 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$20974 = ((long)(((int)(hostListLen))));
        
        //#line 366 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail intermRes = new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$20974);
        
        //#line 385 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$20975 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 385 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$20975.println(((java.lang.Object)("PPPPPPPPPPPPPPPPPPPPPPP")));
        
        //#line 386 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$20976 = (("SELECT NAME,PARTITION_IDPARTITION FROM ACACIA_META.HOST_HAS_PARTITION INNER JOIN ACACIA_META.HOST ON HOST_IDHOST=IDHOST WHERE PARTITION_GRAPH_IDGRAPH=") + (graphID));
        
        //#line 386 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$20977 = ((t$20976) + (";"));
        
        //#line 386 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail l = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$20977);
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$20980 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail t$20978 = ((x10.core.Rail)(l));
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$20979 = ((x10.core.Rail<java.lang.String>)t$20978).size;
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$20981 = (("QQQQQQQQQQQQQQQQQQQQQQQ size : ") + ((x10.core.Long.$box(t$20979))));
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$20980.println(((java.lang.Object)(t$20981)));
        
        //#line 388 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.HashMap mp = new x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.ArrayList.$RTT, x10.rtt.Types.STRING)).x10$util$HashMap$$init$S();
        
        //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long i$21435 = 0L;
        
        //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21436 = i$21435;
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21437 = ((x10.core.Rail)(l));
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21438 = ((x10.core.Rail<java.lang.String>)t$21437).size;
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21439 = ((t$21436) < (((long)(t$21438))));
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21439)) {
                
                //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 392 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21388 = ((x10.core.Rail)(l));
            
            //#line 392 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21389 = i$21435;
            
            //#line 392 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21390 = ((java.lang.String[])t$21388.value)[(int)t$21389];
            
            //#line 392 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail items$21391 = x10.lang.StringHelper.split(",", t$21390);
            
            //#line 398 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21392 = ((x10.util.HashMap)(mp));
            
            //#line 398 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21393 = ((java.lang.String[])items$21391.value)[(int)0L];
            
            //#line 398 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList pts$21394 = ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21392).get__0x10$util$HashMap$$K$G(((java.lang.String)(t$21393)));
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.util.ArrayList partitions$21395 = null;
            
            //#line 403 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21396 = ((pts$21394) == (null));
            
            //#line 403 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (t$21396) {
                
                //#line 405 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.ArrayList t$21397 = ((x10.util.ArrayList)(new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S()));
                
                //#line 405 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                partitions$21395 = ((x10.util.ArrayList)(t$21397));
            } else {
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.ArrayList t$21398 = ((x10.util.ArrayList<java.lang.String>)
                                                     pts$21394);
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                partitions$21395 = ((x10.util.ArrayList)(t$21398));
            }
            
            //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList t$21399 = ((x10.util.ArrayList)(partitions$21395));
            
            //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21400 = ((java.lang.String[])items$21391.value)[(int)1L];
            
            //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.ArrayList<java.lang.String>)t$21399).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$21400)));
            
            //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21401 = ((x10.util.HashMap)(mp));
            
            //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21402 = ((java.lang.String[])items$21391.value)[(int)0L];
            
            //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList t$21403 = ((x10.util.ArrayList)(partitions$21395));
            
            //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21401).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$21402)), ((x10.util.ArrayList)(t$21403)));
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21404 = i$21435;
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21405 = ((t$21404) + (((long)(1L))));
            
            //#line 390 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21435 = t$21405;
        }
        
        //#line 415 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int cntr = 0;
        {
            
            //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.xrx.FinishState fs$21696 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail[] $intermRes$21722 = new x10.core.Rail[1];
                
                //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $intermRes$21722[(int)0]=intermRes;
                
                //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    {
                        
                        //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final x10.lang.PlaceGroup t$21003 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                        
                        //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final x10.lang.Iterator p$20595 = ((x10.lang.Iterable<x10.lang.Place>)t$21003).iterator();
                        
                        //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$21018 = ((x10.lang.Iterator<x10.lang.Place>)p$20595).hasNext$O();
                            
                            //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (!(t$21018)) {
                                
                                //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                break;
                            }
                            
                            //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final x10.lang.Place p$21406 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$20595).next$G()));
                            
                            //#line 417 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int k$21407 = cntr;
                            
                            //#line 418 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final long t$21408 = p$21406.id;
                            
                            //#line 418 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String host$21409 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$21408));
                            
                            //#line 419 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final long t$21410 = p$21406.id;
                            
                            //#line 419 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int port$21411 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$21410));
                            
                            //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            java.lang.String partitionID$21412 = null;
                            
                            //#line 422 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final x10.util.HashMap t$21413 = ((x10.util.HashMap)(mp));
                            
                            //#line 422 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final x10.util.ArrayList t$21414 = ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21413).get__0x10$util$HashMap$$K$G(((java.lang.String)(host$21409)));
                            
                            //#line 422 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            x10.util.ArrayList partitions$21415 = ((x10.util.ArrayList<java.lang.String>)
                                                                    t$21414);
                            
                            //#line 423 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final x10.util.ArrayList t$21416 = ((x10.util.ArrayList)(partitions$21415));
                            
                            //#line 423 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final long t$21417 = ((x10.util.ArrayList<java.lang.String>)t$21416).size$O();
                            
                            //#line 423 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$21418 = ((t$21417) > (((long)(0L))));
                            
                            //#line 423 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (t$21418) {
                                
                                //#line 424 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final x10.util.ArrayList t$21419 = ((x10.util.ArrayList)(partitions$21415));
                                
                                //#line 424 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$21420 = ((x10.util.ArrayList<java.lang.String>)t$21419).removeFirst$G();
                                
                                //#line 424 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                partitionID$21412 = ((java.lang.String)(t$21420));
                            }
                            
                            //#line 429 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String ptID$21421 = partitionID$21412;
                            
                            //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$0($intermRes$21722, k$21407, host$21409, port$21411, graphID, ptID$21421))));
                            
                            //#line 433 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21425 = cntr;
                            
                            //#line 433 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21426 = ((t$21425) + (((int)(1))));
                            
                            //#line 433 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            cntr = t$21426;
                        }
                    }
                }}catch (java.lang.Throwable ct$21694) {
                    
                    //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$21694)));
                    
                    //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$21696)));
                 }}
                
                //#line 416 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                intermRes = ((x10.core.Rail<x10.core.Long>)$intermRes$21722[(int)0]);
                }
            }
        
        //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21440 = 0;
        
        //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21441 = i$21440;
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21442 = ((t$21441) < (((int)(hostListLen))));
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21442)) {
                
                //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21427 = result;
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21428 = ((x10.core.Rail)(intermRes));
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21429 = i$21440;
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21430 = ((long)(((int)(t$21429))));
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21431 = ((long[])t$21428.value)[(int)t$21430];
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21432 = ((t$21427) + (((long)(t$21431))));
            
            //#line 437 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = t$21432;
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21433 = i$21440;
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21434 = ((t$21433) + (((int)(1))));
            
            //#line 436 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21440 = t$21434;
        }
        
        //#line 440 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$21030 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 440 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$21030.println(((java.lang.Object)("---------- Now calculating the global only traingles --------")));
        
        //#line 442 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long globalTriangleCount = org.acacia.server.AcaciaManager.countGlobalTraingles(graphID);
        
        //#line 502 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$21031 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 502 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21032 = (("Global traingles : ") + ((x10.core.Long.$box(globalTriangleCount))));
        
        //#line 502 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$21031.println(((java.lang.Object)(t$21032)));
        
        //#line 503 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21033 = result;
        
        //#line 503 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21034 = ((t$21033) + (((long)(globalTriangleCount))));
        
        //#line 503 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        result = t$21034;
        
        //#line 504 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21035 = result;
        
        //#line 504 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21035;
        }
    
    public static long countTraingles$P$O(final java.lang.String graphID, final org.acacia.frontend.AcaciaFrontEndServiceSession AcaciaFrontEndServiceSession) {
        return AcaciaFrontEndServiceSession.countTraingles$O(((java.lang.String)(graphID)));
    }
    
    
    //#line 507 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static void truncateAcacia() {
        
        //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.lang.PlaceGroup t$21448 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.lang.Iterator p$21449 = ((x10.lang.Iterable<x10.lang.Place>)t$21448).iterator();
        
        //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21450 = ((x10.lang.Iterator<x10.lang.Place>)p$21449).hasNext$O();
            
            //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21450)) {
                
                //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 509 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.lang.Place p$21443 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$21449).next$G()));
            
            //#line 512 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21444 = p$21443.id;
            
            //#line 512 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21445 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$21444));
            
            //#line 512 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21446 = p$21443.id;
            
            //#line 512 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21447 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$21446));
            
            //#line 512 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            org.acacia.server.AcaciaManager.truncateLocalInstance(t$21445, ((int)(t$21447)));
        }
        
        //#line 517 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail idArr = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect("select IDGRAPH from ACACIA_META.Graph");
        
        //#line 520 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete("DELETE FROM ACACIA_META.HOST_HAS_PARTITION"));
        
        //#line 521 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete("DELETE FROM ACACIA_META.PARTITION"));
        
        //#line 522 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete("DELETE FROM ACACIA_META.GRAPH"));
    }
    
    public static void truncateAcacia$P() {
        org.acacia.frontend.AcaciaFrontEndServiceSession.truncateAcacia();
    }
    
    
    //#line 530 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static long removeGraph$O(final java.lang.String graphID) {
        
        //#line 531 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long result = 0L;
        
        //#line 549 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.lang.PlaceGroup t$21043 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 549 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21044 = t$21043.size$O();
        
        //#line 549 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final int numPlaces = ((int)(long)(((long)(t$21044))));
        
        //#line 550 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21045 = ((long)(((int)(numPlaces))));
        
        //#line 550 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail intermRes = new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$21045);
        
        //#line 552 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21046 = (("SELECT NAME, PARTITION_IDPARTITION FROM ACACIA_META.HOST_HAS_PARTITION INNER JOIN ACACIA_META.HOST ON HOST_IDHOST=IDHOST WHERE PARTITION_GRAPH_IDGRAPH=") + (graphID));
        
        //#line 552 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail hostPartitionResults = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$21046);
        
        //#line 554 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.HashMap mp = new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
        
        //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long i$21507 = 0L;
        
        //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21508 = i$21507;
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21509 = ((x10.core.Rail)(hostPartitionResults));
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21510 = ((x10.core.Rail<java.lang.String>)t$21509).size;
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21511 = ((t$21508) < (((long)(t$21510))));
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21511)) {
                
                //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 558 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21451 = ((x10.core.Rail)(hostPartitionResults));
            
            //#line 558 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21452 = i$21507;
            
            //#line 558 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21453 = ((java.lang.String[])t$21451.value)[(int)t$21452];
            
            //#line 558 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail items$21454 = x10.lang.StringHelper.split(",", t$21453);
            
            //#line 559 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21455 = ((x10.util.HashMap)(mp));
            
            //#line 559 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21456 = ((java.lang.String[])items$21454.value)[(int)0L];
            
            //#line 559 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21457 = ((java.lang.String[])items$21454.value)[(int)1L];
            
            //#line 559 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.HashMap<java.lang.String, java.lang.String>)t$21455).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$21456)), ((java.lang.String)(t$21457)));
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21458 = i$21507;
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21459 = ((t$21458) + (((long)(1L))));
            
            //#line 556 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21507 = t$21459;
        }
        {
            
            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.xrx.FinishState fs$21702 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail[] $intermRes$21723 = new x10.core.Rail[1];
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $intermRes$21723[(int)0]=intermRes;
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.HashMap[] $mp$21724 = new x10.util.HashMap[1];
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $mp$21724[(int)0]=mp;
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    {
                        
                        //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        int i = 0;
                        
                        //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21061 = i;
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$21072 = ((t$21061) < (((int)(numPlaces))));
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (!(t$21072)) {
                                
                                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                break;
                            }
                            
                            //#line 563 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int k$21460 = i;
                            
                            //#line 564 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$1(k$21460, $intermRes$21723, $mp$21724, graphID))));
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21470 = i;
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21471 = ((t$21470) + (((int)(1))));
                            
                            //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            i = t$21471;
                        }
                    }
                }}catch (java.lang.Throwable ct$21700) {
                    
                    //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$21700)));
                    
                    //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$21702)));
                 }}
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                intermRes = ((x10.core.Rail<x10.core.Long>)$intermRes$21723[(int)0]);
                
                //#line 562 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                mp = ((x10.util.HashMap<java.lang.String, java.lang.String>)$mp$21724[(int)0]);
                }
            }
        
        //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21512 = 0;
        
        //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21513 = i$21512;
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21514 = ((t$21513) < (((int)(numPlaces))));
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21514)) {
                
                //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21472 = result;
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21473 = ((x10.core.Rail)(intermRes));
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21474 = i$21512;
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21475 = ((long)(((int)(t$21474))));
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21476 = ((long[])t$21473.value)[(int)t$21475];
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21477 = ((t$21472) + (((long)(t$21476))));
            
            //#line 572 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = t$21477;
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21478 = i$21512;
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21479 = ((t$21478) + (((int)(1))));
            
            //#line 571 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21512 = t$21479;
        }
        
        //#line 577 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21084 = (("DELETE FROM ACACIA_META.HOST_HAS_PARTITION WHERE PARTITION_GRAPH_IDGRAPH=") + (graphID));
        
        //#line 577 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete(t$21084));
        
        //#line 578 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21085 = (("DELETE FROM ACACIA_META.PARTITION WHERE GRAPH_IDGRAPH=") + (graphID));
        
        //#line 578 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete(t$21085));
        
        //#line 579 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21086 = (("DELETE FROM ACACIA_META.GRAPH WHERE IDGRAPH=") + (graphID));
        
        //#line 579 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runDelete(t$21086));
        
        //#line 583 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21087 = org.acacia.util.java.Utils_Java.getAcaciaProperty(((java.lang.String)("org.acacia.centralstore.location")));
        
        //#line 583 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.io.File centralDir = new java.io.File(t$21087);
        
        //#line 584 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21088 = (("") + (graphID));
        
        //#line 584 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21089 = ((t$21088) + ("_*"));
        
        //#line 584 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.io.FileFilter fileFilter = ((java.io.FileFilter)(new org.apache.commons.io.filefilter.WildcardFileFilter(t$21089)));
        
        //#line 585 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.io.File t$21090 = ((java.io.File)(centralDir));
        
        //#line 585 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.io.FileFilter t$21091 = ((java.io.FileFilter)(fileFilter));
        
        //#line 585 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.io.File[] files = t$21090.listFiles(((java.io.FileFilter)(t$21091)));
        
        //#line 586 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$21092 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 586 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$21092.println(((java.lang.Object)("Files to delete are")));
        
        //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21515 = 0;
        
        //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21516 = i$21515;
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.File[] t$21517 = ((java.io.File[])(files));
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21518 = (t$21517).length;
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21519 = ((t$21516) < (((int)(t$21518))));
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21519)) {
                
                //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 589 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            boolean delStatus$21480 = false;
            
            //#line 591 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.File[] t$21481 = ((java.io.File[])(files));
            
            //#line 591 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21482 = i$21515;
            
            //#line 591 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.File t$21483 = (t$21481)[((int)(t$21482))];
            
            //#line 591 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21484 = t$21483.isDirectory();
            
            //#line 591 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (t$21484) {
                
                //#line 594 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    
                    //#line 595 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.io.File[] t$21485 = ((java.io.File[])(files));
                    
                    //#line 595 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final int t$21486 = i$21515;
                    
                    //#line 595 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.io.File t$21487 = (t$21485)[((int)(t$21486))];
                    
                    //#line 595 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    org.apache.commons.io.FileUtils.deleteDirectory(((java.io.File)(t$21487)));
                }}catch (java.io.IOException ex$21488) {
                    
                    //#line 597 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.io.IOException t$21489 = ((java.io.IOException)(ex$21488));
                    
                    //#line 597 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    t$21489.printStackTrace();
                }
            } else {
                
                //#line 600 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.io.File[] t$21490 = ((java.io.File[])(files));
                
                //#line 600 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final int t$21491 = i$21515;
                
                //#line 600 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.io.File t$21492 = (t$21490)[((int)(t$21491))];
                
                //#line 600 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21492.delete();
            }
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.io.Printer t$21493 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21494 = i$21515;
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21495 = (("=======>") + ((x10.core.Int.$box(t$21494))));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21496 = ((t$21495) + (" "));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.File[] t$21497 = ((java.io.File[])(files));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21498 = i$21515;
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.io.File t$21499 = (t$21497)[((int)(t$21498))];
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21500 = t$21499.getAbsolutePath();
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21501 = ((t$21496) + (t$21500));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21502 = ((t$21501) + ("--->deleted?-->"));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21503 = delStatus$21480;
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21504 = ((t$21502) + ((x10.core.Boolean.$box(t$21503))));
            
            //#line 602 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            t$21493.println(((java.lang.Object)(t$21504)));
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21505 = i$21515;
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21506 = ((t$21505) + (((int)(1))));
            
            //#line 587 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21515 = t$21506;
        }
        
        //#line 604 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.io.Printer t$21123 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 604 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        t$21123.println(((java.lang.Object)("-------------------")));
        
        //#line 606 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21124 = result;
        
        //#line 606 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21124;
        }
    
    public static long removeGraph$P$O(final java.lang.String graphID) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.removeGraph$O(((java.lang.String)(graphID)));
    }
    
    
    //#line 612 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static long countVertices$O(final java.lang.String graphID) {
        
        //#line 613 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21125 = org.acacia.server.AcaciaManager.countVertices(graphID);
        
        //#line 613 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21125;
    }
    
    public static long countVertices$P$O(final java.lang.String graphID) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.countVertices$O(((java.lang.String)(graphID)));
    }
    
    
    //#line 619 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static long countEdges$O(final java.lang.String graphID) {
        
        //#line 620 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21126 = org.acacia.server.AcaciaManager.countEdges(graphID);
        
        //#line 620 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21126;
    }
    
    public static long countEdges$P$O(final java.lang.String graphID) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.countEdges$O(((java.lang.String)(graphID)));
    }
    
    
    //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static java.lang.String getTopKPageRank(final java.lang.String graphID, final int k) {
        
        //#line 627 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String result = "";
        
        //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 629 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21127 = ((x10.core.Rail<java.lang.String>)hosts).size;
        
        //#line 629 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final int hostListLen = ((int)(long)(((long)(t$21127))));
        
        //#line 630 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21128 = ((long)(((int)(hostListLen))));
        
        //#line 630 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail intermRes = new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$21128);
        
        //#line 631 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.StringBuilder hostList = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail rail$21617 = ((x10.core.Rail)(hosts));
        
        //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long size$21618 = ((x10.core.Rail<java.lang.String>)rail$21617).size;
        
        //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long idx$21526 = 0L;
        {
            
            //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String[] rail$21617$value$21729 = ((java.lang.String[])rail$21617.value);
            
            //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            for (;
                 true;
                 ) {
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21527 = idx$21526;
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$21528 = ((t$21527) < (((long)(size$21618))));
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (!(t$21528)) {
                    
                    //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    break;
                }
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21522 = idx$21526;
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String hst$21523 = ((java.lang.String)(((java.lang.String)rail$21617$value$21729[(int)t$21522])));
                
                //#line 634 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.StringBuilder t$21520 = ((x10.util.StringBuilder)(hostList));
                
                //#line 634 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21520.add(((java.lang.String)(hst$21523)));
                
                //#line 635 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.StringBuilder t$21521 = ((x10.util.StringBuilder)(hostList));
                
                //#line 635 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21521.add(((java.lang.String)(",")));
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21524 = idx$21526;
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21525 = ((t$21524) + (((long)(1L))));
                
                //#line 633 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                idx$21526 = t$21525;
            }
        }
        
        //#line 638 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.StringBuilder t$21137 = ((x10.util.StringBuilder)(hostList));
        
        //#line 638 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String hstLine = t$21137.toString();
        
        //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21138 = (("SELECT NAME,PARTITION_IDPARTITION FROM ACACIA_META.HOST_HAS_PARTITION INNER JOIN ACACIA_META.HOST ON HOST_IDHOST=IDHOST WHERE PARTITION_GRAPH_IDGRAPH=") + (graphID));
        
        //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21139 = ((t$21138) + (";"));
        
        //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail l = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$21139);
        
        //#line 642 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.HashMap mp = new x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.ArrayList.$RTT, x10.rtt.Types.STRING)).x10$util$HashMap$$init$S();
        
        //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long i$21619 = 0L;
        
        //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21620 = i$21619;
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21621 = ((x10.core.Rail)(l));
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21622 = ((x10.core.Rail<java.lang.String>)t$21621).size;
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21623 = ((t$21620) < (((long)(t$21622))));
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21623)) {
                
                //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 645 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21529 = ((x10.core.Rail)(l));
            
            //#line 645 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21530 = i$21619;
            
            //#line 645 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21531 = ((java.lang.String[])t$21529.value)[(int)t$21530];
            
            //#line 645 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail items$21532 = x10.lang.StringHelper.split(",", t$21531);
            
            //#line 648 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21533 = ((x10.util.HashMap)(mp));
            
            //#line 648 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21534 = ((java.lang.String[])items$21532.value)[(int)0L];
            
            //#line 648 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList pts$21535 = ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21533).get__0x10$util$HashMap$$K$G(((java.lang.String)(t$21534)));
            
            //#line 649 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.util.ArrayList partitions$21536 = null;
            
            //#line 653 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21537 = ((pts$21535) == (null));
            
            //#line 653 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (t$21537) {
                
                //#line 654 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.ArrayList t$21538 = ((x10.util.ArrayList)(new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S()));
                
                //#line 654 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                partitions$21536 = ((x10.util.ArrayList)(t$21538));
            } else {
                
                //#line 656 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.ArrayList t$21539 = ((x10.util.ArrayList<java.lang.String>)
                                                     pts$21535);
                
                //#line 656 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                partitions$21536 = ((x10.util.ArrayList)(t$21539));
            }
            
            //#line 659 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList t$21540 = ((x10.util.ArrayList)(partitions$21536));
            
            //#line 659 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21541 = ((java.lang.String[])items$21532.value)[(int)1L];
            
            //#line 659 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.ArrayList<java.lang.String>)t$21540).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$21541)));
            
            //#line 660 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21542 = ((x10.util.HashMap)(mp));
            
            //#line 660 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21543 = ((java.lang.String[])items$21532.value)[(int)0L];
            
            //#line 660 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.ArrayList t$21544 = ((x10.util.ArrayList)(partitions$21536));
            
            //#line 660 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21542).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$21543)), ((x10.util.ArrayList)(t$21544)));
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21545 = i$21619;
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21546 = ((t$21545) + (((long)(1L))));
            
            //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21619 = t$21546;
        }
        {
            
            //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.xrx.FinishState fs$21708 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail[] $intermRes$21725 = new x10.core.Rail[1];
                
                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $intermRes$21725[(int)0]=intermRes;
                
                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    {
                        
                        //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        int i = 0;
                        {
                            
                            //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String[] hosts$value$21730 = ((java.lang.String[])hosts.value);
                            
                            //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final int t$21161 = i;
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final boolean t$21179 = ((t$21161) < (((int)(hostListLen))));
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                if (!(t$21179)) {
                                    
                                    //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    break;
                                }
                                
                                //#line 665 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final int u$21547 = i;
                                
                                //#line 667 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final x10.util.HashMap t$21548 = ((x10.util.HashMap)(mp));
                                
                                //#line 667 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final long t$21549 = ((long)(((int)(u$21547))));
                                
                                //#line 667 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String t$21550 = ((java.lang.String)hosts$value$21730[(int)t$21549]);
                                
                                //#line 667 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final x10.util.ArrayList t$21551 = ((x10.util.HashMap<java.lang.String, x10.util.ArrayList<java.lang.String>>)t$21548).get__0x10$util$HashMap$$K$G(((java.lang.String)(t$21550)));
                                
                                //#line 667 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                x10.util.ArrayList partitions$21552 = ((x10.util.ArrayList<java.lang.String>)
                                                                        t$21551);
                                
                                //#line 668 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                java.lang.String partitionID$21553 = null;
                                
                                //#line 670 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final x10.util.ArrayList t$21554 = ((x10.util.ArrayList)(partitions$21552));
                                
                                //#line 670 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final long t$21555 = ((x10.util.ArrayList<java.lang.String>)t$21554).size$O();
                                
                                //#line 670 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final boolean t$21556 = ((t$21555) > (((long)(0L))));
                                
                                //#line 670 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                if (t$21556) {
                                    
                                    //#line 671 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    final x10.util.ArrayList t$21557 = ((x10.util.ArrayList)(partitions$21552));
                                    
                                    //#line 671 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    final java.lang.String t$21558 = ((x10.util.ArrayList<java.lang.String>)t$21557).removeFirst$G();
                                    
                                    //#line 671 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                    partitionID$21553 = ((java.lang.String)(t$21558));
                                }
                                
                                //#line 676 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final java.lang.String ptID$21559 = partitionID$21553;
                                
                                //#line 678 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$2($intermRes$21725, u$21547, hosts, k, graphID, ptID$21559, hstLine, (org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$2.__2$1x10$lang$String$2) null))));
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final int t$21566 = i;
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                final int t$21567 = ((t$21566) + (((int)(1))));
                                
                                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                i = t$21567;
                            }
                        }
                    }
                }}catch (java.lang.Throwable ct$21706) {
                    
                    //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$21706)));
                    
                    //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$21708)));
                 }}
                
                //#line 664 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                intermRes = ((x10.core.Rail<java.lang.String>)$intermRes$21725[(int)0]);
                }
            }
        
        //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21624 = 0;
        
        //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21625 = i$21624;
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21626 = ((t$21625) < (((int)(hostListLen))));
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21626)) {
                
                //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21568 = ((java.lang.String)(result));
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21569 = ((x10.core.Rail)(intermRes));
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21570 = i$21624;
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21571 = ((long)(((int)(t$21570))));
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21572 = ((java.lang.String[])t$21569.value)[(int)t$21571];
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21573 = ((t$21568) + (t$21572));
            
            //#line 684 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = ((java.lang.String)(t$21573));
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21574 = i$21624;
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21575 = ((t$21574) + (((int)(1))));
            
            //#line 683 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21624 = t$21575;
        }
        
        //#line 688 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21191 = ((java.lang.String)(result));
        
        //#line 688 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail str1 = x10.lang.StringHelper.split(";", t$21191);
        
        //#line 689 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        double current = 0.0;
        
        //#line 690 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        double largest = 0.0;
        
        //#line 691 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        double lastLargest = 0.0;
        
        //#line 692 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String largestVertex = null;
        
        //#line 693 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.HashMap resultMP = new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
        
        //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21627 = 0;
        
        //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21628 = i$21627;
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21629 = ((t$21628) < (((int)(k))));
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21629)) {
                
                //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail rail$21601 = ((x10.core.Rail)(str1));
            
            //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long size$21602 = ((x10.core.Rail<java.lang.String>)rail$21601).size;
            
            //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            long idx$21598 = 0L;
            {
                
                //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String[] rail$21601$value$21731 = ((java.lang.String[])rail$21601.value);
                
                //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21599 = idx$21598;
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$21600 = ((t$21599) < (((long)(size$21602))));
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (!(t$21600)) {
                        
                        //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        break;
                    }
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21594 = idx$21598;
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String item$21595 = ((java.lang.String)(((java.lang.String)rail$21601$value$21731[(int)t$21594])));
                    
                    //#line 696 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final x10.core.Rail str$21576 = x10.lang.StringHelper.split(",", item$21595);
                    
                    //#line 697 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final java.lang.String t$21577 = ((java.lang.String[])str$21576.value)[(int)1L];
                    
                    //#line 697 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final double t$21578 = java.lang.Double.parseDouble(t$21577);
                    
                    //#line 697 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    current = t$21578;
                    
                    //#line 699 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final double t$21579 = lastLargest;
                    
                    //#line 699 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final boolean t$21580 = ((double) t$21579) == ((double) 0.0);
                    
                    //#line 699 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    if (t$21580) {
                        
                        //#line 700 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final double t$21581 = current;
                        
                        //#line 700 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final double t$21582 = largest;
                        
                        //#line 700 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$21583 = ((t$21581) > (((double)(t$21582))));
                        
                        //#line 700 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$21583) {
                            
                            //#line 701 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final double t$21584 = current;
                            
                            //#line 701 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            largest = t$21584;
                            
                            //#line 702 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$21585 = ((java.lang.String[])str$21576.value)[(int)0L];
                            
                            //#line 702 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            largestVertex = ((java.lang.String)(t$21585));
                        }
                    } else {
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final double t$21586 = lastLargest;
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final double t$21587 = current;
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        boolean t$21588 = ((t$21586) > (((double)(t$21587))));
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$21588) {
                            
                            //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final double t$21589 = current;
                            
                            //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final double t$21590 = largest;
                            
                            //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            t$21588 = ((t$21589) > (((double)(t$21590))));
                        }
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        final boolean t$21591 = t$21588;
                        
                        //#line 705 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        if (t$21591) {
                            
                            //#line 706 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final double t$21592 = current;
                            
                            //#line 706 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            largest = t$21592;
                            
                            //#line 707 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final java.lang.String t$21593 = ((java.lang.String[])str$21576.value)[(int)0L];
                            
                            //#line 707 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            largestVertex = ((java.lang.String)(t$21593));
                        }
                    }
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21596 = idx$21598;
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    final long t$21597 = ((t$21596) + (((long)(1L))));
                    
                    //#line 695 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    idx$21598 = t$21597;
                }
            }
            
            //#line 711 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final double t$21603 = largest;
            
            //#line 711 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            lastLargest = t$21603;
            
            //#line 712 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            largest = 0.0;
            
            //#line 713 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.HashMap t$21604 = ((x10.util.HashMap)(resultMP));
            
            //#line 713 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21605 = ((java.lang.String)(largestVertex));
            
            //#line 713 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final double t$21606 = lastLargest;
            
            //#line 713 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21607 = (("") + ((x10.core.Double.$box(t$21606))));
            
            //#line 713 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            ((x10.util.HashMap<java.lang.String, java.lang.String>)t$21604).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$21605)), ((java.lang.String)(t$21607)));
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21608 = i$21627;
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21609 = ((t$21608) + (((int)(1))));
            
            //#line 694 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21627 = t$21609;
        }
        
        //#line 716 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.HashMap t$21225 = ((x10.util.HashMap)(resultMP));
        
        //#line 716 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.Set t$21226 = ((x10.util.Set<x10.util.Map.Entry<java.lang.String, java.lang.String>>)
                                       ((x10.util.HashMap<java.lang.String, java.lang.String>)t$21225).entries());
        
        //#line 716 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.lang.Iterator itr3 = ((x10.lang.Iterator<x10.util.Map.Entry<java.lang.String, java.lang.String>>)
                                         ((x10.lang.Iterable<x10.util.Map.Entry<java.lang.String, java.lang.String>>)t$21226).iterator());
        
        //#line 717 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.StringBuilder sb2 = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 718 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        while (true) {
            
            //#line 718 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21233 = ((x10.lang.Iterator<x10.util.Map.Entry<java.lang.String, java.lang.String>>)itr3).hasNext$O();
            
            //#line 718 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21233)) {
                
                //#line 718 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 719 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.Map.Entry entr$21610 = ((x10.lang.Iterator<x10.util.Map.Entry<java.lang.String, java.lang.String>>)itr3).next$G();
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.StringBuilder t$21611 = ((x10.util.StringBuilder)(sb2));
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21612 = ((x10.util.Map.Entry<java.lang.String, java.lang.String>)entr$21610).getKey$G();
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21613 = ((t$21612) + (","));
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21614 = ((x10.util.Map.Entry<java.lang.String, java.lang.String>)entr$21610).getValue$G();
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21615 = ((t$21613) + (t$21614));
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21616 = ((t$21615) + (";"));
            
            //#line 720 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            t$21611.add(((java.lang.String)(t$21616)));
        }
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.StringBuilder t$21234 = ((x10.util.StringBuilder)(sb2));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21235 = t$21234.toString();
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21235;
        }
    
    public static java.lang.String getTopKPageRank$P(final java.lang.String graphID, final int k) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.getTopKPageRank(((java.lang.String)(graphID)), (int)(k));
    }
    
    
    //#line 729 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static java.lang.String getPageRank(final java.lang.String graphID) {
        
        //#line 730 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String result = "";
        
        //#line 731 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 732 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21236 = ((x10.core.Rail<java.lang.String>)hosts).size;
        
        //#line 732 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final int hostListLen = ((int)(long)(((long)(t$21236))));
        
        //#line 733 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21237 = ((long)(((int)(hostListLen))));
        
        //#line 733 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail intermRes = new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$21237);
        
        //#line 734 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.StringBuilder hostList = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail rail$21655 = ((x10.core.Rail)(hosts));
        
        //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long size$21656 = ((x10.core.Rail<java.lang.String>)rail$21655).size;
        
        //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long idx$21636 = 0L;
        {
            
            //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String[] rail$21655$value$21732 = ((java.lang.String[])rail$21655.value);
            
            //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            for (;
                 true;
                 ) {
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21637 = idx$21636;
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$21638 = ((t$21637) < (((long)(size$21656))));
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (!(t$21638)) {
                    
                    //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    break;
                }
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21632 = idx$21636;
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String hst$21633 = ((java.lang.String)(((java.lang.String)rail$21655$value$21732[(int)t$21632])));
                
                //#line 737 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.StringBuilder t$21630 = ((x10.util.StringBuilder)(hostList));
                
                //#line 737 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21630.add(((java.lang.String)(hst$21633)));
                
                //#line 738 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.StringBuilder t$21631 = ((x10.util.StringBuilder)(hostList));
                
                //#line 738 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21631.add(((java.lang.String)(",")));
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21634 = idx$21636;
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21635 = ((t$21634) + (((long)(1L))));
                
                //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                idx$21636 = t$21635;
            }
        }
        
        //#line 741 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.StringBuilder t$21246 = ((x10.util.StringBuilder)(hostList));
        
        //#line 741 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String hstLine = t$21246.toString();
        {
            
            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.xrx.FinishState fs$21714 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail[] $intermRes$21726 = new x10.core.Rail[1];
                
                //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $intermRes$21726[(int)0]=intermRes;
                
                //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    {
                        
                        //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        int i = 0;
                        
                        //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21248 = i;
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$21256 = ((t$21248) < (((int)(hostListLen))));
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (!(t$21256)) {
                                
                                //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                break;
                            }
                            
                            //#line 743 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int u$21639 = i;
                            
                            //#line 744 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$3($intermRes$21726, u$21639, hosts, graphID, hstLine, (org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$3.__2$1x10$lang$String$2) null))));
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21645 = i;
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21646 = ((t$21645) + (((int)(1))));
                            
                            //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            i = t$21646;
                        }
                    }
                }}catch (java.lang.Throwable ct$21712) {
                    
                    //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$21712)));
                    
                    //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$21714)));
                 }}
                
                //#line 742 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                intermRes = ((x10.core.Rail<java.lang.String>)$intermRes$21726[(int)0]);
                }
            }
        
        //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21657 = 0;
        
        //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21658 = i$21657;
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21659 = ((t$21658) < (((int)(hostListLen))));
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21659)) {
                
                //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21647 = ((java.lang.String)(result));
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21648 = ((x10.core.Rail)(intermRes));
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21649 = i$21657;
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21650 = ((long)(((int)(t$21649))));
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21651 = ((java.lang.String[])t$21648.value)[(int)t$21650];
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21652 = ((t$21647) + (t$21651));
            
            //#line 750 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = ((java.lang.String)(t$21652));
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21653 = i$21657;
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21654 = ((t$21653) + (((int)(1))));
            
            //#line 749 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21657 = t$21654;
        }
        
        //#line 753 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21268 = ((java.lang.String)(result));
        
        //#line 753 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21268;
        }
    
    public static java.lang.String getPageRank$P(final java.lang.String graphID) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.getPageRank(((java.lang.String)(graphID)));
    }
    
    
    //#line 756 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static java.lang.String getFreeSpaceInfo() {
        
        //#line 757 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String result = null;
        
        //#line 758 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.StringBuilder interimres = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 775 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail rail$21672 = ((x10.core.Rail)(hosts));
        
        //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long size$21673 = ((x10.core.Rail<java.lang.String>)rail$21672).size;
        
        //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        long idx$21669 = 0L;
        {
            
            //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String[] rail$21672$value$21733 = ((java.lang.String[])rail$21672.value);
            
            //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            for (;
                 true;
                 ) {
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21670 = idx$21669;
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final boolean t$21671 = ((t$21670) < (((long)(size$21673))));
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                if (!(t$21671)) {
                    
                    //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    break;
                }
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21665 = idx$21669;
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String host$21666 = ((java.lang.String)(((java.lang.String)rail$21672$value$21733[(int)t$21665])));
                
                //#line 777 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21660 = org.acacia.server.AcaciaManager.getFreeSpaceInfo(host$21666);
                
                //#line 777 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String freeSP$21661 = ((t$21660) + (","));
                
                //#line 778 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.io.Printer t$21662 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 778 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21663 = (("freeSP (At place 0) : ") + (freeSP$21661));
                
                //#line 778 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21662.println(((java.lang.Object)(t$21663)));
                
                //#line 779 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.StringBuilder t$21664 = ((x10.util.StringBuilder)(interimres));
                
                //#line 779 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                t$21664.add(((java.lang.String)(freeSP$21661)));
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21667 = idx$21669;
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21668 = ((t$21667) + (((long)(1L))));
                
                //#line 776 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                idx$21669 = t$21668;
            }
        }
        
        //#line 783 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21279 = ((java.lang.String)(result));
        
        //#line 783 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21286 = ((t$21279) == (null));
        
        //#line 783 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        if (t$21286) {
            
            //#line 784 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.StringBuilder t$21280 = ((x10.util.StringBuilder)(interimres));
            
            //#line 784 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21281 = t$21280.toString();
            
            //#line 784 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = ((java.lang.String)(t$21281));
        } else {
            
            //#line 786 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21283 = ((java.lang.String)(result));
            
            //#line 786 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.util.StringBuilder t$21282 = ((x10.util.StringBuilder)(interimres));
            
            //#line 786 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21284 = t$21282.toString();
            
            //#line 786 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21285 = ((t$21283) + (t$21284));
            
            //#line 786 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = ((java.lang.String)(t$21285));
        }
        
        //#line 789 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21287 = ((java.lang.String)(result));
        
        //#line 789 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21287;
    }
    
    public static java.lang.String getFreeSpaceInfo$P() {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.getFreeSpaceInfo();
    }
    
    
    //#line 796 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static java.lang.String getOutDegreeDistribution(final java.lang.String graphID) {
        
        //#line 797 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        java.lang.String result = null;
        
        //#line 798 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.util.StringBuilder interimres = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 800 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 801 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.lang.PlaceGroup t$21288 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 801 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21289 = t$21288.size$O();
        
        //#line 801 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final int numPlaces = ((int)(long)(((long)(t$21289))));
        
        //#line 802 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final long t$21290 = ((long)(((int)(numPlaces))));
        
        //#line 802 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail intermDegRes = new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$21290);
        {
            
            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.xrx.FinishState fs$21720 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail[] $intermDegRes$21727 = new x10.core.Rail[1];
                
                //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                $intermDegRes$21727[(int)0]=intermDegRes;
                
                //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                try {{
                    {
                        
                        //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        int i = 0;
                        
                        //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21292 = i;
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final boolean t$21301 = ((t$21292) < (((int)(numPlaces))));
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            if (!(t$21301)) {
                                
                                //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                                break;
                            }
                            
                            //#line 805 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21674 = i;
                            
                            //#line 805 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final long k$21675 = ((long)(((int)(t$21674))));
                            
                            //#line 806 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$4($intermDegRes$21727, k$21675, graphID))));
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21681 = i;
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            final int t$21682 = ((t$21681) + (((int)(1))));
                            
                            //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                            i = t$21682;
                        }
                    }
                }}catch (java.lang.Throwable ct$21718) {
                    
                    //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$21718)));
                    
                    //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$21720)));
                 }}
                
                //#line 804 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                intermDegRes = ((x10.core.Rail<java.lang.String>)$intermDegRes$21727[(int)0]);
                }
            }
        
        //#line 811 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.util.StringBuilder sb = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        int i$21689 = 0;
        
        //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        for (;
             true;
             ) {
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21690 = i$21689;
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final boolean t$21691 = ((t$21690) < (((int)(numPlaces))));
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            if (!(t$21691)) {
                
                //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                break;
            }
            
            //#line 814 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final x10.core.Rail t$21683 = ((x10.core.Rail)(intermDegRes));
            
            //#line 814 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21684 = i$21689;
            
            //#line 814 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final long t$21685 = ((long)(((int)(t$21684))));
            
            //#line 814 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final java.lang.String t$21686 = ((java.lang.String[])t$21683.value)[(int)t$21685];
            
            //#line 814 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            sb.add(((java.lang.String)(t$21686)));
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21687 = i$21689;
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            final int t$21688 = ((t$21687) + (((int)(1))));
            
            //#line 813 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            i$21689 = t$21688;
        }
        
        //#line 817 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21311 = sb.toString();
        
        //#line 817 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        result = ((java.lang.String)(t$21311));
        
        //#line 819 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21312 = ((java.lang.String)(result));
        
        //#line 819 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21312;
        }
    
    public static java.lang.String getOutDegreeDistribution$P(final java.lang.String graphID) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.getOutDegreeDistribution(((java.lang.String)(graphID)));
    }
    
    
    //#line 825 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static boolean graphExists$O(final java.lang.String path) {
        
        //#line 826 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        boolean result = true;
        
        //#line 827 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21313 = (("select COUNT(*) from ACACIA_META.Graph where UPLOAD_PATH LIKE \'") + (path));
        
        //#line 827 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21314 = ((t$21313) + ("\';"));
        
        //#line 827 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail l = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$21314);
        
        //#line 829 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail t$21315 = ((x10.core.Rail)(l));
        
        //#line 829 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21316 = ((java.lang.String[])t$21315.value)[(int)0L];
        
        //#line 829 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21317 = (t$21316).equals("0");
        
        //#line 829 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        if (t$21317) {
            
            //#line 830 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = false;
        }
        
        //#line 833 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21318 = result;
        
        //#line 833 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21318;
    }
    
    public static boolean graphExists$P$O(final java.lang.String path) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.graphExists$O(((java.lang.String)(path)));
    }
    
    
    //#line 839 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    private static boolean graphExistsByID$O(final java.lang.String id) {
        
        //#line 840 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        boolean result = true;
        
        //#line 841 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21319 = (("select COUNT(*) from ACACIA_META.Graph where IDGRAPH=") + (id));
        
        //#line 841 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21320 = ((t$21319) + (";"));
        
        //#line 841 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        x10.core.Rail l = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$21320);
        
        //#line 843 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final x10.core.Rail t$21321 = ((x10.core.Rail)(l));
        
        //#line 843 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21322 = ((java.lang.String[])t$21321.value)[(int)0L];
        
        //#line 843 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21323 = (t$21322).equals("0");
        
        //#line 843 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        if (t$21323) {
            
            //#line 844 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            result = false;
        }
        
        //#line 847 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21324 = result;
        
        //#line 847 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return t$21324;
    }
    
    public static boolean graphExistsByID$P$O(final java.lang.String id) {
        return org.acacia.frontend.AcaciaFrontEndServiceSession.graphExistsByID$O(((java.lang.String)(id)));
    }
    
    
    //#line 853 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static x10.core.Rail call_runSelect(final java.lang.String id$2) {
        try {
            return org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(id$2);
        }
        catch (java.lang.Throwable exc$33568) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33568);
        }
        
    }
    
    
    
    //#line 859 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static long call_countVertices$O(final java.lang.String id$3) {
        try {
            return org.acacia.server.AcaciaManager.countVertices(id$3);
        }
        catch (java.lang.Throwable exc$33569) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33569);
        }
        
    }
    
    
    
    //#line 865 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static long call_countEdges$O(final java.lang.String id$4) {
        try {
            return org.acacia.server.AcaciaManager.countEdges(id$4);
        }
        catch (java.lang.Throwable exc$33570) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33570);
        }
        
    }
    
    
    
    //#line 868 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static long call_removeVertices$O(final java.lang.String id$5, final int id$6, final java.lang.String id$7, final java.lang.String id$8) {
        try {
            return org.acacia.server.AcaciaManager.removeVertices(id$5, id$6, id$7, id$8);
        }
        catch (java.lang.Throwable exc$33571) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33571);
        }
        
    }
    
    
    
    //#line 871 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static int call_runDelete$O(final java.lang.String id$9) {
        try {
            return org.acacia.metadata.db.java.MetaDataDBInterface.runDelete(id$9);
        }
        catch (java.lang.Throwable exc$33572) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33572);
        }
        
    }
    
    
    
    //#line 874 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static void call_truncateLocalInstance(final java.lang.String id$10, final int id$11) {
        try {
            org.acacia.server.AcaciaManager.truncateLocalInstance(id$10, id$11);
        }
        catch (java.lang.Throwable exc$33573) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33573);
        }
        
    }
    
    
    
    //#line 879 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static java.lang.String call_pageRank(final java.lang.String id$12, final java.lang.String id$13, final java.lang.String id$14) {
        try {
            return org.acacia.server.AcaciaManager.pageRank(id$12, id$13, id$14);
        }
        catch (java.lang.Throwable exc$33574) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33574);
        }
        
    }
    
    
    
    //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static java.lang.String call_pageRankTopK(final java.lang.String id$15, final java.lang.String id$16, final java.lang.String id$17, final java.lang.String id$18, final java.lang.String id$19) {
        try {
            return org.acacia.server.AcaciaManager.pageRankTopK(id$15, id$16, id$17, id$18, id$19);
        }
        catch (java.lang.Throwable exc$33575) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33575);
        }
        
    }
    
    
    
    //#line 885 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static long call_countTraingles$O(final java.lang.String id$20, final int id$21, final java.lang.String id$22, final java.lang.String id$23) {
        try {
            return org.acacia.server.AcaciaManager.countTraingles(id$20, id$21, id$22, id$23);
        }
        catch (java.lang.Throwable exc$33576) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33576);
        }
        
    }
    
    
    
    //#line 888 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static long call_countGlobalTraingles$O(final java.lang.String id$24) {
        try {
            return org.acacia.server.AcaciaManager.countGlobalTraingles(id$24);
        }
        catch (java.lang.Throwable exc$33577) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33577);
        }
        
    }
    
    
    
    //#line 891 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static java.lang.String call_outDegree(final java.lang.String id$25, final java.lang.String id$26, final java.lang.String id$27) {
        try {
            return org.acacia.query.algorithms.degree.OutDegree.run(id$25, id$26, id$27);
        }
        catch (java.lang.Throwable exc$33578) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33578);
        }
        
    }
    
    
    
    //#line 894 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    public static java.lang.String call_getFreeSpaceInfo(final java.lang.String id$28) {
        try {
            return org.acacia.server.AcaciaManager.getFreeSpaceInfo(id$28);
        }
        catch (java.lang.Throwable exc$33579) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33579);
        }
        
    }
    
    
    
    //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    final public org.acacia.frontend.AcaciaFrontEndServiceSession org$acacia$frontend$AcaciaFrontEndServiceSession$$this$org$acacia$frontend$AcaciaFrontEndServiceSession() {
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        return org.acacia.frontend.AcaciaFrontEndServiceSession.this;
    }
    
    
    //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
    final public void __fieldInitializers_org_acacia_frontend_AcaciaFrontEndServiceSession() {
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        this.sessionSkt = null;
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        this.gremlinInterpreter = null;
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final java.lang.String t$21325 = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.server.mode.isdistributed");
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        final boolean t$21326 = java.lang.Boolean.parseBoolean(t$21325);
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
        this.IS_DISTRIBUTED = t$21326;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.$intermRes$21722 = $deserializer.readObject();
            $_obj.graphID = $deserializer.readObject();
            $_obj.host$21409 = $deserializer.readObject();
            $_obj.k$21407 = $deserializer.readInt();
            $_obj.port$21411 = $deserializer.readInt();
            $_obj.ptID$21421 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$0 $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$intermRes$21722);
            $serializer.write(this.graphID);
            $serializer.write(this.host$21409);
            $serializer.write(this.k$21407);
            $serializer.write(this.port$21411);
            $serializer.write(this.ptID$21421);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            try {{
                
                //#line 431 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail t$21422 = ((x10.core.Rail<x10.core.Long>)this.$intermRes$21722[(int)0]);
                
                //#line 431 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21423 = ((long)(((int)(this.k$21407))));
                
                //#line 431 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21424 = org.acacia.server.AcaciaManager.countTraingles(this.host$21409, ((int)(this.port$21411)), this.graphID, this.ptID$21421);
                
                //#line 431 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                ((long[])t$21422.value)[(int)t$21423] = t$21424;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail[] $intermRes$21722;
        public int k$21407;
        public java.lang.String host$21409;
        public int port$21411;
        public java.lang.String graphID;
        public java.lang.String ptID$21421;
        
        public $Closure$0(final x10.core.Rail[] $intermRes$21722, final int k$21407, final java.lang.String host$21409, final int port$21411, final java.lang.String graphID, final java.lang.String ptID$21421) {
             {
                this.$intermRes$21722 = $intermRes$21722;
                this.k$21407 = k$21407;
                this.host$21409 = ((java.lang.String)(host$21409));
                this.port$21411 = port$21411;
                this.graphID = ((java.lang.String)(graphID));
                this.ptID$21421 = ((java.lang.String)(ptID$21421));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$1> make($Closure$1.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$1.class + " calling"); } 
            $_obj.$intermRes$21723 = $deserializer.readObject();
            $_obj.$mp$21724 = $deserializer.readObject();
            $_obj.graphID = $deserializer.readObject();
            $_obj.k$21460 = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$1 $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$1((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$intermRes$21723);
            $serializer.write(this.$mp$21724);
            $serializer.write(this.graphID);
            $serializer.write(this.k$21460);
            
        }
        
        // constructor just for allocation
        public $Closure$1(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 564 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            try {{
                
                //#line 566 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21461 = ((long)(((int)(this.k$21460))));
                
                //#line 566 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String hst$21462 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$21461));
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail t$21463 = ((x10.core.Rail<x10.core.Long>)this.$intermRes$21723[(int)0]);
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21464 = ((long)(((int)(this.k$21460))));
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21465 = ((long)(((int)(this.k$21460))));
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final int t$21466 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$21465));
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.util.HashMap t$21467 = ((x10.util.HashMap<java.lang.String, java.lang.String>)this.$mp$21724[(int)0]);
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21468 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$21467).get__0x10$util$HashMap$$K$G(((java.lang.String)(hst$21462)));
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21469 = org.acacia.server.AcaciaManager.removeVertices(hst$21462, ((int)(t$21466)), this.graphID, t$21468);
                
                //#line 567 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                ((long[])t$21463.value)[(int)t$21464] = t$21469;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 564 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 564 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public int k$21460;
        public x10.core.Rail[] $intermRes$21723;
        public x10.util.HashMap[] $mp$21724;
        public java.lang.String graphID;
        
        public $Closure$1(final int k$21460, final x10.core.Rail[] $intermRes$21723, final x10.util.HashMap[] $mp$21724, final java.lang.String graphID) {
             {
                this.k$21460 = k$21460;
                this.$intermRes$21723 = $intermRes$21723;
                this.$mp$21724 = $mp$21724;
                this.graphID = ((java.lang.String)(graphID));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$2> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$2> make($Closure$2.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$2.class + " calling"); } 
            $_obj.$intermRes$21725 = $deserializer.readObject();
            $_obj.graphID = $deserializer.readObject();
            $_obj.hosts = $deserializer.readObject();
            $_obj.hstLine = $deserializer.readObject();
            $_obj.k = $deserializer.readInt();
            $_obj.ptID$21559 = $deserializer.readObject();
            $_obj.u$21547 = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$2 $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$2((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$intermRes$21725);
            $serializer.write(this.graphID);
            $serializer.write(this.hosts);
            $serializer.write(this.hstLine);
            $serializer.write(this.k);
            $serializer.write(this.ptID$21559);
            $serializer.write(this.u$21547);
            
        }
        
        // constructor just for allocation
        public $Closure$2(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 678 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            try {{
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail t$21560 = ((x10.core.Rail<java.lang.String>)this.$intermRes$21725[(int)0]);
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21561 = ((long)(((int)(this.u$21547))));
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21562 = ((long)(((int)(this.u$21547))));
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21563 = ((java.lang.String[])this.hosts.value)[(int)t$21562];
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21564 = (("") + ((x10.core.Int.$box(this.k))));
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21565 = org.acacia.server.AcaciaManager.pageRankTopK(t$21563, this.graphID, this.ptID$21559, this.hstLine, t$21564);
                
                //#line 679 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                ((java.lang.String[])t$21560.value)[(int)t$21561] = t$21565;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 678 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 678 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail[] $intermRes$21725;
        public int u$21547;
        public x10.core.Rail<java.lang.String> hosts;
        public int k;
        public java.lang.String graphID;
        public java.lang.String ptID$21559;
        public java.lang.String hstLine;
        
        public $Closure$2(final x10.core.Rail[] $intermRes$21725, final int u$21547, final x10.core.Rail<java.lang.String> hosts, final int k, final java.lang.String graphID, final java.lang.String ptID$21559, final java.lang.String hstLine, __2$1x10$lang$String$2 $dummy) {
             {
                this.$intermRes$21725 = $intermRes$21725;
                this.u$21547 = u$21547;
                this.hosts = ((x10.core.Rail)(hosts));
                this.k = k;
                this.graphID = ((java.lang.String)(graphID));
                this.ptID$21559 = ((java.lang.String)(ptID$21559));
                this.hstLine = ((java.lang.String)(hstLine));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$3> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$3> make($Closure$3.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$3.class + " calling"); } 
            $_obj.$intermRes$21726 = $deserializer.readObject();
            $_obj.graphID = $deserializer.readObject();
            $_obj.hosts = $deserializer.readObject();
            $_obj.hstLine = $deserializer.readObject();
            $_obj.u$21639 = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$3 $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$3((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$intermRes$21726);
            $serializer.write(this.graphID);
            $serializer.write(this.hosts);
            $serializer.write(this.hstLine);
            $serializer.write(this.u$21639);
            
        }
        
        // constructor just for allocation
        public $Closure$3(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$String$2 {}
        
    
        
        public void $apply() {
            
            //#line 744 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            try {{
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail t$21640 = ((x10.core.Rail<java.lang.String>)this.$intermRes$21726[(int)0]);
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21641 = ((long)(((int)(this.u$21639))));
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final long t$21642 = ((long)(((int)(this.u$21639))));
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21643 = ((java.lang.String[])this.hosts.value)[(int)t$21642];
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21644 = org.acacia.server.AcaciaManager.pageRank(t$21643, this.graphID, this.hstLine);
                
                //#line 745 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                ((java.lang.String[])t$21640.value)[(int)t$21641] = t$21644;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 744 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 744 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail[] $intermRes$21726;
        public int u$21639;
        public x10.core.Rail<java.lang.String> hosts;
        public java.lang.String graphID;
        public java.lang.String hstLine;
        
        public $Closure$3(final x10.core.Rail[] $intermRes$21726, final int u$21639, final x10.core.Rail<java.lang.String> hosts, final java.lang.String graphID, final java.lang.String hstLine, __2$1x10$lang$String$2 $dummy) {
             {
                this.$intermRes$21726 = $intermRes$21726;
                this.u$21639 = u$21639;
                this.hosts = ((x10.core.Rail)(hosts));
                this.graphID = ((java.lang.String)(graphID));
                this.hstLine = ((java.lang.String)(hstLine));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$4 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$4> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$4> make($Closure$4.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$4 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$4.class + " calling"); } 
            $_obj.$intermDegRes$21727 = $deserializer.readObject();
            $_obj.graphID = $deserializer.readObject();
            $_obj.k$21675 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$4 $_obj = new org.acacia.frontend.AcaciaFrontEndServiceSession.$Closure$4((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$intermDegRes$21727);
            $serializer.write(this.graphID);
            $serializer.write(this.k$21675);
            
        }
        
        // constructor just for allocation
        public $Closure$4(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 806 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
            try {{
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final x10.core.Rail t$21676 = ((x10.core.Rail<java.lang.String>)this.$intermDegRes$21727[(int)0]);
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21677 = org.acacia.util.PlaceToNodeMapper.getHost((long)(this.k$21675));
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final int t$21678 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(this.k$21675));
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21679 = (("") + ((x10.core.Int.$box(t$21678))));
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                final java.lang.String t$21680 = org.acacia.query.algorithms.degree.OutDegree.run(t$21677, t$21679, this.graphID);
                
                //#line 807 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                ((java.lang.String[])t$21676.value)[(int)this.k$21675] = t$21680;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 806 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 806 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaFrontEndServiceSession.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.Rail[] $intermDegRes$21727;
        public long k$21675;
        public java.lang.String graphID;
        
        public $Closure$4(final x10.core.Rail[] $intermDegRes$21727, final long k$21675, final java.lang.String graphID) {
             {
                this.$intermDegRes$21727 = $intermDegRes$21727;
                this.k$21675 = k$21675;
                this.graphID = ((java.lang.String)(graphID));
            }
        }
        
    }
    
    }
    
    