package org.acacia.partitioner.hadoop;


@x10.runtime.impl.java.X10Generated
public class HadoopOrchestrator extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HadoopOrchestrator> $RTT = 
        x10.rtt.NamedType.<HadoopOrchestrator> make("org.acacia.partitioner.hadoop.HadoopOrchestrator",
                                                    HadoopOrchestrator.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.partitioner.hadoop.HadoopOrchestrator $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HadoopOrchestrator.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.partitioner.hadoop.HadoopOrchestrator $_obj = new org.acacia.partitioner.hadoop.HadoopOrchestrator((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HadoopOrchestrator(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    // creation method for java code (1-phase java constructor)
    public HadoopOrchestrator() {
        this((java.lang.System[]) null);
        org$acacia$partitioner$hadoop$HadoopOrchestrator$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.partitioner.hadoop.HadoopOrchestrator org$acacia$partitioner$hadoop$HadoopOrchestrator$$init$S() {
         {
            
            //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            
            
            //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            this.__fieldInitializers_org_acacia_partitioner_hadoop_HadoopOrchestrator();
        }
        return this;
    }
    
    
    
    //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static void setupHadoop() {
        
        //#line 31 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String hadoopHome = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        java.lang.String hadoopHosts = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.masters");
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29512 = ((java.lang.String)(hadoopHosts));
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        x10.core.Rail hadoopHostsArray = x10.lang.StringHelper.split(",", t$29512);
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29513 = ((hadoopHome) + ("/conf/masters"));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        x10.io.File outFile = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$29513);
        
        //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.File t$29514 = ((x10.io.File)(outFile));
        
        //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        x10.io.FileWriter writer = new x10.io.FileWriter((java.lang.System[]) null).x10$io$FileWriter$$init$S(t$29514);
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.core.Rail rail$29614 = ((x10.core.Rail)(hadoopHostsArray));
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final long i$29469min$29615 = 0L;
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final long i$29469max$29616 = ((x10.core.Rail<java.lang.String>)rail$29614).size;
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        long i$29600 = i$29469min$29615;
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        for (;
             true;
             ) {
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29601 = i$29600;
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29602 = ((t$29601) < (((long)(i$29469max$29616))));
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (!(t$29602)) {
                
                //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long item$29597 = i$29600;
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.FileWriter t$29592 = ((x10.io.FileWriter)(writer));
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.core.Rail t$29593 = ((x10.core.Rail)(hadoopHostsArray));
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String t$29594 = ((java.lang.String[])t$29593.value)[(int)item$29597];
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String t$29595 = ((t$29594) + ("\n"));
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.core.Rail t$29596 = x10.runtime.impl.java.ArrayUtils.<x10.core.Byte>makeRailFromJavaArray(x10.rtt.Types.BYTE, (t$29595).getBytes(), false);
            
            //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29592.write__0$1x10$lang$Byte$2(((x10.core.Rail)(t$29596)));
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29598 = i$29600;
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29599 = ((t$29598) + (((long)(1L))));
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            i$29600 = t$29599;
        }
        
        //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.FileWriter t$29525 = ((x10.io.FileWriter)(writer));
        
        //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29525.close();
        
        //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29526 = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.slaves");
        
        //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        hadoopHosts = ((java.lang.String)(t$29526));
        
        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29527 = ((java.lang.String)(hadoopHosts));
        
        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.core.Rail t$29528 = x10.lang.StringHelper.split(",", t$29527);
        
        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        hadoopHostsArray = ((x10.core.Rail)(t$29528));
        
        //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29529 = ((hadoopHome) + ("/conf/slaves"));
        
        //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.File t$29530 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$29529)));
        
        //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        outFile = ((x10.io.File)(t$29530));
        
        //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.File t$29531 = ((x10.io.File)(outFile));
        
        //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.FileWriter t$29532 = ((x10.io.FileWriter)(new x10.io.FileWriter((java.lang.System[]) null).x10$io$FileWriter$$init$S(t$29531)));
        
        //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        writer = ((x10.io.FileWriter)(t$29532));
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.core.Rail rail$29617 = ((x10.core.Rail)(hadoopHostsArray));
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final long i$29488min$29618 = 0L;
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final long i$29488max$29619 = ((x10.core.Rail<java.lang.String>)rail$29617).size;
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        long i$29611 = i$29488min$29618;
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        for (;
             true;
             ) {
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29612 = i$29611;
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29613 = ((t$29612) < (((long)(i$29488max$29619))));
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (!(t$29613)) {
                
                //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long item$29608 = i$29611;
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.FileWriter t$29603 = ((x10.io.FileWriter)(writer));
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.core.Rail t$29604 = ((x10.core.Rail)(hadoopHostsArray));
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String t$29605 = ((java.lang.String[])t$29604.value)[(int)item$29608];
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String t$29606 = ((t$29605) + ("\n"));
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.core.Rail t$29607 = x10.runtime.impl.java.ArrayUtils.<x10.core.Byte>makeRailFromJavaArray(x10.rtt.Types.BYTE, (t$29606).getBytes(), false);
            
            //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29603.write__0$1x10$lang$Byte$2(((x10.core.Rail)(t$29607)));
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29609 = i$29611;
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final long t$29610 = ((t$29609) + (((long)(1L))));
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            i$29611 = t$29610;
        }
        
        //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.FileWriter t$29543 = ((x10.io.FileWriter)(writer));
        
        //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29543.close();
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29544 = ((hadoopHome) + ("/conf/hadoop-env.sh"));
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String data = org.acacia.partitioner.hadoop.HadoopOrchestrator.readAlltext(((java.lang.String)(t$29544)));
        
        //#line 67 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.core.Rail dataArr = x10.lang.StringHelper.split("\n", data);
        
        //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final int ind = (data).indexOf("JAVA_HOME");
        
        //#line 75 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29545 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 75 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29546 = (("ind : ") + ((x10.core.Int.$box(ind))));
        
        //#line 75 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29545.println(((java.lang.Object)(t$29546)));
    }
    
    
    //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    private static java.lang.String readAlltext(final java.lang.String fileName) {
        
        //#line 80 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        x10.util.StringBuilder builder = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.File t$29547 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(fileName)))));
        
        //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        x10.io.FileReader reader = new x10.io.FileReader((java.lang.System[]) null).x10$io$FileReader$$init$S(((x10.io.File)(t$29547)));
        
        //#line 82 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        java.lang.String line = null;
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        while (true) {
            
            //#line 85 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            try {{
                
                //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                final x10.io.FileReader t$29548 = ((x10.io.FileReader)(reader));
                
                //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                final java.lang.String t$29549 = t$29548.readLine();
                
                //#line 86 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                line = ((java.lang.String)(t$29549));
                
                //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                final x10.util.StringBuilder t$29550 = ((x10.util.StringBuilder)(builder));
                
                //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                final java.lang.String t$29551 = ((java.lang.String)(line));
                
                //#line 87 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                t$29550.add(((java.lang.String)(t$29551)));
            }}catch (final x10.io.IOException id$60) {
                
                //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
        }
        
        //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.util.StringBuilder t$29552 = ((x10.util.StringBuilder)(builder));
        
        //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29553 = t$29552.toString();
        
        //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        return t$29553;
    }
    
    public static java.lang.String readAlltext$P(final java.lang.String fileName) {
        return org.acacia.partitioner.hadoop.HadoopOrchestrator.readAlltext(((java.lang.String)(fileName)));
    }
    
    
    //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static boolean isHadoopRunning$O() {
        
        //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        boolean result = false;
        
        //#line 100 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final boolean t$29554 = result;
        
        //#line 100 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        return t$29554;
    }
    
    
    //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static boolean isJobDone$O() {
        
        //#line 104 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.File fileTmp = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("/tmp/jobdone")));
        
        //#line 106 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final boolean t$29555 = fileTmp.exists$O();
        
        //#line 106 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        return t$29555;
    }
    
    
    //#line 109 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static void startHadoop() {
        
        //#line 110 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29556 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 110 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29556.println(((java.lang.Object)("Starting Hadoop")));
        
        //#line 111 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String namenode = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.namenode");
        
        //#line 113 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        boolean flag = false;
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29624 = (("ssh ") + (namenode));
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29625 = ((t$29624) + (" "));
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29626 = ((t$29625) + (hadoopLoc));
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29627 = ((t$29626) + ("/bin/start-all.sh"));
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Reader t$29628 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead(t$29627)));
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.ReaderIterator t$29629 = t$29628.lines();
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.lang.Iterator line$29630 = ((x10.lang.Iterator<java.lang.String>)
                                               ((x10.io.ReaderIterator<java.lang.String>)t$29629).iterator());
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        for (;
             true;
             ) {
            
            //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29631 = ((x10.lang.Iterator<java.lang.String>)line$29630).hasNext$O();
            
            //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (!(t$29631)) {
                
                //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
            
            //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String line$29620 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$29630).next$G()));
            
            //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.Printer t$29621 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 116 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29621.println(((java.lang.Object)(line$29620)));
            
            //#line 117 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final int t$29622 = (line$29620).indexOf("Stop it first.");
            
            //#line 117 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29623 = ((int) t$29622) != ((int) -1);
            
            //#line 117 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (t$29623) {
                
                //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                flag = true;
            }
        }
        
        //#line 121 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final boolean t$29570 = flag;
        
        //#line 121 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        if (t$29570) {
            
            //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.Printer t$29568 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 122 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29568.println(((java.lang.Object)("Hadoop is already running.")));
        } else {
            
            //#line 124 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.Printer t$29569 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 124 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29569.println(((java.lang.Object)("Done starting Hadoop")));
        }
    }
    
    
    //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static void submitJob(final java.lang.String args) {
        
        //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29571 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29572 = (("Submitting the job : ") + (args));
        
        //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29571.println(((java.lang.Object)(t$29572)));
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29634 = ((hadoopLoc) + ("/bin/hadoop "));
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29635 = ((t$29634) + (args));
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Reader t$29636 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead(t$29635)));
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.ReaderIterator t$29637 = t$29636.lines();
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.lang.Iterator line$29638 = ((x10.lang.Iterator<java.lang.String>)
                                               ((x10.io.ReaderIterator<java.lang.String>)t$29637).iterator());
        
        //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        for (;
             true;
             ) {
            
            //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29639 = ((x10.lang.Iterator<java.lang.String>)line$29638).hasNext$O();
            
            //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (!(t$29639)) {
                
                //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
            
            //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String line$29632 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$29638).next$G()));
            
            //#line 133 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.Printer t$29633 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 133 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29633.println(((java.lang.Object)(line$29632)));
        }
        
        //#line 136 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29580 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 136 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29580.println(((java.lang.Object)("Submitted job to Hadoop")));
    }
    
    
    //#line 145 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static void stopHadoop() {
        
        //#line 146 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29581 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 146 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29581.println(((java.lang.Object)("Stopping Hadoop")));
        
        //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 148 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String namenode = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.namenode");
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29642 = (("ssh ") + (namenode));
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29643 = ((t$29642) + (" "));
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29644 = ((t$29643) + (hadoopLoc));
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final java.lang.String t$29645 = ((t$29644) + ("/bin/stop-all.sh"));
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Reader t$29646 = ((x10.io.Reader)(x10.runtime.impl.java.Runtime.execForRead(t$29645)));
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.ReaderIterator t$29647 = t$29646.lines();
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.lang.Iterator line$29648 = ((x10.lang.Iterator<java.lang.String>)
                                               ((x10.io.ReaderIterator<java.lang.String>)t$29647).iterator());
        
        //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        for (;
             true;
             ) {
            
            //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final boolean t$29649 = ((x10.lang.Iterator<java.lang.String>)line$29648).hasNext$O();
            
            //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            if (!(t$29649)) {
                
                //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
                break;
            }
            
            //#line 150 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final java.lang.String line$29640 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$29648).next$G()));
            
            //#line 151 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            final x10.io.Printer t$29641 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 151 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
            t$29641.println(((java.lang.Object)(line$29640)));
        }
        
        //#line 153 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        final x10.io.Printer t$29591 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 153 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        t$29591.println(((java.lang.Object)("Done stopping Hadoop")));
    }
    
    
    //#line 156 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    public static void reStartHadoop() {
        
        //#line 157 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.stopHadoop();
        
        //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        org.acacia.partitioner.hadoop.HadoopOrchestrator.startHadoop();
    }
    
    
    //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    final public org.acacia.partitioner.hadoop.HadoopOrchestrator org$acacia$partitioner$hadoop$HadoopOrchestrator$$this$org$acacia$partitioner$hadoop$HadoopOrchestrator() {
        
        //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
        return org.acacia.partitioner.hadoop.HadoopOrchestrator.this;
    }
    
    
    //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HadoopOrchestrator.x10"
    final public void __fieldInitializers_org_acacia_partitioner_hadoop_HadoopOrchestrator() {
        
    }
}

