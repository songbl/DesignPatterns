package statuepattern;

public class GumballMachine {
    final  static int SOLD_OUT = 0;
    final static  int NO_QUARTER = 1;
    final static  int HAS_QUARTER = 2;
    final static  int SOLD = 3;
     int statue = SOLD_OUT;//初始状态是糖果售罄；开机安装是没有糖果的。
     int count = 0;

     public GumballMachine(int count){
         this.count = count;
         //库存不为0，等着别人投钱，进入没有25美分状态
         if(count>0){
             statue = NO_QUARTER;
         }
     }
     //当有钱投入进来
     public void insetQuarter(){
         if (statue == HAS_QUARTER){
             System.out.println("已经有钱了，不能再投钱了...");
         }else if (statue == NO_QUARTER){
             statue = HAS_QUARTER;
             System.out.println("投入25块钱");
         }else if (statue ==SOLD_OUT){
             System.out.println("你不可以投钱了，没有糖果卖给你了。....");
         }else if (statue==SOLD){
             System.out.println("稍等，正在准备糖果中....");
         }
     }
     //现在，如果客户试着退回25美分
    public void ejectQuarter(){
         if (statue == HAS_QUARTER){
             System.out.println("退回钱");
             statue = NO_QUARTER;
         }else if (statue == NO_QUARTER){
             System.out.println("没钱，你退啥..");
         }else if (statue == SOLD){
             System.out.println("已经给你糖块了，不给退钱了...");
         }else if (statue ==SOLD_OUT){
             System.out.println("糖果都售罄了，没投钱，更不能退钱了..");
         }
    }
    //转动杠杆
    public void turnCrank(){
         if (statue == SOLD){
             System.out.println("别想骗我拿两次糖果，没门...");
         }else if (statue == NO_QUARTER){
             System.out.println("投入25美分再说吧...");
         }else if (statue == SOLD_OUT){
             System.out.println("已经没有任何糖果可以给你了...");
         }else if (statue==HAS_QUARTER){
             System.out.println("成功，发放糖块ok的...");
             statue =SOLD;
             dispense();
         }
    }

    //发放糖果
    private void dispense() {
         if (statue==SOLD){
             System.out.println("发放糖果...");
             count = count-1;
             if (count==0){
                 System.out.println("最后一颗糖果，状态改变...");
                 statue=SOLD_OUT;
             }else {
                 statue=NO_QUARTER;
             }
         }else if (statue ==NO_QUARTER){//本，及以下状态不该发生
             System.out.println("先投钱再说...");
         }else if (statue ==SOLD_OUT){
             System.out.println("没有 糖果可以发放了...");
         }else if (statue==HAS_QUARTER){
             System.out.println("没糖果发放了...");

         }
    }
    public void setStatue(int statue){
         this.statue = statue;
    }
}
