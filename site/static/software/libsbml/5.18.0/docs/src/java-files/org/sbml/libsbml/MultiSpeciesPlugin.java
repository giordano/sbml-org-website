/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-multi"><a href="group__multi.html">multi</a></span>
 Extension of {@link Species} for the 'multi' package.
 <p>
 * The {@link MultiSpeciesPlugin} class extends the {@link Species} class to have a new
 * attribute 'speciesType', and two extra optional {@link ListOfOutwardBindingSites}
 * and {@link ListOfSpeciesFeatures} children. A species may have a
 * {@link ListOfOutwardBindingSites} child and/or a {@link ListOfSpeciesFeatures} child only
 * when its speciesType attribute has been defined.  The relationship among
 * the elements of a {@link ListOfOutwardBindingSites} or a {@link ListOfSpeciesFeatures} is
 * 'and'.
 */

public class MultiSpeciesPlugin extends SBasePlugin {
   private long swigCPtr;

   protected MultiSpeciesPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.MultiSpeciesPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(MultiSpeciesPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (MultiSpeciesPlugin obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_MultiSpeciesPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link MultiSpeciesPlugin} object.
   <p>
   * <p>
 * In the XML representation of an SBML document, XML namespaces are used to
 * identify the origin of each XML construct used.  XML namespaces are
 * identified by their unique resource identifiers (URIs).  The core SBML
 * specifications stipulate the namespaces that must be used for core SBML
 * constructs; for example, all XML elements that belong to SBML Level&nbsp;3
 * Version&nbsp;1 Core must be placed in the XML namespace identified by the URI
 * <code>'http://www.sbml.org/sbml/level3/version1/core'</code>.  Individual
 * SBML Level&nbsp;3 packages define their own XML namespaces; for example,
 * all elements belonging to the SBML Level&nbsp;3 Layout Version&nbsp;1
 * package must be placed in the XML namespace
 * <code>'http://www.sbml.org/sbml/level3/version1/layout/version1/'</code>.
   <p>
   * <p>
 * The {@link SBMLNamespaces} object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * {@link SBMLNamespaces} object somewhere in a program once, then hand that object
 * as needed to object constructors that accept {@link SBMLNamespaces} as arguments.
   <p>
   * @param uri the URI of the SBML Level&nbsp;3 package implemented by
   * this libSBML package extension.
   <p>
   * @param prefix the XML namespace prefix being used for the package.
   <p>
   * @param multins the namespaces object for the package.
   */ public
 MultiSpeciesPlugin(String uri, String prefix, MultiPkgNamespaces multins) {
    this(libsbmlJNI.new_MultiSpeciesPlugin__SWIG_0(uri, prefix, MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link MultiSpeciesPlugin}.
   <p>
   * @param orig the {@link MultiSpeciesPlugin} instance to copy.
   */ public
 MultiSpeciesPlugin(MultiSpeciesPlugin orig) {
    this(libsbmlJNI.new_MultiSpeciesPlugin__SWIG_1(MultiSpeciesPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link MultiSpeciesPlugin} object.
   <p>
   * @return a (deep) copy of this {@link MultiSpeciesPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new MultiSpeciesPlugin(cPtr, true);
  }

  
/** * @internal */ public
 SBase createObject(XMLInputStream stream) {
  return libsbml.DowncastSBase(libsbmlJNI.MultiSpeciesPlugin_createObject(swigCPtr, this, XMLInputStream.getCPtr(stream), stream), false);
}

  
/**
   * Returns <code>true</code> if this object has all the required elements.
   <p>
   * @return <code>true</code> if this object has all the elements required by the
   * package specification; otherwise, <code>false</code> will be returned.
   */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.MultiSpeciesPlugin_hasRequiredElements(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'speciesType' attribute of this 'multi' {@link Species}.
   <p>
   * @return the value of the 'speciesType' attribute.
   */ public
 String getSpeciesType() {
    return libsbmlJNI.MultiSpeciesPlugin_getSpeciesType(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if the 'speciesType' attribute of this 'multi' {@link Species}
   * has been set.
   <p>
   * @return <code>true</code> if this SpeciesPlugin's 'speciesType' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetSpeciesType() {
    return libsbmlJNI.MultiSpeciesPlugin_isSetSpeciesType(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'speciesType' attribute on this 'multi' {@link Species}.
   <p>
   * @param speciesType the new value for the attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setSpeciesType(String speciesType) {
    return libsbmlJNI.MultiSpeciesPlugin_setSpeciesType(swigCPtr, this, speciesType);
  }

  
/**
   * Unsets the value of the 'speciesType' attribute on this 'multi' {@link Species}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetSpeciesType() {
    return libsbmlJNI.MultiSpeciesPlugin_unsetSpeciesType(swigCPtr, this);
  }

  
/**
   * Returns the {@link ListOfOutwardBindingSites} of this 'multi' {@link Species}.
   <p>
   * @return the {@link ListOfOutwardBindingSites} object.
   */ public
 ListOfOutwardBindingSites getListOfOutwardBindingSites() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getListOfOutwardBindingSites__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfOutwardBindingSites(cPtr, false);
  }

  
/**
   * Returns the nth {@link OutwardBindingSite} object.
   <p>
   * @param n the index number of the {@link OutwardBindingSite} to get
   <p>
   * @return the nth {@link OutwardBindingSite} in the {@link ListOfOutwardBindingSites}.  If
   * the index is invalid, null is returned.
   */ public
 OutwardBindingSite getOutwardBindingSite(long n) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getOutwardBindingSite__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, false);
  }

  
/**
   * Returns the {@link OutwardBindingSite} object with the given identifier <code>sid</code>.
   <p>
   * @param sid a string representing the id of the {@link OutwardBindingSite} to get.
   <p>
   * @return {@link OutwardBindingSite} in the {@link ListOfOutwardBindingSites} with the given id
   * or <code>null</code> if no such {@link OutwardBindingSite} exists.
   */ public
 OutwardBindingSite getOutwardBindingSite(String sid) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getOutwardBindingSite__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, false);
  }

  
/**
   * Adds a copy of the given {@link OutwardBindingSite} to the
   * {@link ListOfOutwardBindingSites}.
   <p>
   * @param outwardBindingSite the outwardBindingSite to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addOutwardBindingSite(OutwardBindingSite outwardBindingSite) {
    return libsbmlJNI.MultiSpeciesPlugin_addOutwardBindingSite(swigCPtr, this, OutwardBindingSite.getCPtr(outwardBindingSite), outwardBindingSite);
  }

  
/**
   * Creates a new {@link OutwardBindingSite} object and adds it to the
   * {@link ListOfOutwardBindingSites}.
   <p>
   * @return the newly created {@link OutwardBindingSite} object.
   */ public
 OutwardBindingSite createOutwardBindingSite() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_createOutwardBindingSite(swigCPtr, this);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, false);
  }

  
/**
   * Removes the nth {@link OutwardBindingSite} object and returns a pointer to it.
   <p>
   * @param n the index of the {@link OutwardBindingSite} to remove.
   <p>
   * @return the {@link OutwardBindingSite} object removed or <code>null</code> index was out of
   * range.  Note that the caller owns the returned object and is responsible
   * for deleting it.
   */ public
 OutwardBindingSite removeOutwardBindingSite(long n) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_removeOutwardBindingSite__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, true);
  }

  
/**
   * Removes the {@link OutwardBindingSite} object with the given id <code>sid</code> and
   * returns a pointer to it.
   <p>
   * @param sid a string representing the id of the {@link OutwardBindingSite} to remove.
   <p>
   * @return the {@link OutwardBindingSite} object removed or <code>null</code> index was out of
   * range.  Note that the caller owns the returned object and is responsible
   * for deleting it.
   */ public
 OutwardBindingSite removeOutwardBindingSite(String sid) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_removeOutwardBindingSite__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, true);
  }

  
/**
   * Returns the number of {@link OutwardBindingSite} objects of this 'multi' {@link Species}.
   <p>
   * @return the number of {@link OutwardBindingSite} objects in this plugin object.
   */ public
 long getNumOutwardBindingSites() {
    return libsbmlJNI.MultiSpeciesPlugin_getNumOutwardBindingSites(swigCPtr, this);
  }

  
/**
   * Returns the {@link ListOfSpeciesFeatures} of this 'multi' {@link Species}.
   <p>
   * @return {@link ListOfSpeciesFeatures} object in this plugin object.
   */ public
 ListOfSpeciesFeatures getListOfSpeciesFeatures() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getListOfSpeciesFeatures__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfSpeciesFeatures(cPtr, false);
  }

  
/**
   * Returns the nth {@link SpeciesFeature} object.
   <p>
   * @param n the index number of the {@link SpeciesFeature} to get.
   <p>
   * @return the nth {@link SpeciesFeature} in the {@link ListOfSpeciesFeatures}.  If the
   * index is invalid, null is returned.
   */ public
 SpeciesFeature getSpeciesFeature(long n) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getSpeciesFeature__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Returns the {@link SpeciesFeature} object with the given identifier <code>sid</code>.
   <p>
   * @param sid a string representing the id of the {@link SpeciesFeature} to get
   <p>
   * @return {@link SpeciesFeature} in the {@link ListOfSpeciesFeatures} with the given id 
   * <code>sid</code>, or <code>null</code> if no such {@link SpeciesFeature} exists.
   */ public
 SpeciesFeature getSpeciesFeature(String sid) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getSpeciesFeature__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Adds a copy of the given {@link SpeciesFeature} to the {@link ListOfSpeciesFeatures} of
   * this 'multi' {@link Species}.
   <p>
   * @param speciesFeature the {@link SpeciesFeature} to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addSpeciesFeature(SpeciesFeature speciesFeature) {
    return libsbmlJNI.MultiSpeciesPlugin_addSpeciesFeature(swigCPtr, this, SpeciesFeature.getCPtr(speciesFeature), speciesFeature);
  }

  
/**
   * Creates a new {@link SpeciesFeature} object and adds it to the
   * {@link ListOfSpeciesFeatures} of this 'multi' {@link Species}.
   <p>
   * @return the newly created {@link SpeciesFeature} object.
   */ public
 SpeciesFeature createSpeciesFeature() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_createSpeciesFeature(swigCPtr, this);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Returns the nth {@link SubListOfSpeciesFeatures} object.
   <p>
   * @param n the index number of the {@link SubListOfSpeciesFeatures} to get
   <p>
   * @return the nth {@link SubListOfSpeciesFeatures} in the {@link ListOfSpeciesFeatures}.
   * If the index is invalid, null is returned.
   */ public
 SubListOfSpeciesFeatures getSubListOfSpeciesFeatures(long n) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getSubListOfSpeciesFeatures__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SubListOfSpeciesFeatures(cPtr, false);
  }

  
/**
   * Returns the {@link SubListOfSpeciesFeatures} object with the given identifier <code>sid</code>.
   <p>
   * @param sid the id of the {@link SubListOfSpeciesFeatures} to get.
   <p>
   * @return {@link SubListOfSpeciesFeatures} in the {@link ListOfSpeciesFeatures} with the
   * given id <code>sid</code>, or <code>null</code> if no such {@link SubListOfSpeciesFeatures} exists.
   */ public
 SubListOfSpeciesFeatures getSubListOfSpeciesFeatures(String sid) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_getSubListOfSpeciesFeatures__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SubListOfSpeciesFeatures(cPtr, false);
  }

  
/**
   * Adds a copy of the given {@link SubListOfSpeciesFeatures} to the
   * {@link ListOfSpeciesFeatures}.
   <p>
   * @param subListOfSpeciesFeatures the {@link SubListOfSpeciesFeatures} to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addSubListOfSpeciesFeatures(SubListOfSpeciesFeatures subListOfSpeciesFeatures) {
    return libsbmlJNI.MultiSpeciesPlugin_addSubListOfSpeciesFeatures(swigCPtr, this, SubListOfSpeciesFeatures.getCPtr(subListOfSpeciesFeatures), subListOfSpeciesFeatures);
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} object and adds it to the
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @return the newly created {@link SubListOfSpeciesFeatures} object.
   */ public
 SubListOfSpeciesFeatures createSubListOfSpeciesFeatures() {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_createSubListOfSpeciesFeatures(swigCPtr, this);
    return (cPtr == 0) ? null : new SubListOfSpeciesFeatures(cPtr, false);
  }

  
/**
   * Removes the nth {@link SpeciesFeature} object and returns a pointer to it.
   <p>
   * @param n the index of the {@link SpeciesFeature} to remove.
   <p>
   * @return the {@link SpeciesFeature} object removed or <code>null</code> index was out of
   * range.  Note that the caller owns the returned object and is responsible
   * for deleting it.
   */ public
 SpeciesFeature removeSpeciesFeature(long n) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_removeSpeciesFeature__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, true);
  }

  
/**
   * Removes the {@link SpeciesFeature} object with the given identifier <code>sid</code>.
   <p>
   * @param sid a string representing the id of the {@link SpeciesFeature} to get.
   <p>
   * @return the {@link SpeciesFeature} object removed or <code>null</code> index was out of
   * range.  Note that the caller owns the returned object and is responsible
   * for deleting it.
   */ public
 SpeciesFeature removeSpeciesFeature(String sid) {
    long cPtr = libsbmlJNI.MultiSpeciesPlugin_removeSpeciesFeature__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, true);
  }

  
/**
   * Returns the number of {@link SpeciesFeature} objects of this 'multi' {@link Species}.
   <p>
   * @return the number of {@link SpeciesFeature} objects in this plugin object.
   */ public
 long getNumSpeciesFeatures() {
    return libsbmlJNI.MultiSpeciesPlugin_getNumSpeciesFeatures(swigCPtr, this);
  }

  
/**
   * Returns the number of {@link SubListOfSpeciesFeatures} objects of this 'multi' {@link Species}.
   <p>
   * @return the number of {@link SubListOfSpeciesFeatures} objects in this plugin object.
   */ public
 long getNumSubListOfSpeciesFeatures() {
    return libsbmlJNI.MultiSpeciesPlugin_getNumSubListOfSpeciesFeatures(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToParent(SBase sbase) {
    libsbmlJNI.MultiSpeciesPlugin_connectToParent(swigCPtr, this, SBase.getCPtr(sbase), sbase);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.MultiSpeciesPlugin_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.MultiSpeciesPlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
