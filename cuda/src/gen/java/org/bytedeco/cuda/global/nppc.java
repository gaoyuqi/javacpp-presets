// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.global;

import org.bytedeco.cuda.nppc.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nppc extends org.bytedeco.cuda.presets.nppc {
    static { Loader.load(); }

// Parsed from <npp.h>

 /* Copyright 2009-2016 NVIDIA Corporation.  All rights reserved. 
  * 
  * NOTICE TO LICENSEE: 
  * 
  * The source code and/or documentation ("Licensed Deliverables") are 
  * subject to NVIDIA intellectual property rights under U.S. and 
  * international Copyright laws. 
  * 
  * The Licensed Deliverables contained herein are PROPRIETARY and 
  * CONFIDENTIAL to NVIDIA and are being provided under the terms and 
  * conditions of a form of NVIDIA software license agreement by and 
  * between NVIDIA and Licensee ("License Agreement") or electronically 
  * accepted by Licensee.  Notwithstanding any terms or conditions to 
  * the contrary in the License Agreement, reproduction or disclosure 
  * of the Licensed Deliverables to any third party without the express 
  * written consent of NVIDIA is prohibited. 
  * 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE 
  * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  THEY ARE 
  * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND. 
  * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED 
  * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY, 
  * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE. 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY 
  * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY 
  * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, 
  * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS 
  * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE 
  * OF THESE LICENSED DELIVERABLES. 
  * 
  * U.S. Government End Users.  These Licensed Deliverables are a 
  * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT 
  * 1995), consisting of "commercial computer software" and "commercial 
  * computer software documentation" as such terms are used in 48 
  * C.F.R. 12.212 (SEPT 1995) and are provided to the U.S. Government 
  * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and 
  * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all 
  * U.S. Government End Users acquire the Licensed Deliverables with 
  * only those rights set forth herein. 
  * 
  * Any use of the Licensed Deliverables in individual and commercial 
  * software must include, in the user documentation and internal 
  * comments to the code, the above Disclaimer and U.S. Government End 
  * Users Notice. 
  */ 
// #ifndef NV_NPP_H
// #define NV_NPP_H
 
/**
 * \file npp.h
 * Main include file for NPP library. 
 *      Aggregates all other include files.
 */

// #include <nppversion.h>

// #include <nppdefs.h>
// #include <nppcore.h>
// #include <nppi.h>
// #include <npps.h>

// #endif // NV_NPP_H


// Parsed from <nppversion.h>

 /* Copyright 2009-2011 NVIDIA Corporation.  All rights reserved. 
  * 
  * NOTICE TO LICENSEE: 
  * 
  * The source code and/or documentation ("Licensed Deliverables") are 
  * subject to NVIDIA intellectual property rights under U.S. and 
  * international Copyright laws. 
  * 
  * The Licensed Deliverables contained herein are PROPRIETARY and 
  * CONFIDENTIAL to NVIDIA and are being provided under the terms and 
  * conditions of a form of NVIDIA software license agreement by and 
  * between NVIDIA and Licensee ("License Agreement") or electronically 
  * accepted by Licensee.  Notwithstanding any terms or conditions to 
  * the contrary in the License Agreement, reproduction or disclosure 
  * of the Licensed Deliverables to any third party without the express 
  * written consent of NVIDIA is prohibited. 
  * 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE 
  * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  THEY ARE 
  * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND. 
  * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED 
  * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY, 
  * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE. 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY 
  * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY 
  * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, 
  * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS 
  * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE 
  * OF THESE LICENSED DELIVERABLES. 
  * 
  * U.S. Government End Users.  These Licensed Deliverables are a 
  * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT 
  * 1995), consisting of "commercial computer software" and "commercial 
  * computer software documentation" as such terms are used in 48 
  * C.F.R. 12.212 (SEPT 1995) and are provided to the U.S. Government 
  * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and 
  * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all 
  * U.S. Government End Users acquire the Licensed Deliverables with 
  * only those rights set forth herein. 
  * 
  * Any use of the Licensed Deliverables in individual and commercial 
  * software must include, in the user documentation and internal 
  * comments to the code, the above Disclaimer and U.S. Government End 
  * Users Notice. 
  */ 
// #ifndef NV_NPP_VERSION_H
// #define NV_NPP_VERSION_H

/**
 * \file nppversion.h
 *
 * NPP version information
 *
 * This file contains \#defines with the various versioning information.
 *  A user should not directly rely on these defines but rather use 
 *  nppGetLibVersion to obtain this information.
 */

// #ifdef __cplusplus
// #endif

public static final int NPP_VERSION_MAJOR = 10;
public static final int NPP_VERSION_MINOR = 0;
public static final int NPP_VERSION_BUILD = 130;

// #ifdef __cplusplus /* extern "C" */
// #endif


// #endif /* NV_NPPI_VERSION_H */


// Parsed from <nppdefs.h>

 /* Copyright 2009-2016 NVIDIA Corporation.  All rights reserved. 
  * 
  * NOTICE TO LICENSEE: 
  * 
  * The source code and/or documentation ("Licensed Deliverables") are 
  * subject to NVIDIA intellectual property rights under U.S. and 
  * international Copyright laws. 
  * 
  * The Licensed Deliverables contained herein are PROPRIETARY and 
  * CONFIDENTIAL to NVIDIA and are being provided under the terms and 
  * conditions of a form of NVIDIA software license agreement by and 
  * between NVIDIA and Licensee ("License Agreement") or electronically 
  * accepted by Licensee.  Notwithstanding any terms or conditions to 
  * the contrary in the License Agreement, reproduction or disclosure 
  * of the Licensed Deliverables to any third party without the express 
  * written consent of NVIDIA is prohibited. 
  * 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE 
  * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  THEY ARE 
  * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND. 
  * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED 
  * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY, 
  * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE. 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY 
  * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY 
  * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, 
  * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS 
  * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE 
  * OF THESE LICENSED DELIVERABLES. 
  * 
  * U.S. Government End Users.  These Licensed Deliverables are a 
  * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT 
  * 1995), consisting of "commercial computer software" and "commercial 
  * computer software documentation" as such terms are used in 48 
  * C.F.R. 12.212 (SEPT 1995) and are provided to the U.S. Government 
  * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and 
  * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all 
  * U.S. Government End Users acquire the Licensed Deliverables with 
  * only those rights set forth herein. 
  * 
  * Any use of the Licensed Deliverables in individual and commercial 
  * software must include, in the user documentation and internal 
  * comments to the code, the above Disclaimer and U.S. Government End 
  * Users Notice. 
  */ 
// #ifndef NV_NPPIDEFS_H
// #define NV_NPPIDEFS_H

// #include <stdlib.h>
// #include <cuda_runtime.h>

/**
 * \file nppdefs.h
 * Typedefinitions and macros for NPP library.
 */
 

// #ifdef __cplusplus
// #endif

        // If this is a 32-bit Windows compile, don't align to 16-byte at all
        // and use a "union-trick" to create 8-byte alignment.
// #if defined(_WIN32) && !defined(_WIN64)

            // On 32-bit Windows platforms, do not force 8-byte alignment.
            //   This is a consequence of a limitation of that platform.
//     #define NPP_ALIGN_8
            // On 32-bit Windows platforms, do not force 16-byte alignment.
            //   This is a consequence of a limitation of that platform.
//     #define NPP_ALIGN_16

// #else /* _WIN32 && !_WIN64 */

//     #define NPP_ALIGN_8     __align__(8)
//     #define NPP_ALIGN_16    __align__(16)

// #endif /* !__CUDACC__ && _WIN32 && !_WIN64 */


/** \defgroup typedefs_npp NPP Type Definitions and Constants
 * \{
 */

/** 
 * Filtering methods.
 */
/** enum NppiInterpolationMode */
public static final int
    NPPI_INTER_UNDEFINED         = 0,
    /**  Nearest neighbor filtering. */
    NPPI_INTER_NN                = 1,
    /**  Linear interpolation. */
    NPPI_INTER_LINEAR            = 2,
    /**  Cubic interpolation. */
    NPPI_INTER_CUBIC             = 4,
    /**  Two-parameter cubic filter (B=1, C=0) */
    NPPI_INTER_CUBIC2P_BSPLINE = 5,
    /**  Two-parameter cubic filter (B=0, C=1/2) */
    NPPI_INTER_CUBIC2P_CATMULLROM = 6,
    /**  Two-parameter cubic filter (B=1/2, C=3/10) */
    NPPI_INTER_CUBIC2P_B05C03 = 7,
    /**  Super sampling. */
    NPPI_INTER_SUPER             = 8,
    /**  Lanczos filtering. */
    NPPI_INTER_LANCZOS           = 16,
    /**  Generic Lanczos filtering with order 3. */
    NPPI_INTER_LANCZOS3_ADVANCED = 17,
    /**  Smooth edge filtering. */
    NPPI_SMOOTH_EDGE             = (1 << 31); 

/** 
 * Bayer Grid Position Registration.
 */
/** enum NppiBayerGridPosition */
public static final int
    /**  Default registration position. */
    NPPI_BAYER_BGGR         = 0,
    NPPI_BAYER_RGGB         = 1,
    NPPI_BAYER_GBRG         = 2,
    NPPI_BAYER_GRBG         = 3; 

/**
 * Fixed filter-kernel sizes.
 */
/** enum NppiMaskSize */
public static final int
    NPP_MASK_SIZE_1_X_3 = 0,
    NPP_MASK_SIZE_1_X_5 = 1,
    NPP_MASK_SIZE_3_X_1 = 100, // leaving space for more 1 X N type enum values 
    NPP_MASK_SIZE_5_X_1 = 101,
    NPP_MASK_SIZE_3_X_3 = 200, // leaving space for more N X 1 type enum values
    NPP_MASK_SIZE_5_X_5 = 201,
    NPP_MASK_SIZE_7_X_7 = 400,
    NPP_MASK_SIZE_9_X_9 = 500,
    NPP_MASK_SIZE_11_X_11 = 600,
    NPP_MASK_SIZE_13_X_13 = 700,
    NPP_MASK_SIZE_15_X_15 = 800;

/** 
 * Differential Filter types
 */
 
/** enum NppiDifferentialKernel */
public static final int
    NPP_FILTER_SOBEL = 0,
    NPP_FILTER_SCHARR = 1;

/**
 * Error Status Codes
 *
 * Almost all NPP function return error-status information using
 * these return codes.
 * Negative return codes indicate errors, positive return codes indicate
 * warnings, a return code of 0 indicates success.
 */
/** enum NppStatus */
public static final int
    /* negative return-codes indicate errors */
    NPP_NOT_SUPPORTED_MODE_ERROR            = -9999,  
    
    NPP_INVALID_HOST_POINTER_ERROR          = -1032,
    NPP_INVALID_DEVICE_POINTER_ERROR        = -1031,
    NPP_LUT_PALETTE_BITSIZE_ERROR           = -1030,
    /**  ZeroCrossing mode not supported  */
    NPP_ZC_MODE_NOT_SUPPORTED_ERROR         = -1028,
    NPP_NOT_SUFFICIENT_COMPUTE_CAPABILITY   = -1027,
    NPP_TEXTURE_BIND_ERROR                  = -1024,
    NPP_WRONG_INTERSECTION_ROI_ERROR        = -1020,
    NPP_HAAR_CLASSIFIER_PIXEL_MATCH_ERROR   = -1006,
    NPP_MEMFREE_ERROR                       = -1005,
    NPP_MEMSET_ERROR                        = -1004,
    NPP_MEMCPY_ERROR                        = -1003,
    NPP_ALIGNMENT_ERROR                     = -1002,
    NPP_CUDA_KERNEL_EXECUTION_ERROR         = -1000,

    /** Unsupported round mode*/
    NPP_ROUND_MODE_NOT_SUPPORTED_ERROR      = -213,
    
    /** Image pixels are constant for quality index */
    NPP_QUALITY_INDEX_ERROR                 = -210,

    /** One of the output image dimensions is less than 1 pixel */
    NPP_RESIZE_NO_OPERATION_ERROR           = -201,

    /** Number overflows the upper or lower limit of the data type */
    NPP_OVERFLOW_ERROR                      = -109,
    /** Step value is not pixel multiple */
    NPP_NOT_EVEN_STEP_ERROR                 = -108,
    /** Number of levels for histogram is less than 2 */
    NPP_HISTOGRAM_NUMBER_OF_LEVELS_ERROR    = -107,
    /** Number of levels for LUT is less than 2 */
    NPP_LUT_NUMBER_OF_LEVELS_ERROR          = -106,

    /** Processed data is corrupted */
    NPP_CORRUPTED_DATA_ERROR                = -61,
    /** Wrong order of the destination channels */
    NPP_CHANNEL_ORDER_ERROR                 = -60,
    /** All values of the mask are zero */
    NPP_ZERO_MASK_VALUE_ERROR               = -59,
    /** The quadrangle is nonconvex or degenerates into triangle, line or point */
    NPP_QUADRANGLE_ERROR                    = -58,
    /** Size of the rectangle region is less than or equal to 1 */
    NPP_RECTANGLE_ERROR                     = -57,
    /** Unallowable values of the transformation coefficients   */
    NPP_COEFFICIENT_ERROR                   = -56,

    /** Bad or unsupported number of channels */
    NPP_NUMBER_OF_CHANNELS_ERROR            = -53,
    /** Channel of interest is not 1, 2, or 3 */
    NPP_COI_ERROR                           = -52,
    /** Divisor is equal to zero */
    NPP_DIVISOR_ERROR                       = -51,

    /** Illegal channel index */
    NPP_CHANNEL_ERROR                       = -47,
    /** Stride is less than the row length */
    NPP_STRIDE_ERROR                        = -37,
    
    /** Anchor point is outside mask */
    NPP_ANCHOR_ERROR                        = -34,
    /** Lower bound is larger than upper bound */
    NPP_MASK_SIZE_ERROR                     = -33,

    NPP_RESIZE_FACTOR_ERROR                 = -23,
    NPP_INTERPOLATION_ERROR                 = -22,
    NPP_MIRROR_FLIP_ERROR                   = -21,
    NPP_MOMENT_00_ZERO_ERROR                = -20,
    NPP_THRESHOLD_NEGATIVE_LEVEL_ERROR      = -19,
    NPP_THRESHOLD_ERROR                     = -18,
    NPP_CONTEXT_MATCH_ERROR                 = -17,
    NPP_FFT_FLAG_ERROR                      = -16,
    NPP_FFT_ORDER_ERROR                     = -15,
    /**  Step is less or equal zero */
    NPP_STEP_ERROR                          = -14,
    NPP_SCALE_RANGE_ERROR                   = -13,
    NPP_DATA_TYPE_ERROR                     = -12,
    NPP_OUT_OFF_RANGE_ERROR                 = -11,
    NPP_DIVIDE_BY_ZERO_ERROR                = -10,
    NPP_MEMORY_ALLOCATION_ERR               = -9,
    NPP_NULL_POINTER_ERROR                  = -8,
    NPP_RANGE_ERROR                         = -7,
    NPP_SIZE_ERROR                          = -6,
    NPP_BAD_ARGUMENT_ERROR                  = -5,
    NPP_NO_MEMORY_ERROR                     = -4,
    NPP_NOT_IMPLEMENTED_ERROR               = -3,
    NPP_ERROR                               = -2,
    NPP_ERROR_RESERVED                      = -1,
    
    /* success */
    /**  Error free operation */
    NPP_NO_ERROR                            = 0,
    /**  Successful operation (same as NPP_NO_ERROR) */
    NPP_SUCCESS = NPP_NO_ERROR,

    /* positive return-codes indicate warnings */
    /**  Indicates that no operation was performed */
    NPP_NO_OPERATION_WARNING                = 1,
    /**  Divisor is zero however does not terminate the execution */
    NPP_DIVIDE_BY_ZERO_WARNING              = 6,
    /**  Indicates that the quadrangle passed to one of affine warping functions doesn't have necessary properties. First 3 vertices are used, the fourth vertex discarded. */
    NPP_AFFINE_QUAD_INCORRECT_WARNING       = 28,
    /**  The given ROI has no interestion with either the source or destination ROI. Thus no operation was performed. */
    NPP_WRONG_INTERSECTION_ROI_WARNING      = 29,
    /**  The given quadrangle has no intersection with either the source or destination ROI. Thus no operation was performed. */
    NPP_WRONG_INTERSECTION_QUAD_WARNING     = 30,
    /**  Image size isn't multiple of two. Indicates that in case of 422/411/420 sampling the ROI width/height was modified for proper processing. */
    NPP_DOUBLE_SIZE_WARNING                 = 35,
    
    /**  Speed reduction due to uncoalesced memory accesses warning. */
    NPP_MISALIGNED_DST_ROI_WARNING          = 10000;

/** enum NppGpuComputeCapability */
public static final int
    /**  Indicates that the compute-capability query failed */
    NPP_CUDA_UNKNOWN_VERSION = -1,
    /**  Indicates that no CUDA capable device was found */
    NPP_CUDA_NOT_CAPABLE     = 0,
    /**  Indicates that CUDA 1.0 capable device is machine's default device */
    NPP_CUDA_1_0             = 100,
    /**  Indicates that CUDA 1.1 capable device is machine's default device */
    NPP_CUDA_1_1             = 110,
    /**  Indicates that CUDA 1.2 capable device is machine's default device */
    NPP_CUDA_1_2             = 120,
    /**  Indicates that CUDA 1.3 capable device is machine's default device */
    NPP_CUDA_1_3             = 130,
    /**  Indicates that CUDA 2.0 capable device is machine's default device */
    NPP_CUDA_2_0             = 200,
    /**  Indicates that CUDA 2.1 capable device is machine's default device */
    NPP_CUDA_2_1             = 210,
    /**  Indicates that CUDA 3.0 capable device is machine's default device */
    NPP_CUDA_3_0             = 300,
    /**  Indicates that CUDA 3.2 capable device is machine's default device */
    NPP_CUDA_3_2             = 320,
    /**  Indicates that CUDA 3.5 capable device is machine's default device */
    NPP_CUDA_3_5             = 350,
    /**  Indicates that CUDA 3.7 capable device is machine's default device */
    NPP_CUDA_3_7             = 370,
    /**  Indicates that CUDA 5.0 capable device is machine's default device */
    NPP_CUDA_5_0             = 500,
    /**  Indicates that CUDA 5.2 capable device is machine's default device */
    NPP_CUDA_5_2             = 520,
    /**  Indicates that CUDA 5.3 capable device is machine's default device */
    NPP_CUDA_5_3             = 530,
    /**  Indicates that CUDA 6.0 capable device is machine's default device */
    NPP_CUDA_6_0             = 600,
    /**  Indicates that CUDA 6.1 capable device is machine's default device */
    NPP_CUDA_6_1             = 610,
    /**  Indicates that CUDA 6.2 capable device is machine's default device */
    NPP_CUDA_6_2             = 620,
    /**  Indicates that CUDA 6.3 capable device is machine's default device */
    NPP_CUDA_6_3             = 630,
    /**  Indicates that CUDA 7.0 capable device is machine's default device */
    NPP_CUDA_7_0             = 700,
    /**  Indicates that CUDA 7.2 capable device is machine's default device */
    NPP_CUDA_7_2             = 720,
    /**  Indicates that CUDA 7.3 capable device is machine's default device */
    NPP_CUDA_7_3             = 730,
    /**  Indicates that CUDA 7.5 or better is machine's default device */
    NPP_CUDA_7_5             = 750;
// Targeting ../nppc/NppLibraryVersion.java



/** \defgroup npp_basic_types Basic NPP Data Types
 * \{
 */


/**  8-bit unsigned chars */
/**  8-bit signed chars */
/**  16-bit unsigned integers */
/**  16-bit signed integers */
/**  32-bit unsigned integers */
/**  32-bit signed integers */
/**  64-bit unsigned integers */
/**  64-bit signed integers */
/**  32-bit (IEEE) floating-point numbers */
/**  64-bit floating-point numbers */
// Targeting ../nppc/Npp8uc.java


// Targeting ../nppc/Npp16uc.java


// Targeting ../nppc/Npp16sc.java


// Targeting ../nppc/Npp32uc.java


// Targeting ../nppc/Npp32sc.java


// Targeting ../nppc/Npp32fc.java


// Targeting ../nppc/Npp64sc.java


// Targeting ../nppc/Npp64fc.java



/*@}*/

/**  Minimum 8-bit unsigned integer */
public static final int NPP_MIN_8U =      ( 0 );
/**  Maximum 8-bit unsigned integer */
public static final int NPP_MAX_8U =      ( 255 );
/**  Minimum 16-bit unsigned integer */
public static final int NPP_MIN_16U =     ( 0 );
/**  Maximum 16-bit unsigned integer */
public static final int NPP_MAX_16U =     ( 65535 );
/**  Minimum 32-bit unsigned integer */
public static final int NPP_MIN_32U =     ( 0 );
/**  Maximum 32-bit unsigned integer */
public static final long NPP_MAX_32U =     ( 4294967295L );
/**  Minimum 64-bit unsigned integer */
public static final int NPP_MIN_64U =     ( 0 );
/**  Maximum 64-bit unsigned integer */
public static native @MemberGetter long NPP_MAX_64U();
public static final long NPP_MAX_64U = NPP_MAX_64U();

/**  Minimum 8-bit signed integer */
public static final int NPP_MIN_8S =      (-127 - 1 );
/**  Maximum 8-bit signed integer */
public static final int NPP_MAX_8S =      ( 127 );
/**  Minimum 16-bit signed integer */
public static final int NPP_MIN_16S =     (-32767 - 1 );
/**  Maximum 16-bit signed integer */
public static final int NPP_MAX_16S =     ( 32767 );
/**  Minimum 32-bit signed integer */
public static final int NPP_MIN_32S =     (-2147483647 - 1 );
/**  Maximum 32-bit signed integer */
public static final int NPP_MAX_32S =     ( 2147483647 );
/**  Maximum 64-bit signed integer */
public static final long NPP_MAX_64S =     ( 9223372036854775807L );
/**  Minimum 64-bit signed integer */
public static final long NPP_MIN_64S =     (-9223372036854775807L - 1);

/**  Smallest positive 32-bit floating point value */
public static final double NPP_MINABS_32F =  ( 1.175494351e-38f );
/**  Largest  positive 32-bit floating point value */
public static final double NPP_MAXABS_32F =  ( 3.402823466e+38f );
/**  Smallest positive 64-bit floating point value */
public static final double NPP_MINABS_64F =  ( 2.2250738585072014e-308 );
/**  Largest  positive 64-bit floating point value */
public static final double NPP_MAXABS_64F =  ( 1.7976931348623158e+308 );
// Targeting ../nppc/NppiPoint.java


// Targeting ../nppc/NppPointPolar.java


// Targeting ../nppc/NppiSize.java


// Targeting ../nppc/NppiRect.java



/** enum NppiAxis */
public static final int
    NPP_HORIZONTAL_AXIS = 0,
    NPP_VERTICAL_AXIS = 1,
    NPP_BOTH_AXIS = 2;

/** enum NppCmpOp */
public static final int
    NPP_CMP_LESS = 0,
    NPP_CMP_LESS_EQ = 1,
    NPP_CMP_EQ = 2,
    NPP_CMP_GREATER_EQ = 3,
    NPP_CMP_GREATER = 4;

/**
 * Rounding Modes
 *
 * The enumerated rounding modes are used by a large number of NPP primitives
 * to allow the user to specify the method by which fractional values are converted
 * to integer values. Also see \ref rounding_modes.
 *
 * For NPP release 5.5 new names for the three rounding modes are introduced that are
 * based on the naming conventions for rounding modes set forth in the IEEE-754
 * floating-point standard. Developers are encouraged to use the new, longer names
 * to be future proof as the legacy names will be deprecated in subsequent NPP releases.
 *
 */
/** enum NppRoundMode */
public static final int
    /** 
     * Round to the nearest even integer.
     * All fractional numbers are rounded to their nearest integer. The ambiguous
     * cases (i.e. \<integer\>.5) are rounded to the closest even integer.
     * E.g.
     * - roundNear(0.5) = 0
     * - roundNear(0.6) = 1
     * - roundNear(1.5) = 2
     * - roundNear(-1.5) = -2
     */
    NPP_RND_NEAR = 0,
    /** Alias name for ::NPP_RND_NEAR. */
    NPP_ROUND_NEAREST_TIES_TO_EVEN = NPP_RND_NEAR,
    /** 
     * Round according to financial rule.
     * All fractional numbers are rounded to their nearest integer. The ambiguous
     * cases (i.e. \<integer\>.5) are rounded away from zero.
     * E.g.
     * - roundFinancial(0.4)  = 0
     * - roundFinancial(0.5)  = 1
     * - roundFinancial(-1.5) = -2
     */
    NPP_RND_FINANCIAL = NPP_RND_NEAR + 1,
    /** Alias name for ::NPP_RND_FINANCIAL.  */
    NPP_ROUND_NEAREST_TIES_AWAY_FROM_ZERO = NPP_RND_FINANCIAL,
    /**
     * Round towards zero (truncation). 
     * All fractional numbers of the form \<integer\>.\<decimals\> are truncated to
     * \<integer\>.
     * - roundZero(1.5) = 1
     * - roundZero(1.9) = 1
     * - roundZero(-2.5) = -2
     */
    NPP_RND_ZERO = NPP_RND_FINANCIAL + 1,
    /** Alias name for ::NPP_RND_ZERO.  */
    NPP_ROUND_TOWARD_ZERO = NPP_RND_ZERO;
    
    /*
     * Other rounding modes supported by IEEE-754 (2008) floating-point standard:
     *
     * - NPP_ROUND_TOWARD_INFINITY // ceiling
     * - NPP_ROUND_TOWARD_NEGATIVE_INFINITY // floor
     *
     */

/** enum NppiBorderType */
public static final int
    NPP_BORDER_UNDEFINED        = 0,
    NPP_BORDER_NONE             = NPP_BORDER_UNDEFINED, 
    NPP_BORDER_CONSTANT         = 1,
    NPP_BORDER_REPLICATE        = 2,
    NPP_BORDER_WRAP             = 3,
    NPP_BORDER_MIRROR           = 4;


/** enum NppHintAlgorithm */
public static final int
    NPP_ALG_HINT_NONE = 0,
    NPP_ALG_HINT_FAST = 1,
    NPP_ALG_HINT_ACCURATE = 2;

/* 
 * Alpha composition controls. 
 */

/** enum NppiAlphaOp */
public static final int
    NPPI_OP_ALPHA_OVER = 0,
    NPPI_OP_ALPHA_IN = 1,
    NPPI_OP_ALPHA_OUT = 2,
    NPPI_OP_ALPHA_ATOP = 3,
    NPPI_OP_ALPHA_XOR = 4,
    NPPI_OP_ALPHA_PLUS = 5,
    NPPI_OP_ALPHA_OVER_PREMUL = 6,
    NPPI_OP_ALPHA_IN_PREMUL = 7,
    NPPI_OP_ALPHA_OUT_PREMUL = 8,
    NPPI_OP_ALPHA_ATOP_PREMUL = 9,
    NPPI_OP_ALPHA_XOR_PREMUL = 10,
    NPPI_OP_ALPHA_PLUS_PREMUL = 11,
    NPPI_OP_ALPHA_PREMUL = 12;
// Targeting ../nppc/NppiHOGConfig.java



/** max horizontal/vertical pixel size of cell.   */
public static final int NPP_HOG_MAX_CELL_SIZE =                          (16);
/** max horizontal/vertical pixel size of block.  */
public static final int NPP_HOG_MAX_BLOCK_SIZE =                         (64);
/** max number of histogram bins. */
public static final int NPP_HOG_MAX_BINS_PER_CELL =                      (16);
/** max number of cells in a descriptor window.   */
public static final int NPP_HOG_MAX_CELLS_PER_DESCRIPTOR =              (256);
/** max number of overlapping blocks in a descriptor window.   */
public static final int NPP_HOG_MAX_OVERLAPPING_BLOCKS_PER_DESCRIPTOR = (256);
/** max number of descriptor window locations per function call.   */
public static final int NPP_HOG_MAX_DESCRIPTOR_LOCATIONS_PER_CALL =     (128);
// Targeting ../nppc/NppiHaarClassifier_32f.java


// Targeting ../nppc/NppiHaarBuffer.java



/** enum NppsZCType */
public static final int
    /**  sign change */
    nppZCR = 0,
    /**  sign change XOR */
    nppZCXor = 1,
    /**  sign change count_0 */
    nppZCC = 2;

/** enum NppiHuffmanTableType */
public static final int
    /**  DC Table */
    nppiDCTable = 0,
    /**  AC Table */
    nppiACTable = 1;

/** enum NppiNorm */
public static final int
    /**  maximum */
    nppiNormInf = 0,
    /**  sum */
    nppiNormL1 = 1,
    /**  square root of sum of squares */
    nppiNormL2 = 2;


// #ifdef __cplusplus /* extern "C" */
// #endif

/*@}*/
 
// #endif /* NV_NPPIDEFS_H */


// Parsed from <nppcore.h>

 /* Copyright 2009-2016 NVIDIA Corporation.  All rights reserved. 
  * 
  * NOTICE TO LICENSEE: 
  * 
  * The source code and/or documentation ("Licensed Deliverables") are 
  * subject to NVIDIA intellectual property rights under U.S. and 
  * international Copyright laws. 
  * 
  * The Licensed Deliverables contained herein are PROPRIETARY and 
  * CONFIDENTIAL to NVIDIA and are being provided under the terms and 
  * conditions of a form of NVIDIA software license agreement by and 
  * between NVIDIA and Licensee ("License Agreement") or electronically 
  * accepted by Licensee.  Notwithstanding any terms or conditions to 
  * the contrary in the License Agreement, reproduction or disclosure 
  * of the Licensed Deliverables to any third party without the express 
  * written consent of NVIDIA is prohibited. 
  * 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE 
  * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  THEY ARE 
  * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND. 
  * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED 
  * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY, 
  * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE. 
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE 
  * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY 
  * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY 
  * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, 
  * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS 
  * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE 
  * OF THESE LICENSED DELIVERABLES. 
  * 
  * U.S. Government End Users.  These Licensed Deliverables are a 
  * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT 
  * 1995), consisting of "commercial computer software" and "commercial 
  * computer software documentation" as such terms are used in 48 
  * C.F.R. 12.212 (SEPT 1995) and are provided to the U.S. Government 
  * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and 
  * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all 
  * U.S. Government End Users acquire the Licensed Deliverables with 
  * only those rights set forth herein. 
  * 
  * Any use of the Licensed Deliverables in individual and commercial 
  * software must include, in the user documentation and internal 
  * comments to the code, the above Disclaimer and U.S. Government End 
  * Users Notice. 
  */ 
// #ifndef NV_NPPCORE_H
// #define NV_NPPCORE_H

// #include <cuda_runtime_api.h>

/**
 * \file nppcore.h
 * Basic NPP functionality. 
 *  This file contains functions to query the NPP version as well as 
 *  info about the CUDA compute capabilities on a given computer.
 */
 
// #include "nppdefs.h"

// #ifdef __cplusplus
// #endif
 
/** \defgroup core_npp NPP Core
 * Basic functions for library management, in particular library version
 * and device property query functions.
 * \{
 */

/**
 * Get the NPP library version.
 *
 * @return A struct containing separate values for major and minor revision 
 *      and build number.
 */
public static native @Const NppLibraryVersion nppGetLibVersion();

/**
 * What CUDA compute model is supported by the active CUDA device?
 * 
 * Before trying to call any NPP functions, the user should make a call
 * this function to ensure that the current machine has a CUDA capable device.
 *
 * @return An enum value representing if a CUDA capable device was found and what
 *      level of compute capabilities it supports.
 */
public static native @Cast("NppGpuComputeCapability") int nppGetGpuComputeCapability();

/**
 * Get the number of Streaming Multiprocessors (SM) on the active CUDA device.
 *
 * @return Number of SMs of the default CUDA device.
 */
public static native int nppGetGpuNumSMs();

/**
 * Get the maximum number of threads per block on the active CUDA device.
 *
 * @return Maximum number of threads per block on the active CUDA device.
 */
public static native int nppGetMaxThreadsPerBlock();

/**
 * Get the maximum number of threads per SM for the active GPU
 *
 * @return Maximum number of threads per SM for the active GPU
 */
public static native int nppGetMaxThreadsPerSM();

/**
 * Get the maximum number of threads per SM, maximum threads per block, and number of SMs for the active GPU
 *
 * @return cudaSuccess for success, -1 for failure
 */
public static native int nppGetGpuDeviceProperties(IntPointer pMaxThreadsPerSM, IntPointer pMaxThreadsPerBlock, IntPointer pNumberOfSMs);
public static native int nppGetGpuDeviceProperties(IntBuffer pMaxThreadsPerSM, IntBuffer pMaxThreadsPerBlock, IntBuffer pNumberOfSMs);
public static native int nppGetGpuDeviceProperties(int[] pMaxThreadsPerSM, int[] pMaxThreadsPerBlock, int[] pNumberOfSMs);

/** 
 * Get the name of the active CUDA device.
 *
 * @return Name string of the active graphics-card/compute device in a system.
 */
public static native @Cast("const char*") BytePointer nppGetGpuName();

/**
 * Get the NPP CUDA stream.
 * NPP enables concurrent device tasks via a global stream state varible.
 * The NPP stream by default is set to stream 0, i.e. non-concurrent mode.
 * A user can set the NPP stream to any valid CUDA stream. All CUDA commands
 * issued by NPP (e.g. kernels launched by the NPP library) are then
 * issed to that NPP stream.
 */
public static native CUstream_st nppGetStream();

/**
 * Get the number of SMs on the device associated with the current NPP CUDA stream.
 * NPP enables concurrent device tasks via a global stream state varible.
 * The NPP stream by default is set to stream 0, i.e. non-concurrent mode.
 * A user can set the NPP stream to any valid CUDA stream. All CUDA commands
 * issued by NPP (e.g. kernels launched by the NPP library) are then
 * issed to that NPP stream.  This call avoids a cudaGetDeviceProperties() call.
 */
public static native @Cast("unsigned int") int nppGetStreamNumSMs();

/**
 * Get the maximum number of threads per SM on the device associated with the current NPP CUDA stream.
 * NPP enables concurrent device tasks via a global stream state varible.
 * The NPP stream by default is set to stream 0, i.e. non-concurrent mode.
 * A user can set the NPP stream to any valid CUDA stream. All CUDA commands
 * issued by NPP (e.g. kernels launched by the NPP library) are then
 * issed to that NPP stream.  This call avoids a cudaGetDeviceProperties() call.
 */
public static native @Cast("unsigned int") int nppGetStreamMaxThreadsPerSM();

/**
 * Set the NPP CUDA stream.  This function now returns an error if a problem occurs with Cuda stream management. 
 *   This function should only be called if a call to nppGetStream() returns a stream number which is different from
 *   the desired stream since unnecessarily flushing the current stream can significantly affect performance.
 * @see nppGetStream()
 */
public static native @Cast("NppStatus") int nppSetStream(CUstream_st hStream);


/** \} Module LabelCoreNPP */


// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPCORE_H */


}
