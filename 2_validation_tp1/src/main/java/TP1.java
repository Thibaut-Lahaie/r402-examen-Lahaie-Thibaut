import static java.lang.Math.abs;

public class TP1 {

    /* Exercice 1: défauts, erreurs et défaillances
     *
     * Pour chacune des méthodes indexOfLastOccurrence, average, et countOddElements:
     * 1) déterminez le défaut logiciel dans la méthode (si vous ne trouvez pas le défaut simplement en inspectant le
     *    code, écrivez des tests pour vous aider)
     * 2) écrivez un test qui n'exécute pas le défaut
     * 3) écrivez un test qui exécute le défaut, mais ne provoque pas de défaillance
     * 4) écrivez un test qui provoque une défaillance
     *
     */

    /**
     * Retourne la position de la dernière occurrence de la valeur x dans le tableau a, ou -1 si la valeur n'est pas
     * présente dans le tableau.
     *
     * @param a le tableau où chercher la valeur
     * @param x la valeur recherchée
     * @return la plus grande position <code>i</code> telle que <code>a[i] == x</code>, ou -1 si aucune position ne
     * contient la valeur recherchée
     * @throws NullPointerException si <code>a == null</code>
     */
    public static int indexOfLastOccurrence(int[] a, int x) {
        for (int i = a.length -1; i >= 0; i--) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Retourne la moyenne des valeurs stockées dans le tableau.
     *
     * @param a le tableau contenant les valeurs
     * @return la moyenne des valeurs stockées, ou 0.0 si le tableau est vide
     * @throws NullPointerException si <code>a == null</code>
     */
    public static double average(int[] a) {
        if (a.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return (float) sum / a.length;
    }

    /**
     * Retourne le nombre d'entiers impairs contenus dans le tableau.
     *
     * @param a le tableau contenant les valeurs
     * @return le nombre d'entier impairs contenus dans le tableau
     * @throws NullPointerException si <code>a == null</code>
     */
    public static int countOddElements(int[] a) {
        int res = 0;
        for (int j : a) {
            if (abs(j) % 2 == 1) {
                res++;
            }
        }
        return res;
    }

}
