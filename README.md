1.自定义注解
  > 使用@interface关键字定义自定义注解 (支持八大基本类型，枚举，Class,嵌套另一个注解。这些属性的一维数组)
  > 元注解 : @Retention 
              > Source 只存在于源代码上(.java)
              > Class  编译后仍然存在 (.class)
              > Runtime 运行时仍然存在 *
             @Target
              作用域(类,属性,方法...)
             @Document
             @Inherited 表示是否让子类继承该注解
  >特殊属性value
  
2.动态代理
  > 用于拦截对真实业务对象的访问
  > 真实对象必须实现某个接口
  > Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler handler{
        /*
			 * proxy:把代理对象自身传递进来
			 * method:代表当前调用的方法
			 * args:调用方法的参数
			 * 
			 */
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return null;
			}
    })
    
