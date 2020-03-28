/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-comp"><a href="group__comp.html">comp</a></span>
 Registry of all SBML resolvers.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * LibSBML provides facilities for resolving SBML documents in various ways
 * from a given URI. Resolvers are implemented as objects derived from the
 * class {@link SBMLResolver}.
 <p>
 * The resolver registry maintains a list of known resolvers and provides
 * methods for discovering them.  It is implemented as a singleton object of
 * class {@link SBMLResolverRegistry}.  Callers can use the method
 * {@link SBMLResolverRegistry#getNumResolvers()} to find out how many resolvers are
 * registered, then use {@link SBMLResolverRegistry#getResolverByIndex(int)} to iterate over each one;
 <p>
 * @see SBMLFileResolver
 */

public class SBMLResolverRegistry {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLResolverRegistry(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLResolverRegistry obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLResolverRegistry obj)
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
        libsbmlJNI.delete_SBMLResolverRegistry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/**
   * Returns the singleton instance for the resolver registry.
   <p>
   * Prior to using the registry, callers have to obtain a copy of the
   * registry.  This static method provides the means for doing that.
   <p>
   * @return the singleton for the resolver registry.
   */ public
 static SBMLResolverRegistry getInstance() {
    return new SBMLResolverRegistry(libsbmlJNI.SBMLResolverRegistry_getInstance(), false);
  }

  
/**
   * Adds the given resolver to the registry of SBML resolvers.
   <p>
   * @param resolver the resolver to add to the registry.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * </ul>
   */ public
 int addResolver(SBMLResolver resolver) {
    return libsbmlJNI.SBMLResolverRegistry_addResolver(swigCPtr, this, SBMLResolver.getCPtr(resolver), resolver);
  }

  
/**
   * Adds the given {@link SBMLDocument} to the registry of SBML documents that will need to be deleted.
   <p>
   * When calculating reference cycles, sometimes we need SBML Documents to persist, but nobody
   * else owns them directly.  We hand them to the registry here so they can be cleaned up
   <p>
   * @param doc the SBML Document to add to the registry.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * </ul>
   */ public
 int addOwnedSBMLDocument(SBMLDocument doc) {
    return libsbmlJNI.SBMLResolverRegistry_addOwnedSBMLDocument(swigCPtr, this, SBMLDocument.getCPtr(doc), doc);
  }

  
/**
   * Removes the resolver with the given index.
   <p>
   * @param index the index of the resolver to be removed.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * </ul>
   */ public
 int removeResolver(int index) {
    return libsbmlJNI.SBMLResolverRegistry_removeResolver(swigCPtr, this, index);
  }

  
/**
   * Returns the resolver with the given index number.
   <p>
   * Resolvers are given arbitrary index numbers by the registry.  Callers
   * can use the method {@link SBMLResolverRegistry#getNumResolvers()} to find
   * out how many resolvers are registered, then use this method to
   * iterate over the list and obtain each one in turn.
   <p>
   * @param index the zero-based index of the resolver to fetch.
   <p>
   * @return the resolver with the given index number, or <code>null</code> if the
   * number is less than <code>0</code> or there is no resolver at the given index
   * position.
   */ public
 SBMLResolver getResolverByIndex(int index) {
    long cPtr = libsbmlJNI.SBMLResolverRegistry_getResolverByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SBMLResolver(cPtr, false);
  }

  
/**
   * Returns the number of resolvers known by the registry.
   <p>
   * @return the number of registered resolvers.
   <p>
   * @see #getResolverByIndex(int)
   */ public
 int getNumResolvers() {
    return libsbmlJNI.SBMLResolverRegistry_getNumResolvers(swigCPtr, this);
  }

  
/**
   * Resolves the document for the given URI.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return  the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLDocument resolve(String uri, String baseUri) {
    long cPtr = libsbmlJNI.SBMLResolverRegistry_resolve__SWIG_0(swigCPtr, this, uri, baseUri);
    return (cPtr == 0) ? null : new SBMLDocument(cPtr, false);
  }

  
/**
   * Resolves the document for the given URI.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return  the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLDocument resolve(String uri) {
    long cPtr = libsbmlJNI.SBMLResolverRegistry_resolve__SWIG_1(swigCPtr, this, uri);
    return (cPtr == 0) ? null : new SBMLDocument(cPtr, false);
  }

  
/**
   * Resolves the full URI for the given URI without actually reading the
   * document.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return  the full URI to the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLUri resolveUri(String uri, String baseUri) {
    long cPtr = libsbmlJNI.SBMLResolverRegistry_resolveUri__SWIG_0(swigCPtr, this, uri, baseUri);
    return (cPtr == 0) ? null : new SBMLUri(cPtr, false);
  }

  
/**
   * Resolves the full URI for the given URI without actually reading the
   * document.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return  the full URI to the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLUri resolveUri(String uri) {
    long cPtr = libsbmlJNI.SBMLResolverRegistry_resolveUri__SWIG_1(swigCPtr, this, uri);
    return (cPtr == 0) ? null : new SBMLUri(cPtr, false);
  }

  
/**
   * deletes the static resolver registry instance
   */ public
 static void deleteResolerRegistryInstance() {
    libsbmlJNI.SBMLResolverRegistry_deleteResolerRegistryInstance();
  }

}