1. 配置entity、mapper实体类、mapper配置文件后，可以查询到结果，但是部分结果始终为null，是什么原因？

可能是因为返回值类型resultType和resultMap的区别！！！ 对应的实体类属性和表中字段不一致，需要利用resultMap来添加映射，把数据库表属性和实体类字段进行绑定。

2. 