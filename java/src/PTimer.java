/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PTimer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PTimer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PTimer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PTimer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PTimer() {
    this(PapillonCoreJavaJNI.new_PTimer__SWIG_0(), true);
  }

  public PTimer(PTimer other) {
    this(PapillonCoreJavaJNI.new_PTimer__SWIG_1(PTimer.getCPtr(other), other), true);
  }

  public void Reset() {
    PapillonCoreJavaJNI.PTimer_Reset(swigCPtr, this);
  }

  public void Start() {
    PapillonCoreJavaJNI.PTimer_Start(swigCPtr, this);
  }

  public double Stop() {
    return PapillonCoreJavaJNI.PTimer_Stop(swigCPtr, this);
  }

  public double ElapsedSec() {
    return PapillonCoreJavaJNI.PTimer_ElapsedSec(swigCPtr, this);
  }

  public double ElapsedMs() {
    return PapillonCoreJavaJNI.PTimer_ElapsedMs(swigCPtr, this);
  }

  public double Min() {
    return PapillonCoreJavaJNI.PTimer_Min(swigCPtr, this);
  }

  public double Max() {
    return PapillonCoreJavaJNI.PTimer_Max(swigCPtr, this);
  }

  public double Average() {
    return PapillonCoreJavaJNI.PTimer_Average(swigCPtr, this);
  }

  public int Size() {
    return PapillonCoreJavaJNI.PTimer_Size(swigCPtr, this);
  }

  public double Get(int n) {
    return PapillonCoreJavaJNI.PTimer_Get(swigCPtr, this, n);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PTimer_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PTimer_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PTimer_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PTimer_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PTimer_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PTimer_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

}