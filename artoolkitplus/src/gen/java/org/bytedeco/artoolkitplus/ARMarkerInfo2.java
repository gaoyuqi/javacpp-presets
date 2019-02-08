// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARMarkerInfo2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMarkerInfo2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARMarkerInfo2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMarkerInfo2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARMarkerInfo2 position(long position) {
        return (ARMarkerInfo2)super.position(position);
    }

    public native int area(); public native ARMarkerInfo2 area(int area);
    public native @Cast("ARFloat") float pos(int i); public native ARMarkerInfo2 pos(int i, float pos);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer pos();
    public native int coord_num(); public native ARMarkerInfo2 coord_num(int coord_num);
    public native int x_coord(int i); public native ARMarkerInfo2 x_coord(int i, int x_coord);
    @MemberGetter public native IntPointer x_coord();
    public native int y_coord(int i); public native ARMarkerInfo2 y_coord(int i, int y_coord);
    @MemberGetter public native IntPointer y_coord();
    public native int vertex(int i); public native ARMarkerInfo2 vertex(int i, int vertex);
    @MemberGetter public native IntPointer vertex();
}
