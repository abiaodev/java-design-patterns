package com.biao.composite;

/**
 * 组合模式
 */
class App {
    public static void main(String[] args){
        Composite composite1 = new Composite("总公司");
        composite1.add(new Leaf("总公司部门一"));
        composite1.add(new Leaf("总公司部门二"));

        Composite composite2 = new Composite("分公司2");
        composite2.add(new Leaf("分公司2部门一"));
        composite2.add(new Leaf("分公司2部门二"));


        Composite composite21 = new Composite("分公司2下属公司");
        composite21.add(new Leaf("分公司2下属公司部门一"));
        composite21.add(new Leaf("分公司2下属公司部门二"));
        composite2.add(composite21);

        composite1.add(composite2);

        Composite composite3 = new Composite("分公司3");
        composite3.add(new Leaf("分公司3部门一"));
        composite3.add(new Leaf("分公司3部门二"));

        composite1.add(composite3);


        composite1.display(1);
    }
}
