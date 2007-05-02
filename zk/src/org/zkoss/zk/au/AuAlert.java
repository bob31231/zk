/* AuAlert.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Thu Oct 13 10:26:35     2005, Created by tomyeh
}}IS_NOTE

Copyright (C) 2005 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zk.au;

/**
 * A response to ask client to show an alert.
 *
 * <p>data[0]: the alert message
 * 
 * @author tomyeh
 */
public class AuAlert extends AuResponse {
	public AuAlert(String message) {
		super("alert", message); //component-independent
	}
}
