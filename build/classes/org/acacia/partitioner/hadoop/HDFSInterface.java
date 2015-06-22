package org.acacia.partitioner.hadoop;


@x10.runtime.impl.java.X10Generated
public class HDFSInterface extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HDFSInterface> $RTT = 
        x10.rtt.NamedType.<HDFSInterface> make("org.acacia.partitioner.hadoop.HDFSInterface",
                                               HDFSInterface.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.partitioner.hadoop.HDFSInterface $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HDFSInterface.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.partitioner.hadoop.HDFSInterface $_obj = new org.acacia.partitioner.hadoop.HDFSInterface((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HDFSInterface(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void copyOntoHDFSfromLocal(final java.lang.String localFilePath, final java.lang.String pathOnHDFS) {
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final boolean t$31979 = org.acacia.partitioner.hadoop.HDFSInterface.fileExists$O(((java.lang.String)(pathOnHDFS)));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        if (t$31979) {
            
            //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            org.acacia.partitioner.hadoop.HDFSInterface.deleteFile$O(((java.lang.String)(pathOnHDFS)));
        }
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String taskCount = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.taskcount");
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final int t$31980 = java.lang.Integer.parseInt(taskCount);
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long blockSize = org.acacia.partitioner.hadoop.HDFSInterface.getBlockSize$O(((java.lang.String)(localFilePath)), (int)(t$31980));
        
        //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$31981 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31982 = (("Hadoop Map/Reduce Task count is : ") + (taskCount));
        
        //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$31981.println(((java.lang.Object)(t$31982)));
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$31983 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31984 = (("HDFS Block size is : ") + ((x10.core.Long.$box(blockSize))));
        
        //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$31983.println(((java.lang.Object)(t$31984)));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$31991 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31985 = (("The command is : ") + (hadoopLoc));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31986 = ((t$31985) + ("/bin/hadoop fs -Ddfs.block.size="));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31987 = ((t$31986) + ((x10.core.Long.$box(blockSize))));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31988 = ((t$31987) + (" -put "));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31989 = ((t$31988) + (localFilePath));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31990 = ((t$31989) + (" "));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31992 = ((t$31990) + (pathOnHDFS));
        
        //#line 38 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$31991.println(((java.lang.Object)(t$31992)));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31993 = ((hadoopLoc) + ("/bin/hadoop fs -Ddfs.block.size="));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31994 = ((t$31993) + ((x10.core.Long.$box(blockSize))));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31995 = ((t$31994) + (" -put "));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31996 = ((t$31995) + (localFilePath));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31997 = ((t$31996) + (" "));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$31998 = ((t$31997) + (pathOnHDFS));
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$31998);
        
        //#line 46 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$31999 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 46 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$31999.println(((java.lang.Object)("Done executing the command...")));
    }
    
    
    //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    private static long getBlockSize$O(final java.lang.String path, final int mapTaskCnt) {
        
        //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        long result = 0L;
        
        //#line 56 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long bytesPerCheckSum = 512L;
        
        //#line 57 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.File file = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(path)));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32002 = file.size$O();
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32000 = ((long)(((int)(mapTaskCnt))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32001 = ((t$32000) * (((long)(bytesPerCheckSum))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32003 = ((t$32001) * (((long)(2L))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32004 = ((t$32002) / (((long)(t$32003))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final double t$32005 = ((double)(long)(((long)(t$32004))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final double t$32006 = java.lang.Math.floor(((double)(t$32005)));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final double t$32007 = (double)java.lang.Math.round(((double)(t$32006)));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32008 = ((long)(double)(((double)(t$32007))));
        
        //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        result = t$32008;
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32009 = result;
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final boolean t$32011 = ((long) t$32009) == ((long) 0L);
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        if (t$32011) {
            
            //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final long t$32010 = 32768L;
            
            //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            return t$32010;
        }
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32012 = result;
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long t$32013 = ((t$32012) * (((long)(bytesPerCheckSum))));
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return t$32013;
    }
    
    public static long getBlockSize$P$O(final java.lang.String path, final int mapTaskCnt) {
        return org.acacia.partitioner.hadoop.HDFSInterface.getBlockSize$O(((java.lang.String)(path)), (int)(mapTaskCnt));
    }
    
    
    //#line 75 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void mergeOnHDFSandCopyOntoLocal(final java.lang.String pathOnHDFS, final java.lang.String localPath) {
        
        //#line 76 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$32018 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32014 = (("Running : ") + (hadoopLoc));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32015 = ((t$32014) + ("/bin/hadoop fs -getmerge "));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32016 = ((t$32015) + (pathOnHDFS));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32017 = ((t$32016) + (" "));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32019 = ((t$32017) + (localPath));
        
        //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$32018.println(((java.lang.Object)(t$32019)));
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32020 = ((hadoopLoc) + ("/bin/hadoop fs -getmerge "));
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32021 = ((t$32020) + (pathOnHDFS));
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32022 = ((t$32021) + (" "));
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32023 = ((t$32022) + (localPath));
        
        //#line 84 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$32023);
    }
    
    
    //#line 90 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void copyOntoLocal(final java.lang.String pathOnHDFS, final java.lang.String localPath) {
        
        //#line 91 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$32028 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32024 = (("Running : ") + (hadoopLoc));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32025 = ((t$32024) + ("/bin/hadoop fs -get "));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32026 = ((t$32025) + (pathOnHDFS));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32027 = ((t$32026) + (" "));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32029 = ((t$32027) + (localPath));
        
        //#line 93 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$32028.println(((java.lang.Object)(t$32029)));
        
        //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32030 = ((hadoopLoc) + ("/bin/hadoop fs -get "));
        
        //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32031 = ((t$32030) + (pathOnHDFS));
        
        //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32032 = ((t$32031) + (" "));
        
        //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32033 = ((t$32032) + (localPath));
        
        //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$32033);
        
        //#line 101 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.io.Printer t$32034 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 101 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        t$32034.println(((java.lang.Object)("Done downloading the file.")));
    }
    
    
    //#line 104 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void copyOntoLocalFromHDFS(final java.lang.String pathOnHDFS, final java.lang.String localPath) {
        
        //#line 115 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final org.apache.hadoop.conf.Configuration conf = new org.apache.hadoop.conf.Configuration();
        
        //#line 118 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopHome = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 119 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String resPath1 = ((hadoopHome) + ("/conf/core-site.xml"));
        
        //#line 120 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String resPath2 = ((hadoopHome) + ("/conf/hdfs-site.xml"));
        
        //#line 121 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String resPath3 = ((hadoopHome) + ("/conf/mapred-site.xml"));
        
        //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final org.apache.hadoop.fs.Path t$32035 = ((org.apache.hadoop.fs.Path)(new org.apache.hadoop.fs.Path(((java.lang.String)(resPath1)))));
        
        //#line 123 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        conf.addResource(((org.apache.hadoop.fs.Path)(t$32035)));
        
        //#line 124 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final org.apache.hadoop.fs.Path t$32036 = ((org.apache.hadoop.fs.Path)(new org.apache.hadoop.fs.Path(((java.lang.String)(resPath2)))));
        
        //#line 124 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        conf.addResource(((org.apache.hadoop.fs.Path)(t$32036)));
        
        //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final org.apache.hadoop.fs.Path t$32037 = ((org.apache.hadoop.fs.Path)(new org.apache.hadoop.fs.Path(((java.lang.String)(resPath3)))));
        
        //#line 125 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        conf.addResource(((org.apache.hadoop.fs.Path)(t$32037)));
        
        //#line 126 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.apache.hadoop.fs.FileSystem fileSystem = null;
        
        //#line 128 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        try {{
            
            //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final org.apache.hadoop.fs.FileSystem t$32038 = org.apache.hadoop.fs.FileSystem.get(((org.apache.hadoop.conf.Configuration)(conf)));
            
            //#line 129 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            fileSystem = ((org.apache.hadoop.fs.FileSystem)(t$32038));
            
            //#line 130 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final org.apache.hadoop.fs.Path pthSrc = new org.apache.hadoop.fs.Path(((java.lang.String)(pathOnHDFS)));
            
            //#line 132 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final org.apache.hadoop.fs.Path pthDst = new org.apache.hadoop.fs.Path(((java.lang.String)(localPath)));
            
            //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final int t$32039 = (pathOnHDFS).lastIndexOf(((char)('/')));
            
            //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final int t$32040 = ((t$32039) + (((int)(1))));
            
            //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final int t$32041 = (pathOnHDFS).length();
            
            //#line 140 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String fileName = (pathOnHDFS).substring(((int)(t$32040)), ((int)(t$32041)));
            
            //#line 141 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final org.apache.hadoop.fs.FileSystem t$32042 = ((org.apache.hadoop.fs.FileSystem)(fileSystem));
            
            //#line 141 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            t$32042.copyFromLocalFile(((org.apache.hadoop.fs.Path)(pthSrc)), ((org.apache.hadoop.fs.Path)(pthDst)));
            
            //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final x10.io.Printer t$32045 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String t$32043 = (("File ") + (fileName));
            
            //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String t$32044 = ((t$32043) + (" copied to "));
            
            //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String t$32046 = ((t$32044) + (localPath));
            
            //#line 142 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            t$32045.println(((java.lang.Object)(t$32046)));
        }}catch (java.io.IOException e) {
            
            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final x10.io.Printer t$32049 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.io.IOException t$32047 = ((java.io.IOException)(e));
            
            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String t$32048 = t$32047.getMessage();
            
            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String t$32050 = (("Exception2 : ") + (t$32048));
            
            //#line 144 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            t$32049.println(((java.lang.Object)(t$32050)));
        }finally {{
             
             //#line 146 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
             try {{
                 
                 //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 final org.apache.hadoop.fs.FileSystem t$32051 = ((org.apache.hadoop.fs.FileSystem)(fileSystem));
                 
                 //#line 147 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 t$32051.close();
             }}catch (final java.io.IOException ec) {
                 
                 //#line 149 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 final x10.io.Printer t$32053 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                 
                 //#line 149 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 final java.lang.String t$32052 = ec.getMessage();
                 
                 //#line 149 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 final java.lang.String t$32054 = (("Exception3 : ") + (t$32052));
                 
                 //#line 149 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                 t$32053.println(((java.lang.Object)(t$32054)));
             }
         }}
        }
    
    
    //#line 157 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static int getFileCountOnDir$O(final java.lang.String pathOnHDFS) {
        
        //#line 158 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        int result = 0;
        
        //#line 159 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32055 = ((hadoopLoc) + ("/bin/hadoop fs -count -q "));
        
        //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32056 = ((t$32055) + (pathOnHDFS));
        
        //#line 181 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        x10.core.Rail intermRes = org.acacia.util.java.Utils_Java.runProcessBuilderAndGetResults(t$32056);
        
        //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail rail$32156 = ((x10.core.Rail)(intermRes));
        
        //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long size$32157 = ((x10.core.Rail<java.lang.String>)rail$32156).size;
        
        //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        long idx$32153 = 0L;
        {
            
            //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String[] rail$32156$value$32199 = ((java.lang.String[])rail$32156.value);
            
            //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            for (;
                 true;
                 ) {
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32154 = idx$32153;
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32155 = ((t$32154) < (((long)(size$32157))));
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (!(t$32155)) {
                    
                    //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    break;
                }
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32149 = idx$32153;
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final java.lang.String line$32150 = ((java.lang.String)(((java.lang.String)rail$32156$value$32199[(int)t$32149])));
                
                //#line 183 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final x10.core.Rail res$32147 = x10.lang.StringHelper.split(" ", line$32150);
                
                //#line 184 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                int counter$32148 = 0;
                
                //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final x10.core.Rail rail$32144 = ((x10.core.Rail)(res$32147));
                
                //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long i$31861min$32145 = 0L;
                
                //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long i$31861max$32146 = ((x10.core.Rail<java.lang.String>)rail$32144).size;
                
                //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                long i$32141 = i$31861min$32145;
                {
                    
                    //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    final java.lang.String[] res$32147$value$32198 = ((java.lang.String[])res$32147.value);
                    
                    //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final long t$32142 = i$32141;
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final boolean t$32143 = ((t$32142) < (((long)(i$31861max$32146))));
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        if (!(t$32143)) {
                            
                            //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            break;
                        }
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final long item$32138 = i$32141;
                        
                        //#line 186 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final java.lang.String t$32126 = ((java.lang.String)res$32147$value$32198[(int)item$32138]);
                        
                        //#line 186 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final java.lang.String v$32127 = (t$32126).trim();
                        
                        //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final boolean t$32128 = (v$32127).equals("");
                        
                        //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final boolean t$32129 = !(t$32128);
                        
                        //#line 187 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        if (t$32129) {
                            
                            //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            final int t$32130 = counter$32148;
                            
                            //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            final int t$32131 = ((t$32130) + (((int)(1))));
                            
                            //#line 188 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            counter$32148 = t$32131;
                            
                            //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            final int t$32132 = counter$32148;
                            
                            //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            final boolean t$32133 = ((int) t$32132) == ((int) 6);
                            
                            //#line 190 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                            if (t$32133) {
                                
                                //#line 191 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                final int t$32134 = java.lang.Integer.parseInt(v$32127);
                                
                                //#line 191 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                final int t$32135 = ((t$32134) - (((int)(3))));
                                
                                //#line 191 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                result = t$32135;
                                
                                //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                final int t$32136 = result;
                                
                                //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                final boolean t$32137 = ((int) t$32136) == ((int) -2);
                                
                                //#line 193 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                if (t$32137) {
                                    
                                    //#line 194 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                                    result = 1;
                                }
                            }
                        }
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final long t$32139 = i$32141;
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final long t$32140 = ((t$32139) + (((long)(1L))));
                        
                        //#line 185 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        i$32141 = t$32140;
                    }
                }
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32151 = idx$32153;
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32152 = ((t$32151) + (((long)(1L))));
                
                //#line 182 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                idx$32153 = t$32152;
            }
        }
        
        //#line 200 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final int t$32079 = result;
        
        //#line 200 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return t$32079;
    }
    
    
    //#line 207 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static x10.core.Rail getListofFileNamesOnDir(final java.lang.String pathOnHDFS) {
        
        //#line 208 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        x10.util.ArrayList result = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 209 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 221 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32080 = ((hadoopLoc) + ("/bin/hadoop fs -ls "));
        
        //#line 221 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32081 = ((t$32080) + (pathOnHDFS));
        
        //#line 221 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        x10.core.Rail intermRes = org.acacia.util.java.Utils_Java.runProcessBuilderAndGetResults(t$32081);
        
        //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail rail$32174 = ((x10.core.Rail)(intermRes));
        
        //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long size$32175 = ((x10.core.Rail<java.lang.String>)rail$32174).size;
        
        //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        long idx$32171 = 0L;
        {
            
            //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String[] rail$32174$value$32200 = ((java.lang.String[])rail$32174.value);
            
            //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            for (;
                 true;
                 ) {
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32172 = idx$32171;
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32173 = ((t$32172) < (((long)(size$32175))));
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (!(t$32173)) {
                    
                    //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    break;
                }
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32167 = idx$32171;
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final java.lang.String line$32168 = ((java.lang.String)(((java.lang.String)rail$32174$value$32200[(int)t$32167])));
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final int t$32158 = (line$32168).indexOf("_SUCCESS");
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                boolean t$32159 = ((int) t$32158) == ((int) -1);
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (t$32159) {
                    
                    //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    final int t$32160 = (line$32168).indexOf("_logs");
                    
                    //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    t$32159 = ((int) t$32160) == ((int) -1);
                }
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32161 = t$32159;
                
                //#line 224 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (t$32161) {
                    
                    //#line 225 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    final int idx$32162 = (line$32168).lastIndexOf("/");
                    
                    //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    final boolean t$32163 = ((int) idx$32162) != ((int) -1);
                    
                    //#line 227 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    if (t$32163) {
                        
                        //#line 228 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final x10.util.ArrayList t$32164 = ((x10.util.ArrayList)(result));
                        
                        //#line 228 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final int t$32165 = ((idx$32162) + (((int)(1))));
                        
                        //#line 228 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        final java.lang.String t$32166 = (line$32168).substring(((int)(t$32165)));
                        
                        //#line 228 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                        ((x10.util.ArrayList<java.lang.String>)t$32164).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$32166)));
                    }
                }
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32169 = idx$32171;
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32170 = ((t$32169) + (((long)(1L))));
                
                //#line 223 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                idx$32171 = t$32170;
            }
        }
        
        //#line 233 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.util.ArrayList t$32096 = ((x10.util.ArrayList)(result));
        
        //#line 233 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail t$32097 = ((x10.core.Rail<java.lang.String>)
                                        ((x10.util.ArrayList<java.lang.String>)t$32096).toRail());
        
        //#line 233 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return t$32097;
    }
    
    
    //#line 236 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void moveFileTo(final java.lang.String sourcePath, final java.lang.String destPath) {
        
        //#line 237 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32098 = ((hadoopLoc) + ("/bin/hadoop fs -mv "));
        
        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32099 = ((t$32098) + (sourcePath));
        
        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32100 = ((t$32099) + (" "));
        
        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32101 = ((t$32100) + (destPath));
        
        //#line 245 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$32101);
    }
    
    
    //#line 253 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void mkdir(final java.lang.String path) {
        
        //#line 254 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32102 = ((hadoopLoc) + ("/bin/hadoop fs -mkdir "));
        
        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32103 = ((t$32102) + (path));
        
        //#line 260 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(t$32103);
    }
    
    
    //#line 266 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static boolean fileExists$O(final java.lang.String filePath) {
        
        //#line 267 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        boolean result = false;
        
        //#line 268 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 280 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32104 = ((hadoopLoc) + ("/bin/hadoop fs -ls "));
        
        //#line 280 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32105 = ((t$32104) + (filePath));
        
        //#line 280 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        x10.core.Rail intermRes = org.acacia.util.java.Utils_Java.runProcessBuilderAndGetResults(t$32105);
        
        //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail rail$32187 = ((x10.core.Rail)(intermRes));
        
        //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long size$32188 = ((x10.core.Rail<java.lang.String>)rail$32187).size;
        
        //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        long idx$32184 = 0L;
        {
            
            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String[] rail$32187$value$32201 = ((java.lang.String[])rail$32187.value);
            
            //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            for (;
                 true;
                 ) {
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32185 = idx$32184;
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32186 = ((t$32185) < (((long)(size$32188))));
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (!(t$32186)) {
                    
                    //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    break;
                }
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32180 = idx$32184;
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final java.lang.String line$32181 = ((java.lang.String)(((java.lang.String)rail$32187$value$32201[(int)t$32180])));
                
                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final int t$32176 = (line$32181).indexOf(filePath);
                
                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                boolean t$32177 = ((int) t$32176) != ((int) -1);
                
                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (t$32177) {
                    
                    //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    final int t$32178 = (line$32181).indexOf("Cannot access");
                    
                    //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    t$32177 = ((int) t$32178) == ((int) -1);
                }
                
                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32179 = t$32177;
                
                //#line 289 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (t$32179) {
                    
                    //#line 290 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    result = true;
                }
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32182 = idx$32184;
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32183 = ((t$32182) + (((long)(1L))));
                
                //#line 282 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                idx$32184 = t$32183;
            }
        }
        
        //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final boolean t$32116 = result;
        
        //#line 295 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return t$32116;
    }
    
    
    //#line 298 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static boolean deleteFile$O(final java.lang.String filePath) {
        
        //#line 299 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        boolean result = true;
        
        //#line 300 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String hadoopLoc = org.acacia.util.java.Utils_Java.getAcaciaProperty("org.acacia.partitioner.hadoop.home");
        
        //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32117 = ((hadoopLoc) + ("/bin/hadoop fs -rmr "));
        
        //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final java.lang.String t$32118 = ((t$32117) + (filePath));
        
        //#line 306 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail res = org.acacia.util.java.Utils_Java.runProcessBuilderAndGetResults(t$32118);
        
        //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final x10.core.Rail rail$32196 = ((x10.core.Rail)(res));
        
        //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final long size$32197 = ((x10.core.Rail<java.lang.String>)rail$32196).size;
        
        //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        long idx$32193 = 0L;
        {
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            final java.lang.String[] rail$32196$value$32202 = ((java.lang.String[])rail$32196.value);
            
            //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            for (;
                 true;
                 ) {
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32194 = idx$32193;
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final boolean t$32195 = ((t$32194) < (((long)(size$32197))));
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                if (!(t$32195)) {
                    
                    //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                    break;
                }
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32189 = idx$32193;
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final java.lang.String line$32190 = ((java.lang.String)(((java.lang.String)rail$32196$value$32202[(int)t$32189])));
                
                //#line 309 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                org.acacia.log.Logger.info(((java.lang.String)(line$32190)));
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32191 = idx$32193;
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                final long t$32192 = ((t$32191) + (((long)(1L))));
                
                //#line 308 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
                idx$32193 = t$32192;
            }
        }
        
        //#line 312 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        final boolean t$32125 = result;
        
        //#line 312 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return t$32125;
    }
    
    
    //#line 316 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static void call_runProcessBuilderAndPrintToConsole(final java.lang.String id$61) {
        try {
            org.acacia.util.java.Utils_Java.runProcessBuilderAndPrintToConsole(id$61);
        }
        catch (java.lang.Throwable exc$33599) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33599);
        }
        
    }
    
    
    
    //#line 319 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    public static x10.core.Rail call_runProcessBuilderAndGetResults(final java.lang.String id$62) {
        try {
            return org.acacia.util.java.Utils_Java.runProcessBuilderAndGetResults(id$62);
        }
        catch (java.lang.Throwable exc$33600) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33600);
        }
        
    }
    
    
    
    //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    final public org.acacia.partitioner.hadoop.HDFSInterface org$acacia$partitioner$hadoop$HDFSInterface$$this$org$acacia$partitioner$hadoop$HDFSInterface() {
        
        //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
        return org.acacia.partitioner.hadoop.HDFSInterface.this;
    }
    
    
    //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    // creation method for java code (1-phase java constructor)
    public HDFSInterface() {
        this((java.lang.System[]) null);
        org$acacia$partitioner$hadoop$HDFSInterface$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.partitioner.hadoop.HDFSInterface org$acacia$partitioner$hadoop$HDFSInterface$$init$S() {
         {
            
            //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            
            
            //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
            this.__fieldInitializers_org_acacia_partitioner_hadoop_HDFSInterface();
        }
        return this;
    }
    
    
    
    //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/partitioner/hadoop/HDFSInterface.x10"
    final public void __fieldInitializers_org_acacia_partitioner_hadoop_HDFSInterface() {
        
    }
    }
    
    