package fizzbuzz.handler;

/**
 * Handler pour le mot "FizzBuzz".
 * Cette classe renvoie "FizzBuzz" si le nombre passé en paramètre
 * est à la fois un multiple de 3 et un multiple de 5. Sinon, elle
 * délègue le traitement au handler suivant dans la chaîne.
 */
public class FizzBuzzHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 3 et de 5, retourne "FizzBuzz".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "FizzBuzz" si multiple de 3 et 5,
   *     sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
      return "FizzBuzz";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
