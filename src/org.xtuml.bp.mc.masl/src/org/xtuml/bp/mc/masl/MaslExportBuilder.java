package org.xtuml.bp.mc.masl;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class MaslExportBuilder extends IncrementalProjectBuilder {
    
    public static final String BUILDER_ID = "org.xtuml.bp.mc.masl.masl_builder";
    
    @Override
    protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
        System.out.println("LEVI building masl");
        return null;
    }
}
