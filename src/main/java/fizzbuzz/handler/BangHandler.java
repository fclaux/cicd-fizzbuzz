package fizzbuzz.handler;

/**
 * Handler pour le mot "Bang".
 * Cette classe renvoie "Bang" si le nombre passé en paramètre
 * est un multiple de 7. Sinon, elle délègue le traitement
 * au handler suivant dans la chaîne.
 */
public class BangHandler extends MultipleHandler {

  /**
   * Calcule la réponse pour un nombre donné.
   * Si le nombre est multiple de 7, retourne "Bang".
   * Sinon, délègue la vérification au handler suivant.
   *
   * @param number le nombre à analyser
   * @return "Bang" si multiple de 7, sinon la réponse du handler suivant
   */
  @Override
  public String sayAnswerFor(final int number) {
    if (isMultipleOfSeven(number)) {
      return "Bang";
    }
    return getNextHandler().sayAnswerFor(number);
  }
}
