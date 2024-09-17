package Abstraction;

enum Geometry{LINE,POINT,POLYGON}
enum Color{BLACK, BLUE, GREEN, ORANGE, RED}
enum PointMarker{CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarker{DASHED, DOTTED, SOLID}
public interface MappableMain {

    static String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLAbel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {

        return """
                type: "%s","label": "%s", "marker: "%s" """
                .formatted(getShape(), getLAbel(), getMarker());
    }
    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toString()));
    }
}
