package Foundation;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Instances of NSDateFormatter create string representations of NSDate objects,
 * and convert textual representations of dates and times into NSDate objects.
 * For user-visible representations of dates and times, NSDateFormatter provides
 * a variety of localized presets and configuration options. For fixed format
 * representations of dates and times, you can specify a custom format string.
 *  
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class NSDateFormatter extends SimpleDateFormat {

	private static final long serialVersionUID = -761525931603929943L;

	/**
	 * Creates a date formatter from the given template.
	 * 
	 * @param template The template to format the date.
	 */
	public NSDateFormatter(String template) {
		super(template);
	}

	/**
	 * Creates a date formatter from the given template and its localization.
	 * 
	 * @param template The template to format the date.
	 * @param locale The localization to format the date.
	 */
	public NSDateFormatter(String template, Locale locale) {
		super(template, locale);
	}
}
