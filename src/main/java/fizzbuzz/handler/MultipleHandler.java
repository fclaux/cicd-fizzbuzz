package fizzbuzz.handler;

/**
 * Classe abstraite représentant un handler dans la chaîne de responsabilité.
 * Chaque handler peut vérifier certaines conditions sur un nombre et
 * renvoyer une réponse. Si le handler ne peut pas traiter le nombre,
 * il délègue la vérification au handler suivant dans la chaîne.
 */
public abstract class MultipleHandler {

  /** Constante représentant le nombre 3. */
  public static final int THREE = 3;

  /** Constante représentant le nombre 5. */
  public static final int FIVE = 5;

  /** Constante représentant le nombre 7. */
  public static final int SEVEN = 7;

  /** Handler suivant dans la chaîne. */
  private MultipleHandler nextHandler;


  /**
   * Retourne le handler suivant dans la chaîne de responsabilité.
   * Cette méthode permet aux classes filles de récupérer le handler suivant
   * afin de déléguer le traitement si elles ne peuvent pas gérer le nombre.
   *
   * @return le handler suivant dans la chaîne
   */
  protected MultipleHandler getNextHandler() {
    return nextHandler;
  }

  /**
   * Définit le handler suivant dans la chaîne.
   *
   * @param handler le handler à mettre après celui-ci
   */
  public void setNextHandler(final MultipleHandler handler) {
    this.nextHandler = handler;
  }

  /**
   * Méthode abstraite à implémenter par chaque handler concret.
   * Calcule la réponse pour un nombre donné.
   *
   * @param number le nombre à analyser
   * @return la réponse du handler ou celle du handler suivant
   */
  public abstract String sayAnswerFor(int number);

  /**
   * Vérifie si un nombre est multiple de 7.
   *
   * @param number le nombre à tester
   * @return true si multiple de 7, false sinon
   */
  protected boolean isMultipleOfSeven(final int number) {
    return number % SEVEN == 0;
  }

  /**
   * Vérifie si un nombre est multiple de 5.
   *
   * @param number le nombre à tester
   * @return true si multiple de 5, false sinon
   */
  protected boolean isMultipleOfFive(final int number) {
    return number % FIVE == 0;
  }

  /**
   * Vérifie si un nombre est multiple de 3.
   *
   * @param number le nombre à tester
   * @return true si multiple de 3, false sinon
   */
  protected boolean isMultipleOfThree(final int number) {
    return number % THREE == 0;
  }
}
