package tests.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		tests.Collections.AllAVLTests.class,
		tests.Collections.AllGraphsTests.class,
		tests.Collections.AllBinaryHeapTests.class,
		tests.Collections.HashTableAllTests.class })
/**
 * 
 * @author Guillermo Facundo Colunga
 * @version 3.2
 */
public class TestAllCollections {

}
