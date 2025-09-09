package fizzbuzz.handler;

/**
 * Handler pour le mot "BuzzBang".
 * Cette classe renvoie "BuzzBang" si le nombre passé en paramètre
 * est à la fois un multiple de 5 et un multiple de 7. Sinon, elle
 * délègue le traitement au handler suivant dans la chaîne.
 */
public class BuzzBangHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 5 et de 7, retourne "BuzzBang".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "BuzzBang" si multiple de 5 et 7,
   *     sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfFive(number) && isMultipleOfSeven(number)) {
      return "BuzzBang";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
