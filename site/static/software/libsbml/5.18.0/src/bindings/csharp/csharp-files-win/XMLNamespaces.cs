//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace libsbml {

 using System;
 using System.Runtime.InteropServices;

/** 
 * @sbmlpackage{core}
 *
@htmlinclude pkg-marker-core.html An XML Namespace.
 *
 * @htmlinclude not-sbml-warning.html
 *
 * This class serves to organize functionality for tracking XML namespaces
 * in a document or data stream.  The namespace declarations are stored as
 * a list of pairs of XML namespace URIs and prefix strings.  These
 * correspond to the parts of a namespace declaration on an XML element.
 * For example, in the following XML fragment,
 * @verbatim
<annotation>
    <mysim:nodecolors xmlns:mysim='urn:lsid:mysim.org'
         mysim:bgcolor='green' mysim:fgcolor='white'/>
</annotation>
@endverbatim
 * there is one namespace declaration.  Its URI is
 * <code>urn:lsid:mysim.org</code> and its prefix is <code>mysim</code>.
 * This pair could be stored as one item in an XMLNamespaces list.
 *
 * XMLNamespaces provides various methods for manipulating the list of
 * prefix-URI pairs.  Individual namespaces stored in a given XMLNamespace
 * object instance can be retrieved based on their index using
 * XMLNamespaces::getPrefix(int index), or by their characteristics such as
 * their URI or position in the list.
 */

public class XMLNamespaces : global::System.IDisposable {
	private HandleRef swigCPtr;
	protected bool swigCMemOwn;
	
	internal XMLNamespaces(IntPtr cPtr, bool cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr    = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(XMLNamespaces obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (XMLNamespaces obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~XMLNamespaces() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_XMLNamespaces(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public static bool operator==(XMLNamespaces lhs, XMLNamespaces rhs)
  {
    if((Object)lhs == (Object)rhs)
    {
      return true;
    }

    if( ((Object)lhs == null) || ((Object)rhs == null) )
    {
      return false;
    }

    return (getCPtr(lhs).Handle.ToString() == getCPtr(rhs).Handle.ToString());
  }

  public static bool operator!=(XMLNamespaces lhs, XMLNamespaces rhs)
  {
    return !(lhs == rhs);
  }

  public override bool Equals(Object sb)
  {
    if ( ! (sb is XMLNamespaces) )
    {
      return false;
    }

    return this == (XMLNamespaces)sb;
  }

  public override int GetHashCode()
  {
    return swigCPtr.Handle.ToInt32();
  }

  
/**
   * Creates a new empty list of XML namespace declarations.
   */ public
 XMLNamespaces() : this(libsbmlPINVOKE.new_XMLNamespaces__SWIG_0(), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Copy constructor; creates a copy of this XMLNamespaces list.
   *
   * @param orig the XMLNamespaces object to copy.
   */ public
 XMLNamespaces(XMLNamespaces orig) : this(libsbmlPINVOKE.new_XMLNamespaces__SWIG_1(XMLNamespaces.getCPtr(orig)), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Creates and returns a deep copy of this XMLNamespaces object.
   *
   * @return the (deep) copy of this XMLNamespaces object.
   */ public
 XMLNamespaces clone() {
    global::System.IntPtr cPtr = libsbmlPINVOKE.XMLNamespaces_clone(swigCPtr);
    XMLNamespaces ret = (cPtr == global::System.IntPtr.Zero) ? null : new XMLNamespaces(cPtr, true);
    return ret;
  }

  
/**
   * Appends an XML namespace prefix and URI pair to this list of namespace
   * declarations.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  If there is an XML namespace with the given @p uri prefix
   * in this list, then its corresponding URI will be overwritten by the
   * new @p uri unless the uri represents the core sbml namespace.
   * Calling programs could use one of the other XMLNamespaces
   * methods, such as
   * XMLNamespaces::hasPrefix(@if java String@endif) and 
   * XMLNamespaces::hasURI(@if java String@endif) to
   * inquire whether a given prefix and/or URI
   * is already present in this XMLNamespaces object.
   * If the @p uri represents the sbml namespaces then it will not be
   * overwritten, as this has potentially serious consequences. If it
   * is necessary to replace the sbml namespace the namespace should be removed
   * prior to adding the new namespace.
   *
   * @param uri a string, the uri for the namespace.
   * @param prefix a string, the prefix for the namespace.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT@endlink
   * @li @link libsbml#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED@endlink
   *
   * @ifnot hasDefaultArgs @htmlinclude warn-default-args-in-docs.html @endif
   */ public
 int add(string uri, string prefix) {
    int ret = libsbmlPINVOKE.XMLNamespaces_add__SWIG_0(swigCPtr, uri, prefix);
    return ret;
  }

  
/**
   * Appends an XML namespace prefix and URI pair to this list of namespace
   * declarations.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  If there is an XML namespace with the given @p uri prefix
   * in this list, then its corresponding URI will be overwritten by the
   * new @p uri unless the uri represents the core sbml namespace.
   * Calling programs could use one of the other XMLNamespaces
   * methods, such as
   * XMLNamespaces::hasPrefix(@if java String@endif) and 
   * XMLNamespaces::hasURI(@if java String@endif) to
   * inquire whether a given prefix and/or URI
   * is already present in this XMLNamespaces object.
   * If the @p uri represents the sbml namespaces then it will not be
   * overwritten, as this has potentially serious consequences. If it
   * is necessary to replace the sbml namespace the namespace should be removed
   * prior to adding the new namespace.
   *
   * @param uri a string, the uri for the namespace.
   * @param prefix a string, the prefix for the namespace.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT@endlink
   * @li @link libsbml#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED@endlink
   *
   * @ifnot hasDefaultArgs @htmlinclude warn-default-args-in-docs.html @endif
   */ public
 int add(string uri) {
    int ret = libsbmlPINVOKE.XMLNamespaces_add__SWIG_1(swigCPtr, uri);
    return ret;
  }

  
/**
   * Removes an XML Namespace stored in the given position of this list.
   *
   * @param index an integer, position of the namespace to remove.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INDEX_EXCEEDS_SIZE LIBSBML_INDEX_EXCEEDS_SIZE@endlink
   */ public
 int remove(int index) {
    int ret = libsbmlPINVOKE.XMLNamespaces_remove__SWIG_0(swigCPtr, index);
    return ret;
  }

  
/**
   * Removes an XML Namespace with the given prefix.
   *
   * @param prefix a string, prefix of the required namespace.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INDEX_EXCEEDS_SIZE LIBSBML_INDEX_EXCEEDS_SIZE@endlink
   *
   * @see remove(int index)
   */ public
 int remove(string prefix) {
    int ret = libsbmlPINVOKE.XMLNamespaces_remove__SWIG_1(swigCPtr, prefix);
    return ret;
  }

  
/**
   * Clears (deletes) all XML namespace declarations in this XMLNamespaces
   * object.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED@endlink
   *
   * @see remove(int index)
   */ public
 int clear() {
    int ret = libsbmlPINVOKE.XMLNamespaces_clear(swigCPtr);
    return ret;
  }

  
/**
   * Look up the index of an XML namespace declaration by URI.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  If this XMLNamespaces object contains a pair with the given
   * URI @p uri, this method returns its index in the list.
   *
   * @param uri a string, the URI of the sought-after namespace.
   *
   * @return the index of the given declaration, or <code>-1</code> if not
   * present.
   */ public
 int getIndex(string uri) {
    int ret = libsbmlPINVOKE.XMLNamespaces_getIndex(swigCPtr, uri);
    return ret;
  }

  
/**
   * Tests whether the given uri is contained in this set of namespaces. 
   * 
   */ public
 bool containsUri(string uri) {
    bool ret = libsbmlPINVOKE.XMLNamespaces_containsUri(swigCPtr, uri);
    return ret;
  }

  
/**
   * Look up the index of an XML namespace declaration by @p prefix.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  If this XMLNamespaces object contains a pair with the given
   * prefix @p prefix, this method returns its index in the list.
   *
   * @param prefix a string, the prefix string of the sought-after
   * namespace.
   *
   * @return the index of the given declaration, or <code>-1</code> if not
   * present.
   */ public
 int getIndexByPrefix(string prefix) {
    int ret = libsbmlPINVOKE.XMLNamespaces_getIndexByPrefix(swigCPtr, prefix);
    return ret;
  }

  
/**
   * Returns the total number of URI-and-prefix pairs stored in this
   * particular XMLNamespaces instance.
   *
   * @return the number of namespaces in this list.
   */ public
 int getLength() {
    int ret = libsbmlPINVOKE.XMLNamespaces_getLength(swigCPtr);
    return ret;
  }

  
/**
   * Returns the total number of URI-and-prefix pairs stored in this
   * particular XMLNamespaces instance.
   *
   * @return the number of namespaces in this list.
   *
   * This function is an alias for getLength introduced for consistency
   * with other XML classes.
   */ public
 int getNumNamespaces() {
    int ret = libsbmlPINVOKE.XMLNamespaces_getNumNamespaces(swigCPtr);
    return ret;
  }

  
/**
   * Look up the prefix of an XML namespace declaration by its position.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  This method returns the prefix of the <code>n</code>th
   * element in that list (if it exists).  Callers should use
   * XMLAttributes::getLength() first to find out how many namespaces are
   * stored in the list.
   *
   * @param index an integer, position of the sought-after prefix.
   *
   * @return the prefix of an XML namespace declaration in this list (by
   * position), or an empty string if the @p index is out of range.
   *
   * @see getLength()
   */ public
 string getPrefix(int index) {
    string ret = libsbmlPINVOKE.XMLNamespaces_getPrefix__SWIG_0(swigCPtr, index);
    return ret;
  }

  
/**
   * Look up the prefix of an XML namespace declaration by its URI.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  This method returns the prefix for a pair that has the
   * given @p uri.
   *
   * @param uri a string, the URI of the prefix being sought.
   *
   * @return the prefix of an XML namespace declaration given its URI, or
   * an empty string if no such @p uri exists in this XMLNamespaces object.
   */ public
 string getPrefix(string uri) {
    string ret = libsbmlPINVOKE.XMLNamespaces_getPrefix__SWIG_1(swigCPtr, uri);
    return ret;
  }

  
/**
   * Look up the URI of an XML namespace declaration by its position.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  This method returns the URI of the <code>n</code>th element
   * in that list (if it exists).  Callers should use
   * XMLAttributes::getLength() first to find out how many namespaces are
   * stored in the list.
   *
   * @param index an integer, position of the required URI.
   *
   * @return the URI of an XML namespace declaration in this list (by
   * position), or an empty string if the @p index is out of range.
   *
   * @see getLength()
   */ public
 string getURI(int index) {
    string ret = libsbmlPINVOKE.XMLNamespaces_getURI__SWIG_0(swigCPtr, index);
    return ret;
  }

  
/**
   * Look up the URI of an XML namespace declaration by its prefix.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  This method returns the namespace URI for a pair that has
   * the given @p prefix.
   *
   * @param prefix a string, the prefix of the required URI.
   *
   * @return the URI of an XML namespace declaration having the given @p
   * prefix, or an empty string if no such prefix-and-URI pair exists
   * in this XMLNamespaces object.
   *
   * @ifnot hasDefaultArgs @htmlinclude warn-default-args-in-docs.html @endif
   * 
   * @see getURI()
   */ public
 string getURI(string prefix) {
    string ret = libsbmlPINVOKE.XMLNamespaces_getURI__SWIG_1(swigCPtr, prefix);
    return ret;
  }

  
/**
   * Look up the URI of an XML namespace declaration by its prefix.
   *
   * An XMLNamespaces object stores a list of pairs of namespaces and their
   * prefixes.  This method returns the namespace URI for a pair that has
   * the given @p prefix.
   *
   * @param prefix a string, the prefix of the required URI.
   *
   * @return the URI of an XML namespace declaration having the given @p
   * prefix, or an empty string if no such prefix-and-URI pair exists
   * in this XMLNamespaces object.
   *
   * @ifnot hasDefaultArgs @htmlinclude warn-default-args-in-docs.html @endif
   * 
   * @see getURI()
   */ public
 string getURI() {
    string ret = libsbmlPINVOKE.XMLNamespaces_getURI__SWIG_2(swigCPtr);
    return ret;
  }

  
/**
   * Predicate returning @c true or @c false depending on whether this
   * XMLNamespaces list is empty.
   * 
   * @return @c true if this XMLNamespaces list is empty, @c false otherwise.
   */ public
 bool isEmpty() {
    bool ret = libsbmlPINVOKE.XMLNamespaces_isEmpty(swigCPtr);
    return ret;
  }

  
/**
   * Predicate returning @c true or @c false depending on whether an XML
   * Namespace with the given URI is contained in this XMLNamespaces list.
   * 
   * @param uri a string, the uri for the namespace.
   *
   * @return @c true if an XML Namespace with the given URI is contained in
   * this XMLNamespaces list, @c false otherwise.
   */ public
 bool hasURI(string uri) {
    bool ret = libsbmlPINVOKE.XMLNamespaces_hasURI(swigCPtr, uri);
    return ret;
  }

  
/**
   * Predicate returning @c true or @c false depending on whether an XML
   * Namespace with the given prefix is contained in this XMLNamespaces
   * list.
   *
   * @param prefix a string, the prefix for the namespace.
   * 
   * @return @c true if an XML Namespace with the given URI is contained in
   * this XMLNamespaces list, @c false otherwise.
   */ public
 bool hasPrefix(string prefix) {
    bool ret = libsbmlPINVOKE.XMLNamespaces_hasPrefix(swigCPtr, prefix);
    return ret;
  }

  
/**
   * Predicate returning @c true or @c false depending on whether an XML
   * Namespace with the given URI and prefix pair is contained in this
   * XMLNamespaces list.
   *
   * @param uri a string, the URI for the namespace.
   * @param prefix a string, the prefix for the namespace.
   * 
   * @return @c true if an XML Namespace with the given uri/prefix pair is
   * contained in this XMLNamespaces list, @c false otherwise.
   */ public
 bool hasNS(string uri, string prefix) {
    bool ret = libsbmlPINVOKE.XMLNamespaces_hasNS(swigCPtr, uri, prefix);
    return ret;
  }

}

}
