/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.opencv.jni;

class opencvJNI {

  static {
    try {
    	//load the library, make sure that libandroid-opencv.so is in your <project>/libs/armeabi directory
    	//so that android sdk automatically installs it along with the app.
        System.loadLibrary("android-armsk");
    } catch (UnsatisfiedLinkError e) {
    	//badness
    	throw e;
     
    }
  }

  public final static native int Mat_rows_get(long jarg1, Mat jarg1_);
  public final static native int Mat_cols_get(long jarg1, Mat jarg1_);
  public final static native long new_Mat();
  public final static native void delete_Mat(long jarg1);
  public final static native long new_Size(int jarg1, int jarg2);
  public final static native void Size_width_set(long jarg1, Size jarg1_, int jarg2);
  public final static native int Size_width_get(long jarg1, Size jarg1_);
  public final static native void Size_height_set(long jarg1, Size jarg1_, int jarg2);
  public final static native int Size_height_get(long jarg1, Size jarg1_);
  public final static native void delete_Size(long jarg1);
  public final static native long new_PtrMat__SWIG_0();
  public final static native long new_PtrMat__SWIG_1(long jarg1, Mat jarg1_);
  public final static native void delete_PtrMat(long jarg1);
  public final static native long new_PtrMat__SWIG_2(long jarg1, PtrMat jarg1_);
  public final static native void PtrMat_addref(long jarg1, PtrMat jarg1_);
  public final static native void PtrMat_release(long jarg1, PtrMat jarg1_);
  public final static native void PtrMat_delete_obj(long jarg1, PtrMat jarg1_);
  public final static native boolean PtrMat_empty(long jarg1, PtrMat jarg1_);
  public final static native long PtrMat___deref__(long jarg1, PtrMat jarg1_);
  public final static native int PtrMat_rows_get(long jarg1, PtrMat jarg1_);
  public final static native int PtrMat_cols_get(long jarg1, PtrMat jarg1_);
  public final static native void glcamera_init(long jarg1, glcamera jarg1_, int jarg2, int jarg3);
  public final static native void glcamera_step(long jarg1, glcamera jarg1_);
  public final static native void glcamera_drawMatToGL(long jarg1, glcamera jarg1_, int jarg2, long jarg3, image_pool jarg3_);
  public final static native long new_glcamera();
  public final static native void delete_glcamera(long jarg1);
  public final static native void addYUVtoPool(long jarg1, image_pool jarg1_, byte[] jarg2, int jarg3, int jarg4, int jarg5, boolean jarg6);
  public final static native long new_image_pool();
  public final static native void delete_image_pool(long jarg1);
  public final static native long image_pool_getImage(long jarg1, image_pool jarg1_, int jarg2);
  public final static native void image_pool_addImage(long jarg1, image_pool jarg1_, int jarg2, long jarg3, PtrMat jarg3_);
  public final static native void Calibration_patternsize_set(long jarg1, Calibration jarg1_, long jarg2, Size jarg2_);
  public final static native long Calibration_patternsize_get(long jarg1, Calibration jarg1_);
  public final static native long new_Calibration();
  public final static native void delete_Calibration(long jarg1);
  public final static native boolean Calibration_detectAndDrawChessboard(long jarg1, Calibration jarg1_, int jarg2, long jarg3, image_pool jarg3_);
  public final static native void Calibration_resetChess(long jarg1, Calibration jarg1_);
  public final static native int Calibration_getNumberDetectedChessboards(long jarg1, Calibration jarg1_);
  public final static native void Calibration_calibrate(long jarg1, Calibration jarg1_, String jarg2);
  public final static native void Calibration_drawText(long jarg1, Calibration jarg1_, int jarg2, long jarg3, image_pool jarg3_, String jarg4);
}
