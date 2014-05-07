/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.dirt.test;

import java.util.List;

/**
 * For a given deployment name, provide the expected ZooKeeper
 * paths for definitions, deployments, and individual module
 * deployments.
 *
 * @author Patrick Peralta
 */
public interface DeploymentPathProvider {
	/**
	 * Return the expected path for a definition with the provided name.
	 *
	 * @param name definition name
	 * @return path of definition
	 */
	String getDefinitionPath(String name);

	/**
	 * Return the expected path for a deployment with the provided name.
	 *
	 * @param name definition name
	 * @return path of deployment
	 */
	String getDeploymentPath(String name);

	/**
	 * Return the expected paths for the module deployments for a
	 * named deployment.
	 *
	 * @param name definition name
	 *
	 * @return list of expected deployment paths for the modules
	 *         for this deployment
	 */
	List<String> getModuleDeploymentPaths(String name);
}