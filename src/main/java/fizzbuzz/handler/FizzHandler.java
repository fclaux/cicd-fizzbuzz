package fizzbuzz.handler;

/**
 * Handler pour le mot "Fizz".
 * Cette classe renvoie "Fizz" si le nombre passé en paramètre
 * est un multiple de 3. Sinon, elle retourne le nombre sous forme de chaîne.
 */
public class FizzHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 3, retourne "Fizz".
   * Sinon, retourne le nombre lui-même sous forme de chaîne.
   *
   * @param number le nombre à analyser
   * @return "Fizz" si multiple de 3, sinon le nombre sous forme de chaîne
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfThree(number)) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}
