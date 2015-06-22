package org.acacia.frontend;


@x10.runtime.impl.java.X10Generated
public class AcaciaGremlinInterpreter extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AcaciaGremlinInterpreter> $RTT = 
        x10.rtt.NamedType.<AcaciaGremlinInterpreter> make("org.acacia.frontend.AcaciaGremlinInterpreter",
                                                          AcaciaGremlinInterpreter.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.acacia.frontend.AcaciaGremlinInterpreter $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + AcaciaGremlinInterpreter.class + " calling"); } 
        $_obj.buff = $deserializer.readObject();
        $_obj.out = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        org.acacia.frontend.AcaciaGremlinInterpreter $_obj = new org.acacia.frontend.AcaciaGremlinInterpreter((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.buff);
        $serializer.write(this.out);
        
    }
    
    // constructor just for allocation
    public AcaciaGremlinInterpreter(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 26 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    public java.io.BufferedReader buff;
    
    //#line 27 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    public java.io.PrintWriter out;
    
    
    //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaGremlinInterpreter() {
        this((java.lang.System[]) null);
        org$acacia$frontend$AcaciaGremlinInterpreter$$init$S();
    }
    
    // constructor for non-virtual call
    final public org.acacia.frontend.AcaciaGremlinInterpreter org$acacia$frontend$AcaciaGremlinInterpreter$$init$S() {
         {
            
            //#line 29 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            
            
            //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            this.__fieldInitializers_org_acacia_frontend_AcaciaGremlinInterpreter();
        }
        return this;
    }
    
    
    
    //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    // creation method for java code (1-phase java constructor)
    public AcaciaGremlinInterpreter(final java.io.BufferedReader b, final java.io.PrintWriter o) {
        this((java.lang.System[]) null);
        org$acacia$frontend$AcaciaGremlinInterpreter$$init$S(b, o);
    }
    
    // constructor for non-virtual call
    final public org.acacia.frontend.AcaciaGremlinInterpreter org$acacia$frontend$AcaciaGremlinInterpreter$$init$S(final java.io.BufferedReader b, final java.io.PrintWriter o) {
         {
            
            //#line 33 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            
            
            //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            this.__fieldInitializers_org_acacia_frontend_AcaciaGremlinInterpreter();
            
            //#line 34 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            this.buff = ((java.io.BufferedReader)(b));
            
            //#line 35 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            this.out = ((java.io.PrintWriter)(o));
        }
        return this;
    }
    
    
    
    //#line 39 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    public void run() {
        
        //#line 40 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
        java.lang.String msg = null;
        
        //#line 42 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
        try {{
            
            //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.BufferedReader t$33365 = ((java.io.BufferedReader)(this.buff));
            
            //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33366 = t$33365.readLine();
            
            //#line 43 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            msg = ((java.lang.String)(t$33366));
            
            //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            while (true) {
                
                //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.lang.String t$33367 = ((java.lang.String)(msg));
                
                //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.lang.String t$33368 = ((java.lang.String)(org.acacia.frontend.AcaciaFrontEndProtocol.EXIT));
                
                //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final boolean t$33369 = (t$33367).equals(t$33368);
                
                //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final boolean t$33374 = !(t$33369);
                
                //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                if (!(t$33374)) {
                    
                    //#line 45 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                    break;
                }
                
                //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.io.PrintWriter t$33409 = ((java.io.PrintWriter)(this.out));
                
                //#line 47 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                t$33409.println(((java.lang.String)("abc")));
                
                //#line 48 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.io.PrintWriter t$33410 = ((java.io.PrintWriter)(this.out));
                
                //#line 48 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                t$33410.flush();
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.io.BufferedReader t$33411 = ((java.io.BufferedReader)(this.buff));
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.lang.String t$33412 = t$33411.readLine();
                
                //#line 49 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                msg = ((java.lang.String)(t$33412));
            }
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33376 = ((java.io.PrintWriter)(this.out));
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33375 = ((java.lang.String)(msg));
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33377 = (("exit : ") + (t$33375));
            
            //#line 52 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33376.println(((java.lang.String)(t$33377)));
            
            //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.BufferedReader t$33378 = ((java.io.BufferedReader)(this.buff));
            
            //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33379 = t$33378.readLine();
            
            //#line 53 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            msg = ((java.lang.String)(t$33379));
            
            //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33381 = ((java.io.PrintWriter)(this.out));
            
            //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33380 = ((java.lang.String)(msg));
            
            //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33382 = (("exit : ") + (t$33380));
            
            //#line 54 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33381.println(((java.lang.String)(t$33382)));
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33383 = ((java.io.PrintWriter)(this.out));
            
            //#line 55 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33383.flush();
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngineFactory t$33384 = ((com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngineFactory)(new com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngineFactory()));
            
            //#line 59 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            javax.script.ScriptEngine engine = t$33384.getScriptEngine();
            
            //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.ScriptEngine t$33385 = ((javax.script.ScriptEngine)(engine));
            
            //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final boolean t$33388 = ((t$33385) == (null));
            
            //#line 61 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            if (t$33388) {
                
                //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.io.PrintWriter t$33386 = ((java.io.PrintWriter)(this.out));
                
                //#line 62 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                t$33386.println(((java.lang.String)("Could not get the engine")));
                
                //#line 63 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                final java.io.PrintWriter t$33387 = ((java.io.PrintWriter)(this.out));
                
                //#line 63 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
                t$33387.flush();
            }
            
            //#line 66 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.ScriptEngine t$33389 = ((javax.script.ScriptEngine)(engine));
            
            //#line 66 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            javax.script.Bindings bindings = t$33389.createBindings();
            
            //#line 67 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            org.acacia.tinkerpop.blueprints.impl.AcaciaGraph graph = new org.acacia.tinkerpop.blueprints.impl.AcaciaGraph((java.lang.System[]) null).org$acacia$tinkerpop$blueprints$impl$AcaciaGraph$$init$S();
            
            //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final org.acacia.tinkerpop.blueprints.impl.AcaciaGraph t$33390 = ((org.acacia.tinkerpop.blueprints.impl.AcaciaGraph)(graph));
            
            //#line 68 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33390.addVertex(((java.lang.Object)("v1")));
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.Bindings t$33391 = ((javax.script.Bindings)(bindings));
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final org.acacia.tinkerpop.blueprints.impl.AcaciaGraph t$33392 = ((org.acacia.tinkerpop.blueprints.impl.AcaciaGraph)(graph));
            
            //#line 69 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33391.put(((java.lang.String)("g")), ((java.lang.Object)(t$33392)));
            
            //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.ScriptEngine t$33393 = ((javax.script.ScriptEngine)(engine));
            
            //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.Bindings t$33394 = ((javax.script.Bindings)(bindings));
            
            //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.Object t$33395 = t$33393.eval(((java.lang.String)("g.V[1].name")), ((javax.script.Bindings)(t$33394)));
            
            //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33396 = (("") + (t$33395));
            
            //#line 71 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            msg = ((java.lang.String)(t$33396));
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33398 = ((java.io.PrintWriter)(this.out));
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33397 = ((java.lang.String)(msg));
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33399 = (("uuu : ") + (t$33397));
            
            //#line 72 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33398.println(((java.lang.String)(t$33399)));
            
            //#line 73 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33400 = ((java.io.PrintWriter)(this.out));
            
            //#line 73 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33400.flush();
        }}catch (java.io.IOException e) {
            
            //#line 77 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33402 = ((java.io.PrintWriter)(this.out));
            
            //#line 77 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.IOException t$33401 = ((java.io.IOException)(e));
            
            //#line 77 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33403 = t$33401.getMessage();
            
            //#line 77 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33402.println(((java.lang.String)(t$33403)));
            
            //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33404 = ((java.io.PrintWriter)(this.out));
            
            //#line 78 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33404.flush();
        }catch (javax.script.ScriptException ex) {
            
            //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33406 = ((java.io.PrintWriter)(this.out));
            
            //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final javax.script.ScriptException t$33405 = ((javax.script.ScriptException)(ex));
            
            //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.lang.String t$33407 = t$33405.getMessage();
            
            //#line 81 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33406.println(((java.lang.String)(t$33407)));
            
            //#line 82 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            final java.io.PrintWriter t$33408 = ((java.io.PrintWriter)(this.out));
            
            //#line 82 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
            t$33408.flush();
        }
    }
    
    
    //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    final public org.acacia.frontend.AcaciaGremlinInterpreter org$acacia$frontend$AcaciaGremlinInterpreter$$this$org$acacia$frontend$AcaciaGremlinInterpreter() {
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
        return org.acacia.frontend.AcaciaGremlinInterpreter.this;
    }
    
    
    //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
    final public void __fieldInitializers_org_acacia_frontend_AcaciaGremlinInterpreter() {
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
        this.buff = null;
        
        //#line 25 "/home/yasima/Acacia/x10dt/workspace/Acaciagit/src/org/acacia/frontend/AcaciaGremlinInterpreter.x10"
        this.out = null;
    }
}

