/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base class for SBML converters.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * The {@link SBMLConverter} class is the base class for the various SBML 
 * <em>converters</em>: classes of objects that transform or convert SBML documents.
 * These transformations can involve essentially anything that can be written
 * algorithmically; examples include converting the units of measurement in a
 * model, or converting from one Level+Version combination of SBML to
 * another.  Applications can also create their own converters by subclassing
 * {@link SBMLConverter} and following the examples of the existing converters.
 <p>
 * <p>
 * <h2>General information about the use of SBML converters</h2>
 <p>
 * The use of all the converters follows a similar approach.  First, one
 * creates a {@link ConversionProperties} object and calls
 * {@link ConversionProperties#addOption(ConversionOption)}
 * on this object with one argument: a text string that identifies the desired
 * converter.  (The text string is specific to each converter; consult the
 * documentation for a given converter to find out how it should be enabled.)
 <p>
 * Next, for some converters, the caller can optionally set some
 * converter-specific properties using additional calls to
 * {@link ConversionProperties#addOption(ConversionOption)}.
 * Many converters provide the ability to
 * configure their behavior to some extent; this is realized through the use
 * of properties that offer different options.  The default property values
 * for each converter can be interrogated using the method
 * {@link SBMLConverter#getDefaultProperties()} on the converter class in question .
 <p>
 * Finally, the caller should invoke the method
 * {@link SBMLDocument#convert(ConversionProperties)}
 * with the {@link ConversionProperties} object as an argument.
 <p>
 * <h3>Example of invoking an SBML converter</h3>
 <p>
 * The following code fragment illustrates an example using
 * {@link SBMLReactionConverter}, which is invoked using the option string
 * <code>'replaceReactions':</code>
 <p>
<pre class='fragment'>
{@link ConversionProperties} props = new {@link ConversionProperties}();
if (props != null) {
  props.addOption('replaceReactions');
} else {
  // Deal with error.
}
</pre>
<p>
 * In the case of {@link SBMLReactionConverter}, there are no options to affect
 * its behavior, so the next step is simply to invoke the converter on
 * an {@link SBMLDocument} object.  Continuing the example code:
 <p>
<pre class='fragment'>
  // Assume that the variable 'document' has been set to an {@link SBMLDocument} object.
  status = document.convert(config);
  if (status != libsbml.LIBSBML_OPERATION_SUCCESS)
  {
    // Handle error somehow.
    System.out.println('Error: conversion failed due to the following:');
    document.printErrors();
  }
</pre>
<p>
 * Here is an example of using a converter that offers an option. The
 * following code invokes {@link SBMLStripPackageConverter} to remove the
 * SBML Level&nbsp;3 <em>Layout</em> package from a model.  It sets the name
 * of the package to be removed by adding a value for the option named
 * <code>'package'</code> defined by that converter:
 <p>
<pre class='fragment'>
{@link ConversionProperties} config = new {@link ConversionProperties}();
if (config != None) {
  config.addOption('stripPackage');
  config.addOption('package', 'layout');
  status = document.convert(config);
  if (status != LIBSBML_OPERATION_SUCCESS) {
    // Handle error somehow.
    System.out.println('Error: unable to strip the {@link Layout} package');
    document.printErrors();
  }
} else {
  // Handle error somehow.
  System.out.println('Error: unable to create {@link ConversionProperties} object');
}
</pre>
<p>
 * <h3>Available SBML converters in libSBML</h3>
 <p>
 * LibSBML provides a number of built-in converters; by convention, their
 * names end in <em>Converter</em>. The following are the built-in converters
 * provided by libSBML 5.18.0:
 <p>
 * <p>
 * <ul>
 * <li> {@link CobraToFbcConverter}
 * <li> {@link CompFlatteningConverter}
 * <li> {@link FbcToCobraConverter}
 * <li> {@link FbcV1ToV2Converter}
 * <li> {@link FbcV2ToV1Converter}
 * <li> RenderLayoutConverter
 * <li> {@link SBMLFunctionDefinitionConverter}
 * <li> {@link SBMLIdConverter}
 * <li> {@link SBMLInferUnitsConverter}
 * <li> {@link SBMLInitialAssignmentConverter}
 * <li> {@link SBMLLevel1Version1Converter}
 * <li> {@link SBMLLevelVersionConverter}
 * <li> {@link SBMLLocalParameterConverter}
 * <li> SBMLRateOfConverter
 * <li> {@link SBMLReactionConverter}
 * <li> {@link SBMLRuleConverter}
 * <li> {@link SBMLStripPackageConverter}
 * <li> {@link SBMLUnitsConverter}
 *
 * </ul>
 */

public class SBMLConverter {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLConverter(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLConverter obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLConverter obj)
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
        libsbmlJNI.delete_SBMLConverter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libsbmlJNI.SBMLConverter_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libsbmlJNI.SBMLConverter_change_ownership(this, swigCPtr, true);
  }

  
/**
   * Creates a new {@link SBMLConverter} object.
   */ public
 SBMLConverter() {
    this(libsbmlJNI.new_SBMLConverter__SWIG_0(), true);
    libsbmlJNI.SBMLConverter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  
/**
   * Creates a new {@link SBMLConverter} object with a given name.
   <p>
   * @param name the name for the converter to create.
   */ public
 SBMLConverter(String name) {
    this(libsbmlJNI.new_SBMLConverter__SWIG_1(name), true);
    libsbmlJNI.SBMLConverter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  
/**
   * Copy constructor.
   <p>
   * This creates a copy of an {@link SBMLConverter} object.
   <p>
   * @param orig the {@link SBMLConverter} object to copy.
   */ public
 SBMLConverter(SBMLConverter orig) {
    this(libsbmlJNI.new_SBMLConverter__SWIG_2(SBMLConverter.getCPtr(orig), orig), true);
    libsbmlJNI.SBMLConverter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLConverter} object.
   <p>
   * @return the (deep) copy of this {@link SBMLConverter} object.
   */ public
 SBMLConverter cloneObject() {
	return libsbml.DowncastSBMLConverter((getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_cloneObject(swigCPtr, this) : libsbmlJNI.SBMLConverter_cloneObjectSwigExplicitSBMLConverter(swigCPtr, this), true);
}

  
/**
   * Returns the SBML document that is the subject of the conversions.
   <p>
   * @return the current {@link SBMLDocument} object.
   */ public
 SBMLDocument getDocument() {
    long cPtr = (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_getDocument__SWIG_0(swigCPtr, this) : libsbmlJNI.SBMLConverter_getDocumentSwigExplicitSBMLConverter__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SBMLDocument(cPtr, false);
  }

  
/**
   * Returns the default properties of this converter.
   <p>
   * A given converter exposes one or more properties that can be adjusted
   * in order to influence the behavior of the converter.  This method
   * returns the <em>default</em> property settings for this converter.  It is
   * meant to be called in order to discover all the settings for the
   * converter object.  The run-time properties of the converter object can
   * be adjusted by using the method
   * {@link SBMLConverter#setProperties(ConversionProperties props)}.
   <p>
   * @return the default properties for the converter.
   <p>
   * @see #setProperties(ConversionProperties)
   * @see #matchesProperties(ConversionProperties)
   */ public
 ConversionProperties getDefaultProperties() {
    return new ConversionProperties((getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_getDefaultProperties(swigCPtr, this) : libsbmlJNI.SBMLConverter_getDefaultPropertiesSwigExplicitSBMLConverter(swigCPtr, this), true);
  }

  
/**
   * Returns the target SBML namespaces of the currently set properties.
   <p>
   * SBML namespaces are used by libSBML to express the Level+Version of the
   * SBML document (and, possibly, any SBML Level&nbsp;3 packages in
   * use). Some converters' behavior is affected by the SBML namespace
   * configured in the converter.  For example, in {@link SBMLLevelVersionConverter}
   * (the converter for converting SBML documents from one Level+Version
   * combination to another), the actions are fundamentally dependent on the
   * SBML namespaces targeted.
   <p>
   * @return the {@link SBMLNamespaces} object that describes the SBML namespaces
   * in effect, or <code>null</code> if none are set.
   */ public
 SBMLNamespaces getTargetNamespaces() {
  return libsbml.DowncastSBMLNamespaces((getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_getTargetNamespaces(swigCPtr, this) : libsbmlJNI.SBMLConverter_getTargetNamespacesSwigExplicitSBMLConverter(swigCPtr, this), false);
}

  
/**
   * Returns <code>true</code> if this converter matches the given properties.
   <p>
   * Given a {@link ConversionProperties} object <code>props</code>, this method checks that 
   * <code>props</code> possesses an option value to enable this converter.  If it does,
   * this method returns <code>true.</code>
   <p>
   * @param props the properties to match.
   <p>
   * @return <code>true</code> if the properties <code>props</code> would match the necessary
   * properties for this type of converter, <code>false</code> otherwise.
   */ public
 boolean matchesProperties(ConversionProperties props) {
    return (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_matchesProperties(swigCPtr, this, ConversionProperties.getCPtr(props), props) : libsbmlJNI.SBMLConverter_matchesPropertiesSwigExplicitSBMLConverter(swigCPtr, this, ConversionProperties.getCPtr(props), props);
  }

  
/**
   * Sets the SBML document to be converted.
   <p>
   * @param doc the document to use for this conversion.
   <p>
   * @return integer value indicating the success/failure of the operation.
   *  The set of possible values that may
   * be returned ultimately depends on the specific subclass of
   * {@link SBMLConverter} being used, but the default method can return the
   * following:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setDocument(SBMLDocument doc) {
    return (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_setDocument(swigCPtr, this, SBMLDocument.getCPtr(doc), doc) : libsbmlJNI.SBMLConverter_setDocumentSwigExplicitSBMLConverter(swigCPtr, this, SBMLDocument.getCPtr(doc), doc);
  }

  
/**
   * Sets the configuration properties to be used by this converter.
   <p>
   * @param props the {@link ConversionProperties} object defining the properties
   * to set.
   <p>
   * @return integer value indicating the success/failure of the operation.
   *  The set of possible values that may
   * be returned ultimately depends on the specific subclass of
   * {@link SBMLConverter} being used, but the default method can return the
   * following values:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   *
   * </ul> <p>
   * @see #getProperties()
   * @see #matchesProperties(ConversionProperties)
   */ public
 int setProperties(ConversionProperties props) {
    return (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_setProperties(swigCPtr, this, ConversionProperties.getCPtr(props), props) : libsbmlJNI.SBMLConverter_setPropertiesSwigExplicitSBMLConverter(swigCPtr, this, ConversionProperties.getCPtr(props), props);
  }

  
/**
   * Returns the current properties in effect for this converter.
   <p>
   * A given converter exposes one or more properties that can be adjusted
   * in order to influence the behavior of the converter.  This method
   * returns the current properties for this converter; in other words, the
   * settings in effect at this moment.  To change the property values, you
   * can use {@link SBMLConverter#setProperties(ConversionProperties props)}.
   <p>
   * @return the currently set configuration properties.
   <p>
   * @see #setProperties(ConversionProperties)
   * @see #matchesProperties(ConversionProperties)
   */ public
 ConversionProperties getProperties() {
    long cPtr = (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_getProperties(swigCPtr, this) : libsbmlJNI.SBMLConverter_getPropertiesSwigExplicitSBMLConverter(swigCPtr, this);
    return (cPtr == 0) ? null : new ConversionProperties(cPtr, false);
  }

  
/**
   * Perform the conversion.
   <p>
   * This method causes the converter to do the actual conversion work,
   * that is, to convert the {@link SBMLDocument} object set by
   * {@link SBMLConverter#setDocument(SBMLDocument)} and
   * with the configuration options set by
   * {@link SBMLConverter#setProperties(ConversionProperties)}.
   <p>
   * @return  integer value indicating the success/failure of the operation.
   *  The set of possible values that may
   * be returned depends on the converter subclass; please consult
   * the documentation for the relevant class to find out what the
   * possibilities are.
   */ public
 int convert() {
    return (getClass() == SBMLConverter.class) ? libsbmlJNI.SBMLConverter_convert(swigCPtr, this) : libsbmlJNI.SBMLConverter_convertSwigExplicitSBMLConverter(swigCPtr, this);
  }

  
/**
   * Returns the name of this converter.
   <p>
   * @return a string, the name of this converter.
   */ public
 String getName() {
    return libsbmlJNI.SBMLConverter_getName(swigCPtr, this);
  }

}
