package fizzbuzz.handler;

/**
 * Handler pour le mot "FizzBuzzBang".
 * Cette classe renvoie "FizzBuzzBang" si le nombre passé en paramètre
 * est à la fois un multiple de 3, de 5 et de 7. Sinon, elle
 * délègue le traitement au handler suivant dans la chaîne.
 */
public class FizzBuzzBangHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 3, 5 et 7, retourne "FizzBuzzBang".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "FizzBuzzBang" si multiple de 3, 5 et 7,
   *     sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfThree(number)
          && isMultipleOfFive(number)
          && isMultipleOfSeven(number)) {
      return "FizzBuzzBang";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
