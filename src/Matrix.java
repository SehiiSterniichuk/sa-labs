public record Matrix(Integer[][] array2D) {

    @Override
    public String toString() {
        final var builder = new StringBuilder("\t");
        final var dimension = array2D.length;
        for (int i = 0; i < dimension; i++) {
            builder.append("\tZ" + (i + 1));
        }
        builder.append('\n');
        for (int i = 0; i < dimension; i++) {
            builder.append("\tZ" + (i + 1));
            for (int j = 0; j < dimension; j++) {
                if (j != i){
                    builder.append('\t');
                    builder.append(array2D[i][j]);
                    continue;
                }
                builder.append('\t' + "*");
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
