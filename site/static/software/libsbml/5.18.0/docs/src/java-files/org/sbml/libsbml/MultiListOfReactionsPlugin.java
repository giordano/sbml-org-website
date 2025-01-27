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
 Extension of {@link ListOfReactions} for the 'multi' package.
 <p>
 * The {@link MultiListOfReactionsPlugin} class extends the {@link ListOfReactions} class to
 * allow a {@link ListOfReactions} to contain {@link IntraSpeciesReaction} objects as well as
 * {@link Reaction} objects.
 */

public class MultiListOfReactionsPlugin extends SBasePlugin {
   private long swigCPtr;

   protected MultiListOfReactionsPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.MultiListOfReactionsPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(MultiListOfReactionsPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (MultiListOfReactionsPlugin obj)
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
        libsbmlJNI.delete_MultiListOfReactionsPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link MultiListOfReactionsPlugin}
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
 MultiListOfReactionsPlugin(String uri, String prefix, MultiPkgNamespaces multins) {
    this(libsbmlJNI.new_MultiListOfReactionsPlugin__SWIG_0(uri, prefix, MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link MultiListOfReactionsPlugin}.
   <p>
   * @param orig the {@link MultiListOfReactionsPlugin} instance to copy.
   */ public
 MultiListOfReactionsPlugin(MultiListOfReactionsPlugin orig) {
    this(libsbmlJNI.new_MultiListOfReactionsPlugin__SWIG_1(MultiListOfReactionsPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link MultiListOfReactionsPlugin} object.
   <p>
   * @return a (deep) copy of this {@link MultiListOfReactionsPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.MultiListOfReactionsPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new MultiListOfReactionsPlugin(cPtr, true);
  }

  
/** * @internal */ public
 SBase createObject(XMLInputStream stream) {
  return libsbml.DowncastSBase(libsbmlJNI.MultiListOfReactionsPlugin_createObject(swigCPtr, this, XMLInputStream.getCPtr(stream), stream), false);
}

  
/** * @internal */ public
 boolean isValidTypeForList(SBase item) {
    return libsbmlJNI.MultiListOfReactionsPlugin_isValidTypeForList(swigCPtr, this, SBase.getCPtrAndDisown(item), item);
  }

}
