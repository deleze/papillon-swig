/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PDetector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PDetector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PDetector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PDetector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static PResult Create(PString parameters, PDetector detector) {
    return new PResult(PapillonCoreJavaJNI.PDetector_Create(PString.getCPtr(parameters), parameters, PDetector.getCPtr(detector), detector), true);
  }

  public PDetector() {
    this(PapillonCoreJavaJNI.new_PDetector__SWIG_0(), true);
  }

  public PDetector(PDetector other) {
    this(PapillonCoreJavaJNI.new_PDetector__SWIG_1(PDetector.getCPtr(other), other), true);
  }

  public PGuid GetDetectorId() {
    return new PGuid(PapillonCoreJavaJNI.PDetector_GetDetectorId(swigCPtr, this), true);
  }

  public PString GetName() {
    return new PString(PapillonCoreJavaJNI.PDetector_GetName(swigCPtr, this), true);
  }

  public PResult Detect(PFrame frame, PDetectorOptions options, PDetectionList detectionList) {
    return new PResult(PapillonCoreJavaJNI.PDetector_Detect(swigCPtr, this, PFrame.getCPtr(frame), frame, PDetectorOptions.getCPtr(options), options, PDetectionList.getCPtr(detectionList), detectionList), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PDetector_ToString(swigCPtr, this), true);
  }

  public void SetPimpl(SWIGTYPE_p_papillon__PDetectorInterface pimpl) {
    PapillonCoreJavaJNI.PDetector_SetPimpl(swigCPtr, this, SWIGTYPE_p_papillon__PDetectorInterface.getCPtr(pimpl));
  }

}