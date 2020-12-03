package entity;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/12/3
 * 描述信息: 吸收器，An Absorber is a Gizmo. An Absorber is a mutable object.
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-12-03 15:00] [周政伟][创建]
 */
public class AbsorberGizmo extends Gizmo implements UnResizable{
    private Queue<Ball> balls;
    private Ball holdingBall;

    public AbsorberGizmo(float posX, float posY){
        this.posX = posX;
        this.posY = posY;

        balls = new LinkedList<>();
        holdingBall = null;
    }

    public Queue<Ball> getCapturedBalls()
    {
        return balls;
    }

    public void step(int timeSinceLastStep) {
        ;
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
    public void trigger(TriggerGenerator trigger) {

    }

    @Override
    public void registerTriggerListener(TriggerListener listener) {

    }

    @Override
    public void unregisterTriggerListener(TriggerListener listener) {

    }
}
