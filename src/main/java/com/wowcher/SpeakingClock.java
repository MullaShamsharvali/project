package com.wowcher;

/**
 * Common functionality for time conversion into words. 
 * 
 * @author miroslav
 *
 */
public interface SpeakingClock {
	
	/**
	 * Convert time, in format HH:mm, into words.
	 * 
	 * @param time
	 * 			String, representing time
	 * @return String
	 * 			Words representation of time
	 */
	String convert(final String time);
}
