/*
 * Copyright (c) 2012 - Batoo Software ve Consultancy Ltd.
 * 
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.batoo.jpa.core.test.remove;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author hceylan
 * @since 2.0.0
 */
@Entity
public class Child1 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String value;

	@ManyToOne
	private Parent parent;

	/**
	 * @since 2.0.0
	 */
	public Child1() {
		super();
	}

	/**
	 * @param parent
	 *            the person
	 * @param value
	 *            the value
	 * 
	 * @since 2.0.0
	 */
	public Child1(Parent parent, String value) {
		super();

		this.parent = parent;
		this.value = value;

		parent.getChildren1().add(this);
	}

	/**
	 * Returns the id of the Child1.
	 * 
	 * @return the id of the Child1
	 * 
	 * @since 2.0.0
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Returns the value of the Child1.
	 * 
	 * @return the value of the Child1
	 * 
	 * @since 2.0.0
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets the value of the Child1.
	 * 
	 * @param value
	 *            the value to set for Child1
	 * 
	 * @since 2.0.0
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Returns the parent of the Child1.
	 *
	 * @return the parent of the Child1
	 *
	 * @since 2.0.0
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * Sets the parent of the Child1.
	 *
	 * @param parent the parent to set for Child1
	 *
	 * @since 2.0.0
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}
}
