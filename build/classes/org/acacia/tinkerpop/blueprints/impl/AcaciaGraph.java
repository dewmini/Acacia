package org.acacia.tinkerpop.blueprints.impl;


@x10.runtime.impl.java.X10Generated
public class AcaciaGraph extends x10.core.Ref implements com.tinkerpop.blueprints.Graph, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaGraph> $RTT = 
        x10.rtt.NamedType.<AcaciaGraph> make("org.acacia.tinkerpop.blueprints.impl.AcaciaGraph",
                                             AcaciaGraph.class,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.Types.getRTT(com.tinkerpop.blueprints.Graph.class)
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.tinkerpop.blueprints.impl.AcaciaGraph $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaGraph.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.tinkerpop.blueprints.impl.AcaciaGraph $_obj = new org.acacia.tinkerpop.blueprints.impl.AcaciaGraph((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public AcaciaGraph(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaGraph() {
        this((java.lang.System[]) null);
        org$acacia$tinkerpop$blueprints$impl$AcaciaGraph$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.tinkerpop.blueprints.impl.AcaciaGraph org$acacia$tinkerpop$blueprints$impl$AcaciaGraph$$init$S() {
         {
            
            //#line 18 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
            
            
            //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
            this.__fieldInitializers_org_acacia_tinkerpop_blueprints_impl_AcaciaGraph();
        }
        return this;
    }
    
    
    
    //#line 22 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.Features getFeatures() {
        
        //#line 23 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.Vertex addVertex(final java.lang.Object a1) {
        
        //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 31 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.Vertex getVertex(final java.lang.Object a1) {
        
        //#line 32 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public void removeVertex(final com.tinkerpop.blueprints.Vertex a1) {
        
    }
    
    
    //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public java.lang.Iterable getVertices() {
        
        //#line 40 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public java.lang.Iterable getVertices(final java.lang.String a1, final java.lang.Object a2) {
        
        //#line 44 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.Edge addEdge(final java.lang.Object a1, final com.tinkerpop.blueprints.Vertex a2, final com.tinkerpop.blueprints.Vertex a3, final java.lang.String a4) {
        
        //#line 48 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 51 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.Edge getEdge(final java.lang.Object a1) {
        
        //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public void removeEdge(final com.tinkerpop.blueprints.Edge a1) {
        
    }
    
    
    //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public java.lang.Iterable getEdges() {
        
        //#line 60 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 63 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public java.lang.Iterable getEdges(final java.lang.String a1, final java.lang.Object a2) {
        
        //#line 64 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 67 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public org.acacia.tinkerpop.blueprints.impl.AcaciaGraphQuery query() {
        
        //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public com.tinkerpop.blueprints.GraphQuery has(final java.lang.String a1, final com.tinkerpop.blueprints.Predicate a2, final java.lang.Object a3) {
        
        //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return null;
    }
    
    
    //#line 75 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    public void shutdown() {
        
    }
    
    
    //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    final public org.acacia.tinkerpop.blueprints.impl.AcaciaGraph org$acacia$tinkerpop$blueprints$impl$AcaciaGraph$$this$org$acacia$tinkerpop$blueprints$impl$AcaciaGraph() {
        
        //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
        return org.acacia.tinkerpop.blueprints.impl.AcaciaGraph.this;
    }
    
    
    //#line 14 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/tinkerpop/blueprints/impl/AcaciaGraph.x10"
    final public void __fieldInitializers_org_acacia_tinkerpop_blueprints_impl_AcaciaGraph() {
        
    }
}

