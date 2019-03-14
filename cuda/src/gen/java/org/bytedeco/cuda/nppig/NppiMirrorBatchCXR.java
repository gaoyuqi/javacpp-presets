// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppig;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppig.*;


/** \} image_mirror */

/** \defgroup mirror_batch MirrorBatch
 *  Mirrors batches of images horizontally, vertically or diagonally.
 *
 * MirrorBatch generally takes the same parameter list as Mirror except that there is a list of N instances of those parameters (N > 1) 
 * and that list is passed in device memory.  A convenient data structure is provided that allows for easy initialization of the 
 * parameter lists.  The only restriction on these functions is that there is one single ROI and a single mirror flag which are
 * applied respectively to each image in the batch.  The primary purpose of this function is to
 * provide improved performance for batches of smaller images as long as GPU resources are available.  Therefore it is recommended
 * that the function not be used for very large images as there may not be resources available for processing several large images
 * simultaneously.  
 *
 * <h3><a name="CommonMirrorBatchParameters">Common parameters for nppiMirrorBatch non-inplace and inplace functions include:</a></h3>
 *
 * @param oSizeROI \ref roi_specification.
 * @param flip Specifies the axis about which the images are to be mirrored.
 * @param pBatchList Device memory pointer to nBatchSize list of NppiMirrorBatchCXR structures.
 * @param nBatchSize Number of NppiMirrorBatchCXR structures in this call (must be > 1).
 * @return \ref image_data_error_codes, \ref roi_error_codes, \ref mirror_error_codes
 *
 * \{
 *
 */

@Properties(inherit = org.bytedeco.cuda.presets.nppig.class)
public class NppiMirrorBatchCXR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiMirrorBatchCXR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiMirrorBatchCXR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiMirrorBatchCXR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiMirrorBatchCXR position(long position) {
        return (NppiMirrorBatchCXR)super.position(position);
    }

    @MemberGetter public native @Const Pointer pSrc();  /* device memory pointer, ignored for in place versions */
    public native int nSrcStep(); public native NppiMirrorBatchCXR nSrcStep(int nSrcStep);
    public native Pointer pDst(); public native NppiMirrorBatchCXR pDst(Pointer pDst);        /* device memory pointer */
    public native int nDstStep(); public native NppiMirrorBatchCXR nDstStep(int nDstStep);
}
