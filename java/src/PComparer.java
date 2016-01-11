/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PComparer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PComparer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PComparer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PComparer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PComparer() {
    this(PapillonCoreJavaJNI.new_PComparer__SWIG_0(), true);
  }

  public PComparer(PComparer other) {
    this(PapillonCoreJavaJNI.new_PComparer__SWIG_1(PComparer.getCPtr(other), other), true);
  }

  public static PResult Create(PComparer comparator) {
    return new PResult(PapillonCoreJavaJNI.PComparer_Create__SWIG_0(PComparer.getCPtr(comparator), comparator), true);
  }

  public static PResult Create(PComparer.EComparerType type, PComparer comparator) {
    return new PResult(PapillonCoreJavaJNI.PComparer_Create__SWIG_1(type.swigValue(), PComparer.getCPtr(comparator), comparator), true);
  }

  public PString GetName() {
    return new PString(PapillonCoreJavaJNI.PComparer_GetName(swigCPtr, this), true);
  }

  public PGuid GetId() {
    return new PGuid(PapillonCoreJavaJNI.PComparer_GetId(swigCPtr, this), true);
  }

  public PResult Compare(PDescription description1, PDescription description2, PMatchScore matchScore) {
    return new PResult(PapillonCoreJavaJNI.PComparer_Compare(swigCPtr, this, PDescription.getCPtr(description1), description1, PDescription.getCPtr(description2), description2, PMatchScore.getCPtr(matchScore), matchScore), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PComparer_ToString(swigCPtr, this), true);
  }

  public final static class EComparerType {
    public final static PComparer.EComparerType E_COMPARER_VECTOR_CORRELATION = new PComparer.EComparerType("E_COMPARER_VECTOR_CORRELATION");
    public final static PComparer.EComparerType E_COMPARER_VECTOR_MEDIAN = new PComparer.EComparerType("E_COMPARER_VECTOR_MEDIAN");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static EComparerType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + EComparerType.class + " with value " + swigValue);
    }

    private EComparerType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private EComparerType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private EComparerType(String swigName, EComparerType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static EComparerType[] swigValues = { E_COMPARER_VECTOR_CORRELATION, E_COMPARER_VECTOR_MEDIAN };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}