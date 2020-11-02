/**
 * Copyright (c) 2006 - present Innovative Systems SRL
 * Copyright (c) 2006 - present Ovidiu Podisor ovidiu.podisor@innodocs.com
 * 
 * Authors: Ovidiu Podisor and members of the
 *          IML lab at West University Timisoara (www.uvt.ro)
 * 
 * This file is part of the CF2JSP project.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package ro.innovative.iml.lang.cf.basis;

import javax.servlet.jsp.PageContext;

import ro.innovative.iml.lang.cf.util.CFVariableUtil;

public class CFDecision {
	
	public static Boolean isDefined(Object name, PageContext pageContext) {
		if (CFVariableUtil.exists(pageContext, name.toString()) != null)
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}

	public static Boolean isNumeric(Object number) {
		if (number instanceof Double || number instanceof Integer)
			return true;
		else if (number instanceof String) {
			try {
				Double.parseDouble(number.toString());
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return false;
	}

}