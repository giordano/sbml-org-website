/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-render"><a href="group__render.html">render</a></span>

 A list of {@link GradientBase} objects.
 <p>
 * The {@link ListOfGradientDefinitions} is a container for the {@link GradientBase} elements 
 * of a {@link RenderInformationBase} object.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

 <p>
 * SBML Level&nbsp;3 Version&nbsp;1 has essentially the same structure as 
 * Level&nbsp;2 Version&nbsp;4, depicted above, but SBML Level&nbsp;3 
 * Version&nbsp;2 allows
 * containers to contain zero or more of the relevant object, instead of 
 * requiring at least one.  As such, libsbml will write out an 
 * otherwise-empty ListOf___ element that has any optional attribute set 
 * (such as 'id' or 'metaid'), that has an optional child (such 
 * as a 'notes' or 'annotation'), or that has attributes or children set
 * from any SBML Level&nbsp;3 package, whether or not the ListOf___ has 
 * any other children.
 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 <p>
 * @see GradientBase
 */

public class ListOfGradientDefinitions extends ListOf {
   private long swigCPtr;

   protected ListOfGradientDefinitions(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfGradientDefinitions_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfGradientDefinitions obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfGradientDefinitions obj)
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
        libsbmlJNI.delete_ListOfGradientDefinitions(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGradientDefinitions}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 ListOfGradientDefinitions(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGradientDefinitions}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 ListOfGradientDefinitions(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGradientDefinitions}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 ListOfGradientDefinitions(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGradientDefinitions}.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 ListOfGradientDefinitions() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} using the given
   * {@link RenderPkgNamespaces} object.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param renderns the {@link RenderPkgNamespaces} object.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 ListOfGradientDefinitions(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link ListOfGradientDefinitions} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link ListOfGradientDefinitions}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 ListOfGradientDefinitions(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link ListOfGradientDefinitions} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link ListOfGradientDefinitions} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link ListOfGradientDefinitions}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 ListOfGradientDefinitions(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Copy constructor for {@link ListOfGradientDefinitions}.
   <p>
   * @param orig the {@link ListOfGradientDefinitions} instance to copy.
   */ public
 ListOfGradientDefinitions(ListOfGradientDefinitions orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGradientDefinitions__SWIG_7(ListOfGradientDefinitions.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfGradientDefinitions} object.
   <p>
   * @return a (deep) copy of this {@link ListOfGradientDefinitions} object.
   */ public
 ListOfGradientDefinitions cloneObject() {
    long cPtr = libsbmlJNI.ListOfGradientDefinitions_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfGradientDefinitions(cPtr, true);
  }

  
/**
   * Get a {@link GradientBase} from the {@link ListOfGradientDefinitions}.
   <p>
   * @param n a long integer representing the index of the {@link GradientBase} to
   * retrieve.
   <p>
   * @return the nth {@link GradientBase} in this {@link ListOfGradientDefinitions}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(String sid)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 SBase get(long n) {
  return (GradientBase) libsbml.DowncastSBase(libsbmlJNI.ListOfGradientDefinitions_get__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Get a {@link GradientBase} from the {@link ListOfGradientDefinitions} based on its
   * identifier.
   <p>
   * @param sid a string representing the identifier of the {@link GradientBase} to
   * retrieve.
   <p>
   * @return the {@link GradientBase} in this {@link ListOfGradientDefinitions} with the given
   * <code>sid</code> or <code>null</code> if no such {@link GradientBase} exists.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 GradientBase get(String sid) {
  return (GradientBase) libsbml.DowncastSBase(libsbmlJNI.ListOfGradientDefinitions_get__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Removes the nth {@link GradientBase} from this {@link ListOfGradientDefinitions} and
   * returns a pointer to it.
   <p>
   * @param n a long integer representing the index of the {@link GradientBase} to
   * remove.
   <p>
   * @return a pointer to the nth {@link GradientBase} in this
   * {@link ListOfGradientDefinitions}.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   */ public
 SBase remove(long n) {
  return (GradientBase) libsbml.DowncastSBase(libsbmlJNI.ListOfGradientDefinitions_remove__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes the {@link GradientBase} from this {@link ListOfGradientDefinitions} based on its
   * identifier and returns a pointer to it.
   <p>
   * @param sid a string representing the identifier of the {@link GradientBase} to
   * remove.
   <p>
   * @return the {@link GradientBase} in this {@link ListOfGradientDefinitions} based on the
   * identifier or null if no such {@link GradientBase} exists.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(long n)
   */ public
 GradientBase remove(String sid) {
  return (GradientBase) libsbml.DowncastSBase(libsbmlJNI.ListOfGradientDefinitions_remove__SWIG_1(swigCPtr, this, sid), true);
}

  
/**
   * Adds a copy of the given {@link GradientBase} to this {@link ListOfGradientDefinitions}.
   <p>
   * @param gb the {@link GradientBase} object to add.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * <li> {@link libsbmlConstants#LIBSBML_LEVEL_MISMATCH LIBSBML_LEVEL_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_VERSION_MISMATCH LIBSBML_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_PKG_VERSION_MISMATCH LIBSBML_PKG_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_DUPLICATE_OBJECT_ID LIBSBML_DUPLICATE_OBJECT_ID}
   *
   * </ul> <p>
   * <p>
 * @note This method should be used with some caution.  The fact that this
 * method <em>copies</em> the object passed to it means that the caller will be
 * left holding a physically different object instance than the one contained
 * inside this object.  Changes made to the original object instance (such as
 * resetting attribute values) will <em>not affect the instance in this
 * object</em>.  In addition, the caller should make sure to free the
 * original object if it is no longer being used, or else a memory leak will
 * result.  Please see other methods on this class (particularly a
 * corresponding method whose name begins with the word <code>create</code>)
 * for alternatives that do not lead to these issues.
   <p>
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 int addGradientBase(GradientBase gb) {
    return libsbmlJNI.ListOfGradientDefinitions_addGradientBase(swigCPtr, this, GradientBase.getCPtr(gb), gb);
  }

  
/**
   * Get the number of {@link GradientBase} objects in this {@link ListOfGradientDefinitions}.
   <p>
   * @return the number of {@link GradientBase} objects in this
   * {@link ListOfGradientDefinitions}.
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #createLinearGradient() 
   * @see createRadialGradient
   * @see #get(String sid)
   * @see #get(long n)
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 long getNumGradientBases() {
    return libsbmlJNI.ListOfGradientDefinitions_getNumGradientBases(swigCPtr, this);
  }

  
/**
   * Creates a new {@link LinearGradient} object, adds it to this
   * {@link ListOfGradientDefinitions} object and returns the {@link LinearGradient} object
   * created.
   <p>
   * @return a new {@link LinearGradient} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 LinearGradient createLinearGradient() {
    long cPtr = libsbmlJNI.ListOfGradientDefinitions_createLinearGradient(swigCPtr, this);
    return (cPtr == 0) ? null : new LinearGradient(cPtr, false);
  }

  
/**
   * Creates a new {@link RadialGradient} object, adds it to this
   * {@link ListOfGradientDefinitions} object and returns the {@link RadialGradient} object
   * created.
   <p>
   * @return a new {@link RadialGradient} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGradientBase(GradientBase object)
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGradientBases()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 RadialGradient createRadialGradient() {
    long cPtr = libsbmlJNI.ListOfGradientDefinitions_createRadialGradient(swigCPtr, this);
    return (cPtr == 0) ? null : new RadialGradient(cPtr, false);
  }

  
/**
   * Returns the XML element name of this {@link ListOfGradientDefinitions} object.
   <p>
   * For {@link ListOfGradientDefinitions}, the XML element name is always
   * <code>'listOfGradientDefinitions'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfGradientDefinitions'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfGradientDefinitions_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link ListOfGradientDefinitions} object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   */ public
 int getTypeCode() {
    return libsbmlJNI.ListOfGradientDefinitions_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the SBML objects contained in this
   * {@link ListOfGradientDefinitions} object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML typecode for the objects contained in this
   * ListOfGradientDefinitions:
   * {@link libsbmlConstants#SBML_RENDER_GRADIENTDEFINITION SBML_RENDER_GRADIENTDEFINITION}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfGradientDefinitions_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link ListOfGradientDefinitions} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link ListOfGradientDefinitions} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.ListOfGradientDefinitions_toXML(swigCPtr, this), true);
  }

}
