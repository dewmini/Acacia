package org.acacia.partitioner;


@x10.runtime.impl.java.X10Generated
public class MetisInterface extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MetisInterface> $RTT = 
        x10.rtt.NamedType.<MetisInterface> make("org.acacia.partitioner.MetisInterface",
                                                MetisInterface.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.partitioner.MetisInterface $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MetisInterface.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.partitioner.MetisInterface $_obj = new org.acacia.partitioner.MetisInterface((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public MetisInterface(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    // creation method for java code (1-phase java constructor)
    public MetisInterface() {
        this((java.lang.System[]) null);
        org$acacia$partitioner$MetisInterface$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.partitioner.MetisInterface org$acacia$partitioner$MetisInterface$$init$S() {
         {
            
            //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            
            
            //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            this.__fieldInitializers_org_acacia_partitioner_MetisInterface();
        }
        return this;
    }
    
    
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    public static void partitionWithMetis(final java.lang.String filePath, final long nParts) {
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String metisLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.metis.home");
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32868 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32868.println(((java.lang.Object)("Partitioning the graph with metis.")));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32872 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32869 = ((metisLoc) + ("/bin/gpmetis "));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32870 = ((t$32869) + (filePath));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32871 = ((t$32870) + (" "));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32873 = ((t$32871) + ((x10.core.Long.$box(nParts))));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32872.println(((java.lang.Object)(t$32873)));
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32874 = ((metisLoc) + ("/bin/gpmetis "));
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32875 = ((t$32874) + (filePath));
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32876 = ((t$32875) + (" "));
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String cmd = ((t$32876) + ((x10.core.Long.$box(nParts))));
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Reader t$32877 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead(cmd)));
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Reader t$32878 = ((x10.io.Reader)
                                        t$32877);
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.ReaderIterator t$32879 = t$32878.lines();
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.lang.Iterator itr = ((x10.lang.Iterator<java.lang.String>)
                                        ((x10.io.ReaderIterator<java.lang.String>)t$32879).iterator());
        
        //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        while (true) {
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            final boolean t$32882 = ((x10.lang.Iterator<java.lang.String>)itr).hasNext$O();
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            if (!(t$32882)) {
                
                //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                break;
            }
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            final x10.io.Printer t$32912 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            final java.lang.String t$32913 = ((x10.lang.Iterator<java.lang.String>)itr).next$G();
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            t$32912.println(((java.lang.Object)(t$32913)));
        }
        
        //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32883 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32883.println(((java.lang.Object)("Done partitioning the graph")));
    }
    
    
    //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    public static void partitionWithParMetis(final java.lang.String filePath, final long nParts) {
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String metisLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.parmetis.home");
        
        //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String mpiLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.mpi.home");
        
        //#line 48 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.core.Rail hostList = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32884 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32884.println(((java.lang.Object)("Copying the graph file to all the remote hosts.")));
        {
            
            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            final x10.xrx.FinishState fs$32935 = x10.xrx.Runtime.startFinish();
            
            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            try {{
                {
                    
                    //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    final x10.core.Rail rail$32845 = ((x10.core.Rail)(hostList));
                    
                    //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    final long size$32846 = ((x10.core.Rail<java.lang.String>)rail$32845).size;
                    
                    //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    long idx$32928 = 0L;
                    {
                        
                        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                        final java.lang.String[] rail$32845$value$32937 = ((java.lang.String[])rail$32845.value);
                        
                        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final long t$32929 = idx$32928;
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final boolean t$32930 = ((t$32929) < (((long)(size$32846))));
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            if (!(t$32930)) {
                                
                                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                                break;
                            }
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final long t$32924 = idx$32928;
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final java.lang.String item$32925 = ((java.lang.String)(((java.lang.String)rail$32845$value$32937[(int)t$32924])));
                            
                            //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new org.acacia.partitioner.MetisInterface.$Closure$16(item$32925))));
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final long t$32926 = idx$32928;
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            final long t$32927 = ((t$32926) + (((long)(1L))));
                            
                            //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                            idx$32928 = t$32927;
                        }
                    }
                }
            }}catch (java.lang.Throwable ct$32933) {
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$32933)));
                
                //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$32935)));
             }}
            }
        
        //#line 66 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32899 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 66 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32899.println(((java.lang.Object)("Done copying the file.")));
        
        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32900 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32900.println(((java.lang.Object)("Partitioning the graph with parmetis.")));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32901 = ((mpiLoc) + ("/mpiexec -f machines.txt -np "));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32902 = ((t$32901) + ((x10.core.Long.$box(nParts))));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32903 = ((t$32902) + (" "));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32904 = ((t$32903) + (metisLoc));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32905 = ((t$32904) + ("/parmetis "));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32906 = ((t$32905) + (filePath));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32907 = ((t$32906) + (" 2 "));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32908 = ((t$32907) + ((x10.core.Long.$box(nParts))));
        
        //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String cmd = ((t$32908) + (" 0 0 0 0"));
        
        //#line 74 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32909 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 74 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32909.println(((java.lang.Object)(cmd)));
        
        //#line 85 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final java.lang.String t$32910 = (("/tmp/dgr/grf.part.") + ((x10.core.Long.$box(nParts))));
        
        //#line 85 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndSaveToFile(cmd, t$32910);
        
        //#line 133 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        final x10.io.Printer t$32911 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 133 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        t$32911.println(((java.lang.Object)("Done partitioning the graph")));
        }
    
    
    //#line 136 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    public static void call_runProcessBuilderAndSaveToFile(final java.lang.String id$63, final java.lang.String id$64) {
        try {
            org.acacia.util.java.Utils_Java.runProcessBuilderAndSaveToFile(id$63, id$64);
        }
        catch (java.lang.Throwable exc$33601) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33601);
        }
        
    }
    
    
    
    //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    final public org.acacia.partitioner.MetisInterface org$acacia$partitioner$MetisInterface$$this$org$acacia$partitioner$MetisInterface() {
        
        //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
        return org.acacia.partitioner.MetisInterface.this;
    }
    
    
    //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
    final public void __fieldInitializers_org_acacia_partitioner_MetisInterface() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$16 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$16> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$16> make($Closure$16.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.partitioner.MetisInterface.$Closure$16 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$16.class + " calling"); } 
            $_obj.item$32925 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            org.acacia.partitioner.MetisInterface.$Closure$16 $_obj = new org.acacia.partitioner.MetisInterface.$Closure$16((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.item$32925);
            
        }
        
        // constructor just for allocation
        public $Closure$16(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
            try {{
                
                //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final java.lang.String t$32916 = (("scp /tmp/dgr/grf miyuru@") + (this.item$32925));
                
                //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final java.lang.String cmd$32917 = ((t$32916) + (":/tmp/dgr/grf"));
                
                //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final x10.io.Printer t$32918 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                t$32918.println(((java.lang.Object)(cmd$32917)));
                
                //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final x10.io.Reader t$32919 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead(cmd$32917)));
                
                //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final x10.io.Reader t$32920 = ((x10.io.Reader)
                                                t$32919);
                
                //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final x10.io.ReaderIterator t$32921 = t$32920.lines();
                
                //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                final x10.lang.Iterator itr$32922 = ((x10.lang.Iterator<java.lang.String>)
                                                      ((x10.io.ReaderIterator<java.lang.String>)t$32921).iterator());
                
                //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                while (true) {
                    
                    //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    final boolean t$32923 = ((x10.lang.Iterator<java.lang.String>)itr$32922).hasNext$O();
                    
                    //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    if (!(t$32923)) {
                        
                        //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                        break;
                    }
                    
                    //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    final x10.io.Printer t$32914 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
                    //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    final java.lang.String t$32915 = ((x10.lang.Iterator<java.lang.String>)itr$32922).next$G();
                    
                    //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                    t$32914.println(((java.lang.Object)(t$32915)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/MetisInterface.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public java.lang.String item$32925;
        
        public $Closure$16(final java.lang.String item$32925) {
             {
                this.item$32925 = ((java.lang.String)(item$32925));
            }
        }
        
    }
    
    }
    
    