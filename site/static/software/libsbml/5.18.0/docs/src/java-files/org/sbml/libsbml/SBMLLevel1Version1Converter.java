/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Whole-document SBML Level/Version converter.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * This SBML converter takes an SBML document having one SBML Level+Version
 * combination, and attempts to convert it to an SBML document having a
 * different Level+Version combination.  This converter
 * (SBMLLevel1Version1Converter) converts models to SBML Level&nbsp;1
 * Version&nbsp;1, to the extent possible by the limited features of
 * that Level/Version combination of SBML.
 <p>
 * <h2>Configuration and use of {@link SBMLLevel1Version1Converter}</h2>
 <p>
 * {@link SBMLLevel1Version1Converter} is enabled by creating a {@link ConversionProperties}
 * object with the option <code>'convertToL1V1'</code>, and passing this
 * properties object to {@link SBMLDocument#convert(ConversionProperties)}.  The target SBML Level and Version
 * combination are determined by the value of the SBML namespace set on the
 * {@link ConversionProperties} object (using
 * {@link ConversionProperties#setTargetNamespaces(SBMLNamespaces targetNS)}).
 <p>
 * In addition, this converter offers the following options:
 <p>
 * <ul>
 * <li> <code>'changePow':</code> Mathematical expressions for exponentiation of
 * the form <code>pow(s1, 2)</code> will be converted to the expression
 * <code>s1^2</code>.
 <p>
 * <li> <code>'inlineCompartmentSizes':</code> Back in the days of SBML Level&nbsp;1
 * Version&nbsp;1, many software tools assumed that the 'kinetic laws' of
 * SBML were written in terms of units of
 * <em>concentration</em>/<em>time</em>.  These tools would not expect (and
 * thus not handle) rate expressions such as
 * <code>CompartmentOfS1 * k * S1</code>.
 * When the option <code>'inlineCompartmentSizes'</code> is enabled, libSBML will
 * replace the references to compartments (such as <code>'CompartmentOfS1'</code> in
 * this example) with their initial sizes.  This is not strictly correct in
 * all cases; in particular, if the compartment volume varies during
 * simulation, this conversion will not reflect the expected behavior.
 * However, many models do not have time-varying compartment sizes, so this
 * option makes it easy to get modern SBML rate expressions into a form that
 * old software tools may better understand.
 *
 * </ul> <p>
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

public class SBMLLevel1Version1Converter extends SBMLConverter {
   private long swigCPtr;

   protected SBMLLevel1Version1Converter(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SBMLLevel1Version1Converter_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SBMLLevel1Version1Converter obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLLevel1Version1Converter obj)
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
        libsbmlJNI.delete_SBMLLevel1Version1Converter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/** * @internal */ public
 static void init() {
    libsbmlJNI.SBMLLevel1Version1Converter_init();
  }

  
/**
   * Creates a new {@link SBMLLevel1Version1Converter} object.
   */ public
 SBMLLevel1Version1Converter() {
    this(libsbmlJNI.new_SBMLLevel1Version1Converter__SWIG_0(), true);
  }

  
/**
   * Copy constructor; creates a copy of an {@link SBMLLevel1Version1Converter}
   * object.
   <p>
   * @param obj the {@link SBMLLevel1Version1Converter} object to copy.
   */ public
 SBMLLevel1Version1Converter(SBMLLevel1Version1Converter obj) {
    this(libsbmlJNI.new_SBMLLevel1Version1Converter__SWIG_1(SBMLLevel1Version1Converter.getCPtr(obj), obj), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLLevel1Version1Converter}
   * object.
   <p>
   * @return a (deep) copy of this converter.
   */ public
 SBMLConverter cloneObject() {
    long cPtr = libsbmlJNI.SBMLLevel1Version1Converter_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SBMLLevel1Version1Converter(cPtr, true);
  }

  
/**
   * Returns <code>true</code> if this converter object's properties match the given
   * properties.
   <p>
   * A typical use of this method involves creating a {@link ConversionProperties}
   * object, setting the options desired, and then calling this method on
   * an {@link SBMLLevel1Version1Converter} object to find out if the object's
   * property values match the given ones.  This method is also used by
   * {@link SBMLConverterRegistry#getConverterFor(ConversionProperties)}
   * to search across all registered converters for one matching particular
   * properties.
   <p>
   * @param props the properties to match.
   <p>
   * @return <code>true</code> if this converter's properties match, <code>false</code>
   * otherwise.
   */ public
 boolean matchesProperties(ConversionProperties props) {
    return libsbmlJNI.SBMLLevel1Version1Converter_matchesProperties(swigCPtr, this, ConversionProperties.getCPtr(props), props);
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
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * <li> {@link libsbmlConstants#LIBSBML_CONV_INVALID_TARGET_NAMESPACE LIBSBML_CONV_INVALID_TARGET_NAMESPACE}
   * <li> {@link libsbmlConstants#LIBSBML_CONV_PKG_CONVERSION_NOT_AVAILABLE LIBSBML_CONV_PKG_CONVERSION_NOT_AVAILABLE}
   * <li> {@link libsbmlConstants#LIBSBML_CONV_INVALID_SRC_DOCUMENT LIBSBML_CONV_INVALID_SRC_DOCUMENT}
   * </ul>
   */ public
 int convert() {
    return libsbmlJNI.SBMLLevel1Version1Converter_convert(swigCPtr, this);
  }

  
/**
   * Returns the default properties of this converter.
   <p>
   * A given converter exposes one or more properties that can be adjusted
   * in order to influence the behavior of the converter.  This method
   * returns the <em>default</em> property settings for this converter.  It is
   * meant to be called in order to discover all the settings for the
   * converter object.
   <p>
   * @return the {@link ConversionProperties} object describing the default properties
   * for this converter.
   */ public
 ConversionProperties getDefaultProperties() {
    return new ConversionProperties(libsbmlJNI.SBMLLevel1Version1Converter_getDefaultProperties(swigCPtr, this), true);
  }

}
