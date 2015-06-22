package org.acacia.partitioner.hadoop;


@x10.runtime.impl.java.X10Generated
public class HDFSFile extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HDFSFile> $RTT = 
        x10.rtt.NamedType.<HDFSFile> make("org.acacia.partitioner.hadoop.HDFSFile",
                                          HDFSFile.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.partitioner.hadoop.HDFSFile $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HDFSFile.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.partitioner.hadoop.HDFSFile $_obj = new org.acacia.partitioner.hadoop.HDFSFile((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HDFSFile(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    // creation method for java code (1-phase java constructor)
    public HDFSFile() {
        this((java.lang.System[]) null);
        org$acacia$partitioner$hadoop$HDFSFile$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.partitioner.hadoop.HDFSFile org$acacia$partitioner$hadoop$HDFSFile$$init$S() {
         {
            
            //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
            
            
            //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
            this.__fieldInitializers_org_acacia_partitioner_hadoop_HDFSFile();
        }
        return this;
    }
    
    
    
    //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public void open(final java.lang.String path) {
        
        //#line 17 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
        org.acacia.partitioner.hadoop.java.HDFSFile_Java.open(path);
    }
    
    
    //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public void close() {
        
        //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
        org.acacia.partitioner.hadoop.java.HDFSFile_Java.close();
    }
    
    
    //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public java.lang.String readLine() {
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
        final java.lang.String t$32938 = org.acacia.partitioner.hadoop.java.HDFSFile_Java.readLine();
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
        return t$32938;
    }
    
    
    //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public static void call_open(final java.lang.String id$71) {
        try {
            org.acacia.partitioner.hadoop.java.HDFSFile_Java.open(id$71);
        }
        catch (java.lang.Throwable exc$33608) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33608);
        }
        
    }
    
    
    
    //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public static void call_close() {
        try {
            org.acacia.partitioner.hadoop.java.HDFSFile_Java.close();
        }
        catch (java.lang.Throwable exc$33609) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33609);
        }
        
    }
    
    
    
    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    public static java.lang.String call_readLine() {
        try {
            return org.acacia.partitioner.hadoop.java.HDFSFile_Java.readLine();
        }
        catch (java.lang.Throwable exc$33610) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33610);
        }
        
    }
    
    
    
    //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    final public org.acacia.partitioner.hadoop.HDFSFile org$acacia$partitioner$hadoop$HDFSFile$$this$org$acacia$partitioner$hadoop$HDFSFile() {
        
        //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
        return org.acacia.partitioner.hadoop.HDFSFile.this;
    }
    
    
    //#line 8 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSFile.x10"
    final public void __fieldInitializers_org_acacia_partitioner_hadoop_HDFSFile() {
        
    }
}

