Spring原生实现AOP：

*** 通知Advice

前置通知：通过实现MethodBeforeAdvice接口！
在目标方法执行之前执行，不能改变目标方法执行流程和结果！

后置通知：通过实现AfterReturningAdvice接口！
在目标方法执行之后执行，不能改变目标方法执行流程和结果！

环绕通知：通过拦截器实现，实现MethodInterceptor接口！
可以改变方法执行流程和结果！

异常通知：实现ThrowsAdvice接口！在目标方法抛出异常时执行！


*** 具体实现步骤

01.引入两个jar，aop联盟和spring-aop
02.创建业务类和对应的增强处理类Advice
03.在spring容器中配置目标对象和通知对象
04.配置ProxyFactoryBean 代理工厂类

问题：
   01.如果我们有多个serviceImpl！ 这时候ProxyFactoryBean不能配置多个目标对象！
   02.ProxyFactoryBean给目标对象中的所有主业务都做了增强！不能指定某个主业务！