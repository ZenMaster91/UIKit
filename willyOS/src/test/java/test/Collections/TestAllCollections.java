package test.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		test.Collections.AllAVLTests.class,
		test.Collections.AllGraphsTests.class,
		test.Collections.AllBinaryHeapTests.class,
		test.Collections.HashTableAllTests.class })
/**
 * 
 * @author Guillermo Facundo Colunga
 * @version 3.2
 */
public class TestAllCollections {

}
