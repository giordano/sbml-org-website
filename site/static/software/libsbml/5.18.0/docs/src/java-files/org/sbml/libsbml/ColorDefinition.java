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

 Definition of an identifier for an RGBA color value.
 <p>
 * A <em>ColorDefinition</em> defines an identifier representing an RGBA value,
 * which can then be referenced in other render extension constructs.  For
 * example, an identifier can be defined for 'lightyellow' and this may be
 * more descriptive to use in graphs of models than the corresponding RGBA
 * value.
 <p>
 * A {@link ColorDefinition} has two mandatory attributes: the id for the color
 * definition and the corresponding RGBA value. The RGBA value has the same
 * notation as in HTML files or CSS style sheets. It starts with the <code>#</code>
 * character followed by 8 digit hexadecimal string.  Optionally the alpha
 * part can be omitted, in which case it defaults to <code>FF.</code>
 <p>
 * Examples of valid values strings are <code>'#000000'</code> and <code>'#000000FF'</code> for
 * fully opaque black, and <code>'#FF000010'</code> for an almost completely
 * transparent red.
 <p>
 * Internally, the RGBA components are stored as integer values in the range
 * of 0 to 255 and most methods in the implementation of the libSBML
 * &ldquo;render&rdquo; extension use integer values instead of the
 * hexadecimal value string.
 */

public class ColorDefinition extends SBase {
   private long swigCPtr;

   protected ColorDefinition(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ColorDefinition_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ColorDefinition obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ColorDefinition obj)
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
        libsbmlJNI.delete_ColorDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ColorDefinition} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ColorDefinition}.
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
 ColorDefinition(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ColorDefinition}.
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
 ColorDefinition(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ColorDefinition}.
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
 ColorDefinition(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ColorDefinition}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ColorDefinition}.
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
 ColorDefinition() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} using the given {@link RenderPkgNamespaces} object.
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
 ColorDefinition(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} object from the given {@link XMLNode} object.
   <p>
   * The {@link XMLNode} object must contain a valid XML representation of a
   * {@link ColorDefinition} object as defined in the &ldquo;render&rdquo; package
   * specification.  This method is normally called when &ldquo;render&rdquo;
   * information is read from a file and should normally not have to be
   * called explicitly.
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link ColorDefinition}
   * object to be instantiated.
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 ColorDefinition(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link ColorDefinition} object from the given {@link XMLNode} object.
   <p>
   * The {@link XMLNode} object must contain a valid XML representation of a
   * {@link ColorDefinition} object as defined in the &ldquo;render&rdquo; package
   * specification.  This method is normally called when &ldquo;render&rdquo;
   * information is read from a file and should normally not have to be
   * called explicitly.
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link ColorDefinition}
   * object to be instantiated.
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 ColorDefinition(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Constructor which sets the {@link ColorDefinition} to the given RGBA values.
   <p>
   * @param renderns The namespace object for the Render package.
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
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
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 ColorDefinition(RenderPkgNamespaces renderns, short r, short g, short b, short a) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_7(RenderPkgNamespaces.getCPtr(renderns), renderns, r, g, b, a), true);
  }

  
/**
   * Constructor which sets the {@link ColorDefinition} to the given RGBA values.
   <p>
   * @param renderns The namespace object for the Render package.
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
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
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 ColorDefinition(RenderPkgNamespaces renderns, short r, short g, short b) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_8(RenderPkgNamespaces.getCPtr(renderns), renderns, r, g, b), true);
  }

  
/**
   * Constructor which sets the {@link ColorDefinition} to completely opaque
   * black and sets the id to the given string.
   <p>
   * @param renderns The namespace object for the Render package.
   * @param id the id of the color definition. The user has to make sure 
   * that the id is unique within the given set of color definitions. 
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
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 ColorDefinition(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_9(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Constructor which sets the {@link ColorDefinition} to the given RGBA values
   * and sets the id.
   <p>
   * @param renderns The namespace object for the Render package.
   * @param id the id of the color definition. The user has to make sure 
   * that the id is unique within the given set of color definitions. 
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
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
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 ColorDefinition(RenderPkgNamespaces renderns, String id, short r, short g, short b, short a) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_10(RenderPkgNamespaces.getCPtr(renderns), renderns, id, r, g, b, a), true);
  }

  
/**
   * Constructor which sets the {@link ColorDefinition} to the given RGBA values
   * and sets the id.
   <p>
   * @param renderns The namespace object for the Render package.
   * @param id the id of the color definition. The user has to make sure 
   * that the id is unique within the given set of color definitions. 
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
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
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 ColorDefinition(RenderPkgNamespaces renderns, String id, short r, short g, short b) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_11(RenderPkgNamespaces.getCPtr(renderns), renderns, id, r, g, b), true);
  }

  
/**
   * Copy constructor for {@link ColorDefinition}.
   <p>
   * @param orig the {@link ColorDefinition} instance to copy.
   */ public
 ColorDefinition(ColorDefinition orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ColorDefinition__SWIG_12(ColorDefinition.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ColorDefinition} object.
   <p>
   * @return a (deep) copy of this {@link ColorDefinition} object.
   */ public
 ColorDefinition cloneObject() {
    long cPtr = libsbmlJNI.ColorDefinition_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ColorDefinition(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link ColorDefinition}.
   <p>
   * @return the value of the 'id' attribute of this {@link ColorDefinition} as a
   * string.
   */ public
 String getId() {
    return libsbmlJNI.ColorDefinition_getId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this {@link ColorDefinition}.
   <p>
   * @return the value of the 'name' attribute of this {@link ColorDefinition} as a
   * string.
   */ public
 String getName() {
    return libsbmlJNI.ColorDefinition_getName(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'value' attribute of this {@link ColorDefinition}.
   <p>
   * @return the value of the 'value' attribute of this {@link ColorDefinition} as a
   * string.
   */ public
 String getValue() {
    return libsbmlJNI.ColorDefinition_getValue(swigCPtr, this);
  }

  
/**
   * Returns the red color component.
   <p>
   * @return the red color component for the {@link ColorDefinition}.
   */ public
 short getRed() {
    return libsbmlJNI.ColorDefinition_getRed(swigCPtr, this);
  }

  
/**
   * Returns the green color component.
   <p>
   * @return the green color component for the {@link ColorDefinition}.
   */ public
 short getGreen() {
    return libsbmlJNI.ColorDefinition_getGreen(swigCPtr, this);
  }

  
/**
   * Returns the blue color component.
   <p>
   * @return the blue color component for the {@link ColorDefinition}.
   */ public
 short getBlue() {
    return libsbmlJNI.ColorDefinition_getBlue(swigCPtr, this);
  }

  
/**
   * Returns the alpha color component.
   <p>
   * @return the alpha color component for the {@link ColorDefinition}.
   */ public
 short getAlpha() {
    return libsbmlJNI.ColorDefinition_getAlpha(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ColorDefinition}'s 'id' attribute is
   * set.
   <p>
   * @return <code>true</code> if this {@link ColorDefinition}'s 'id' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.ColorDefinition_isSetId(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ColorDefinition}'s 'name' attribute is
   * set.
   <p>
   * @return <code>true</code> if this {@link ColorDefinition}'s 'name' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.ColorDefinition_isSetName(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ColorDefinition}'s 'value' attribute is
   * set.
   <p>
   * @return <code>true</code> if this {@link ColorDefinition}'s 'value' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetValue() {
    return libsbmlJNI.ColorDefinition_isSetValue(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link ColorDefinition}.
   <p>
   * @param id String& value of the 'id' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   *
   * </ul> <p>
   * Calling this function with <code>id</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetId().
   */ public
 int setId(String id) {
    return libsbmlJNI.ColorDefinition_setId(swigCPtr, this, id);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link ColorDefinition}.
   <p>
   * @param name String& value of the 'name' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   *
   * </ul> <p>
   * Calling this function with <code>name</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetName().
   */ public
 int setName(String name) {
    return libsbmlJNI.ColorDefinition_setName(swigCPtr, this, name);
  }

  
/**
   * Sets the value of the 'value' attribute of this {@link ColorDefinition}.
   <p>
   * @param value String& value of the 'value' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   *
   * </ul> <p>
   * Calling this function with <code>value</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetValue().
   */ public
 int setValue(String value) {
    return libsbmlJNI.ColorDefinition_setValue(swigCPtr, this, value);
  }

  
/**
   * Sets the red color component.
   <p>
   * @param c the new red component value for the color definition.
   */ public
 void setRed(short c) {
    libsbmlJNI.ColorDefinition_setRed(swigCPtr, this, c);
  }

  
/**
   * Sets the green color component.
   <p>
   * @param c the new green component value for the color definition.
   */ public
 void setGreen(short c) {
    libsbmlJNI.ColorDefinition_setGreen(swigCPtr, this, c);
  }

  
/**
   * Sets the blue color component.
   <p>
   * @param c the new blue component value for the color definition.
   */ public
 void setBlue(short c) {
    libsbmlJNI.ColorDefinition_setBlue(swigCPtr, this, c);
  }

  
/**
   * Sets alpha red color component.
   <p>
   * @param c the new alpha component value for the color definition.
   */ public
 void setAlpha(short c) {
    libsbmlJNI.ColorDefinition_setAlpha(swigCPtr, this, c);
  }

  
/**
   * Sets the red green, blue and alpha color component.
   * The alpha value is optional and defaults to 255 if not given.
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
   */ public
 void setRGBA(short r, short g, short b, short a) {
    libsbmlJNI.ColorDefinition_setRGBA__SWIG_0(swigCPtr, this, r, g, b, a);
  }

  
/**
   * Sets the red green, blue and alpha color component.
   * The alpha value is optional and defaults to 255 if not given.
   * @param r Red component value. Has to be in the range of 0 to 255.
   * @param g Green component value. Has to be in the range of 0 to 255.
   * @param b Blue component value. Has to be in the range of 0 to 255.
   * @param a Alpha component value. Has to be in the range of 0 to 255. 
   * The alpha component can be omitted. In that case it has a default value of 255.
   */ public
 void setRGBA(short r, short g, short b) {
    libsbmlJNI.ColorDefinition_setRGBA__SWIG_1(swigCPtr, this, r, g, b);
  }

  
/**
   * Sets the color value from a given value string.
   <p>
   * If the string is not a valid value string, the color value is set to
   * black and <code>false</code> is returned.
   <p>
   * @param valueString A  reference to a string that represents a valid
   * color value, e.g. <code>'#FFFFFFFF'</code> for fully opaque white.
   <p>
   * @return <code>true</code> or <code>false</code> depending on whether setting the color value
   * from the string was successfull.
   */ public
 boolean setColorValue(String valueString) {
    return libsbmlJNI.ColorDefinition_setColorValue(swigCPtr, this, valueString);
  }

  
/**
   * Creates a string that represents the current color value.
   <p>
   * @return The string representation of the color value.
   */ public
 String createValueString() {
    return libsbmlJNI.ColorDefinition_createValueString(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link ColorDefinition}.
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
 int unsetId() {
    return libsbmlJNI.ColorDefinition_unsetId(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'name' attribute of this {@link ColorDefinition}.
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
 int unsetName() {
    return libsbmlJNI.ColorDefinition_unsetName(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'value' attribute of this {@link ColorDefinition}.
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
 int unsetValue() {
    return libsbmlJNI.ColorDefinition_unsetValue(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link ColorDefinition} object.
   <p>
   * For {@link ColorDefinition}, the XML element name is always <code>'colorDefinition'.</code>
   <p>
   * @return the name of this element, i.e. <code>'colorDefinition'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ColorDefinition_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link ColorDefinition} object.
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
   * {@link libsbmlConstants#SBML_RENDER_COLORDEFINITION SBML_RENDER_COLORDEFINITION}.
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
 int getTypeCode() {
    return libsbmlJNI.ColorDefinition_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link ColorDefinition} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link ColorDefinition} have been set, otherwise <code>false</code> is returned.
   <p>
   * @note The required attributes for the {@link ColorDefinition} object are:
   * <ul>
   * <li> 'id'
   * <li> 'value'
   * </ul>
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.ColorDefinition_hasRequiredAttributes(swigCPtr, this);
  }

  
/** * @internal */ public
 boolean hasRequiredAttributesNoDefaults() {
    return libsbmlJNI.ColorDefinition_hasRequiredAttributesNoDefaults(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ColorDefinition_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link ColorDefinition} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link ColorDefinition} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.ColorDefinition_toXML(swigCPtr, this), true);
  }

}