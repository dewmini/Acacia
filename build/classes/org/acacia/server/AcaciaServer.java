package org.acacia.server;


@x10.runtime.impl.java.X10Generated
public class AcaciaServer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaServer> $RTT = 
        x10.rtt.NamedType.<AcaciaServer> make("org.acacia.server.AcaciaServer",
                                              AcaciaServer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaServer.class + " calling"); } 
        $_obj.IS_DISTRIBUTED = $deserializer.readBoolean();
        $_obj.backend = $deserializer.readObject();
        $_obj.frontend = $deserializer.readObject();
        $_obj.runFlag = $deserializer.readBoolean();
        $_obj.srv = $deserializer.readObject();
        $_obj.vertcounter = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.server.AcaciaServer $_obj = new org.acacia.server.AcaciaServer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.IS_DISTRIBUTED);
        $serializer.write(this.backend);
        $serializer.write(this.frontend);
        $serializer.write(this.runFlag);
        $serializer.write(this.srv);
        $serializer.write(this.vertcounter);
        
    }
    
    // constructor just for allocation
    public AcaciaServer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 66 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    private static x10.util.HashMap<java.lang.String, x10.core.Long> hostPlaceMap;
    
    //#line 67 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public org.acacia.frontend.AcaciaFrontEnd frontend;
    
    //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public org.acacia.backend.AcaciaBackEnd backend;
    
    //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public boolean runFlag;
    
    //#line 70 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public java.net.ServerSocket srv;
    
    //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public org.acacia.vertexcounter.VertexCounter vertcounter;
    
    //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public boolean IS_DISTRIBUTED;
    
    
    //#line 77 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            AcaciaServer.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.server.AcaciaServer server = new org.acacia.server.AcaciaServer((java.lang.System[]) null).org$acacia$server$AcaciaServer$$init$S();
        
        //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final org.acacia.server.AcaciaServer t$27750 = ((org.acacia.server.AcaciaServer)(server));
        
        //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27749 = ((java.lang.String[])args.value)[(int)0L];
        
        //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$27751 = java.lang.Boolean.parseBoolean(t$27749);
        
        //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27750.run((boolean)(t$27751));
    }
    
    
    //#line 83 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public void run(final boolean standaloneFlag) {
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.init();
        
        //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27752 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27752.println(((java.lang.Object)("Running the server...")));
        
        //#line 89 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.util.HashMap map = org.acacia.util.Utils.getBatchUploadFileList();
        
        //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap t$27753 = ((x10.util.HashMap)(map));
        
        //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.util.Set keys = ((x10.util.Set<java.lang.String>)
                              ((x10.util.HashMap<java.lang.String, java.lang.String>)t$27753).keySet());
        
        //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.Set t$28410 = ((x10.util.Set)(keys));
        
        //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.Iterator item$28411 = ((x10.lang.Iterator<java.lang.String>)
                                               ((x10.lang.Iterable<java.lang.String>)t$28410).iterator());
        
        //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28412 = ((x10.lang.Iterator<java.lang.String>)item$28411).hasNext$O();
            
            //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28412)) {
                
                //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String item$28333 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)item$28411).next$G()));
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28334 = (("select UPLOAD_PATH from ACACIA_META.Graph where NAME LIKE \'") + (item$28333));
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28335 = ((t$28334) + ("\';"));
            
            //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.core.Rail l$28336 = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$28335);
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28337 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28338 = ((x10.core.Rail)(l$28336));
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28339 = ((x10.core.Rail<java.lang.String>)t$28338).size;
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28340 = (("Size : ") + ((x10.core.Long.$box(t$28339))));
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28337.println(((java.lang.Object)(t$28340)));
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28341 = ((x10.core.Rail)(l$28336));
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long count$28342 = ((x10.core.Rail<java.lang.String>)t$28341).size;
            
            //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            int i$28329 = 0;
            
            //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            for (;
                 true;
                 ) {
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28330 = i$28329;
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28331 = ((long)(((int)(t$28330))));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28332 = ((t$28331) < (((long)(count$28342))));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (!(t$28332)) {
                    
                    //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    break;
                }
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Printer t$28321 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28322 = ((x10.core.Rail)(l$28336));
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28323 = i$28329;
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28324 = ((long)(((int)(t$28323))));
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28325 = ((java.lang.String[])t$28322.value)[(int)t$28324];
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28326 = (("item : ") + (t$28325));
                
                //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28321.println(((java.lang.Object)(t$28326)));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28327 = i$28329;
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28328 = ((t$28327) + (((int)(1))));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                i$28329 = t$28328;
            }
        }
        
        //#line 108 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27776 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 108 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27776.println(((java.lang.Object)("Done processing...")));
        
        //#line 110 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String[] hostLst = org.acacia.util.java.Utils_Java.getPrivateHostList();
        
        //#line 111 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap hostHashMap = new x10.util.HashMap<java.lang.String, x10.core.Boolean>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.BOOLEAN).x10$util$HashMap$$init$S();
        
        //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        int i$28413 = 0;
        
        //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28414 = i$28413;
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28415 = (hostLst).length;
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28416 = ((t$28414) < (((int)(t$28415))));
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28416)) {
                
                //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28343 = i$28413;
            
            //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28344 = (hostLst)[((int)(t$28343))];
            
            //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            ((x10.util.HashMap<java.lang.String, x10.core.Boolean>)hostHashMap).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$28344)), x10.core.Boolean.$box(false));
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28345 = i$28413;
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28346 = ((t$28345) + (((int)(1))));
            
            //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            i$28413 = t$28346;
        }
        {
            
            //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.xrx.FinishState fs$28776 = x10.xrx.Runtime.startFinish();
            
            //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                {
                    
                    //#line 119 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    if (standaloneFlag) {
                        
                        //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.lang.PlaceGroup t$28404 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                        
                        //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.lang.Iterator p$28405 = ((x10.lang.Iterable<x10.lang.Place>)t$28404).iterator();
                        
                        //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28406 = ((x10.lang.Iterator<x10.lang.Place>)p$28405).hasNext$O();
                            
                            //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            if (!(t$28406)) {
                                
                                //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                break;
                            }
                            
                            //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.lang.Place p$28347 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$28405).next$G()));
                            
                            //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final long t$28348 = p$28347.id;
                            
                            //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28349 = ((long) t$28348) == ((long) 0L);
                            
                            //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            if (t$28349) {
                                
                                //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$5(p$28347))));
                            } else {
                                
                                //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$7(p$28347))));
                            }
                            
                            //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final long t$28387 = p$28347.id;
                            
                            //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String curHost$28388 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$28387));
                            
                            //#line 152 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28389 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 152 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28389.println(((java.lang.Object)("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")));
                            
                            //#line 153 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28390 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 153 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28391 = (("Current host is : ") + (curHost$28388));
                            
                            //#line 153 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28390.println(((java.lang.Object)(t$28391)));
                            
                            //#line 154 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28392 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 154 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28392.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ")));
                        }
                        
                        //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.lang.PlaceGroup t$28407 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                        
                        //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.lang.Iterator p$28408 = ((x10.lang.Iterable<x10.lang.Place>)t$28407).iterator();
                        
                        //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28409 = ((x10.lang.Iterator<x10.lang.Place>)p$28408).hasNext$O();
                            
                            //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            if (!(t$28409)) {
                                
                                //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                break;
                            }
                            
                            //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.lang.Place p$28393 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$28408).next$G()));
                            
                            //#line 159 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final long t$28394 = p$28393.id;
                            
                            //#line 159 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String curHost$28395 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$28394));
                            
                            //#line 161 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28396 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 161 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28396.println(((java.lang.Object)("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")));
                            
                            //#line 162 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28397 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 162 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28398 = (("Current host is : ") + (curHost$28395));
                            
                            //#line 162 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28397.println(((java.lang.Object)(t$28398)));
                            
                            //#line 163 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28399 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 163 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28399.println(((java.lang.Object)("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ")));
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28400 = x10.core.Boolean.$unbox(((x10.util.HashMap<java.lang.String, x10.core.Boolean>)hostHashMap).get__0x10$util$HashMap$$K$G(((java.lang.String)(curHost$28395))));
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28401 = ((boolean) t$28400) == ((boolean) false);
                            
                            //#line 164 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            if (t$28401) {
                                
                                //#line 165 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                ((x10.util.HashMap<java.lang.String, x10.core.Boolean>)hostHashMap).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(curHost$28395)), x10.core.Boolean.$box(true));
                                
                                //#line 166 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final long t$28402 = p$28393.id;
                                
                                //#line 166 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final boolean t$28403 = ((long) t$28402) == ((long) 0L);
                                
                                //#line 166 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                if (t$28403) {
                                    
                                    //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$8())));
                                } else {
                                    
                                    //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$10(p$28393))));
                                }
                            }
                        }
                    }
                    
                    //#line 179 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$11(this))));
                    
                    //#line 184 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final org.acacia.frontend.AcaciaFrontEnd t$27846 = ((org.acacia.frontend.AcaciaFrontEnd)(new org.acacia.frontend.AcaciaFrontEnd((java.lang.System[]) null).org$acacia$frontend$AcaciaFrontEnd$$init$S()));
                    
                    //#line 184 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    this.frontend = ((org.acacia.frontend.AcaciaFrontEnd)(t$27846));
                    
                    //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final org.acacia.frontend.AcaciaFrontEnd t$27847 = ((org.acacia.frontend.AcaciaFrontEnd)(this.frontend));
                    
                    //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    t$27847.run();
                }
            }}catch (java.lang.Throwable ct$28774) {
                
                //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$28774)));
                
                //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$28776)));
             }}
            }
        }
    
    
    //#line 189 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void uploadGraphDistributed(final java.lang.String item, final java.lang.String pathOnNFS) {
        
        //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27848 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27849 = (("Uploading the following graph distributed : ") + (item));
        
        //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27848.println(((java.lang.Object)(t$27849)));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27850 = (("INSERT INTO ACACIA_META.GRAPH(NAME,UPLOAD_PATH,UPLOAD_START_TIME, UPLOAD_END_TIME,GRAPH_STATUS_IDGRAPH_STATUS,VERTEXCOUNT) VALUES(\'") + (item));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27851 = ((t$27850) + ("\', \'"));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27852 = ((t$27851) + (pathOnNFS));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27853 = ((t$27852) + ("\', \'"));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27854 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27855 = ((t$27853) + (t$27854));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27856 = ((t$27855) + ("\',\'"));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27857 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27858 = ((t$27856) + (t$27857));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27859 = ((t$27858) + ("\',"));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int t$27860 = org.acacia.server.GraphStatus.LOADING;
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27861 = ((t$27859) + ((x10.core.Int.$box(t$27860))));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27862 = ((t$27861) + (",0 )"));
        
        //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String graphID = org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$27862);
        
        //#line 194 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27863 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 194 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27864 = (("The new graph id : ") + (graphID));
        
        //#line 194 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27863.println(((java.lang.Object)(t$27864)));
        
        //#line 196 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.vertexcounter.VertexCounterClient.loadVertexCountInfo();
        
        //#line 198 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String hadoopNameNodeHost = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.namenode");
        
        //#line 199 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27865 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 199 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27865.println(((java.lang.Object)("Got the Zookeeper contact host.")));
        
        //#line 201 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.lang.String eMapTableName = (("edgemap") + (graphID));
        
        //#line 202 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.lang.String vMapTableName = (("vertexmap") + (graphID));
        
        //#line 204 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)(pathOnNFS)), ((java.lang.String)("/user/miyuru/input")));
        
        //#line 206 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.deleteFile$O(((java.lang.String)("/user/miyuru/notinverts")));
        
        //#line 208 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.csr.java.ZeroVertexSearcher")));
        
        //#line 210 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        boolean zeroVertFlag = org.acacia.partitioner.hadoop.HDFSInterface.fileExists$O(((java.lang.String)("/user/miyuru/zout/zout")));
        
        //#line 212 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$27866 = zeroVertFlag;
        
        //#line 212 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$27869 = !(t$27866);
        
        //#line 212 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (t$27869) {
            
            //#line 213 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$27867 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 213 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27867.println(((java.lang.Object)("The graph starts from vertex id 1")));
        } else {
            
            //#line 215 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$27868 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 215 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27868.println(((java.lang.Object)("The graph has zero vertex")));
        }
        
        //#line 218 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.csr.java.Utils.cleanFiles();
        
        //#line 220 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.csr.java.WordCount")));
        
        //#line 222 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.csr.java.LineCount")));
        
        //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        while (true) {
            
            //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$27870 = org.acacia.csr.java.Utils.isReady();
            
            //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$27871 = !(t$27870);
            
            //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$27871)) {
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 225 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.lang.System.sleep$O((long)(1000L));
        }
        
        //#line 228 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long vcnt = org.acacia.csr.java.Utils.getTotalVertexCount();
        
        //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27873 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$27872 = vcnt;
        
        //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27874 = (("vcnt:") + ((x10.core.Long.$box(t$27872))));
        
        //#line 230 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27873.println(((java.lang.Object)(t$27874)));
        
        //#line 232 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.csr.java.Utils.createHeaderFile();
        
        //#line 234 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        try {{
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27875 = (("jar bin/acacia.jar org.acacia.csr.java.CSRConverter /user/miyuru/input ") + (hadoopNameNodeHost));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27876 = ((t$27875) + (" "));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27877 = ((t$27876) + (graphID));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27879 = ((t$27877) + (" "));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.net.InetAddress t$27878 = java.net.InetAddress.getLocalHost();
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27880 = t$27878.getHostName();
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27881 = ((t$27879) + (t$27880));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27882 = ((t$27881) + (" "));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$27883 = vcnt;
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27884 = ((t$27882) + ((x10.core.Long.$box(t$27883))));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27885 = ((t$27884) + (" "));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$27886 = zeroVertFlag;
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27887 = ((t$27885) + ((x10.core.Boolean.$box(t$27886))));
            
            //#line 235 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)(t$27887)));
        }}catch (final java.net.UnknownHostException ec) {
            
            //#line 237 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            ec.printStackTrace();
        }
        
        //#line 241 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)("/tmp/firstfile")), ((java.lang.String)("/user/miyuru/csrconverter-output/firstfile")));
        
        //#line 243 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27888 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 243 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27888.println(((java.lang.Object)("----------------> Done the CSRJob------------------")));
        
        //#line 250 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole("rm -rf /tmp/dgr");
        
        //#line 256 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole("mkdir /tmp/dgr");
        
        //#line 258 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.mergeOnHDFSandCopyOntoLocal(((java.lang.String)("/user/miyuru/csrconverter-output")), ((java.lang.String)("/tmp/dgr/grf")));
        
        //#line 259 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$27889 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 259 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$27890 = t$27889.size$O();
        
        //#line 259 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.MetisInterface.partitionWithParMetis(((java.lang.String)("/tmp/dgr/grf")), (long)(t$27890));
        
        //#line 261 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$27891 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 261 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$27892 = t$27891.size$O();
        
        //#line 261 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27893 = (("/tmp/dgr/grf.part.") + ((x10.core.Long.$box(t$27892))));
        
        //#line 261 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)(t$27893)), ((java.lang.String)("/user/miyuru/merged")));
        
        //#line 264 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.index.PartitionIndexClient.loadIndex();
        
        //#line 266 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.partitioner.java.EdgelistPartitioner")));
        
        //#line 267 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int partitionedFileCount = org.acacia.partitioner.hadoop.HDFSInterface.getFileCountOnDir$O(((java.lang.String)("/user/miyuru/merged-out")));
        
        //#line 269 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.util.ArrayList ptnArrLst = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 270 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.lang.String initlaPartitionID = null;
        
        //#line 271 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        boolean initPartFlag = false;
        
        //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        int i$28521 = 0;
        
        //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28522 = i$28521;
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28523 = ((t$28522) < (((int)(partitionedFileCount))));
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28523)) {
                
                //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28417 = (("INSERT INTO ACACIA_META.PARTITION(GRAPH_IDGRAPH) VALUES(") + (graphID));
            
            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28418 = ((t$28417) + (" )"));
            
            //#line 273 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String partitionid$28419 = org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28418);
            
            //#line 274 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28420 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 274 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28421 = (("The new partition id : ") + (partitionid$28419));
            
            //#line 274 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28420.println(((java.lang.Object)(t$28421)));
            
            //#line 276 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28422 = initPartFlag;
            
            //#line 276 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28423 = !(t$28422);
            
            //#line 276 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (t$28423) {
                
                //#line 277 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                initlaPartitionID = ((java.lang.String)(partitionid$28419));
                
                //#line 278 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                initPartFlag = true;
            }
            
            //#line 281 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.util.ArrayList t$28424 = ((x10.util.ArrayList)(ptnArrLst));
            
            //#line 281 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            ((x10.util.ArrayList<java.lang.String>)t$28424).add__0x10$util$ArrayList$$T$O(((java.lang.String)(partitionid$28419)));
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28425 = i$28521;
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28426 = ((t$28425) + (((int)(1))));
            
            //#line 272 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            i$28521 = t$28426;
        }
        
        //#line 283 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27906 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 283 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27906.println(((java.lang.Object)("Getting the file list")));
        
        //#line 284 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.core.Rail fileList = org.acacia.partitioner.hadoop.HDFSInterface.getListofFileNamesOnDir(((java.lang.String)("/user/miyuru/merged-out")));
        
        //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27909 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail t$27907 = ((x10.core.Rail)(fileList));
        
        //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$27908 = ((x10.core.Rail<java.lang.String>)t$27907).size;
        
        //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27910 = (("File list size : ") + ((x10.core.Long.$box(t$27908))));
        
        //#line 285 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27909.println(((java.lang.Object)(t$27910)));
        
        //#line 288 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.ArrayList t$27911 = ((x10.util.ArrayList)(ptnArrLst));
        
        //#line 288 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail ptnArr = ((x10.core.Rail<java.lang.String>)
                                       ((x10.util.ArrayList<java.lang.String>)t$27911).toRail());
        
        //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap hostIDMap = org.acacia.server.AcaciaServer.getLiveHostIDList();
        
        //#line 290 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27912 = ((java.lang.String)(initlaPartitionID));
        
        //#line 290 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int initPartID = java.lang.Integer.parseInt(t$27912);
        
        //#line 291 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        int placeID = 0;
        
        //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail rail$28524 = ((x10.core.Rail)(fileList));
        
        //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27664min$28525 = 0L;
        
        //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27664max$28526 = ((x10.core.Rail<java.lang.String>)rail$28524).size;
        
        //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i$28458 = i$27664min$28525;
        {
            
            //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String[] ptnArr$value$28803 = ((java.lang.String[])ptnArr.value);
            
            //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            for (;
                 true;
                 ) {
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28459 = i$28458;
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28460 = ((t$28459) < (((long)(i$27664max$28526))));
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (!(t$28460)) {
                    
                    //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    break;
                }
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long itm$28455 = i$28458;
                
                //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28427 = ((x10.core.Rail)(fileList));
                
                //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28428 = ((java.lang.String[])t$28427.value)[(int)itm$28455];
                
                //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail strArr$28429 = x10.lang.StringHelper.split("_", t$28428);
                
                //#line 296 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28430 = ((java.lang.String[])strArr$28429.value)[(int)1L];
                
                //#line 296 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28431 = x10.lang.StringHelper.split("-", t$28430);
                
                //#line 296 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28432 = ((java.lang.String[])t$28431.value)[(int)0L];
                
                //#line 296 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28433 = java.lang.Integer.parseInt(t$28432);
                
                //#line 296 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                placeID = t$28433;
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28434 = ((x10.core.Rail)(fileList));
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28435 = ((java.lang.String[])t$28434.value)[(int)itm$28455];
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28436 = (("/user/miyuru/merged-out/") + (t$28435));
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28437 = placeID;
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28438 = (("/user/miyuru/merged-out/") + ((x10.core.Int.$box(t$28437))));
                
                //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.partitioner.hadoop.HDFSInterface.moveFileTo(((java.lang.String)(t$28436)), ((java.lang.String)(t$28438)));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28439 = placeID;
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28440 = ((long)(((int)(t$28439))));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28441 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$28440));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28442 = ((x10.util.HashMap<java.lang.String, java.lang.String>)hostIDMap).get__0x10$util$HashMap$$K$G(((java.lang.String)(t$28441)));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28443 = (("INSERT INTO ACACIA_META.HOST_HAS_PARTITION(host_idhost, partition_idpartition, partition_graph_idgraph) VALUES(") + (t$28442));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28444 = ((t$28443) + (","));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28445 = placeID;
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28446 = ((long)(((int)(t$28445))));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28447 = ((java.lang.String)ptnArr$value$28803[(int)t$28446]);
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28448 = ((t$28444) + (t$28447));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28449 = ((t$28448) + (","));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28450 = ((t$28449) + (graphID));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28451 = ((t$28450) + (" )"));
                
                //#line 301 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28451));
                
                //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Printer t$28452 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28453 = ((x10.core.Rail)(fileList));
                
                //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28454 = ((java.lang.String[])t$28453.value)[(int)itm$28455];
                
                //#line 302 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28452.println(((java.lang.Object)(t$28454)));
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28456 = i$28458;
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28457 = ((t$28456) + (((long)(1L))));
                
                //#line 293 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                i$28458 = t$28457;
            }
        }
        
        //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27945 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27945.println(((java.lang.Object)("Submitting the job EdgeDistributor")));
        
        //#line 307 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        try {{
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27946 = (("jar bin/acacia.jar org.acacia.partitioner.java.EdgeDistributor ") + (hadoopNameNodeHost));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27947 = ((t$27946) + (" "));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27948 = ((t$27947) + (graphID));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27950 = ((t$27948) + (" "));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.net.InetAddress t$27949 = java.net.InetAddress.getLocalHost();
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27951 = t$27949.getHostName();
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27952 = ((t$27950) + (t$27951));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27953 = ((t$27952) + (" "));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$27954 = vcnt;
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27955 = ((t$27953) + ((x10.core.Long.$box(t$27954))));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27956 = ((t$27955) + (" "));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27957 = ((java.lang.String)(initlaPartitionID));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27958 = ((t$27956) + (t$27957));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27959 = ((t$27958) + (" "));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$27960 = zeroVertFlag;
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27961 = ((t$27959) + ((x10.core.Boolean.$box(t$27960))));
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)(t$27961)));
        }}catch (final java.net.UnknownHostException ec) {
            
            //#line 310 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            ec.printStackTrace();
        }
        
        //#line 313 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$27962 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 313 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$27962.println(((java.lang.Object)("Done...")));
        
        //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27963 = (("select IDGRAPH from ACACIA_META.Graph where NAME LIKE \'") + (item));
        
        //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$27964 = ((t$27963) + ("\'"));
        
        //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail t$27965 = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$27964);
        
        //#line 315 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.lang.String id = ((java.lang.String[])t$27965.value)[(int)0L];
        
        //#line 316 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.lang.System.sleep$O((long)(5000L));
        
        //#line 323 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.core.Rail fileList2 = org.acacia.partitioner.hadoop.HDFSInterface.getListofFileNamesOnDir(((java.lang.String)("/user/miyuru/edgedistributed-out")));
        
        //#line 324 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.ArrayList listOfFiles = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 325 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.StringBuilder sb = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 326 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.StringBuilder sb2 = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail rail$28527 = ((x10.core.Rail)(fileList));
        
        //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27683min$28528 = 0L;
        
        //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27683max$28529 = ((x10.core.Rail<java.lang.String>)rail$28527).size;
        
        //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i$28483 = i$27683min$28528;
        
        //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28484 = i$28483;
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28485 = ((t$28484) < (((long)(i$27683max$28529))));
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28485)) {
                
                //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long itm$28480 = i$28483;
            
            //#line 329 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28461 = ((x10.core.Rail)(fileList));
            
            //#line 329 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String fileName$28462 = ((java.lang.String[])t$28461.value)[(int)itm$28480];
            
            //#line 330 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28463 = (fileName$28462).indexOf("part-");
            
            //#line 330 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28464 = ((int) t$28463) == ((int) -1);
            
            //#line 330 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (t$28464) {
                
                //#line 331 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.String st$28465 = null;
                
                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28466 = ((x10.core.Rail)(fileList));
                
                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28467 = ((java.lang.String[])t$28466.value)[(int)itm$28480];
                
                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28468 = x10.lang.StringHelper.split("partition_", t$28467);
                
                //#line 332 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String st$28469 = ((java.lang.String[])t$28468.value)[(int)1L];
                
                //#line 333 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail t$28470 = x10.lang.StringHelper.split("-", st$28469);
                
                //#line 333 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28471 = ((java.lang.String[])t$28470.value)[(int)0L];
                
                //#line 333 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                st$28465 = ((java.lang.String)(t$28471));
                
                //#line 335 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28472 = ((java.lang.String)(st$28465));
                
                //#line 335 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28473 = ((x10.util.ArrayList<java.lang.String>)listOfFiles).contains__0x10$util$ArrayList$$T$O(((java.lang.String)(t$28472)));
                
                //#line 335 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28474 = !(t$28473);
                
                //#line 335 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (t$28474) {
                    
                    //#line 336 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28475 = ((java.lang.String)(st$28465));
                    
                    //#line 336 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    ((x10.util.ArrayList<java.lang.String>)listOfFiles).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$28475)));
                    
                    //#line 337 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28476 = ((java.lang.String)(st$28465));
                    
                    //#line 337 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28477 = ((t$28476) + ("\n"));
                    
                    //#line 337 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    sb2.add(((java.lang.String)(t$28477)));
                }
                
                //#line 341 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28478 = (("/user/miyuru/edgedistributed-out/") + (fileName$28462));
                
                //#line 341 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28479 = ((t$28478) + ("\n"));
                
                //#line 341 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                sb.add(((java.lang.String)(t$28479)));
            }
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28481 = i$28483;
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28482 = ((t$28481) + (((long)(1L))));
            
            //#line 328 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            i$28483 = t$28482;
        }
        
        //#line 345 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.io.File fil = new java.io.File(((java.lang.String)("/tmp/dgr/partfilelist")));
        
        //#line 347 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        try {{
            
            //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.File t$27987 = ((java.io.File)(fil));
            
            //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.FileWriter t$27988 = ((java.io.FileWriter)(new java.io.FileWriter(t$27987)));
            
            //#line 348 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            java.io.BufferedWriter bw = new java.io.BufferedWriter(((java.io.Writer)(t$27988)));
            
            //#line 350 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$27989 = ((java.io.BufferedWriter)(bw));
            
            //#line 350 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27990 = sb.toString();
            
            //#line 350 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27989.write(((java.lang.String)(t$27990)));
            
            //#line 351 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$27991 = ((java.io.BufferedWriter)(bw));
            
            //#line 351 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27991.flush();
            
            //#line 352 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$27992 = ((java.io.BufferedWriter)(bw));
            
            //#line 352 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27992.close();
        }}catch (final java.io.IOException exc) {
            
            //#line 354 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$27993 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 354 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27993.println(((java.lang.Object)("Could not write the file: /tmp/dgr/partfilelist")));
        }
        
        //#line 360 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.io.File t$27994 = ((java.io.File)(new java.io.File(((java.lang.String)("/tmp/dgr/partlist")))));
        
        //#line 360 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        fil = ((java.io.File)(t$27994));
        
        //#line 362 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        try {{
            
            //#line 363 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.File t$27995 = ((java.io.File)(fil));
            
            //#line 363 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.FileWriter t$27996 = ((java.io.FileWriter)(new java.io.FileWriter(t$27995)));
            
            //#line 363 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            java.io.BufferedWriter bw = new java.io.BufferedWriter(((java.io.Writer)(t$27996)));
            
            //#line 365 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$27997 = ((java.io.BufferedWriter)(bw));
            
            //#line 365 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$27998 = sb2.toString();
            
            //#line 365 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27997.write(((java.lang.String)(t$27998)));
            
            //#line 366 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$27999 = ((java.io.BufferedWriter)(bw));
            
            //#line 366 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$27999.flush();
            
            //#line 367 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.BufferedWriter t$28000 = ((java.io.BufferedWriter)(bw));
            
            //#line 367 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28000.close();
        }}catch (final java.io.IOException exc) {
            
            //#line 369 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28001 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 369 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28001.println(((java.lang.Object)("Could not write the file: /tmp/dgr/partlist")));
        }
        
        //#line 372 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)("/tmp/dgr/partfilelist")), ((java.lang.String)("/user/miyuru/partfilelist")));
        
        //#line 373 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)("/tmp/dgr/partlist")), ((java.lang.String)("/user/miyuru/partlist")));
        
        //#line 375 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.partitioner.java.FileMover")));
        
        //#line 376 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)("jar bin/acacia.jar org.acacia.partitioner.java.FileMerger")));
        
        //#line 378 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail t$28002 = org.acacia.partitioner.hadoop.HDFSInterface.getListofFileNamesOnDir(((java.lang.String)("/user/miyuru/edgedistributed-out-filtered")));
        
        //#line 378 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail t$28003 = ((x10.core.Rail<java.lang.String>)
                                        t$28002);
        
        //#line 378 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        fileList = ((x10.core.Rail)(t$28003));
        
        //#line 380 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.io.File theDir = new java.io.File(((java.lang.String)("/tmp/dgr")));
        
        //#line 382 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.io.File t$28004 = ((java.io.File)(theDir));
        
        //#line 382 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28005 = t$28004.exists();
        
        //#line 382 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28007 = !(t$28005);
        
        //#line 382 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (t$28007) {
            
            //#line 383 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.File t$28006 = ((java.io.File)(theDir));
            
            //#line 383 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28006.mkdir();
        }
        
        //#line 387 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.HashMap quotaMap = new java.util.HashMap();
        
        //#line 388 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.HashMap quotaMapIndex = new java.util.HashMap();
        
        //#line 389 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long iIndex = 0L;
        
        //#line 397 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28008 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 397 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28008.println(((java.lang.Object)("JKJKJKLLLLLLLLLLLLLLLLLLLLLLACACACA")));
        
        //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail rail$28530 = ((x10.core.Rail)(fileList));
        
        //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27702min$28531 = 0L;
        
        //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27702max$28532 = ((x10.core.Rail<java.lang.String>)rail$28530).size;
        
        //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i$28518 = i$27702min$28531;
        
        //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28519 = i$28518;
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28520 = ((t$28519) < (((long)(i$27702max$28532))));
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28520)) {
                
                //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long itm$28515 = i$28518;
            
            //#line 400 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28486 = ((x10.core.Rail)(fileList));
            
            //#line 400 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String fileName$28487 = ((java.lang.String[])t$28486.value)[(int)itm$28515];
            
            //#line 402 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28488 = (fileName$28487).equals("nopt");
            
            //#line 402 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28489 = !(t$28488);
            
            //#line 402 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (t$28489) {
                
                //#line 403 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28490 = java.lang.Integer.parseInt(fileName$28487);
                
                //#line 403 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int fileIndex$28491 = ((t$28490) - (((int)(initPartID))));
                
                //#line 404 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28492 = (("/user/miyuru/edgedistributed-out-filtered/") + (fileName$28487));
                
                //#line 404 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28493 = (("/tmp/dgr/") + (fileName$28487));
                
                //#line 404 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.partitioner.hadoop.HDFSInterface.copyOntoLocal(((java.lang.String)(t$28492)), ((java.lang.String)(t$28493)));
                
                //#line 405 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28494 = (("/user/miyuru/merged-out/") + ((x10.core.Int.$box(fileIndex$28491))));
                
                //#line 405 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28495 = (("/tmp/dgr/v-") + (fileName$28487));
                
                //#line 405 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.partitioner.hadoop.HDFSInterface.copyOntoLocal(((java.lang.String)(t$28494)), ((java.lang.String)(t$28495)));
                
                //#line 406 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28496 = (("/tmp/dgr/v-") + (fileName$28487));
                
                //#line 406 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.io.File t$28497 = ((java.io.File)(new java.io.File(t$28496)));
                
                //#line 406 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long fsize$28498 = t$28497.length();
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28499 = ((double)(long)(((long)(fsize$28498))));
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28500 = 1048576L;
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28501 = ((double)(long)(((long)(t$28500))));
                
                //#line 407 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double sizeV$28502 = ((t$28499) / (((double)(t$28501))));
                
                //#line 408 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28503 = (("/tmp/dgr/") + (fileName$28487));
                
                //#line 408 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.io.File t$28504 = ((java.io.File)(new java.io.File(t$28503)));
                
                //#line 408 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long fsize$28505 = t$28504.length();
                
                //#line 409 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28506 = ((double)(long)(((long)(fsize$28505))));
                
                //#line 409 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28507 = 1048576.0;
                
                //#line 409 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28508 = t$28507;
                
                //#line 409 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double sizeE$28509 = ((t$28506) / (((double)(t$28508))));
                
                //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.util.HashMap t$28510 = ((java.util.HashMap)(quotaMap));
                
                //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28511 = iIndex;
                
                //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final double t$28512 = ((sizeV$28502) + (((double)(sizeE$28509))));
                
                //#line 410 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28510.put(x10.core.Long.$box(t$28511), x10.core.Double.$box(t$28512));
                
                //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28513 = iIndex;
                
                //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28514 = ((t$28513) + (((long)(1L))));
                
                //#line 411 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                iIndex = t$28514;
            }
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28516 = i$28518;
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28517 = ((t$28516) + (((long)(1L))));
            
            //#line 399 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            i$28518 = t$28517;
        }
        
        //#line 419 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28037 = ((java.lang.String)(id));
        
        //#line 419 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28038 = vcnt;
        
        //#line 419 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.server.AcaciaServer.distributeGraphPartitions(((java.lang.String)(t$28037)), (long)(t$28038), (int)(initPartID));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28039 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28040 = (("UPDATE ACACIA_META.GRAPH SET UPLOAD_END_TIME=\'") + (t$28039));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28041 = ((t$28040) + ("\', GRAPH_STATUS_IDGRAPH_STATUS="));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int t$28042 = org.acacia.server.GraphStatus.OPERATIONAL;
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28043 = ((t$28041) + ((x10.core.Int.$box(t$28042))));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28044 = ((t$28043) + (" WHERE IDGRAPH="));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28045 = ((java.lang.String)(id));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28046 = ((t$28044) + (t$28045));
        
        //#line 420 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(((java.lang.String)(t$28046)));
        
        //#line 421 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.lang.System.sleep$O((long)(5000L));
    }
    
    
    //#line 425 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void uploadGraphLocally(final java.lang.String item, final java.lang.String inputFilePath) {
        
        //#line 426 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28047 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 426 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28048 = (("Uploading the following graph locally : ") + (item));
        
        //#line 426 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28047.println(((java.lang.Object)(t$28048)));
        
        //#line 427 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final org.acacia.partitioner.local.java.MetisPartitioner converter = new org.acacia.partitioner.local.java.MetisPartitioner();
        
        //#line 429 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean isDistrbutedCentralPartitions = false;
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28049 = (("INSERT INTO ACACIA_META.GRAPH(NAME,UPLOAD_PATH,UPLOAD_START_TIME, UPLOAD_END_TIME,GRAPH_STATUS_IDGRAPH_STATUS,VERTEXCOUNT) VALUES(\'") + (item));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28050 = ((t$28049) + ("\', \'"));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28051 = ((t$28050) + (inputFilePath));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28052 = ((t$28051) + ("\', \'"));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28053 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28054 = ((t$28052) + (t$28053));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28055 = ((t$28054) + ("\',\'"));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28056 = org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28057 = ((t$28055) + (t$28056));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28058 = ((t$28057) + ("\',"));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int t$28059 = org.acacia.server.GraphStatus.LOADING;
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28060 = ((t$28058) + ((x10.core.Int.$box(t$28059))));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28061 = ((t$28060) + (",0 )"));
        
        //#line 430 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String graphID = org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28061);
        
        //#line 432 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$28062 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 432 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28063 = t$28062.size$O();
        
        //#line 432 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int t$28064 = ((int)(long)(((long)(t$28063))));
        
        //#line 432 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        converter.convert(((java.lang.String)(item)), ((java.lang.String)(graphID)), ((java.lang.String)(inputFilePath)), ((java.lang.String)("/home/miyurud/tmp")), (int)(t$28064), (boolean)(isDistrbutedCentralPartitions));
        
        //#line 433 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int initialPartID = converter.getInitlaPartitionID();
        
        //#line 435 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String[] t$28065 = converter.getPartitionFileList();
        
        //#line 435 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.core.Rail batchUploadFileList = new x10.core.Rail(x10.rtt.Types.STRING, t$28065.length, t$28065);
        
        //#line 454 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String[] t$28066 = converter.getPartitionIDList();
        
        //#line 454 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.core.Rail ptnArrLst = new x10.core.Rail(x10.rtt.Types.STRING, t$28066.length, t$28066);
        
        //#line 457 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28067 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 457 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28067.println(((java.lang.Object)("+++++++++++++++++A")));
        
        //#line 458 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$28068 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 458 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.Iterator itr = ((x10.lang.Iterable<x10.lang.Place>)t$28068).iterator();
        
        //#line 459 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap placeToHostMap = new x10.util.HashMap<x10.core.Long, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
        
        //#line 461 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        while (true) {
            
            //#line 461 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28080 = ((x10.lang.Iterator<x10.lang.Place>)itr).hasNext$O();
            
            //#line 461 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28080)) {
                
                //#line 461 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 462 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Place p$28533 = ((x10.lang.Iterator<x10.lang.Place>)itr).next$G();
            
            //#line 463 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28534 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 463 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28535 = p$28533.id;
            
            //#line 463 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28536 = (("+++++++++++++++++K p.id ") + ((x10.core.Long.$box(t$28535))));
            
            //#line 463 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28534.println(((java.lang.Object)(t$28536)));
            
            //#line 465 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28537 = p$28533.id;
            
            //#line 465 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String hostName$28538 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$28537));
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28539 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28540 = p$28533.id;
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28541 = (("+++++++++++++++++K p.id ") + ((x10.core.Long.$box(t$28540))));
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28542 = ((t$28541) + (" hostName : "));
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28543 = ((t$28542) + (hostName$28538));
            
            //#line 467 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28539.println(((java.lang.Object)(t$28543)));
            
            //#line 468 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28544 = p$28533.id;
            
            //#line 468 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            ((x10.util.HashMap<x10.core.Long, java.lang.String>)placeToHostMap).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(x10.core.Long.$box(t$28544), ((java.lang.String)(hostName$28538)));
            
            //#line 469 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28545 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 469 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28545.println(((java.lang.Object)("+++++++++++++++++B")));
        }
        
        //#line 471 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28081 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 471 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28081.println(((java.lang.Object)("+++++++++++++++++C")));
        
        //#line 472 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28084 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 472 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.Set t$28082 = ((x10.util.Set<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)
                                       ((x10.util.HashMap<x10.core.Long, java.lang.String>)placeToHostMap).entries());
        
        //#line 472 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28083 = ((x10.util.Container<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)t$28082).size$O();
        
        //#line 472 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28085 = (("placeToHostMap.entries() : ") + ((x10.core.Long.$box(t$28083))));
        
        //#line 472 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28084.println(((java.lang.Object)(t$28085)));
        
        //#line 473 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.Set t$28086 = ((x10.util.Set<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)
                                       ((x10.util.HashMap<x10.core.Long, java.lang.String>)placeToHostMap).entries());
        
        //#line 473 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.lang.Iterator itr2 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)
                                   ((x10.lang.Iterable<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)t$28086).iterator());
        
        //#line 474 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28087 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 474 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28087.println(((java.lang.Object)("+++++++++++++++++C")));
        
        //#line 476 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap hostIDMap = org.acacia.server.AcaciaServer.getLiveHostIDList();
        
        //#line 477 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i = 0L;
        
        //#line 478 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        while (true) {
            
            //#line 478 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Iterator t$28088 = ((x10.lang.Iterator)(itr2));
            
            //#line 478 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28144 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)t$28088).hasNext$O();
            
            //#line 478 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28144)) {
                
                //#line 478 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 479 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Iterator t$28546 = ((x10.lang.Iterator)(itr2));
            
            //#line 479 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.util.Map.Entry itemHost$28547 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.core.Long, java.lang.String>>)t$28546).next$G();
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28548 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28549 = x10.core.Long.$unbox(((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getKey$G());
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28550 = (("") + ((x10.core.Long.$box(t$28549))));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28551 = ((t$28550) + (" : "));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28552 = ((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getValue$G();
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28553 = ((t$28551) + (t$28552));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28554 = ((t$28553) + (" : "));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28555 = ((x10.core.Rail)(batchUploadFileList));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28556 = i;
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28557 = ((java.lang.String[])t$28555.value)[(int)t$28556];
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28558 = ((t$28554) + (t$28557));
            
            //#line 481 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28548.println(((java.lang.Object)(t$28558)));
            
            //#line 482 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28559 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 482 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28559.println(((java.lang.Object)("========================>Super1")));
            
            //#line 483 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28560 = ((x10.core.Rail)(batchUploadFileList));
            
            //#line 483 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28561 = i;
            
            //#line 483 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String filePath$28562 = ((java.lang.String[])t$28560.value)[(int)t$28561];
            
            //#line 484 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28563 = (filePath$28562).indexOf("_");
            
            //#line 484 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28564 = ((t$28563) + (((int)(1))));
            
            //#line 484 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28565 = (filePath$28562).indexOf(".");
            
            //#line 484 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String partitionID$28566 = (filePath$28562).substring(((int)(t$28564)), ((int)(t$28565)));
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28567 = ((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getValue$G();
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28568 = x10.core.Long.$unbox(((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getKey$G());
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28569 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28568));
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28570 = java.lang.Long.parseLong(graphID);
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.core.Rail t$28571 = ((x10.core.Rail)(batchUploadFileList));
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28572 = i;
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28573 = ((java.lang.String[])t$28571.value)[(int)t$28572];
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28574 = x10.core.Long.$unbox(((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getKey$G());
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final int t$28575 = org.acacia.util.PlaceToNodeMapper.getFileTransferServicePort$O((long)(t$28574));
            
            //#line 485 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.runtime.impl.java.EvalUtils.eval(org.acacia.server.AcaciaManager.batchUploadFile(t$28567, ((int)(t$28569)), ((long)(t$28570)), t$28573, ((int)(t$28575))));
            
            //#line 486 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28576 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 486 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28576.println(((java.lang.Object)("========================>Super2")));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28577 = ((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getValue$G();
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28578 = ((x10.util.HashMap<java.lang.String, java.lang.String>)hostIDMap).get__0x10$util$HashMap$$K$G(((java.lang.String)(t$28577)));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28579 = (("INSERT INTO ACACIA_META.HOST_HAS_PARTITION(host_idhost, partition_idpartition, partition_graph_idgraph) VALUES(") + (t$28578));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28580 = ((t$28579) + (","));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28581 = ((t$28580) + (partitionID$28566));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28582 = ((t$28581) + (","));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28583 = ((t$28582) + (graphID));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28584 = ((t$28583) + (")"));
            
            //#line 488 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28584));
            
            //#line 490 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28585 = ((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getValue$G();
            
            //#line 490 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28586 = (("") + (t$28585));
            
            //#line 490 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long vcount$28587 = org.acacia.server.AcaciaManager.countVertices(t$28586, graphID, partitionID$28566);
            
            //#line 491 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28588 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 491 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28589 = (("** vcnt : ") + ((x10.core.Long.$box(vcount$28587))));
            
            //#line 491 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28588.println(((java.lang.Object)(t$28589)));
            
            //#line 492 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28590 = ((x10.util.Map.Entry<x10.core.Long, java.lang.String>)itemHost$28547).getValue$G();
            
            //#line 492 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28591 = (("") + (t$28590));
            
            //#line 492 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long ecount$28592 = org.acacia.server.AcaciaManager.countEdges(t$28591, graphID, partitionID$28566);
            
            //#line 493 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28593 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 493 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28594 = (("** ecnt : ") + ((x10.core.Long.$box(ecount$28592))));
            
            //#line 493 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28593.println(((java.lang.Object)(t$28594)));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28595 = (("UPDATE ACACIA_META.PARTITION SET VERTEXCOUNT=") + ((x10.core.Long.$box(vcount$28587))));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28596 = ((t$28595) + (", EDGECOUNT="));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28597 = ((t$28596) + ((x10.core.Long.$box(ecount$28592))));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28598 = ((t$28597) + (" WHERE GRAPH_IDGRAPH="));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28599 = ((t$28598) + (graphID));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28600 = ((t$28599) + (" and IDPARTITION="));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28601 = ((t$28600) + (partitionID$28566));
            
            //#line 495 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean result$28602 = org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(t$28601);
            
            //#line 496 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28603 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 496 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28604 = (("Result is : ") + ((x10.core.Boolean.$box(result$28602))));
            
            //#line 496 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28603.println(((java.lang.Object)(t$28604)));
            
            //#line 497 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28605 = i;
            
            //#line 497 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28606 = ((t$28605) + (((long)(1L))));
            
            //#line 497 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            i = t$28606;
        }
        
        //#line 499 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28145 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 499 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28145.println(((java.lang.Object)("+++++++++++++++++D")));
    }
    
    
    //#line 521 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    private static void distributeGraphPartitions(final java.lang.String graphID, final long vcnt, final int initPartID) {
        
        //#line 613 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.HashMap quotaMapIndex = new java.util.HashMap();
        
        //#line 614 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.HashMap quotaMap = new java.util.HashMap();
        
        //#line 615 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long iIndex = 0L;
        
        //#line 616 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.util.ArrayList fileList = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 617 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.ArrayList t$28146 = ((x10.util.ArrayList)(fileList));
        
        //#line 617 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        ((x10.util.ArrayList<java.lang.String>)t$28146).add__0x10$util$ArrayList$$T$O(((java.lang.String)("/home/miyurud/tmp/dgr/")));
        
        //#line 623 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28147 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 623 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28147.println(((java.lang.Object)("----Required storage quota is as follows------")));
        
        //#line 624 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.util.HashMap t$28148 = ((java.util.HashMap)(quotaMap));
        
        //#line 624 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.util.Set t$28149 = t$28148.entrySet();
        
        //#line 624 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.Iterator itr2 = t$28149.iterator();
        
        //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        while (true) {
            
            //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Iterator t$28150 = ((java.util.Iterator)(itr2));
            
            //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28159 = t$28150.hasNext();
            
            //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28159)) {
                
                //#line 626 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 627 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Iterator t$28607 = ((java.util.Iterator)(itr2));
            
            //#line 627 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28608 = t$28607.next();
            
            //#line 627 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Map.Entry pairs$28609 = x10.rtt.Types.<java.util.Map.Entry> cast(t$28608,x10.rtt.Types.getRTT(java.util.Map.Entry.class));
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28610 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28611 = pairs$28609.getKey();
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28612 = (("") + (t$28611));
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28613 = ((t$28612) + (" value : "));
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28614 = pairs$28609.getValue();
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28615 = ((t$28613) + (t$28614));
            
            //#line 628 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28610.println(((java.lang.Object)(t$28615)));
        }
        
        //#line 630 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28160 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 630 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28160.println(((java.lang.Object)("----AAAABBBBBBCCCCCCCCCCCCDDDDDDDDDDEEEE------")));
        
        //#line 636 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.util.HashMap t$28161 = ((java.util.HashMap)(quotaMap));
        
        //#line 636 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.HashMap hMapAllocStrat = org.acacia.server.migration.MigrationManager.getAllocationStrategy(((java.util.HashMap)(t$28161)));
        
        //#line 637 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.util.HashMap t$28162 = ((java.util.HashMap)(hMapAllocStrat));
        
        //#line 637 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.util.Set t$28163 = t$28162.entrySet();
        
        //#line 637 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.util.Iterator itr = t$28163.iterator();
        
        //#line 639 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        while (true) {
            
            //#line 639 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Iterator t$28164 = ((java.util.Iterator)(itr));
            
            //#line 639 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28173 = t$28164.hasNext();
            
            //#line 639 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28173)) {
                
                //#line 639 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Iterator t$28616 = ((java.util.Iterator)(itr));
            
            //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28617 = t$28616.next();
            
            //#line 640 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.util.Map.Entry pairs$28618 = x10.rtt.Types.<java.util.Map.Entry> cast(t$28617,x10.rtt.Types.getRTT(java.util.Map.Entry.class));
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28619 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28620 = pairs$28618.getKey();
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28621 = (("") + (t$28620));
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28622 = ((t$28621) + (" value : "));
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.Object t$28623 = pairs$28618.getValue();
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String t$28624 = ((t$28622) + (t$28623));
            
            //#line 641 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28619.println(((java.lang.Object)(t$28624)));
        }
        
        //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28174 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 644 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28174.println(((java.lang.Object)("ABCD1***")));
        
        //#line 721 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28175 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 721 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28175.println(((java.lang.Object)("Done distributing partitions.")));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final double t$28176 = ((double)(long)(((long)(vcnt))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final double t$28177 = ((t$28176) / (((double)(1000000.0))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final double t$28178 = (double)java.lang.Math.round(((double)(t$28177)));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final double t$28179 = ((double)(long)(((long)(1L))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final double t$28180 = ((t$28178) + (((double)(t$28179))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28181 = ((long)(double)(((double)(t$28180))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28182 = (("jar bin/acacia.jar org.acacia.partitioner.java.NoptSplitter ") + ((x10.core.Long.$box(t$28181))));
        
        //#line 723 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.submitJob(((java.lang.String)(t$28182)));
        
        //#line 725 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28183 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 725 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28183.println(((java.lang.Object)("Populating central tables.")));
        
        //#line 727 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int numAsyncPerTime = 4;
        
        //#line 735 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        int cntr = 0;
        
        //#line 736 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long selectedMaxJ = 0L;
        
        //#line 830 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28184 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 830 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28184.println(((java.lang.Object)("Done populating central tables.")));
    }
    
    public static void distributeGraphPartitions$P(final java.lang.String graphID, final long vcnt, final int initPartID) {
        org.acacia.server.AcaciaServer.distributeGraphPartitions(((java.lang.String)(graphID)), (long)(vcnt), (int)(initPartID));
    }
    
    
    //#line 837 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    private static x10.util.HashMap getLiveHostIDList() {
        
        //#line 839 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail hostNameArr = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect("SELECT name,idhost FROM ACACIA_META.HOST");
        
        //#line 842 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.util.HashMap result = new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
        
        //#line 845 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.util.ArrayList hosrArrlist = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 847 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.lang.String nm = null;
        
        //#line 877 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail hosts = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 878 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28185 = ((x10.core.Rail<java.lang.String>)hosts).size;
        
        //#line 878 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final int hostListLen = ((int)(long)(((long)(t$28185))));
        
        //#line 879 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long t$28186 = ((long)(((int)(hostListLen))));
        
        //#line 879 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        x10.core.Rail intermRes = new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$28186);
        
        //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        int i$28641 = 0;
        {
            
            //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String[] hosts$value$28804 = ((java.lang.String[])hosts.value);
            
            //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            for (;
                 true;
                 ) {
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28642 = i$28641;
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28643 = ((t$28642) < (((int)(hostListLen))));
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (!(t$28643)) {
                    
                    //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    break;
                }
                
                //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.util.ArrayList t$28625 = ((x10.util.ArrayList)(hosrArrlist));
                
                //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28626 = i$28641;
                
                //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28627 = ((long)(((int)(t$28626))));
                
                //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28628 = ((java.lang.String)hosts$value$28804[(int)t$28627]);
                
                //#line 882 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                ((x10.util.ArrayList<java.lang.String>)t$28625).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$28628)));
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28629 = i$28641;
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28630 = ((t$28629) + (((int)(1))));
                
                //#line 881 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                i$28641 = t$28630;
            }
        }
        
        //#line 888 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long l = ((x10.core.Rail<java.lang.String>)hostNameArr).size;
        
        //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i$28644 = 0L;
        {
            
            //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String[] hostNameArr$value$28805 = ((java.lang.String[])hostNameArr.value);
            
            //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            for (;
                 true;
                 ) {
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28645 = i$28644;
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28646 = ((t$28645) < (((long)(l))));
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (!(t$28646)) {
                    
                    //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    break;
                }
                
                //#line 892 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28631 = i$28644;
                
                //#line 892 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28632 = ((java.lang.String)hostNameArr$value$28805[(int)t$28631]);
                
                //#line 892 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.core.Rail itm$28633 = x10.lang.StringHelper.split(",", t$28632);
                
                //#line 896 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.util.ArrayList t$28634 = ((x10.util.ArrayList)(hosrArrlist));
                
                //#line 896 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28635 = ((java.lang.String[])itm$28633.value)[(int)0L];
                
                //#line 896 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28636 = ((x10.util.ArrayList<java.lang.String>)t$28634).contains__0x10$util$ArrayList$$T$O(((java.lang.String)(t$28635)));
                
                //#line 896 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (t$28636) {
                    
                    //#line 899 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28637 = ((java.lang.String[])itm$28633.value)[(int)0L];
                    
                    //#line 899 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28638 = ((java.lang.String[])itm$28633.value)[(int)1L];
                    
                    //#line 899 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    ((x10.util.HashMap<java.lang.String, java.lang.String>)result).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$28637)), ((java.lang.String)(t$28638)));
                }
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28639 = i$28644;
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28640 = ((t$28639) + (((long)(1L))));
                
                //#line 890 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                i$28644 = t$28640;
            }
        }
        
        //#line 905 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        return result;
    }
    
    public static x10.util.HashMap getLiveHostIDList$P() {
        return org.acacia.server.AcaciaServer.getLiveHostIDList();
    }
    
    
    //#line 909 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    private static void truncateLocalInstances() {
        
        //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$28209 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.Iterator p$27721 = ((x10.lang.Iterable<x10.lang.Place>)t$28209).iterator();
        
        //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28214 = ((x10.lang.Iterator<x10.lang.Place>)p$27721).hasNext$O();
            
            //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28214)) {
                
                //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 910 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Place p$28647 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$27721).next$G()));
            {
                
                //#line 911 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$28647)), ((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$12(p$28647))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    public static void truncateLocalInstances$P() {
        org.acacia.server.AcaciaServer.truncateLocalInstances();
    }
    
    
    //#line 922 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void insertEdge(final java.lang.String host, final long graphID, final long startVert, final long endVert) {
        {
            
            //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.xrx.FinishState fs$28784 = x10.xrx.Runtime.startFinish();
            
            //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                {
                    
                }
            }}catch (java.lang.Throwable ct$28782) {
                
                //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$28782)));
                
                //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 923 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$28784)));
             }}
            }
        }
    
    
    //#line 939 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void initGraph(final int graphID) {
        
        //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$28216 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.Iterator p$27723 = ((x10.lang.Iterable<x10.lang.Place>)t$28216).iterator();
        
        //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28221 = ((x10.lang.Iterator<x10.lang.Place>)p$27723).hasNext$O();
            
            //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28221)) {
                
                //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 940 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Place p$28652 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$27723).next$G()));
            {
                
                //#line 941 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$28652)), ((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$13(graphID))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 949 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void setDefaultGraph(final int graphID) {
        
        //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.PlaceGroup t$28223 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.lang.Iterator p$27725 = ((x10.lang.Iterable<x10.lang.Place>)t$28223).iterator();
        
        //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        for (;
             true;
             ) {
            
            //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28228 = ((x10.lang.Iterator<x10.lang.Place>)p$27725).hasNext$O();
            
            //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (!(t$28228)) {
                
                //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                break;
            }
            
            //#line 950 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.lang.Place p$28657 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$27725).next$G()));
            {
                
                //#line 951 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.runAt(((x10.lang.Place)(p$28657)), ((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$14(graphID))), ((x10.xrx.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 961 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public void init() {
        
        //#line 962 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28229 = org.acacia.util.java.Utils_Java.getAcaciaProperty(((java.lang.String)("org.acacia.centralstore.location")));
        
        //#line 962 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        java.io.File centalStoreLocation = new java.io.File(t$28229);
        
        //#line 964 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.io.Printer t$28231 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 964 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.io.File t$28230 = ((java.io.File)(centalStoreLocation));
        
        //#line 964 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28232 = (("centalStoreLocation:") + (t$28230));
        
        //#line 964 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        t$28231.println(((java.lang.Object)(t$28232)));
        
        //#line 966 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.io.File t$28233 = ((java.io.File)(centalStoreLocation));
        
        //#line 966 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28234 = t$28233.exists();
        
        //#line 966 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28236 = !(t$28234);
        
        //#line 966 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (t$28236) {
            
            //#line 967 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.io.File t$28235 = ((java.io.File)(centalStoreLocation));
            
            //#line 967 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28235.mkdir();
        }
        
        //#line 970 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail schemaName = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME LIKE \'ACACIA_META\'");
        
        //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        boolean t$28238 = ((schemaName) == (null));
        
        //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (!(t$28238)) {
            
            //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final long t$28237 = ((x10.core.Rail<java.lang.String>)schemaName).size;
            
            //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28238 = ((long) t$28237) == ((long) 0L);
        }
        
        //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28240 = t$28238;
        
        //#line 972 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (t$28240) {
            
            //#line 973 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.io.Printer t$28239 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 973 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            t$28239.println(((java.lang.Object)("Acacia database does not exist.\r\nNow creating...")));
            
            //#line 974 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.runtime.impl.java.EvalUtils.eval(org.acacia.metadata.db.java.AcaciaHSQLDBComm.setupAcaciaMetaDataDB());
        }
        
        //#line 977 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28244 = this.IS_DISTRIBUTED;
        
        //#line 977 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        if (t$28244) {
            
            //#line 979 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28241 = org.acacia.partitioner.hadoop.HDFSInterface.fileExists$O(((java.lang.String)("/user/miyuru/acacia-server.properties")));
            
            //#line 979 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final boolean t$28243 = !(t$28241);
            
            //#line 979 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            if (t$28243) {
                
                //#line 980 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28242 = ((java.lang.String)(org.acacia.util.Conts.ACACIA_SERVER_PROPS_FILE));
                
                //#line 980 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.partitioner.hadoop.HDFSInterface.copyOntoHDFSfromLocal(((java.lang.String)(t$28242)), ((java.lang.String)("/user/miyuru/acacia-server.properties")));
            }
        }
        {
            
            //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final x10.xrx.FinishState fs$28800 = x10.xrx.Runtime.startFinish();
            
            //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                {
                    
                    //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final x10.lang.PlaceGroup t$28246 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final x10.lang.Iterator p$27729 = ((x10.lang.Iterable<x10.lang.Place>)t$28246).iterator();
                    
                    //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final boolean t$28283 = ((x10.lang.Iterator<x10.lang.Place>)p$27729).hasNext$O();
                        
                        //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        if (!(t$28283)) {
                            
                            //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            break;
                        }
                        
                        //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.lang.Place p$28667 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$27729).next$G()));
                        
                        //#line 992 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String strhst$28668 = x10.xrx.Runtime.<java.lang.String> evalAt__1$1x10$xrx$Runtime$$T$2$G(x10.rtt.Types.STRING, ((x10.lang.Place)(p$28667)), ((x10.core.fun.Fun_0_0)(new org.acacia.server.AcaciaServer.$Closure$15())), ((x10.xrx.Runtime.Profile)(null)));
                        
                        //#line 1001 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.core.Rail strArr$28674 = x10.lang.StringHelper.split(":", strhst$28668);
                        
                        //#line 1002 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String hstName$28675 = ((java.lang.String[])strArr$28674.value)[(int)1L];
                        
                        //#line 1003 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String hstIP$28676 = ((java.lang.String[])strArr$28674.value)[(int)0L];
                        
                        //#line 1005 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.util.HashMap t$28677 = ((x10.util.HashMap)(org.acacia.server.AcaciaServer.get$hostPlaceMap()));
                        
                        //#line 1005 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final long t$28678 = p$28667.id;
                        
                        //#line 1005 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        ((x10.util.HashMap<java.lang.String, x10.core.Long>)t$28677).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(hstName$28675)), x10.core.Long.$box(t$28678));
                        
                        //#line 1007 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28679 = (("SELECT count(name) FROM ACACIA_META.HOST WHERE name LIKE \'") + (hstName$28675));
                        
                        //#line 1007 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28680 = ((t$28679) + ("\'"));
                        
                        //#line 1007 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.core.Rail t$28681 = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$28680);
                        
                        //#line 1007 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String insrtID$28682 = ((java.lang.String[])t$28681.value)[(int)0L];
                        
                        //#line 1008 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.io.Printer t$28683 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                        
                        //#line 1008 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28684 = (("Host status : ") + (insrtID$28682));
                        
                        //#line 1008 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28685 = ((t$28684) + (" for host "));
                        
                        //#line 1008 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28686 = ((t$28685) + (hstName$28675));
                        
                        //#line 1008 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        t$28683.println(((java.lang.Object)(t$28686)));
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.io.Printer t$28687 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final long t$28688 = p$28667.id;
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28689 = (("Host name of place : ") + ((x10.core.Long.$box(t$28688))));
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28690 = ((t$28689) + (" is "));
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28691 = ((t$28690) + (hstName$28675));
                        
                        //#line 1009 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        t$28687.println(((java.lang.Object)(t$28691)));
                        
                        //#line 1011 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final boolean t$28692 = (insrtID$28682).equals("0");
                        
                        //#line 1011 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        if (t$28692) {
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28693 = (("INSERT INTO ACACIA_META.HOST(NAME, IP, IS_PUBLIC) VALUES(\'") + (hstName$28675));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28694 = ((t$28693) + ("\',\'"));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28695 = ((t$28694) + (hstIP$28676));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28696 = ((t$28695) + ("\', "));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28697 = org.acacia.util.Utils.isPublic$O(((java.lang.String)(hstName$28675)));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28698 = ((t$28696) + ((x10.core.Boolean.$box(t$28697))));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28699 = ((t$28698) + (")"));
                            
                            //#line 1012 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String insertID$28700 = org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28699);
                            
                            //#line 1013 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28701 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 1013 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28702 = (("Result is : ") + (insertID$28700));
                            
                            //#line 1013 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28701.println(((java.lang.Object)(t$28702)));
                        } else {
                            
                            //#line 1014 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean t$28703 = (insrtID$28682).equals("1");
                            
                            //#line 1014 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            if (t$28703) {
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28704 = (("UPDATE ACACIA_META.HOST SET IP = \'") + (hstIP$28676));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28705 = ((t$28704) + ("\', IS_PUBLIC="));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final boolean t$28706 = org.acacia.util.Utils.isPublic$O(((java.lang.String)(hstName$28675)));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28707 = ((t$28705) + ((x10.core.Boolean.$box(t$28706))));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28708 = ((t$28707) + (" WHERE NAME LIKE \'"));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28709 = ((t$28708) + (hstName$28675));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28710 = ((t$28709) + ("\'"));
                                
                                //#line 1015 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final boolean result$28711 = org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(t$28710);
                                
                                //#line 1016 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final x10.io.Printer t$28712 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                                
                                //#line 1016 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                final java.lang.String t$28713 = (("Result is : ") + ((x10.core.Boolean.$box(result$28711))));
                                
                                //#line 1016 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                                t$28712.println(((java.lang.Object)(t$28713)));
                            }
                        }
                    }
                }
            }}catch (java.lang.Throwable ct$28798) {
                
                //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$28798)));
                
                //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 991 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$28800)));
             }}
            }
        
        //#line 1021 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail publicHosts = org.acacia.util.Utils.getPublicHostList();
        
        //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final x10.core.Rail rail$28753 = ((x10.core.Rail)(publicHosts));
        
        //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27731min$28754 = 0L;
        
        //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final long i$27731max$28755 = ((x10.core.Rail<java.lang.String>)rail$28753).size;
        
        //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        long i$28750 = i$27731min$28754;
        {
            
            //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            final java.lang.String[] publicHosts$value$28806 = ((java.lang.String[])publicHosts.value);
            
            //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            for (;
                 true;
                 ) {
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28751 = i$28750;
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28752 = ((t$28751) < (((long)(i$27731max$28755))));
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (!(t$28752)) {
                    
                    //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    break;
                }
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long item$28747 = i$28750;
                
                //#line 1024 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28714 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                
                //#line 1024 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28715 = (t$28714).equals("");
                
                //#line 1024 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final boolean t$28716 = !(t$28715);
                
                //#line 1024 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                if (t$28716) {
                    
                    //#line 1028 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28717 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                    
                    //#line 1028 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28718 = (("SELECT count(name) FROM ACACIA_META.HOST WHERE name LIKE \'") + (t$28717));
                    
                    //#line 1028 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28719 = ((t$28718) + ("\'"));
                    
                    //#line 1028 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final x10.core.Rail t$28720 = org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(t$28719);
                    
                    //#line 1028 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String insrtID$28721 = ((java.lang.String[])t$28720.value)[(int)0L];
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final x10.io.Printer t$28722 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28723 = (("Host status : ") + (insrtID$28721));
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28724 = ((t$28723) + (" for host "));
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28725 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String t$28726 = ((t$28724) + (t$28725));
                    
                    //#line 1029 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    t$28722.println(((java.lang.Object)(t$28726)));
                    
                    //#line 1031 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final boolean t$28727 = (insrtID$28721).equals("0");
                    
                    //#line 1031 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    if (t$28727) {
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28728 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28729 = (("INSERT INTO ACACIA_META.HOST(NAME, IP, IS_PUBLIC) VALUES(\'") + (t$28728));
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28730 = ((t$28729) + ("\',\'\', "));
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28731 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final boolean t$28732 = org.acacia.util.Utils.isPublic$O(((java.lang.String)(t$28731)));
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28733 = ((t$28730) + ((x10.core.Boolean.$box(t$28732))));
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28734 = ((t$28733) + (")"));
                        
                        //#line 1033 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String insertID$28735 = org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(t$28734);
                        
                        //#line 1034 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final x10.io.Printer t$28736 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                        
                        //#line 1034 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final java.lang.String t$28737 = (("Result is : ") + (insertID$28735));
                        
                        //#line 1034 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        t$28736.println(((java.lang.Object)(t$28737)));
                    } else {
                        
                        //#line 1035 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        final boolean t$28738 = (insrtID$28721).equals("1");
                        
                        //#line 1035 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        if (t$28738) {
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28739 = "UPDATE ACACIA_META.HOST SET IP = \'\', IS_PUBLIC=true";
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28740 = "UPDATE ACACIA_META.HOST SET IP = \'\', IS_PUBLIC=true WHERE NAME LIKE \'";
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28741 = ((java.lang.String)publicHosts$value$28806[(int)item$28747]);
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28742 = ((t$28740) + (t$28741));
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28743 = ((t$28742) + ("\'"));
                            
                            //#line 1036 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final boolean result$28744 = org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(t$28743);
                            
                            //#line 1037 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final x10.io.Printer t$28745 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                            
                            //#line 1037 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            final java.lang.String t$28746 = (("Result is : ") + ((x10.core.Boolean.$box(result$28744))));
                            
                            //#line 1037 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                            t$28745.println(((java.lang.Object)(t$28746)));
                        }
                    }
                }
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28748 = i$28750;
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28749 = ((t$28748) + (((long)(1L))));
                
                //#line 1023 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                i$28750 = t$28749;
            }
        }
        }
    
    
    //#line 1044 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void runNeo4j() {
        
    }
    
    
    //#line 1049 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void call_server() {
        try {
            org.acacia.server.AcaciaManager.run();
        }
        catch (java.lang.Throwable exc$33582) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33582);
        }
        
    }
    
    
    
    //#line 1052 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_insertEdge$O(final java.lang.String id$31, final long id$32, final long id$33, final long id$34) {
        try {
            return org.acacia.server.AcaciaManager.insertEdge(id$31, id$32, id$33, id$34);
        }
        catch (java.lang.Throwable exc$33583) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33583);
        }
        
    }
    
    
    
    //#line 1056 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_batchUploadFile$O(final java.lang.String id$35, final int id$36, final long id$37, final java.lang.String id$38, final int id$39) {
        try {
            return org.acacia.server.AcaciaManager.batchUploadFile(id$35, id$36, id$37, id$38, id$39);
        }
        catch (java.lang.Throwable exc$33584) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33584);
        }
        
    }
    
    
    
    //#line 1059 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_initGraph$O(final java.lang.String id$40, final int id$41) {
        try {
            return org.acacia.server.AcaciaManager.initializeGraphOnLocalInstance(id$40, id$41);
        }
        catch (java.lang.Throwable exc$33585) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33585);
        }
        
    }
    
    
    
    //#line 1062 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_setGraph$O(final java.lang.String id$42, final int id$43) {
        try {
            return org.acacia.server.AcaciaManager.setDefaultGraph(id$42, id$43);
        }
        catch (java.lang.Throwable exc$33586) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33586);
        }
        
    }
    
    
    
    //#line 1065 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static long call_countVertices$O(final java.lang.String id$44, final java.lang.String id$45) {
        try {
            return org.acacia.server.AcaciaManager.countVertices(id$44, id$45);
        }
        catch (java.lang.Throwable exc$33587) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33587);
        }
        
    }
    
    
    
    //#line 1068 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static long call_countVertices$O(final java.lang.String id$46, final java.lang.String id$47, final java.lang.String id$48) {
        try {
            return org.acacia.server.AcaciaManager.countVertices(id$46, id$47, id$48);
        }
        catch (java.lang.Throwable exc$33588) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33588);
        }
        
    }
    
    
    
    //#line 1071 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static long call_countEdges$O(final java.lang.String id$49, final java.lang.String id$50) {
        try {
            return org.acacia.server.AcaciaManager.countEdges(id$49, id$50);
        }
        catch (java.lang.Throwable exc$33589) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33589);
        }
        
    }
    
    
    
    //#line 1074 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static long call_countEdges$O(final java.lang.String id$51, final java.lang.String id$52, final java.lang.String id$53) {
        try {
            return org.acacia.server.AcaciaManager.countEdges(id$51, id$52, id$53);
        }
        catch (java.lang.Throwable exc$33590) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33590);
        }
        
    }
    
    
    
    //#line 1077 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void call_truncateLocalInstance(final java.lang.String id$54, final int id$55) {
        try {
            org.acacia.server.AcaciaManager.truncateLocalInstance(id$54, id$55);
        }
        catch (java.lang.Throwable exc$33591) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33591);
        }
        
    }
    
    
    
    //#line 1080 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static java.lang.String call_runInsert(final java.lang.String id$56) {
        try {
            return org.acacia.metadata.db.java.MetaDataDBInterface.runInsert(id$56);
        }
        catch (java.lang.Throwable exc$33592) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33592);
        }
        
    }
    
    
    
    //#line 1083 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_runUpdate$O(final java.lang.String id$57) {
        try {
            return org.acacia.metadata.db.java.MetaDataDBInterface.runUpdate(id$57);
        }
        catch (java.lang.Throwable exc$33593) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33593);
        }
        
    }
    
    
    
    //#line 1086 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static x10.core.Rail call_runSelect(final java.lang.String id$58) {
        try {
            return org.acacia.metadata.db.java.MetaDataDBInterface.runSelect(id$58);
        }
        catch (java.lang.Throwable exc$33594) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33594);
        }
        
    }
    
    
    
    //#line 1089 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static java.lang.String call_getCurrentTimeStamp() {
        try {
            return org.acacia.util.java.Utils_Java.getCurrentTimeStamp();
        }
        catch (java.lang.Throwable exc$33595) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33595);
        }
        
    }
    
    
    
    //#line 1092 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static boolean call_setupAcaciaMetaDataDB$O() {
        try {
            return org.acacia.metadata.db.java.AcaciaHSQLDBComm.setupAcaciaMetaDataDB();
        }
        catch (java.lang.Throwable exc$33596) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33596);
        }
        
    }
    
    
    
    //#line 1095 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void call_loadIndex() {
        try {
            org.acacia.partitioner.index.PartitionIndexClient.loadIndex();
        }
        catch (java.lang.Throwable exc$33597) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33597);
        }
        
    }
    
    
    
    //#line 1098 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    public static void call_runProcessBuilderAndPrintToConsole(final java.lang.String id$59) {
        try {
            org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(id$59);
        }
        catch (java.lang.Throwable exc$33598) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33598);
        }
        
    }
    
    
    
    //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    final public org.acacia.server.AcaciaServer org$acacia$server$AcaciaServer$$this$org$acacia$server$AcaciaServer() {
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        return org.acacia.server.AcaciaServer.this;
    }
    
    
    //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaServer() {
        this((java.lang.System[]) null);
        org$acacia$server$AcaciaServer$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.server.AcaciaServer org$acacia$server$AcaciaServer$$init$S() {
         {
            
            //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            
            
            //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            this.__fieldInitializers_org_acacia_server_AcaciaServer();
        }
        return this;
    }
    
    
    
    //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
    final public void __fieldInitializers_org_acacia_server_AcaciaServer() {
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.frontend = null;
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.backend = null;
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.runFlag = true;
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.srv = null;
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.vertcounter = null;
        
        //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final java.lang.String t$28319 = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.server.mode.isdistributed");
        
        //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        final boolean t$28320 = java.lang.Boolean.parseBoolean(t$28319);
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
        this.IS_DISTRIBUTED = t$28320;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$hostPlaceMap = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$hostPlaceMap;
    
    public static x10.util.HashMap get$hostPlaceMap() {
        if (((int) org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return org.acacia.server.AcaciaServer.hostPlaceMap;
        }
        if (((int) org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: org.acacia.server.AcaciaServer.hostPlaceMap")));
            }
            throw org.acacia.server.AcaciaServer.exception$hostPlaceMap;
        }
        if (org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                org.acacia.server.AcaciaServer.hostPlaceMap = new x10.util.HashMap<java.lang.String, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.LONG).x10$util$HashMap$$init$S();
            }}catch (java.lang.Throwable exc$28802) {
                org.acacia.server.AcaciaServer.exception$hostPlaceMap = new x10.lang.ExceptionInInitializer(exc$28802);
                org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw org.acacia.server.AcaciaServer.exception$hostPlaceMap;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: org.acacia.server.AcaciaServer.hostPlaceMap")));
            }
            org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) org.acacia.server.AcaciaServer.initStatus$hostPlaceMap.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: org.acacia.server.AcaciaServer.hostPlaceMap")));
                    }
                    throw org.acacia.server.AcaciaServer.exception$hostPlaceMap;
                }
            }
        }
        return org.acacia.server.AcaciaServer.hostPlaceMap;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$5 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$5> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$5> make($Closure$5.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$5 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$5.class + " calling"); } 
            $_obj.p$28347 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$5 $_obj = new org.acacia.server.AcaciaServer.$Closure$5((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$28347);
            
        }
        
        // constructor just for allocation
        public $Closure$5(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28350 = x10.x10rt.X10RT.here().id;
                
                //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28351 = (("") + ((x10.core.Long.$box(t$28350))));
                
                //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("logFileName")), ((java.lang.String)(t$28351)));
                
                //#line 126 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28352 = this.p$28347.id;
                
                //#line 126 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28353 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28352));
                
                //#line 126 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28354 = (("") + ((x10.core.Int.$box(t$28353))));
                
                //#line 126 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("ACACIA_INSTANCE_PORT")), ((java.lang.String)(t$28354)));
                
                //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28355 = this.p$28347.id;
                
                //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28356 = org.acacia.util.PlaceToNodeMapper.getFileTransferServicePort$O((long)(t$28355));
                
                //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28357 = (("") + ((x10.core.Int.$box(t$28356))));
                
                //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("ACACIA_INSTANCE_DATA_PORT")), ((java.lang.String)(t$28357)));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Printer t$28358 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28359 = java.lang.System.getProperty(((java.lang.String)("logFileName")));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28360 = (("logFileName : ") + (t$28359));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28361 = ((t$28360) + (" ACACIA_INSTANCE_PORT : "));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28362 = this.p$28347.id;
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28363 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28362));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28364 = ((t$28361) + ((x10.core.Int.$box(t$28363))));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28365 = ((t$28364) + (" ACACIA_INSTANCE_DATA_PORT : "));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28366 = this.p$28347.id;
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28367 = org.acacia.util.PlaceToNodeMapper.getFileTransferServicePort$O((long)(t$28366));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28368 = ((t$28365) + ((x10.core.Int.$box(t$28367))));
                
                //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28358.println(((java.lang.Object)(t$28368)));
                
                //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                test.acacia.server.x10.TestAcaciaInstance.main__0$1x10$lang$String$2$O(((x10.core.Rail)(null)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.Place p$28347;
        
        public $Closure$5(final x10.lang.Place p$28347) {
             {
                this.p$28347 = ((x10.lang.Place)(p$28347));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$6 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$6> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$6> make($Closure$6.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$6 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$6.class + " calling"); } 
            $_obj.p$28347 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$6 $_obj = new org.acacia.server.AcaciaServer.$Closure$6((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$28347);
            
        }
        
        // constructor just for allocation
        public $Closure$6(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 137 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28369 = x10.x10rt.X10RT.here().id;
                
                //#line 137 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28370 = (("") + ((x10.core.Long.$box(t$28369))));
                
                //#line 137 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("logFileName")), ((java.lang.String)(t$28370)));
                
                //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28371 = this.p$28347.id;
                
                //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28372 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28371));
                
                //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28373 = (("") + ((x10.core.Int.$box(t$28372))));
                
                //#line 138 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("ACACIA_INSTANCE_PORT")), ((java.lang.String)(t$28373)));
                
                //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28374 = this.p$28347.id;
                
                //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28375 = org.acacia.util.PlaceToNodeMapper.getFileTransferServicePort$O((long)(t$28374));
                
                //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28376 = (("") + ((x10.core.Int.$box(t$28375))));
                
                //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.System.setProperty(((java.lang.String)("ACACIA_INSTANCE_DATA_PORT")), ((java.lang.String)(t$28376)));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28377 = java.lang.System.getProperty(((java.lang.String)("logFileName")));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28378 = (("logFileName : ") + (t$28377));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28379 = ((t$28378) + (" ACACIA_INSTANCE_PORT : "));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28380 = this.p$28347.id;
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28381 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28380));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28382 = ((t$28379) + ((x10.core.Int.$box(t$28381))));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28383 = ((t$28382) + (" ACACIA_INSTANCE_DATA_PORT : "));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28384 = x10.x10rt.X10RT.here().id;
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28385 = org.acacia.util.PlaceToNodeMapper.getFileTransferServicePort$O((long)(t$28384));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28386 = ((t$28383) + ((x10.core.Int.$box(t$28385))));
                
                //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.log.java.Logger_Java.info(((java.lang.String)(t$28386)));
                
                //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                test.acacia.server.x10.TestAcaciaInstance.main__0$1x10$lang$String$2$O(((x10.core.Rail)(null)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.Place p$28347;
        
        public $Closure$6(final x10.lang.Place p$28347) {
             {
                this.p$28347 = ((x10.lang.Place)(p$28347));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$7 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$7> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$7> make($Closure$7.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$7 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$7.class + " calling"); } 
            $_obj.p$28347 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$7 $_obj = new org.acacia.server.AcaciaServer.$Closure$7((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$28347);
            
        }
        
        // constructor just for allocation
        public $Closure$7(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                {
                    
                    //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(this.p$28347)), ((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$6(((x10.lang.Place)(this.p$28347))))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 135 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.Place p$28347;
        
        public $Closure$7(final x10.lang.Place p$28347) {
             {
                this.p$28347 = ((x10.lang.Place)(p$28347));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$8 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$8> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$8> make($Closure$8.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$8 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$8.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$8 $_obj = new org.acacia.server.AcaciaServer.$Closure$8((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$8(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 168 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                test.acacia.partitioner.index.TestPartitionIndex.main(((java.lang.String[])(null)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 167 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public $Closure$8() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$9 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$9> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$9> make($Closure$9.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$9 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$9.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$9 $_obj = new org.acacia.server.AcaciaServer.$Closure$9((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$9(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 172 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                test.acacia.partitioner.index.TestPartitionIndex.main(((java.lang.String[])(null)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public $Closure$9() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$10 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$10> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$10> make($Closure$10.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$10 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$10.class + " calling"); } 
            $_obj.p$28393 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$10 $_obj = new org.acacia.server.AcaciaServer.$Closure$10((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$28393);
            
        }
        
        // constructor just for allocation
        public $Closure$10(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                {
                    
                    //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(this.p$28393)), ((x10.core.fun.VoidFun_0_0)(new org.acacia.server.AcaciaServer.$Closure$9())), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 171 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.Place p$28393;
        
        public $Closure$10(final x10.lang.Place p$28393) {
             {
                this.p$28393 = ((x10.lang.Place)(p$28393));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$11 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$11> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$11> make($Closure$11.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$11 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$11.class + " calling"); } 
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$11 $_obj = new org.acacia.server.AcaciaServer.$Closure$11((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$11(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 179 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 180 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final org.acacia.backend.AcaciaBackEnd t$27844 = ((org.acacia.backend.AcaciaBackEnd)(new org.acacia.backend.AcaciaBackEnd()));
                
                //#line 180 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                this.out$$.backend = ((org.acacia.backend.AcaciaBackEnd)(t$27844));
                
                //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final org.acacia.backend.AcaciaBackEnd t$27845 = ((org.acacia.backend.AcaciaBackEnd)(this.out$$.backend));
                
                //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$27845.run();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 179 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 179 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public org.acacia.server.AcaciaServer out$$;
        
        public $Closure$11(final org.acacia.server.AcaciaServer out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$12 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$12> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$12> make($Closure$12.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$12 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$12.class + " calling"); } 
            $_obj.p$28647 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$12 $_obj = new org.acacia.server.AcaciaServer.$Closure$12((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p$28647);
            
        }
        
        // constructor just for allocation
        public $Closure$12(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 911 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 913 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28648 = this.p$28647.id;
                
                //#line 913 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28649 = org.acacia.util.PlaceToNodeMapper.getHost((long)(t$28648));
                
                //#line 913 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final long t$28650 = this.p$28647.id;
                
                //#line 913 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final int t$28651 = org.acacia.util.PlaceToNodeMapper.getInstancePort$O((long)(t$28650));
                
                //#line 913 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                org.acacia.server.AcaciaManager.truncateLocalInstance(t$28649, ((int)(t$28651)));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 911 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.Place p$28647;
        
        public $Closure$12(final x10.lang.Place p$28647) {
             {
                this.p$28647 = ((x10.lang.Place)(p$28647));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$13 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$13> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$13> make($Closure$13.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$13 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$13.class + " calling"); } 
            $_obj.graphID = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$13 $_obj = new org.acacia.server.AcaciaServer.$Closure$13((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.graphID);
            
        }
        
        // constructor just for allocation
        public $Closure$13(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 941 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 942 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Printer t$28653 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 942 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28654 = org.acacia.util.Utils.getHostName();
                
                //#line 942 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28655 = (("Initializing graph at : ") + (t$28654));
                
                //#line 942 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28653.println(((java.lang.Object)(t$28655)));
                
                //#line 943 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28656 = org.acacia.util.Utils.getHostName();
                
                //#line 943 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.runtime.impl.java.EvalUtils.eval(org.acacia.server.AcaciaManager.initializeGraphOnLocalInstance(t$28656, ((int)(this.graphID))));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 941 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public int graphID;
        
        public $Closure$13(final int graphID) {
             {
                this.graphID = graphID;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$14 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$14> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$14> make($Closure$14.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$14 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$14.class + " calling"); } 
            $_obj.graphID = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$14 $_obj = new org.acacia.server.AcaciaServer.$Closure$14((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.graphID);
            
        }
        
        // constructor just for allocation
        public $Closure$14(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 951 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 952 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Printer t$28658 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 952 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28659 = org.acacia.util.Utils.getHostName();
                
                //#line 952 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28660 = (("Setting default graph at : ") + (t$28659));
                
                //#line 952 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                t$28658.println(((java.lang.Object)(t$28660)));
                
                //#line 953 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28661 = org.acacia.util.Utils.getHostName();
                
                //#line 953 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                x10.runtime.impl.java.EvalUtils.eval(org.acacia.server.AcaciaManager.setDefaultGraph(t$28661, ((int)(this.graphID))));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 951 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public int graphID;
        
        public $Closure$14(final int graphID) {
             {
                this.graphID = graphID;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$15 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$15> $RTT = 
            x10.rtt.StaticFunType.<$Closure$15> make($Closure$15.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.STRING)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.server.AcaciaServer.$Closure$15 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$15.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.server.AcaciaServer.$Closure$15 $_obj = new org.acacia.server.AcaciaServer.$Closure$15((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$15(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public java.lang.String $apply$G() {
            return $apply();
        }
        
        
    
        
        public java.lang.String $apply() {
            
            //#line 992 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
            try {{
                
                //#line 993 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.String hst$28669 = null;
                
                //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.Reader t$28665 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead("hostname -i")));
                
                //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.io.ReaderIterator t$28666 = t$28665.lines();
                
                //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final x10.lang.Iterator line$28663 = ((x10.lang.Iterator<java.lang.String>)
                                                       ((x10.io.ReaderIterator<java.lang.String>)t$28666).iterator());
                
                //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final boolean t$28664 = ((x10.lang.Iterator<java.lang.String>)line$28663).hasNext$O();
                    
                    //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    if (!(t$28664)) {
                        
                        //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                        break;
                    }
                    
                    //#line 994 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    final java.lang.String line$28662 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$28663).next$G()));
                    
                    //#line 995 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                    hst$28669 = line$28662;
                }
                
                //#line 998 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28670 = hst$28669;
                
                //#line 998 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28671 = ((t$28670) + (":"));
                
                //#line 998 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28672 = org.acacia.util.Utils.getHostName();
                
                //#line 998 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                final java.lang.String t$28673 = ((t$28671) + (t$28672));
                
                //#line 998 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                return t$28673;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 992 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                java.lang.String __lowerer__var__1__ = ((java.lang.String)(x10.xrx.Runtime.<java.lang.String> wrapAtChecked$G(x10.rtt.Types.STRING, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 992 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/server/AcaciaServer.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$15() {
             {
                
            }
        }
        
    }
    
    }
    
    