package entity;

/**
 * @author: 周政伟
 * @create: 2020/11/26-21:44
 * @description:
 */
public enum Gizmos {
    BALL, SQUARE_BUMPER, CIRCLE_BUMPER, TRIANGLE_BUMPER, LEFT_FLIPPER, RIGHT_FLIPPER, ABSORBER, TAIL, BENT_RAIL;

    /**
     * @return: the xml tag name of the gizmo type
     */
    public String xmlTag(){
        return this.name();
    }
}
