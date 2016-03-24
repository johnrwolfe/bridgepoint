//=====================================================================
//
//File:      $RCSfile: ModelCompareTestSuite.java,v $
//Version:   $Revision: 1.1.2.1 $
//Modified:  $Date: 2013/07/23 15:06:44 $
//
//(c) Copyright 2006-2014 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//=====================================================================
package org.xtuml.bp.model.compare.test;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.xtuml.bp.core.CorePlugin;
import org.xtuml.bp.core.common.BridgePointPreferencesStore;
import org.xtuml.bp.core.util.WorkspaceUtil;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
* Test all areas of compare and merge
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GlobalTestSetupClass.class,
	ModelMergeTests.class,
	ModelMergeTests2.class,
	ElementOrderingTests.class,
	ModelComparisonTests.class,
})
public class ModelCompareTestSuite extends TestSuite {


}