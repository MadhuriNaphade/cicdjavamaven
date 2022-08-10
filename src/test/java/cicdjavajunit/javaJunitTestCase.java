package cicdjavajunit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class javaJunitTestCase {

	@Test
	public void test() {
		javaJunitAdd a = new javaJunitAdd();
		assertEquals(20,a.add(10,10));
	}

}
