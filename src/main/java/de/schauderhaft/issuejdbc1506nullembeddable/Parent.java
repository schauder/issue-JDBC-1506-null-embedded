package de.schauderhaft.issuejdbc1506nullembeddable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

 class Parent {
	@Id
	Long id;
	String name;

	@Embedded(onEmpty = Embedded.OnEmpty.USE_NULL)
	Child child;
}
