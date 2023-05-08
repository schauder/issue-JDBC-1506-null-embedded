package de.schauderhaft.issuejdbc1506nullembeddable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class IssueJdbc1506NullEmbeddableApplicationTests {

	@Autowired
	Parents parents;

	@BeforeEach
	void setup() {
		Child.constructorCalls = 0;
	}
	@Test
	void contextLoads() {

		Parent jens = new Parent();
		jens.name = "Jens";

		parents.save(jens);

		parents.findAll();

		assertThat(Child.constructorCalls).isEqualTo(0);

	}

	@Test
	void verifyTheConstructorCounterWorks() {
		assertThat(Child.constructorCalls).isEqualTo(0);
		new Child("jens", "schauder");
		assertThat(Child.constructorCalls).isEqualTo(1);

	}

}
