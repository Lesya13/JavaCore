package lesson05;

import java.util.Arrays;

public class AppData {

    private String[] headers;
    private int[][] data;

    public AppData(String [] headers, int[][] data) {
        this.headers = headers;
        this.data =data;
    }

    @Override
    public String toString() {
        return "ApplicationData{" +
                "headers=" + Arrays.toString(headers) +
                ", data=" + dataToString() +
                '}';
    }

    private String dataToString() {
        StringBuilder builder = new StringBuilder("[");
        for(int[] values : data) {
            builder.append(dataValuesToString(values)).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    private String dataValuesToString(int[] values) {
        StringBuilder builder = new StringBuilder("[");
        for (int intValue : values) {
            builder.append(intValue).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }
}
