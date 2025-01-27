using System;
using System.Runtime.InteropServices;
 
//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace libsbmlcs {

public class CVTermList : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal CVTermList(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(CVTermList obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~CVTermList() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_CVTermList(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public CVTermList() : this(libsbmlPINVOKE.new_CVTermList(), true) {
  }

  public void add(CVTerm item) {
    libsbmlPINVOKE.CVTermList_add(swigCPtr, CVTerm.getCPtr(item));
  }

  public CVTerm get(uint n) {
    global::System.IntPtr cPtr = libsbmlPINVOKE.CVTermList_get(swigCPtr, n);
    CVTerm ret = (cPtr == global::System.IntPtr.Zero) ? null : new CVTerm(cPtr, false);
    return ret;
  }

  public void prepend(CVTerm item) {
    libsbmlPINVOKE.CVTermList_prepend(swigCPtr, CVTerm.getCPtr(item));
  }

  public CVTerm remove(uint n) {
    global::System.IntPtr cPtr = libsbmlPINVOKE.CVTermList_remove(swigCPtr, n);
    CVTerm ret = (cPtr == global::System.IntPtr.Zero) ? null : new CVTerm(cPtr, false);
    return ret;
  }

  public uint getSize() {
    uint ret = libsbmlPINVOKE.CVTermList_getSize(swigCPtr);
    return ret;
  }

}

}
