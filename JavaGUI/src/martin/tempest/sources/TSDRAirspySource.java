/*******************************************************************************
 * Copyright (c) 2014 Martin Marinov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Martin Marinov - initial API and implementation
 *     Tan Peng Chong - adaptation to Airspy
 ******************************************************************************/
package martin.tempest.sources;

/**
 * This plugin allows for playback of prerecorded files.
 * 
 * @author Martin Marinov
 *
 */
public class TSDRAirspySource extends TSDRSource {

	public TSDRAirspySource() {
		super("Airspy (via libairspy)", "TSDRPlugin_Airspy", false);
	}

}
