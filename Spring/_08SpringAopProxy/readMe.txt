回顾下代理设计模式！

特点：
01.委托类和代理类有相同的接口或父类！
02.代理类为委托类负责处理消息，并将消息转发给委托类！
03.委托类和代理类对象通常存在关联关系！一个代理类对象与一个委托类对象关联！
04.代理类本身并不是真正的实现者！而是通过调用委托类的方法来实现功能！

按照代理类创建的时机，代理类分为两种：
01.静态代理：由我们程序猿或者特定的工具自动生成了源代码，在程序运行之前，.class文件已经存在了！
02.动态代理：在程序运行期间，通过反射的方式动态的创建出来！

动态代理的两种实现：
01.jdk动态代理（接口）
涉及如下一个类和一个接口！

001.InvocationHandler接口只有一个方法
public Object invoke(Object proxy, Method method, Object[] args)

proxy：代理类对象
method：被代理的方法
args：被代理的方法的参数列表

002.Proxy类
public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)

loader:类加载器
interfaces：代理类实现的所有接口
h：InvocationHandler接口的一个实例，this当前对象，因为我们想使用jdk动态代理 必须是代理类实现 InvocationHandler！
它让我们传递父接口 我们传递自身！

02.cglib动态代理（接口+父类）
涉及一个类和一个接口
001.MethodInterceptor接口
public Object intercept(Object obj,Method method,Object[] args, MethodProxy proxy)

intercept是所有拦截器执行的方法，类似于jdk动态代理中的invoke


002. Enhancer类，设置委托类和代理类的公共接口或者公共的父类

public void setSuperclass(Class superclass)

               代理类执行完毕 通知委托类
               public void setCallback(final Callback callback) {
                      setCallbacks(new Callback[]{ callback });
               }


                在Enhancer类的父类AbstractClassGenerator中有一个方法
                  创建我们需要的代理类
                  protected Object create(Object key)