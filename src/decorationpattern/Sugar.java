package decorationpattern;

    /**
     *   具体装饰者
     */
    public class Sugar extends CondimentDecorator {
        /**
         * Mocha 能够引用一个Beverage
         * 1.用一个实例变量记录饮料，也就是被装饰者
         * 2.想办法让装饰者（饮料）被记录到实例变量中。
         */
        Beverage beverage ;
        public Sugar (Beverage beverage){
            this.beverage = beverage;
        }
        @Override
        public String getDescription() {
            System.out.println("调用糖==="+beverage.getDescription());
            return beverage.getDescription()+"、糖";
        }

        @Override
        public double cost() {
            return 1.0+beverage.cost();
        }


    }


