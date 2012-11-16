package org.batoo.jpa.community.test.t3;

import javax.persistence.TypedQuery;

import org.batoo.jpa.community.test.BaseCoreTest;
import org.junit.Test;

/**
 * 
 * @author hceylan
 * @since 2.0.0
 */
public class Test3 extends BaseCoreTest {

	/**
	 * 
	 * @since 2.0.0
	 */
	@Test
	public void test() {
		final TypedQuery<E1> q = this.cq("select e1 from E1 e1 where :oem = e1.e2", E1.class);

		q.setParameter("oem", new E2());
		q.getResultList();
	}
}
