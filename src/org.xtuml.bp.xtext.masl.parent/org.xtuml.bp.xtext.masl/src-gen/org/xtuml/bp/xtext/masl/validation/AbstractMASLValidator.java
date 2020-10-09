/*
 * generated by Xtext 2.22.0
 */
package org.xtuml.bp.xtext.masl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMASLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.xtuml.org/bp/xtext/masl/MASLStructure"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.xtuml.org/bp/xtext/masl/MASLTypes"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.xtuml.org/bp/xtext/masl/MASLBehavior"));
		return result;
	}
}
