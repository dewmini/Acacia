package org.acacia.util;


@x10.runtime.impl.java.X10Generated
public class Utils extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Utils> $RTT = 
        x10.rtt.NamedType.<Utils> make("org.acacia.util.Utils",
                                       Utils.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.util.Utils $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Utils.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.util.Utils $_obj = new org.acacia.util.Utils((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Utils(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static java.lang.String getHostName() {
        
        //#line 13 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final java.lang.String hostName = x10.lang.System.getenv(((java.lang.String)("HOSTNAME")));
        
        //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final boolean t$21909 = ((hostName) != (null));
        
        //#line 15 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        if (t$21909) {
            
            //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            return hostName;
        } else {
            
            //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            java.lang.String hstNm = null;
            
            //#line 20 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            try {{
                
                //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.net.InetAddress t$21906 = java.net.InetAddress.getLocalHost();
                
                //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String t$21907 = t$21906.getHostName();
                
                //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                hstNm = ((java.lang.String)(t$21907));
            }}catch (final java.net.UnknownHostException e) {
                
                //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                e.printStackTrace();
            }
            
            //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21908 = ((java.lang.String)(hstNm));
            
            //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            return t$21908;
        }
    }
    
    
    //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static boolean isPublic$O(final java.lang.String hostName) {
        
        //#line 31 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        boolean result = false;
        
        //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        try {{
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21910 = ((java.lang.String)(org.acacia.util.Conts.ACACIA_SERVER_PUBLIC_HOSTS_FILE));
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21911 = "machines_public.txt";
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.File input = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$21911)));
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.ReaderIterator t$21961 = input.lines();
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.lang.Iterator line$21962 = ((x10.lang.Iterator<java.lang.String>)
                                                   ((x10.io.ReaderIterator<java.lang.String>)t$21961).iterator());
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            for (;
                 true;
                 ) {
                
                //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21963 = ((x10.lang.Iterator<java.lang.String>)line$21962).hasNext$O();
                
                //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (!(t$21963)) {
                    
                    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    break;
                }
                
                //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String line$21958 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$21962).next$G()));
                
                //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String t$21959 = (line$21958).trim();
                
                //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21960 = (t$21959).equals(hostName);
                
                //#line 36 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (t$21960) {
                    
                    //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    result = true;
                }
            }
        }}catch (final x10.io.IOException e) {
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.Printer t$21917 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21918 = e.getMessage();
            
            //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            t$21917.println(((java.lang.Object)(t$21918)));
        }
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final boolean t$21919 = result;
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        return t$21919;
    }
    
    
    //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static x10.core.Rail getPublicHostList() {
        
        //#line 48 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        x10.util.ArrayList result = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 50 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        try {{
            
            //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21920 = ((java.lang.String)(org.acacia.util.Conts.ACACIA_SERVER_PUBLIC_HOSTS_FILE));
            
            //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21921 = "machines_public.txt";
            
            //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.File input = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$21921)));
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.ReaderIterator t$21969 = input.lines();
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.lang.Iterator line$21970 = ((x10.lang.Iterator<java.lang.String>)
                                                   ((x10.io.ReaderIterator<java.lang.String>)t$21969).iterator());
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            for (;
                 true;
                 ) {
                
                //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21971 = ((x10.lang.Iterator<java.lang.String>)line$21970).hasNext$O();
                
                //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (!(t$21971)) {
                    
                    //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    break;
                }
                
                //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String line$21964 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$21970).next$G()));
                
                //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String t$21965 = (line$21964).trim();
                
                //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21966 = (!x10.rtt.Equality.equalsequals((t$21965),("")));
                
                //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (t$21966) {
                    
                    //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final x10.util.ArrayList t$21967 = ((x10.util.ArrayList)(result));
                    
                    //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final java.lang.String t$21968 = (line$21964).trim();
                    
                    //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    ((x10.util.ArrayList<java.lang.String>)t$21967).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$21968)));
                }
            }
        }}catch (final x10.io.IOException e) {
            
            //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.Printer t$21929 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21930 = e.getMessage();
            
            //#line 58 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            t$21929.println(((java.lang.Object)(t$21930)));
        }
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final x10.util.ArrayList t$21931 = ((x10.util.ArrayList)(result));
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final x10.core.Rail t$21932 = ((x10.core.Rail<java.lang.String>)
                                        ((x10.util.ArrayList<java.lang.String>)t$21931).toRail());
        
        //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        return t$21932;
    }
    
    
    //#line 64 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static x10.core.Rail getPrivateHostList() {
        
        //#line 65 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        x10.util.ArrayList result = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 67 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        try {{
            
            //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21933 = ((java.lang.String)(org.acacia.util.Conts.ACACIA_SERVER_PRIVATE_HOSTS_FILE));
            
            //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21934 = "machines.txt";
            
            //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.File input = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$21934)));
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.ReaderIterator t$21975 = input.lines();
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.lang.Iterator line$21976 = ((x10.lang.Iterator<java.lang.String>)
                                                   ((x10.io.ReaderIterator<java.lang.String>)t$21975).iterator());
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            for (;
                 true;
                 ) {
                
                //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21977 = ((x10.lang.Iterator<java.lang.String>)line$21976).hasNext$O();
                
                //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (!(t$21977)) {
                    
                    //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    break;
                }
                
                //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String line$21972 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$21976).next$G()));
                
                //#line 70 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final x10.util.ArrayList t$21973 = ((x10.util.ArrayList)(result));
                
                //#line 70 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String t$21974 = (line$21972).trim();
                
                //#line 70 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                ((x10.util.ArrayList<java.lang.String>)t$21973).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$21974)));
            }
        }}catch (final x10.io.IOException e) {
            
            //#line 73 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.Printer t$21940 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 73 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21941 = e.getMessage();
            
            //#line 73 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            t$21940.println(((java.lang.Object)(t$21941)));
        }
        
        //#line 76 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final x10.util.ArrayList t$21942 = ((x10.util.ArrayList)(result));
        
        //#line 76 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final x10.core.Rail t$21943 = ((x10.core.Rail<java.lang.String>)
                                        ((x10.util.ArrayList<java.lang.String>)t$21942).toRail());
        
        //#line 76 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        return t$21943;
    }
    
    
    //#line 79 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static x10.util.HashMap getBatchUploadFileList() {
        
        //#line 92 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        final x10.util.HashMap result = new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
        
        //#line 94 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        try {{
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21944 = ((java.lang.String)(org.acacia.util.Conts.BATCH_UPLOAD_FILE_LIST));
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21945 = "conf/batch-upload.txt";
            
            //#line 95 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.File input = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$21945)));
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.ReaderIterator t$21987 = input.lines();
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.lang.Iterator line$21988 = ((x10.lang.Iterator<java.lang.String>)
                                                   ((x10.io.ReaderIterator<java.lang.String>)t$21987).iterator());
            
            //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            for (;
                 true;
                 ) {
                
                //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21989 = ((x10.lang.Iterator<java.lang.String>)line$21988).hasNext$O();
                
                //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (!(t$21989)) {
                    
                    //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    break;
                }
                
                //#line 96 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final java.lang.String line$21978 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$21988).next$G()));
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                boolean t$21979 = (line$21978).startsWith("#");
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (!(t$21979)) {
                    
                    //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    t$21979 = (line$21978).equals("");
                }
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21980 = t$21979;
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                final boolean t$21981 = !(t$21980);
                
                //#line 97 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                if (t$21981) {
                    
                    //#line 98 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    x10.core.Rail arr$21982 = x10.lang.StringHelper.split(":", line$21978);
                    
                    //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final x10.core.Rail t$21983 = ((x10.core.Rail)(arr$21982));
                    
                    //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final java.lang.String t$21984 = ((java.lang.String[])t$21983.value)[(int)0L];
                    
                    //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final x10.core.Rail t$21985 = ((x10.core.Rail)(arr$21982));
                    
                    //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    final java.lang.String t$21986 = ((java.lang.String[])t$21985.value)[(int)1L];
                    
                    //#line 99 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
                    ((x10.util.HashMap<java.lang.String, java.lang.String>)result).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$21984)), ((java.lang.String)(t$21986)));
                }
            }
        }}catch (final x10.io.IOException e) {
            
            //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final x10.io.Printer t$21956 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            final java.lang.String t$21957 = e.getMessage();
            
            //#line 103 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            t$21956.println(((java.lang.Object)(t$21957)));
        }
        
        //#line 106 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        return result;
    }
    
    
    //#line 109 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static java.lang.String call_getRuntimeLocation() {
        try {
            return org.acacia.util.java.Utils_Java.getRuntimeLocation();
        }
        catch (java.lang.Throwable exc$33580) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33580);
        }
        
    }
    
    
    
    //#line 112 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    public static java.lang.String call_getAcaciaProperty(final java.lang.String id$30) {
        try {
            return org.acacia.util.java.Utils_Java.getAcaciaProperty(id$30);
        }
        catch (java.lang.Throwable exc$33581) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$33581);
        }
        
    }
    
    
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    final public org.acacia.util.Utils org$acacia$util$Utils$$this$org$acacia$util$Utils() {
        
        //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
        return org.acacia.util.Utils.this;
    }
    
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    // creation method for java code (1-phase java constructor)
    public Utils() {
        this((java.lang.System[]) null);
        org$acacia$util$Utils$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.util.Utils org$acacia$util$Utils$$init$S() {
         {
            
            //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            
            
            //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
            this.__fieldInitializers_org_acacia_util_Utils();
        }
        return this;
    }
    
    
    
    //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/Utils.x10"
    final public void __fieldInitializers_org_acacia_util_Utils() {
        
    }
}

