# templMethodDesignModel
模板方法模式

定义：定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类可以不改变一个定义一个操作中算法的框架，而将一些步骤延迟到子类中。
模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。算法的结构即可重定义该算法的某些特定步骤。

简单来说：模板方法模式就是定义一个抽象类，类中定义一个模板方法（一般用final修饰）和基本方法，而模板方法调用基本方法组成实现功能的算法逻辑，
而基本方法的具体实现由不同的子类去完成。
模板方法模式是基于继承的代码复用技术，是行为型模式。
