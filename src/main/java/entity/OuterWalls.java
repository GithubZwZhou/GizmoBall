package entity;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/12/3
 * 描述信息: `OuterWalls` are a `Gizmo`. `OuterWalls` are a mutable object.
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-12-03 16:24] [周政伟][创建]
 */
public class OuterWalls extends Gizmo{
    /**
     * A `Gizmoball` game supports exactly one set of outer walls.
     *  The user cannot move, delete, or rotate the outer walls.
     *  The outer walls lie just outside the playing area:
     *      There is one wall in the X plane just above the y=0L coordinate.
     *      There is one wall in the X plane just below the y=20L coordinate.
     *      There is one wall in the Y plane just to the left of the x=0L coordinate.
     *      There is one wall in the Y plane just to the right of the x=20L coordinate.
     */
    public OuterWalls(){

    }

    @Override
    public boolean proximate(Gizmo otherGizmo) {
        return false;
    }

    @Override
    public String helpText() {
        return null;
    }

    @Override
    public void registerTriggerListener(TriggerListener listener) {

    }

    @Override
    public void unregisterTriggerListener(TriggerListener listener) {

    }

    @Override
    public void trigger(TriggerGenerator trigger) {

    }
}
