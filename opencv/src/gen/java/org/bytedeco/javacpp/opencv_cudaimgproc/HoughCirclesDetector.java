// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_cudaimgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_cudaarithm.*;
import static org.bytedeco.javacpp.opencv_cudaarithm.opencv_cudaarithm.*;
import org.bytedeco.javacpp.opencv_cudafilters.*;
import static org.bytedeco.javacpp.opencv_cudafilters.opencv_cudafilters.*;

import static org.bytedeco.javacpp.opencv_cudaimgproc.opencv_cudaimgproc.*;


//////////////////////////////////////
// HoughCircles

/** \brief Base class for circles detector algorithm. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.javacpp.opencv_cudaimgproc.opencv_cudaimgproc_presets.class)
public class HoughCirclesDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HoughCirclesDetector(Pointer p) { super(p); }

    /** \brief Finds circles in a grayscale image using the Hough transform.
    <p>
    @param src 8-bit, single-channel grayscale input image.
    @param circles Output vector of found circles. Each vector is encoded as a 3-element
    floating-point vector \f$(x, y, radius)\f$ .
    @param stream Stream for the asynchronous version.
    <p>
    @see HoughCircles
     */
    public native void detect(@ByVal Mat src, @ByVal Mat circles, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat src, @ByVal Mat circles);
    public native void detect(@ByVal UMat src, @ByVal UMat circles, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat src, @ByVal UMat circles);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat circles, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat circles);

    public native void setDp(float dp);
    public native float getDp();

    public native void setMinDist(float minDist);
    public native float getMinDist();

    public native void setCannyThreshold(int cannyThreshold);
    public native int getCannyThreshold();

    public native void setVotesThreshold(int votesThreshold);
    public native int getVotesThreshold();

    public native void setMinRadius(int minRadius);
    public native int getMinRadius();

    public native void setMaxRadius(int maxRadius);
    public native int getMaxRadius();

    public native void setMaxCircles(int maxCircles);
    public native int getMaxCircles();
}