package fizzbuzz.handler;

/**
 * Handler pour le mot "FizzBang".
 * Cette classe renvoie "FizzBang" si le nombre passé en paramètre
 * est à la fois un multiple de 3 et un multiple de 7. Sinon, elle
 * délègue le traitement au handler suivant dans la chaîne.
 */
public class FizzBangHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 3 et de 7, retourne "FizzBang".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "FizzBang" si multiple de 3 et 7,
   *     sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfThree(number) && isMultipleOfSeven(number)) {
      return "FizzBang";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
