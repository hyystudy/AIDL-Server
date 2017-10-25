# 这是一个android AIDL 的简单app
AIDL（android interface definition language）安卓接口定义语言：

首先AIDL是一门语言， 它的作用就是为了**实现进程间通信**，当然我对鱼AIDL理解不够深，暂时以一个app（Client简称A）去绑定另一个app（Server简称B）的service为例，去实现A从B中取数据 并且往B中添加数据的小demo，B指的就是这个仓库 A的仓库链接如下：
[AIDL Client](https://github.com/hyystudy/AIDLClient)
当然我们也可以很简单的去理解AIDL，客户端和服务器，一般客户端和服务器是通过网络请求去通信的，客户端会上传数据到服务器， 服务器也会返回数据给客户端；那android里面AIDL其实也是这个道理，A绑定B中的service， 通过定义接口，可以调用Bservice中的一些方法以及传递已经定义好的一些数据类型（一般都implements Pacelable）这样子就实现了俩个app间的通信
