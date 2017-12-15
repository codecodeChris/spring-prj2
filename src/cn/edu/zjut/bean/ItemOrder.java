package cn.edu.zjut.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder,InitializingBean,DisposableBean {
    private IItem item;
    private int numItems;
    public void incrementNumItems(){
        setNumItems(getNumItems()+1);
    }
    public void cancelOrder(){
        setNumItems(0);
    }
    public double getTotalCost(){
        return getNumItems()*getUnitCost();
    }
    public double getUnitCost(){
        return item.getCost();
    }
    public void init() { System.out.println("正在执行初始化方法 init..."); }
    public ItemOrder() {
        System.out.println("Spring实例化ItemOrder...");
    }
    public IItem getItem() {
        return item;
    }

    public void setItem(IItem item) {
        System.out.println("Spring注入item..");
        this.item = item;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        System.out.println("Spring注入numItems...");
        this.numItems = numItems;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet...");

    }
    public void predestroy() throws Exception {
        System.out.println("正在执行销毁前方法 predestroy...");
    }

    public void destroy() throws Exception {
        System.out.println("正在执行销毁 destroy...");
    }
}
