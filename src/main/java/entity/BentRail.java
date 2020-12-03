package entity;

import java.util.Vector;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/11/30
 * 描述信息: 弯轨道，可以改变小球的方向。
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-11-30 13:44] [周政伟][创建]
 * @update [2][2020-12-03 15:03] [周政伟][修改 position 属性]
 */
public class BentRail extends OrientatableGizmo implements UnResizable{
    public BentRail(String name, float posX, float posY){
        this.name = name;
        this.orient = DEFAULT_ORIENT;
        this.parentBoard = null;
        this.posX = posX;
        this.posY = posY;
        this.reflectionCoefficient = 0.0;
        this.size = 3;
    }

    /**
     * 对弯曲轨道组件的重叠处理，将其视为一个 3*3 的正方形。
     * @param otherGizmo: 与之比较的另一个组件。
     */
    @Override
    public boolean isOverlapped(Gizmo otherGizmo) {
        Gizmo replaceGizmo = new SquareBumper();
        Vector<Float> pos = orient.dealPosForBentRail(posX, posY);
        replaceGizmo.setSize(size / 2).setPosition(pos.get(0), pos.get(1));
        return replaceGizmo.isOverlapped(otherGizmo);
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
