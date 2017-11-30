package Foundation;

import java.util.Calendar;
import java.util.Date;

/**
 * NSDate objects encapsulate a single point in time, independent of any particular calendrical system or time zone.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class NSDate extends Date {

	private static final long serialVersionUID = -1007128257480947207L;
	
	/**
	 * Inits a NSDate object from a day, month and year.
	 * 
	 * @param day The day of the month.
	 * @param month The month of the year.
	 * @param year The year.
	 */
	public NSDate(int day, int month, int year) {
		super();
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		setTime(calendar.getTimeInMillis());
	}
	
	/**
     * Allocates a <code>NSDate</code> object and initializes it so that
     * it represents the time at which it was allocated, measured to the
     * nearest millisecond.
     *
     * @see     java.lang.System#currentTimeMillis()
     */
	public NSDate() {
		super();
	}

}
