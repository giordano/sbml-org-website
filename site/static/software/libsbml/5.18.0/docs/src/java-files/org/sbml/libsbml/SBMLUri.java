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
 Utility class for handling URIs.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * This class implements functionality for parsing URIs and extracting
 * information about them.
 <p>
 * @see SBMLResolver
 * @see SBMLFileResolver
 */

public class SBMLUri {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLUri(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLUri obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLUri obj)
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
        libsbmlJNI.delete_SBMLUri(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/**
   * Creates a new {@link SBMLUri} from the given string URI.
   */ public
 SBMLUri(String uri) {
    this(libsbmlJNI.new_SBMLUri__SWIG_0(uri), true);
  }

  
/**
   * Copy constructor.  Creates a copy of an {@link SBMLUri} object.
   <p>
   * @param orig the {@link SBMLUri} object to copy.
   */ public
 SBMLUri(SBMLUri orig) {
    this(libsbmlJNI.new_SBMLUri__SWIG_1(SBMLUri.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLUri} object.
   <p>
   * @return a (deep) copy of this {@link SBMLFileResolver} object.
   */ public
 SBMLUri cloneObject() {
    long cPtr = libsbmlJNI.SBMLUri_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SBMLUri(cPtr, true);
  }

  
/**
   * Returns the scheme of the stored URI.
   <p>
   * The <em>scheme</em> of the URI is the text before the first colon character.
   * Typical examples of what this might return are the strings <code>'file'</code> or
   * <code>'http'.</code>  If the current URI does not have a scheme, this method
   * returns an empty string.
   <p>
   * @return the parsed scheme, such as <code>'http'</code>, or an empty string if no
   * scheme exists for the current URI.
   */ public
 String getScheme() {
    return libsbmlJNI.SBMLUri_getScheme(swigCPtr, this);
  }

  
/**
   * Returns the host portion of the stored URI.
   <p>
   * For a scheme such as <code>'http'</code>, this method returns the part of the URI
   * after <code>'http:</code>//' and before the next <code>'</code>/' character.  URIs with file
   * or URN schemes have no host; in that case, this method returns an empty
   * string.
   <p>
   * @return the host of the URI, or an empty string in the case of files
   * or URNs schemes that do not possess a host portion.
   */ public
 String getHost() {
    return libsbmlJNI.SBMLUri_getHost(swigCPtr, this);
  }

  
/**
   * Returns the path and filename portion of the stored URI.
   <p>
   * This method returns the text after the scheme, colon, and host (if
   * present), and before the next <code>'?'</code> character.  The result may be an
   * empty string for some URIs.
   <p>
   * @return the path of the URI (i.e., the full filename with path).
   */ public
 String getPath() {
    return libsbmlJNI.SBMLUri_getPath(swigCPtr, this);
  }

  
/**
   * Returns the query portion of the stored URI.
   <p>
   * The equery portion of a URI is the text after a filename, starting with
   * the character <code>'?'.</code>  For many URIs, this is an empty string.
   <p>
   * @return the query of the URI (i.e., the part after the full filename
   * with path).
   */ public
 String getQuery() {
    return libsbmlJNI.SBMLUri_getQuery(swigCPtr, this);
  }

  
/**
   * Returns the full stored URI, after replacing backslashes with slashes.
   <p>
   * @return the original URI, with backslashes replaced with slashes.
   */ public
 String getUri() {
    return libsbmlJNI.SBMLUri_getUri(swigCPtr, this);
  }

  
/**
   * Constructs a new URI relative to this object and the given URI.
   <p>
   * For example,
   <p>
<pre class='fragment'>
{@link SBMLUri}('c:\test').relativeTo('test.xml');
</pre>
<p>
   * would construct a new file URI, with path
   * <code>c:/test/test.xml</code>.
   <p>
   * @param uri a URI to be added to this object.
   <p>
   * @return the resulting new URI.
   */ public
 SBMLUri relativeTo(String uri) {
    return new SBMLUri(libsbmlJNI.SBMLUri_relativeTo(swigCPtr, this, uri), true);
  }

}
