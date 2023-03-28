class SuperClass {

    void method() {
        System.out.println("SuperClass");
    }
    }
    
    class SubClass extends SuperClass {
    
        void method() throws ArithmeticException {
            System.out.println("SubClass");
        }
        public static void main(String args[]) {
            SuperClass s = new SubClass();
            s.method();
        }
    }