package Foundation;

import java.util.Comparator;

/**
 * Defines the signature for a block object used for comparison operations.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 * @param <T> The types of objects compared by this comparator.
 */
@FunctionalInterface
public interface NSComparator<T> extends Comparator<T> {

	@Override
	public abstract int compare(T o1, T o2);

}
