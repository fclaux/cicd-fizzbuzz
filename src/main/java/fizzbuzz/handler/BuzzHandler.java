package fizzbuzz.handler;

/**
 * Handler pour le mot "Buzz".
 * Cette classe renvoie "Buzz" si le nombre passé en paramètre
 * est un multiple de 5. Sinon, elle délègue le traitement
 * au handler suivant dans la chaîne.
 */
public class BuzzHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 5, retourne "Buzz".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "Buzz" si multiple de 5, sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfFive(number)) {
      return "Buzz";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
