package org.acacia.util;

@x10.runtime.impl.java.X10Generated
public class PlaceToNodeMapper extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PlaceToNodeMapper> $RTT = 
        x10.rtt.NamedType.<PlaceToNodeMapper> make("org.acacia.util.PlaceToNodeMapper",
                                                   PlaceToNodeMapper.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.util.PlaceToNodeMapper $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + PlaceToNodeMapper.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.util.PlaceToNodeMapper $_obj = new org.acacia.util.PlaceToNodeMapper((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public PlaceToNodeMapper(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 9 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    public static java.lang.String getHost(final long placeID) {
        
        //#line 10 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        java.lang.String result = null;
        
        //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.lang.PlaceGroup t$33527 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33528 = t$33527.size$O();
        
        //#line 11 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int nPlaces = ((int)(long)(((long)(t$33528))));
        
        //#line 12 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.core.Rail hostList = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33529 = ((x10.core.Rail<java.lang.String>)hostList).size;
        
        //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long hostID = ((placeID) % (((long)(t$33529))));
        
        //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final java.lang.String t$33530 = ((java.lang.String[])hostList.value)[(int)hostID];
        
        //#line 16 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        result = ((java.lang.String)(t$33530));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final java.lang.String t$33531 = ((java.lang.String)(result));
        
        //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        return t$33531;
    }
    
    
    //#line 21 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    public static int getInstancePort$O(final long placeID) {
        
        //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        int port = org.acacia.util.java.Conts_Java.ACACIA_INSTANCE_PORT;
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.lang.PlaceGroup t$33532 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33533 = t$33532.size$O();
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int nPlaces = ((int)(long)(((long)(t$33533))));
        
        //#line 24 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.core.Rail hostList = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33534 = ((x10.core.Rail<java.lang.String>)hostList).size;
        
        //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int hostCount = ((int)(long)(((long)(t$33534))));
        
        //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33535 = ((long)(((int)(hostCount))));
        
        //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long hostID = ((placeID) % (((long)(t$33535))));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33536 = ((placeID) - (((long)(hostID))));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33537 = ((int)(long)(((long)(t$33536))));
        
        //#line 28 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int withinPlaceIndex = ((t$33537) / (((int)(hostCount))));
        
        //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33538 = port;
        
        //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33539 = ((t$33538) + (((int)(withinPlaceIndex))));
        
        //#line 30 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        return t$33539;
    }
    
    
    //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    public static int getFileTransferServicePort$O(final long placeID) {
        
        //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.lang.PlaceGroup t$33540 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33541 = t$33540.size$O();
        
        //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int nPlaces = ((int)(long)(((long)(t$33541))));
        
        //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final x10.core.Rail hostList = org.acacia.util.Utils.getPrivateHostList();
        
        //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33542 = ((x10.core.Rail<java.lang.String>)hostList).size;
        
        //#line 37 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int hostCount = ((int)(long)(((long)(t$33542))));
        
        //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33543 = org.acacia.util.java.Conts_Java.ACACIA_INSTANCE_PORT;
        
        //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33544 = ((nPlaces) / (((int)(hostCount))));
        
        //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        int port = ((t$33543) + (((int)(t$33544))));
        
        //#line 40 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33545 = ((long)(((int)(hostCount))));
        
        //#line 40 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long hostID = ((placeID) % (((long)(t$33545))));
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final long t$33546 = ((placeID) - (((long)(hostID))));
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33547 = ((int)(long)(((long)(t$33546))));
        
        //#line 41 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int withinPlaceIndex = ((t$33547) / (((int)(hostCount))));
        
        //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33548 = port;
        
        //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        final int t$33549 = ((t$33548) + (((int)(withinPlaceIndex))));
        
        //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        return t$33549;
    }
    
    
    //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    final public org.acacia.util.PlaceToNodeMapper org$acacia$util$PlaceToNodeMapper$$this$org$acacia$util$PlaceToNodeMapper() {
        
        //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
        return org.acacia.util.PlaceToNodeMapper.this;
    }
    
    
    //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    // creation method for java code (1-phase java constructor)
    public PlaceToNodeMapper() {
        this((java.lang.System[]) null);
        org$acacia$util$PlaceToNodeMapper$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.util.PlaceToNodeMapper org$acacia$util$PlaceToNodeMapper$$init$S() {
         {
            
            //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
            
            
            //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
            this.__fieldInitializers_org_acacia_util_PlaceToNodeMapper();
        }
        return this;
    }
    
    
    
    //#line 7 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/util/PlaceToNodeMapper.x10"
    final public void __fieldInitializers_org_acacia_util_PlaceToNodeMapper() {
        
    }
}

