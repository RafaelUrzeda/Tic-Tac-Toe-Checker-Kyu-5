public class Solution {

    public static int isSolved(int[][] board) {

        //Comprobar si algun jugador tiene 3 en raya de forma horizontal
        if (hayTresEnRayaHorizontal(board) == 1) {
            return 1;
        } else if ( hayTresEnRayaHorizontal(board) == 2){
          return 2;
        }

        //Comprobar si algun jugador tiene 3 en raya de forma vertical
        if (hayTresEnRayaVertical(board) == 1) {
            return 1;
        } else if (hayTresEnRayaVertical(board) == 2){
          return 2;
        }

        //Comprobar si algun jugador tiene 3 en raya de forma diagonal de izquierda a derecha
        if (hayTresEnRayaDiagonalIzquierda(board) == 1) {
            return 1;
        }  else if (hayTresEnRayaDiagonalIzquierda(board) == 2){
          return 2;
        }

        //Comprobar si algun jugador tiene 3 en raya de forma diagonal de derecha a izquieda
        if (hayTresEnRayaDiagonalDerecha(board) == 1) {
            return 1;
        } else if (hayTresEnRayaDiagonalDerecha(board) == 2){
          return 2;
        }

        //Cuenta la cantidad de espacios vacios que quedan
        int espaciosVacios = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    espaciosVacios++;
                    break;
                }
            }
        }
        
        //Si hay espacios vacios no ha terminado la partida
        if (espaciosVacios > 0) {
            return -1;
        }

        //Si ninguna de todas las condiciones anteriores se ha cumplido, significa que no hay espacios blanco 
        // y que no hay ganador, la partida termina en empate
        return 0;
    }

    public static int hayTresEnRayaHorizontal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int contador1 = 0;
            int contador2 = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    contador1++;
                } else if (matrix[i][j] == 2) {
                    contador2++;
                }

                //Si el contador1 llega a 3 ha ganado el jugador 1, devuelve 1
                //Si el contador 2 llega a 3 ha ganado el jugador 2, devuelve 2
                if (contador1 == 3) {
                    return 1;
                } else if (contador2 == 3){
                  return 2;
                }
            }
        }
      return 0;
    }

    public static int hayTresEnRayaVertical(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int contador1 = 0;
            int contador2 = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    contador1++;
                } else if (matrix[i][j] == 2) {
                    contador2++;
                }

                //Si el contador1 llega a 3 ha ganado el jugador 1, devuelve 1
                //Si el contador 2 llega a 3 ha ganado el jugador 2, devuelve 2
                if (contador1 == 3) {
                    return 1;
                } else if (contador2 == 3){
                  return 2;
                }
            }
        }
      return 0;
    }

    public static int hayTresEnRayaDiagonalIzquierda(int[][] matrix) {
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0, j = 0; i < matrix.length && j < matrix[i].length; i++, j++) {
            if (matrix[i][j] == 1) {
                contador1++;
            } else if (matrix[i][j] == 2) {
                contador2++;
            }

            //Si el contador1 llega a 3 ha ganado el jugador 1, devuelve 1
            //Si el contador 2 llega a 3 ha ganado el jugador 2, devuelve 2
            if (contador1 == 3) {
                    return 1;
                } else if (contador2 == 3){
                  return 2;
                }
        }
      return 0;
    }

    public static int hayTresEnRayaDiagonalDerecha(int[][] matrix) {
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0, j = matrix[0].length - 1; i < matrix.length && j >= 0; i++, j--) {
            if (matrix[i][j] == 1) {
                contador1++;
            } else if (matrix[i][j] == 2) {
                contador2++;
            }

            //Si el contador1 llega a 3 ha ganado el jugador 1, devuelve 1
            //Si el contador 2 llega a 3 ha ganado el jugador 2, devuelve 2
            if (contador1 == 3) {
                    return 1;
                } else if (contador2 == 3){
                  return 2;
                }
        }
      return 0;
    }
}
