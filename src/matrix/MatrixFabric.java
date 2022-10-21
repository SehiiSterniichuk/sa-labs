package matrix;

public class MatrixFabric {

    public static Integer[][] makeDefaultArray2D(int dimension){
        Integer[][] array2D = new Integer[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(j == i){
                    array2D[i][j] = null;
                }else {
                    array2D[i][j] = 0;
                }
            }
        }
        return array2D;
    }

    public static Matrix makeMyVariantMatrix(){
        final var array2D = makeDefaultArray2D(5);
        array2D[0][4] = 1;

        array2D[1][3] = 1;
        array2D[1][4] = 1;
        array2D[1][0] = 1;

        array2D[2][0] = 1;
        array2D[2][1] = 1;
        array2D[2][3] = 1;
        array2D[2][4] = 1;

        array2D[3][0] = 1;
        array2D[3][4] = 1;

        return new Matrix(array2D);
    }
}
