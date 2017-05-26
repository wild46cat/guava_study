# guava_study

###参考资料
**可以参考以下文章：**
http://ifeve.com/google-guava/


##总结：
* 判断出现的是不是null

        Optional.of(123).isPresent();
       
* 判断是否是null

        String a = Preconditions.checkNotNull("123","String不能为null");
* 判断数组越界

        int[] ints = new int[2];

        Preconditions.checkPositionIndex(2,ints.length-1);

* 判断参数是否合法

         Preconditions.checkArgument(true,"argument wrong");
         
*

