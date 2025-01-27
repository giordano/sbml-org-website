/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-layout"><a href="group__layout.html">layout</a></span>

 Connection between an object and a glyph.
 <p>
 * The {@link ReferenceGlyph} element describes the graphical connection between an
 * arbitrary {@link GraphicalObject} (or derived element) and a {@link GeneralGlyph} (which
 * would be an arrow or some curve in most cases). A {@link ReferenceGlyph} inherits
 * from {@link GraphicalObject}. Additionally it has a mandatory attribute 'glyph'
 * and two optional attributes 'reference' and 'role'. Optionally, the
 * {@link ReferenceGlyph} also has an element 'curve'.  The {@link ReferenceGlyph} should
 * either contain a bounding box or a curve specification.  If both are
 * given, the bounding box should be ignored.
 */

public class ReferenceGlyph extends GraphicalObject {
   private long swigCPtr;

   protected ReferenceGlyph(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ReferenceGlyph_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ReferenceGlyph obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ReferenceGlyph obj)
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
        libsbmlJNI.delete_ReferenceGlyph(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ReferenceGlyph} with the given SBML level, version and
   * package version.  The id if the associated 
   * reference and the id of the associated  glyph are set to the
   * empty string.  The role is set to empty.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
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
 ReferenceGlyph(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph} with the given SBML level, version and
   * package version.  The id if the associated 
   * reference and the id of the associated  glyph are set to the
   * empty string.  The role is set to empty.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
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
 ReferenceGlyph(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph} with the given SBML level, version and
   * package version.  The id if the associated 
   * reference and the id of the associated  glyph are set to the
   * empty string.  The role is set to empty.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
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
 ReferenceGlyph(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph} with the given SBML level, version and
   * package version.  The id if the associated 
   * reference and the id of the associated  glyph are set to the
   * empty string.  The role is set to empty.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
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
 ReferenceGlyph() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_3(), true);
  }

  
/**
   * Constructor.
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
   * @param layoutns the {@link LayoutPkgNamespaces} object.
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
 ReferenceGlyph(LayoutPkgNamespaces layoutns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_4(LayoutPkgNamespaces.getCPtr(layoutns), layoutns), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph}.  The id is given as the first
   * argument, the id of the associated glyph is given as the
   * second argument.  The third argument is the id of the associated
   * reference and the fourth argument is the role.
   */ public
 ReferenceGlyph(LayoutPkgNamespaces layoutns, String sid, String glyphId, String referenceId, String role) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_5(LayoutPkgNamespaces.getCPtr(layoutns), layoutns, sid, glyphId, referenceId, role), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph} from the given {@link XMLNode}
   */ public
 ReferenceGlyph(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_6(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link ReferenceGlyph} from the given {@link XMLNode}
   */ public
 ReferenceGlyph(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_7(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Copy constructor.
   <p>
   * @param source the instance to copy.
   */ public
 ReferenceGlyph(ReferenceGlyph source) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ReferenceGlyph__SWIG_8(ReferenceGlyph.getCPtr(source), source), true);
  }

  
/**
   * <p>
 * Replaces all uses of a given <code>SIdRef</code> type attribute value with another
 * value.
 <p>
 * <p>
 * In SBML, object identifiers are of a data type called <code>SId</code>.
 * In SBML Level&nbsp;3, an explicit data type called <code>SIdRef</code> was
 * introduced for attribute values that refer to <code>SId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to an identifier', but the effective
 * data type was the same as <code>SIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>SIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 <p>
 * This method works by looking at all attributes and (if appropriate)
 * mathematical formulas in MathML content, comparing the referenced
 * identifiers to the value of <code>oldid</code>.  If any matches are found, the
 * matching values are replaced with <code>newid</code>.  The method does <em>not</em>
 * descend into child elements.
 <p>
 * @param oldid the old identifier.
 * @param newid the new identifier.
   */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.ReferenceGlyph_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * Returns the id of the associated glyph.
   */ public
 String getGlyphId() {
    return libsbmlJNI.ReferenceGlyph_getGlyphId(swigCPtr, this);
  }

  
/**
   * Sets the id of the associated glyph.
   */ public
 void setGlyphId(String glyphId) {
    libsbmlJNI.ReferenceGlyph_setGlyphId(swigCPtr, this, glyphId);
  }

  
/**
   * Returns the id of the associated sbml reference.
   */ public
 String getReferenceId() {
    return libsbmlJNI.ReferenceGlyph_getReferenceId(swigCPtr, this);
  }

  
/**
   * Sets the id of the associated sbml reference.
   */ public
 void setReferenceId(String id) {
    libsbmlJNI.ReferenceGlyph_setReferenceId(swigCPtr, this, id);
  }

  
/**
   * Returns a string representation of the role.
   */ public
 String getRole() {
    return libsbmlJNI.ReferenceGlyph_getRole(swigCPtr, this);
  }

  
/**
   * Sets the role.
   */ public
 void setRole(String role) {
    libsbmlJNI.ReferenceGlyph_setRole(swigCPtr, this, role);
  }

  
/**
   * Returns the curve object for the reference glyph
   */ public
 Curve getCurve() {
    long cPtr = libsbmlJNI.ReferenceGlyph_getCurve__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Curve(cPtr, false);
  }

  
/**
   * Sets the curve object for the reference glyph.
   */ public
 void setCurve(Curve curve) {
    libsbmlJNI.ReferenceGlyph_setCurve(swigCPtr, this, Curve.getCPtr(curve), curve);
  }

  
/**
   * Returns <code>true</code> if the curve consists of one or more segments.
   */ public
 boolean isSetCurve() {
    return libsbmlJNI.ReferenceGlyph_isSetCurve(swigCPtr, this);
  }

  
/** */ public
 boolean getCurveExplicitlySet() {
    return libsbmlJNI.ReferenceGlyph_getCurveExplicitlySet(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if the id of the associated glyph is not the
   * empty string.
   */ public
 boolean isSetGlyphId() {
    return libsbmlJNI.ReferenceGlyph_isSetGlyphId(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if the id of the associated reference is not the
   * empty string.
   */ public
 boolean isSetReferenceId() {
    return libsbmlJNI.ReferenceGlyph_isSetReferenceId(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> of role is different from the empty string.
   */ public
 boolean isSetRole() {
    return libsbmlJNI.ReferenceGlyph_isSetRole(swigCPtr, this);
  }

  
/**
   * Calls initDefaults on {@link GraphicalObject} 
   */ public
 void initDefaults() {
    libsbmlJNI.ReferenceGlyph_initDefaults(swigCPtr, this);
  }

  
/**
   * Creates a new {@link LineSegment} object, adds it to the end of the list of
   * curve segment objects of the curve and returns a reference to the
   * newly created object.
   */ public
 LineSegment createLineSegment() {
	return (LineSegment) libsbml.DowncastSBase(libsbmlJNI.ReferenceGlyph_createLineSegment(swigCPtr, this), false);
}

  
/**
   * Creates a new {@link CubicBezier} object, adds it to the end of the list of
   * curve segment objects of the curve and returns a reference to the
   * newly created object.
   */ public
 CubicBezier createCubicBezier() {
    long cPtr = libsbmlJNI.ReferenceGlyph_createCubicBezier(swigCPtr, this);
    return (cPtr == 0) ? null : new CubicBezier(cPtr, false);
  }

  
/**
   * Returns the XML element name of
   * this SBML object.
   <p>
   * @return the string of the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.ReferenceGlyph_getElementName(swigCPtr, this);
  }

  
/**
   * Creates and returns a deep copy of this {@link ReferenceGlyph}.
   <p>
   * @return a (deep) copy of this {@link ReferenceGlyph}.
   */ public
 ReferenceGlyph cloneObject() {
    long cPtr = libsbmlJNI.ReferenceGlyph_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ReferenceGlyph(cPtr, true);
  }

  
/**
   * Returns the libSBML type code of this object instance.
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
   * {@link libsbmlConstants#SBML_LAYOUT_REFERENCEGLYPH SBML_LAYOUT_REFERENCEGLYPH}.
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
    return libsbmlJNI.ReferenceGlyph_getTypeCode(swigCPtr, this);
  }

  
/**
    * Creates an {@link XMLNode} object from this.
    */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.ReferenceGlyph_toXML(swigCPtr, this), true);
  }

  public void connectToChild() {
    libsbmlJNI.ReferenceGlyph_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ReferenceGlyph_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
