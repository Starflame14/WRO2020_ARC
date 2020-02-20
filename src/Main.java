public class Main {
    public static void main(String[] args) {
        System.out.println(intersect(
                0, 0, 1, 1,
                0.49f, 0.5f, 1.99f,  1f,
                2.99f, -2f, 1.49f, -2.5f
        ));
    }

    static boolean intersect(
            float lineX1, float lineY1, float lineX2, float lineY2,
            float rectX1, float rectY1, float rectX2, float rectY2,
            float rectX3, float rectY3, float rectX4, float rectY4
    ) {
        float x3, y3, x4, y4, denom, ua, ub;

        //first side
        x3 = rectX1;
        y3 = rectY1;
        x4 = rectX2;
        y4 = rectY2;

        denom = (y4 - y3) * (lineX2 - lineX1) - (x4 - x3) * (lineY2 - lineY1);
        if (denom == 0) {
            return false;
        }

        ua = ((x4 - x3) * (lineY1 - y3) - (y4 - y3) * (lineX1 - x3)) / denom;
        ub = ((lineX2 - lineX1) * (lineY1 - y3) - (lineY2 - lineY1) * (lineX1 - x3)) / denom;
        if (ua >= 0.0f && ua <= 1.0f && ub >= 0.0f && ub <= 1.0f) {
            return true;
        }

        //second side
        x3 = rectX2;
        y3 = rectY2;
        x4 = rectX3;
        y4 = rectY3;

        denom = (y4 - y3) * (lineX2 - lineX1) - (x4 - x3) * (lineY2 - lineY1);
        if (denom == 0) {
            return false;
        }

        ua = ((x4 - x3) * (lineY1 - y3) - (y4 - y3) * (lineX1 - x3)) / denom;
        ub = ((lineX2 - lineX1) * (lineY1 - y3) - (lineY2 - lineY1) * (lineX1 - x3)) / denom;
        if (ua >= 0.0f && ua <= 1.0f && ub >= 0.0f && ub <= 1.0f) {
            return true;
        }

        //third side
        x3 = rectX3;
        y3 = rectY3;
        x4 = rectX4;
        y4 = rectY4;

        denom = (y4 - y3) * (lineX2 - lineX1) - (x4 - x3) * (lineY2 - lineY1);
        if (denom == 0) {
            return false;
        }

        ua = ((x4 - x3) * (lineY1 - y3) - (y4 - y3) * (lineX1 - x3)) / denom;
        ub = ((lineX2 - lineX1) * (lineY1 - y3) - (lineY2 - lineY1) * (lineX1 - x3)) / denom;
        if (ua >= 0.0f && ua <= 1.0f && ub >= 0.0f && ub <= 1.0f) {
            return true;
        }

        //fourth side
        x3 = rectX4;
        y3 = rectY4;
        x4 = rectX1;
        y4 = rectY1;

        denom = (y4 - y3) * (lineX2 - lineX1) - (x4 - x3) * (lineY2 - lineY1);
        if (denom == 0) {
            return false;
        }

        ua = ((x4 - x3) * (lineY1 - y3) - (y4 - y3) * (lineX1 - x3)) / denom;
        ub = ((lineX2 - lineX1) * (lineY1 - y3) - (lineY2 - lineY1) * (lineX1 - x3)) / denom;
        if (ua >= 0.0f && ua <= 1.0f && ub >= 0.0f && ub <= 1.0f) {
            return true;
        }

        return false;
    }

    static boolean intersect(float[] line, float[] rect) {
        return intersect(
                line[0], line[1], line[2], line[3],
                rect[0], rect[1], rect[2], rect[3],
                rect[4], rect[5], rect[6], rect[7]
        );
    }
}
