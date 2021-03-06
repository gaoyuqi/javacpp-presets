// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** This is an internal structure. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2TimeStep extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2TimeStep() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2TimeStep(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2TimeStep(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2TimeStep position(long position) {
        return (b2TimeStep)super.position(position);
    }

	public native @Cast("float32") float dt(); public native b2TimeStep dt(float dt);			// time step
	public native @Cast("float32") float inv_dt(); public native b2TimeStep inv_dt(float inv_dt);		// inverse time step (0 if dt == 0).
	public native @Cast("float32") float dtRatio(); public native b2TimeStep dtRatio(float dtRatio);	// dt * inv_dt0
	public native @Cast("int32") int velocityIterations(); public native b2TimeStep velocityIterations(int velocityIterations);
	public native @Cast("int32") int positionIterations(); public native b2TimeStep positionIterations(int positionIterations);
	public native @Cast("int32") int particleIterations(); public native b2TimeStep particleIterations(int particleIterations);
	public native @Cast("bool") boolean warmStarting(); public native b2TimeStep warmStarting(boolean warmStarting);
}
