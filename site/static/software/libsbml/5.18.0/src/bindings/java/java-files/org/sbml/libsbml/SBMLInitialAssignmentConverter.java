/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Converter that removes SBML <em>initial assignments</em>.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * This is an SBML converter for replacing {@link InitialAssignment} objects, when
 * possible, by setting the initial value attributes on the model objects
 * being assigned.  In other words, for every object that is the target of an
 * initial assignment in the model, the converter evaluates the mathematical
 * expression of the assignment to get a <em>numerical</em> value, and then sets
 * the corresponding attribute of the object to the value.  The effects for
 * different kinds of SBML components are as follows:
 <p>
 * <center>
 * <table border='0' class='text-table width80 normal-font alt-row-colors'>
 *  <tr style='background: lightgray; font-size: 14px;'>
 *      <th align='left' width='200'>Component</th>
 *      <th align='left'>Effect</th>
 *  </tr>
 *  <tr>
 *  <td>Compartment</td>
 *  <td>Sets the value of the <code>size</code> attribute.</td>
 *  </tr>
 *  <tr>
 *  <td>Species</td>
 *  <td>Sets the value of either the <code>initialAmount</code>
 *  or the <code>initialConcentration</code> attributes, depending
 *  on the value of the {@link Species} object's
 *  <code>hasOnlySubstanceUnits</code> attribute.</td>
 *  </tr>
 *  <tr>
 *  <td>Parameter</td>
 *  <td>Sets the value of the <code>value</code> attribute.</td>
 *  </tr>
 *  <tr>
 *  <td>SpeciesReference</td>
 *  <td>Sets the value of the <code>stoichiometry</code> attribute
 *  in the {@link Reaction} object where the {@link SpeciesReference} object appears.</td>
 *  </tr>
 * </table>
 * </center>
 <p>
 * <h2>Configuration and use of {@link SBMLInitialAssignmentConverter}</h2>
 <p>
 * {@link SBMLInitialAssignmentConverter} is enabled by creating a
 * {@link ConversionProperties} object with the option <code>'expandInitialAssignments'</code>,
 * and passing this properties object to {@link SBMLDocument#convert(ConversionProperties)}.  The converter offers no other options.
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
    System.out.println('Error: unable to strip the Layout package');
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
 * @copydetails doc_list_of_libsbml_converters
 */

public class SBMLInitialAssignmentConverter extends SBMLConverter {
   private long swigCPtr;

   protected SBMLInitialAssignmentConverter(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SBMLInitialAssignmentConverter_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SBMLInitialAssignmentConverter obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLInitialAssignmentConverter obj)
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
        libsbmlJNI.delete_SBMLInitialAssignmentConverter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/** * @internal */ public
 static void init() {
    libsbmlJNI.SBMLInitialAssignmentConverter_init();
  }

  
/**
   * Creates a new {@link SBMLInitialAssignmentConverter} object.
   */ public
 SBMLInitialAssignmentConverter() {
    this(libsbmlJNI.new_SBMLInitialAssignmentConverter__SWIG_0(), true);
  }

  
/**
   * Copy constructor; creates a copy of an {@link SBMLInitialAssignmentConverter}
   * object.
   <p>
   * @param obj the {@link SBMLInitialAssignmentConverter} object to copy.
   */ public
 SBMLInitialAssignmentConverter(SBMLInitialAssignmentConverter obj) {
    this(libsbmlJNI.new_SBMLInitialAssignmentConverter__SWIG_1(SBMLInitialAssignmentConverter.getCPtr(obj), obj), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLInitialAssignmentConverter}
   * object.
   <p>
   * @return a (deep) copy of this converter.
   */ public
 SBMLConverter cloneObject() {
    long cPtr = libsbmlJNI.SBMLInitialAssignmentConverter_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SBMLInitialAssignmentConverter(cPtr, true);
  }

  
/**
   * Returns <code>true</code> if this converter object's properties match the given
   * properties.
   <p>
   * A typical use of this method involves creating a {@link ConversionProperties}
   * object, setting the options desired, and then calling this method on
   * an {@link SBMLInitialAssignmentConverter} object to find out if the object's
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
    return libsbmlJNI.SBMLInitialAssignmentConverter_matchesProperties(swigCPtr, this, ConversionProperties.getCPtr(props), props);
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
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * </ul>
   */ public
 int convert() {
    return libsbmlJNI.SBMLInitialAssignmentConverter_convert(swigCPtr, this);
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
    return new ConversionProperties(libsbmlJNI.SBMLInitialAssignmentConverter_getDefaultProperties(swigCPtr, this), true);
  }

}
