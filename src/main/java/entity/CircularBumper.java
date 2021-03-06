package entity;

/**
 * 项目名称: GizmoBall
 * 创建时间: 2020/12/3
 * 描述信息: A `CircularBumper` is a `Gizmo`. A `CircularBumper` is a mutable object.
 *
 * @author <a href="mail to: 10185101124@stu.ecnu.edu.cn" rel="nofollow">周政伟</a>
 * @update [1][2020-12-03 16:21] [周政伟][创建]
 */
public class CircularBumper extends Gizmo{

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
