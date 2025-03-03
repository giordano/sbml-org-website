/**
 * @file    multi_example3.java
 * @brief   multi create example
 * @author  Sarah Keating
 * @author  Frank Bergmann
 *
 * <!--------------------------------------------------------------------------
 * This file is part of libSBML.  Please visit http://sbml.org for more
 * information about SBML, and the latest version of libSBML.
 *
 * Copyright (C) 2009-2013 jointly by the following organizations:
 *     1. California Institute of Technology, Pasadena, CA, USA
 *     2. EMBL European Bioinformatics Institute (EMBL-EBI), Hinxton, UK
 *
 * Copyright (C) 2006-2008 by the California Institute of Technology,
 *     Pasadena, CA, USA 
 *
 * Copyright (C) 2002-2005 jointly by the following organizations:
 *     1. California Institute of Technology, Pasadena, CA, USA
 *     2. Japan Science and Technology Agency, Japan
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation.  A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as http://sbml.org/software/libsbml/license.html
 * ------------------------------------------------------------------------ -->
 */

import org.sbml.libsbml.*;

public class multi_example3
{

    public static void main(String[] args)
    {
        System.loadLibrary("sbmlj");

        SBMLNamespaces sbmlns = new SBMLNamespaces(3,1,"multi",1);

        // create the document

        SBMLDocument document = new SBMLDocument(sbmlns);

        // set the required attribute to true
        SBMLDocumentPlugin  docPlug = 
                (SBMLDocumentPlugin)(document.getPlugin("multi"));
        docPlug.setRequired(true);


        // create the Model

        Model model=document.createModel();

        // create the compartments

        Compartment  c = model.createCompartment();
        c.setId("membrane");
        c.setConstant(true);

        // set the multi attribute isType via the compartmentPlugin
        MultiCompartmentPlugin  compPlug = 
                (MultiCompartmentPlugin)(c.getPlugin("multi"));
        compPlug.setIsType(true);

        // create the speciesTypes

        MultiModelPlugin  modelPlug = 
                (MultiModelPlugin)(model.getPlugin("multi"));

        MultiSpeciesType  st = modelPlug.createMultiSpeciesType();
        st.setId("stX");
        st.setCompartment("membrane");

        // create species
        Species s = model.createSpecies();
        s.setId("s1");
        s.setCompartment("membrane");
        s.setBoundaryCondition(false);
        s.setHasOnlySubstanceUnits(false);
        s.setConstant(false);

        // set the multi attribute speciesType via the compartmentPlugin
        MultiSpeciesPlugin  spPlug = 
                (MultiSpeciesPlugin)(s.getPlugin("multi"));
        spPlug.setSpeciesType("stX");

        // create species feature
        SpeciesFeature sf = spPlug.createSpeciesFeature();
        sf.setSpeciesFeatureType("a");
        sf.setOccur(1);
        sf.setComponent("b");

        SpeciesFeatureValue sfv = sf.createSpeciesFeatureValue();
        sfv.setValue("c");

        // create a subListOfSpeciesFeatures
        SubListOfSpeciesFeatures subloSF = spPlug.createSubListOfSpeciesFeatures();
        subloSF.setRelation(libsbml.Relation_fromString("and"));

        // add speciesFeatures to the subList
        SpeciesFeature sf1 = new SpeciesFeature(3, 1, 1);
        sf1.setSpeciesFeatureType("a1");
        sf1.setOccur(1);
        sf1.setComponent("b1");

        SpeciesFeatureValue sfv1 = sf1.createSpeciesFeatureValue();
        sfv1.setValue("c1");

        subloSF.appendAndOwn(sf1);

        sf1 = new SpeciesFeature(3, 1, 1);
        sf1.setSpeciesFeatureType("a2");
        sf1.setOccur(1);
        sf1.setComponent("b2");

        sfv1 = sf1.createSpeciesFeatureValue();
        sfv1.setValue("c2");

        subloSF.appendAndOwn(sf1);

        // create a second subListOfSpeciesfeatures
        subloSF = spPlug.createSubListOfSpeciesFeatures();
        subloSF.setRelation(libsbml.Relation_fromString("or"));

        sf1 = new SpeciesFeature(3, 1, 1);
        sf1.setSpeciesFeatureType("a3");
        sf1.setOccur(1);
        sf1.setComponent("b3");

        sfv1 = sf1.createSpeciesFeatureValue();
        sfv1.setValue("c3");

        subloSF.appendAndOwn(sf1);

        sf1 = new SpeciesFeature(3, 1, 1);
        sf1.setSpeciesFeatureType("a4");
        sf1.setOccur(1);
        sf1.setComponent("b4");

        sfv1 = sf1.createSpeciesFeatureValue();
        sfv1.setValue("c4");

        subloSF.appendAndOwn(sf1);

        libsbml.writeSBML(document,"multi_example3.xml");
    }
}