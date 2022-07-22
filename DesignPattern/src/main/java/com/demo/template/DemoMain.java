/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.template;
/**
 * @Title 
 * 模板方法模式
 * @Description 
 * 定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 * 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势，提供了一个很好用代码复用平台。
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		TestPaperA a = new TestPaperA();
		a.testQuestion();
		
		TestPaperB b = new TestPaperB();
		b.testQuestion();
	}

}

