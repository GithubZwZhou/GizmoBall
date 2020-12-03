package entity;

import java.util.Vector;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/11/28
 * 描述信息: 小球组件
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-11-28 12:55] [周政伟][创建]
 * @update [2][2020-12-03 15:03] [周政伟][修改 position 属性]
 */
public class Ball extends Gizmo implements UnResizable{
    public Ball(String name, float posX, float posY){
        this.parentBoard = null;
        this.posX = posX;
        this.posY = posY;
        this.size = 1;
        this.reflectionCoefficient = 0.0;
        this.name = name;
    }

    /**
     * A time step has occurred. Do whatever is necessary
     * @param timeSinceLastStep:
     */
    void step(int timeSinceLastStep){
    }

    /**
     * Hold this gizmo, if applicable
     */
    public void hold(){
    }

    /**
     * UnHold this gizmo, if applicable
     */
    public void unHold(){
    }

    /**
     * is this gizmo held?
     */
    public boolean isHold(){
        return true;
    }

    /**
     * Move the Gizmo by offset to a new position.
     * @param offset: a Vector<Float> with capacity of 2.
     * @modifies: this.position
     */
    void move(Vector<Float> offset){
    }

    /**
     *
     * @param otherGizmo: an instantiated Gizmo (or Ball)
     * @param timeStep:
     * @return: are we actually colliding with the other Gizmo (or Ball)
     */
    boolean colliding(Gizmo otherGizmo, double timeStep){
        return true;
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
