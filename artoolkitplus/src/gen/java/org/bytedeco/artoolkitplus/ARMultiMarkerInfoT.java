// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARMultiMarkerInfoT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMultiMarkerInfoT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARMultiMarkerInfoT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMultiMarkerInfoT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARMultiMarkerInfoT position(long position) {
        return (ARMultiMarkerInfoT)super.position(position);
    }

    public native ARMultiEachMarkerInfoT marker(); public native ARMultiMarkerInfoT marker(ARMultiEachMarkerInfoT marker);
    public native int marker_num(); public native ARMultiMarkerInfoT marker_num(int marker_num);
    public native @Cast("ARFloat") float trans(int i, int j); public native ARMultiMarkerInfoT trans(int i, int j, float trans);
    @MemberGetter public native @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer trans();
    public native int prevF(); public native ARMultiMarkerInfoT prevF(int prevF);
/*---*/
    public native @Cast("ARFloat") float transR(int i, int j); public native ARMultiMarkerInfoT transR(int i, int j, float transR);
    @MemberGetter public native @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer transR();
}
