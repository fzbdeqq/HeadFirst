# HeadFirst 设计模式
###Chapter1  Strategy
###策略模式
#####定义算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
###设计原则
#####找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起
#####针对接口编程，也不是针对实现编程
#####多用组合，少用继承
###Chapter2  Observer
###观察者模式
####定义对象之间一对多依赖，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
####观察者模式提供了一种对象设计，让主题和观察者之间松耦合
###设计原则
####为了交互对象之间的松耦合设计而努力

###Chapter3  Decorator
###装饰者模式
####动态地将责任附加到对象上。若要扩展功能，装饰罩提供了比继承更有弹性的替代方案。
###设计原则
####开闭原则:类应该对扩展开放，对修改关闭

###Chapter4  Abstract Factor\ Factor Method
###工厂方法模式
####让子类决定改创建的对象是什么，来达到对象创建的过程封装的目的。
####定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类
###设计原则
####依赖抽象，不要依赖具体类
###抽象工厂模式
####提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
###Chapter5  Singleton
###单利模式
####确保一个类只有一个实例，并提供全局访问点
###Chapter6  Command
###命令模式
####将“请求”封装成对象，一遍使用不同的请求、队列或者日志来参数化其他对象
###Chapter7  Adapter\Facade
###适配器模式
####将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
###Chapter8  Template Method
###Chapter9 Iterator 
###Chapter10 Composite
###Chapter11 
###Chapter12 
###Chapter13 
###Chapter14 State
###Chapter15 Proxy

###Bridge
###Builder
###Chain of Responsibility
###Flyweight
###Interpreter
###Mediator
###Memento
###Prototype
###Visitor