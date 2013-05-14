/*
 * Copyright 2013 Martin Kouba
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
package org.trimou;

import java.io.Writer;
import java.util.Map;

/**
 * Compiled mustache template.
 */
public interface Mustache {

	/**
	 * @return the template name
	 */
	public String getName();

	/**
	 * Render the template.
	 *
	 * @param writer
	 *            The writer to render the template to
	 * @param data
	 *            Optional context data (ideally immutable), may be <code>null</code>
	 */
	public void render(Writer writer, Map<String, Object> data);

	/**
	 * Render the template.
	 *
	 * @param data
	 *            Optional context data (ideally immutable), may be <code>null</code>
	 * @return the rendered template as string
	 */
	public String render(Map<String, Object> data);

}