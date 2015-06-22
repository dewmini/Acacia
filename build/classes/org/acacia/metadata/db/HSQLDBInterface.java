package org.acacia.metadata.db;


@x10.runtime.impl.java.X10Generated
public class HSQLDBInterface extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HSQLDBInterface> $RTT = 
        x10.rtt.NamedType.<HSQLDBInterface> make("org.acacia.metadata.db.HSQLDBInterface",
                                                 HSQLDBInterface.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.metadata.db.HSQLDBInterface $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HSQLDBInterface.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.metadata.db.HSQLDBInterface $_obj = new org.acacia.metadata.db.HSQLDBInterface((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HSQLDBInterface(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
    public static void startHsqlDB() {
        
        //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String javaHome = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.javahome");
        
        //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String workDir = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.server.runtime.location");
        
        //#line 13 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String dbFileLoc = ((workDir) + ("/metadb"));
        
        //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.io.File file = new java.io.File(((java.lang.String)(dbFileLoc)));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final x10.io.Printer t$33226 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        t$33226.println(((java.lang.Object)("AAAAAA")));
        
        //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final boolean t$33227 = file.isDirectory();
        
        //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final boolean t$33232 = !(t$33227);
        
        //#line 19 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        if (t$33232) {
            
            //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            final x10.io.Printer t$33229 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            final java.lang.String t$33228 = (("MetaDB folder (") + (dbFileLoc));
            
            //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            final java.lang.String t$33230 = ((t$33228) + (") was created."));
            
            //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            t$33229.println(((java.lang.Object)(t$33230)));
            
            //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            file.mkdir();
        } else {
            
            //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            final x10.io.Printer t$33231 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            t$33231.println(((java.lang.Object)("BBBBBBB")));
        }
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String t$33233 = (("ssh localhost") + (javaHome));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String t$33234 = ((t$33233) + ("/bin/java -cp lib/hsqldb-2.2.9.jar org.hsqldb.Server -database.0 file:"));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String t$33235 = ((t$33234) + (dbFileLoc));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        final java.lang.String t$33236 = ((t$33235) + (" -dbname.0 acacia_meta &"));
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$33236);
    }
    
    
    //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
    public static void call_runProcessBuilderAndPrintToConsole(final java.lang.String id$72) {
        try {
            org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(id$72);
        }
        catch (java.lang.Throwable exc$33611) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33611);
        }
        
    }
    
    
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
    final public org.acacia.metadata.db.HSQLDBInterface org$acacia$metadata$db$HSQLDBInterface$$this$org$acacia$metadata$db$HSQLDBInterface() {
        
        //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
        return org.acacia.metadata.db.HSQLDBInterface.this;
    }
    
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
    // creation method for java code (1-phase java constructor)
    public HSQLDBInterface() {
        this((java.lang.System[]) null);
        org$acacia$metadata$db$HSQLDBInterface$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.metadata.db.HSQLDBInterface org$acacia$metadata$db$HSQLDBInterface$$init$S() {
         {
            
            //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            
            
            //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
            this.__fieldInitializers_org_acacia_metadata_db_HSQLDBInterface();
        }
        return this;
    }
    
    
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/metadata/db/HSQLDBInterface.x10"
    final public void __fieldInitializers_org_acacia_metadata_db_HSQLDBInterface() {
        
    }
}

