package entity;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/12/3
 * 描述信息: An AbstractFlipper is either a LeftFlipper or a RightFlipper. An AbstractFlipper is a mutable object.
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-12-03 16:30] [周政伟][创建]
 */
public abstract class AbstractFlipper extends Gizmo{
    /**
     * Create a flipper bumper.
     */
    public void commonFlipper(float posX, float posY, Orient orient, Gizmos type){

    }

    @Override
    public void trigger(TriggerGenerator trigger) {

    }
}
