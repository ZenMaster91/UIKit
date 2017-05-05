package Foundation.DataStructures.AllTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		Foundation.DataStructures.AVLTree.Tests.AllAVLTests.class,
		Foundation.DataStructures.Graph.Tests.AllGraphsTests.class,
		Foundation.DataStructures.PriorityQueue.Tests.AllBinaryHeapTests.class,
		Foundation.DataStructures.HashTable.Tests.HashTableAllTests.class })
/**
 * 
 * @author Guillermo Facundo Colunga
 * @version 3.2
 */
public class AllTests {

}
