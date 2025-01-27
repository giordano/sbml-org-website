/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-qual"><a href="group__qual.html">qual</a></span>

 Extension of {@link Model}.
 <p>
 * The extension of SBML Level 3 Core's {@link Model} class is relatively
 * straightforward: the Qualitative Models Package adds two lists, one for
 * holding qualitativeSpecies (ListOfQualitativeSpecies), and the other for
 * holding transitions (ListOfTransitions).  The {@link Model} element may contain at
 * most one {@link ListOfQualitativeSpecies}, which must contain at least one
 * {@link QualitativeSpecies}. It may also contain at most one {@link ListOfTransitions}
 * which must contain at least one {@link Transition}.
 */

public class QualModelPlugin extends SBasePlugin {
   private long swigCPtr;

   protected QualModelPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.QualModelPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(QualModelPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (QualModelPlugin obj)
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
        libsbmlJNI.delete_QualModelPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link QualModelPlugin} object using the given parameters.
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
   * @param qualns the namespaces object for the package.
   */ public
 QualModelPlugin(String uri, String prefix, QualPkgNamespaces qualns) {
    this(libsbmlJNI.new_QualModelPlugin__SWIG_0(uri, prefix, QualPkgNamespaces.getCPtr(qualns), qualns), true);
  }

  
/**
   * Copy constructor. Creates a copy of this object.
   <p>
   * @param orig the instance to copy.
   */ public
 QualModelPlugin(QualModelPlugin orig) {
    this(libsbmlJNI.new_QualModelPlugin__SWIG_1(QualModelPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link QualModelPlugin} object.
   <p>
   * @return a (deep) copy of this {@link QualModelPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.QualModelPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new QualModelPlugin(cPtr, true);
  }

  
/** * @internal */ public
 SBase createObject(XMLInputStream stream) {
  return libsbml.DowncastSBase(libsbmlJNI.QualModelPlugin_createObject(swigCPtr, this, XMLInputStream.getCPtr(stream), stream), false);
}

  
/** * @internal */ public
 int appendFrom(Model model) {
    return libsbmlJNI.QualModelPlugin_appendFrom(swigCPtr, this, Model.getCPtr(model), model);
  }

  
/**
   * Returns the {@link ListOfQualitativeSpecies} in this plugin object.
   <p>
   * @return {@link ListOfQualitativeSpecies} object in this plugin object.
   */ public
 ListOfQualitativeSpecies getListOfQualitativeSpecies() {
    long cPtr = libsbmlJNI.QualModelPlugin_getListOfQualitativeSpecies__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfQualitativeSpecies(cPtr, false);
  }

  
/**
   * Returns the {@link QualitativeSpecies} object that belongs to the given index. If the
   * index is invalid, null is returned.
   <p>
   * @param n the index number of the {@link QualitativeSpecies} to get.
   <p>
   * @return the nth {@link QualitativeSpecies} in the {@link ListOfQualitativeSpecies}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   */ public
 QualitativeSpecies getQualitativeSpecies(long n) {
    long cPtr = libsbmlJNI.QualModelPlugin_getQualitativeSpecies__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new QualitativeSpecies(cPtr, false);
  }

  
/**
   * Returns the qualitativeSpecies object based on its identifier.
   <p>
   * @param sid a string representing the identifier 
   * of the {@link QualitativeSpecies} to get.
   <p>
   * @return {@link QualitativeSpecies} in the {@link ListOfQualitativeSpecies} with the given id
   * or <code>null</code> if no such {@link QualitativeSpecies} exists.
   <p>
   * @see #getQualitativeSpecies(long n)
   * @see #getListOfQualitativeSpecies()
   */ public
 QualitativeSpecies getQualitativeSpecies(String sid) {
    long cPtr = libsbmlJNI.QualModelPlugin_getQualitativeSpecies__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new QualitativeSpecies(cPtr, false);
  }

  
/**
   * Adds a copy of the given {@link QualitativeSpecies} object to the list of qual.
   <p>
   * @param qualitativeSpecies the {@link QualitativeSpecies} object to be added to the list of qual.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addQualitativeSpecies(QualitativeSpecies qualitativeSpecies) {
    return libsbmlJNI.QualModelPlugin_addQualitativeSpecies(swigCPtr, this, QualitativeSpecies.getCPtr(qualitativeSpecies), qualitativeSpecies);
  }

  
/**
   * Creates a new qual object and adds it to the list of qual objects
   * and returns it.
   <p>
   * @return a newly created {@link QualitativeSpecies} object.
   */ public
 QualitativeSpecies createQualitativeSpecies() {
    long cPtr = libsbmlJNI.QualModelPlugin_createQualitativeSpecies(swigCPtr, this);
    return (cPtr == 0) ? null : new QualitativeSpecies(cPtr, false);
  }

  
/**
   * Removes the nth {@link QualitativeSpecies} object from this plugin object and
   * returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   *  deleting it.
   <p>
   * @param n the index of the {@link QualitativeSpecies} object to remove.
   <p>
   * @return the {@link QualitativeSpecies} object removed.  As mentioned above, the 
   * caller owns the returned object. null is returned if the 
   * given index is out of range.
   */ public
 QualitativeSpecies removeQualitativeSpecies(long n) {
    long cPtr = libsbmlJNI.QualModelPlugin_removeQualitativeSpecies__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new QualitativeSpecies(cPtr, true);
  }

  
/**
   * Removes the {@link QualitativeSpecies} object with the given id attribute from 
   * this plugin object and returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   * deleting it.
   <p>
   * @param sid the id attribute of the {@link QualitativeSpecies} object to remove.
   <p>
   * @return the {@link QualitativeSpecies} object removed.  As mentioned above, the 
   * caller owns the returned object. null is returned if the 
   * given index is out of range.
   */ public
 QualitativeSpecies removeQualitativeSpecies(String sid) {
    long cPtr = libsbmlJNI.QualModelPlugin_removeQualitativeSpecies__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new QualitativeSpecies(cPtr, true);
  }

  
/**
   * Returns the number of {@link QualitativeSpecies} object in this plugin object.
   <p>
   * @return the number of {@link QualitativeSpecies} object in this plugin object.
   */ public
 long getNumQualitativeSpecies() {
    return libsbmlJNI.QualModelPlugin_getNumQualitativeSpecies(swigCPtr, this);
  }

  
/**
   * Returns the {@link ListOfTransitions} in this plugin object.
   <p>
   * @return {@link ListOfTransitions} object in this plugin object.
   */ public
 ListOfTransitions getListOfTransitions() {
    long cPtr = libsbmlJNI.QualModelPlugin_getListOfTransitions__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfTransitions(cPtr, false);
  }

  
/**
   * Returns the {@link Transition} object that belongs to the given index. If the
   * index is invalid, null is returned.
   <p>
   * @param n the index number of the {@link Transition} to get.
   <p>
   * @return the nth {@link Transition} in the {@link ListOfTransitions}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   */ public
 Transition getTransition(long n) {
    long cPtr = libsbmlJNI.QualModelPlugin_getTransition__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Transition(cPtr, false);
  }

  
/**
   * Returns the qualitativeSpecies object based on its identifier.
   <p>
   * @param sid a string representing the identifier 
   * of the {@link Transition} to get.
   <p>
   * @return {@link Transition} in the {@link ListOfTransitions} with the given id
   * or <code>null</code> if no such {@link Transition} exists.
   <p>
   * @see #getTransition(long n)
   * @see #getListOfTransitions()
   */ public
 Transition getTransition(String sid) {
    long cPtr = libsbmlJNI.QualModelPlugin_getTransition__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Transition(cPtr, false);
  }

  
/**
   * Adds a copy of the given {@link Transition} object to the list of qual.
   <p>
   * @param transition the {@link Transition} object to be added to the list of qual.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addTransition(Transition transition) {
    return libsbmlJNI.QualModelPlugin_addTransition(swigCPtr, this, Transition.getCPtr(transition), transition);
  }

  
/**
   * Creates a new qual object and adds it to the list of qual objects
   * and returns it.
   <p>
   * @return a newly created {@link Transition} object.
   */ public
 Transition createTransition() {
    long cPtr = libsbmlJNI.QualModelPlugin_createTransition(swigCPtr, this);
    return (cPtr == 0) ? null : new Transition(cPtr, false);
  }

  
/**
   * Removes the nth {@link Transition} object from this plugin object and
   * returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   *  deleting it.
   <p>
   * @param n the index of the {@link Transition} object to remove.
   <p>
   * @return the {@link Transition} object removed.  As mentioned above, the 
   * caller owns the returned object. null is returned if the 
   * given index is out of range.
   */ public
 Transition removeTransition(long n) {
    long cPtr = libsbmlJNI.QualModelPlugin_removeTransition__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Transition(cPtr, true);
  }

  
/**
   * Removes the {@link Transition} object with the given id attribute from 
   * this plugin object and returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   * deleting it.
   <p>
   * @param sid the id attribute of the {@link Transition} object to remove.
   <p>
   * @return the {@link Transition} object removed.  As mentioned above, the 
   * caller owns the returned object. null is returned if the 
   * given index is out of range.
   */ public
 Transition removeTransition(String sid) {
    long cPtr = libsbmlJNI.QualModelPlugin_removeTransition__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Transition(cPtr, true);
  }

  
/**
   * Returns the number of {@link Transition} object in this plugin object.
   <p>
   * @return the number of {@link Transition} object in this plugin object.
   */ public
 long getNumTransitions() {
    return libsbmlJNI.QualModelPlugin_getNumTransitions(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.QualModelPlugin_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToParent(SBase sbase) {
    libsbmlJNI.QualModelPlugin_connectToParent(swigCPtr, this, SBase.getCPtr(sbase), sbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.QualModelPlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/**
   * Returns the first child element that has the given <code>id</code> in the model-wide
   * SId namespace, or <code>null</code> if no such object is found.
   <p>
   * @param id a string representing the id attribute of the object to
   * retrieve.
   <p>
   * @return a pointer to the {@link SBase} element with the given <code>id</code>.
   */ public
 SBase getElementBySId(String id) {
  return libsbml.DowncastSBase(libsbmlJNI.QualModelPlugin_getElementBySId(swigCPtr, this, id), false);
}

  
/**
   * Returns the first child element that has the given <code>metaid</code>, or <code>null</code>
   * if no such object is found.
   <p>
   * @param metaid a string representing the metaid attribute of the object to
   * retrieve.
   <p>
   * @return a pointer to the {@link SBase} element with the given <code>metaid</code>.
   */ public
 SBase getElementByMetaId(String metaid) {
  return libsbml.DowncastSBase(libsbmlJNI.QualModelPlugin_getElementByMetaId(swigCPtr, this, metaid), false);
}

}
