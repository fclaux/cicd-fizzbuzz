package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de tests unitaires pour la classe {@link FizzBuzz}.
 * Cette classe vérifie que la méthode {@link FizzBuzz#sayAnswerFor(int)}
 * renvoie les réponses correctes pour les différents cas :
 * nombres classiques, multiples de 3, 5, 7 et leurs combinaisons.
 */
class FizzBuzzTest {

  /** Instance de FizzBuzz utilisée pour les tests. */
  private FizzBuzz fizzBuzz;

  /**
   * Initialisation avant chaque test.
   */
  @BeforeEach
  public void setup() {
    fizzBuzz = new FizzBuzz();
  }

  /**
   * Vérifie que les nombres classiques (non multiples de 3, 5 ou 7)
   * sont renvoyés tels quels.
   */
  @Test
  void should_answer_classical_number() {
    assertEquals("1", fizzBuzz.sayAnswerFor(1));
    assertEquals("2", fizzBuzz.sayAnswerFor(2));
    assertEquals("4", fizzBuzz.sayAnswerFor(4));
  }

  /**
   * Vérifie que les multiples de 3 renvoient "Fizz".
   */
  @Test
  void shouldAnswerFizzWhenMultipleOf3() {
    assertEquals("Fizz", fizzBuzz.sayAnswerFor(3));
    assertEquals("Fizz", fizzBuzz.sayAnswerFor(6));
    assertEquals("Fizz", fizzBuzz.sayAnswerFor(9));
  }

  /**
   * Vérifie que les multiples de 5 renvoient "Buzz".
   */
  @Test
  void shouldAnswerFuzzWhenMultipleOf5() {
    assertEquals("Buzz", fizzBuzz.sayAnswerFor(5));
    assertEquals("Buzz", fizzBuzz.sayAnswerFor(10));
    assertEquals("Buzz", fizzBuzz.sayAnswerFor(20));
  }

  /**
   * Vérifie que les multiples de 3 et 5 renvoient "FizzBuzz".
   */
  @Test
  void shouldAnswerFizzbuzzWhenMultipleOf3And5() {
    assertEquals("FizzBuzz", fizzBuzz.sayAnswerFor(15));
    assertEquals("FizzBuzz", fizzBuzz.sayAnswerFor(30));
    assertEquals("FizzBuzz", fizzBuzz.sayAnswerFor(45));
  }

  /**
   * Vérifie que les multiples de 7 renvoient "Bang".
   */
  @Test
  void shouldAnswerFangWhenMultipleOf7() {
    assertEquals("Bang", fizzBuzz.sayAnswerFor(7));
    assertEquals("Bang", fizzBuzz.sayAnswerFor(14));
    assertEquals("Bang", fizzBuzz.sayAnswerFor(28));
  }

  /**
   * Vérifie que les multiples de 3 et 7 renvoient "FizzBang".
   */
  @Test
  void shouldAnswerFizzbangWhenMultipleOf3And7() {
    assertEquals("FizzBang", fizzBuzz.sayAnswerFor(21));
    assertEquals("FizzBang", fizzBuzz.sayAnswerFor(42));
    assertEquals("FizzBang", fizzBuzz.sayAnswerFor(63));
  }

  /**
   * Vérifie que les multiples de 5 et 7 renvoient "BuzzBang".
   */
  @Test
  void shouldAnswerFuzzbangWhenMultipleOf5And7() {
    assertEquals("BuzzBang", fizzBuzz.sayAnswerFor(35));
    assertEquals("BuzzBang", fizzBuzz.sayAnswerFor(70));
    assertEquals("BuzzBang", fizzBuzz.sayAnswerFor(140));
  }

  /**
   * Vérifie que les multiples de 3, 5 et 7 renvoient "FizzBuzzBang".
   */
  @Test
  void shouldAnswerFizzbuzzbangWhenMultipleOf3And5And7() {
    assertEquals("FizzBuzzBang", fizzBuzz.sayAnswerFor(105));
    assertEquals("FizzBuzzBang", fizzBuzz.sayAnswerFor(210));
    assertEquals("FizzBuzzBang", fizzBuzz.sayAnswerFor(315));
  }

}
