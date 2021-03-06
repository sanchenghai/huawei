2016-07-28

购物结算系统

描述: 	
1 总体说明
考生需要模拟实现一个简单的购物结算系统，实现挑选和删除商品、按照最佳优惠方案进行结算、查询购物车订单信息及购物卡余额和积分的功能。
系统初始化时购物卡中有3000元余额和150积分，可以输入命令来初始化系统。
1.1 购物活动细则
只要购物卡余额足够，可以进行多次购买，每次购买活动可以包含如下活动：
1、多次挑选商品，每次挑选形成购物车中的一条商品订单；
2、多次删除商品订单，每次只能删除一条订单；
结算的是当前购物车中所有订单，结算完成即本次购买活动结束，同时清空购物车并更新购物卡余额和积分；
 
1.2 商品优惠细则
购买商品时优惠方案分为单项优惠方案和总价优惠方案，在享受单项优惠的同时如满足一定条件可以再享受总价优惠。
 
各种商品的单项优惠方案列表：
 
商品序号
商品种类
单价（元）
单项优惠方案
积分积累方式
0
食品
10
无优惠
结算时消费金额每10元积1分，不足10元不积分
9折
每满100直减18
1
服装
120
无优惠
每满200直减40
2
书籍
30
无优惠
5折
 
单项优惠方案序号：
单项优惠方案序号
单项优惠方案
0
无优惠
1
打折
2
直减
 
  1、在一次购买活动中，同种商品只能有一种单项优惠方案；总价优惠方案：在一次购买活动结算时，所有商品单项优惠后总消费金额大于等于500时，可以再使用“积分抵现”或“折上折”优惠：
（1）   积分抵现：1个积分抵1元现金，购物卡积分大于等于120只能使用120个积分，不足120，全部使用；
（2）   折上折：在单项商品优惠后总金额基础上，再打8折；
1.3 约束
*  商品价格最小单位到元，所有涉及价格计算中不足1元，向下取整，舍掉余数部分。例如：计算出的实际价格为563.9，则取整为563；
*  本次购买活动新增的积分不能在当次购买中使用；
*  购物卡余额和积分不能透支；
2 操作说明
   命令字与第一个参数间使用一个空格分隔，多个参数间使用半角“-”分隔，参数间没有空格。考试系统会对输入命令格式进行处理，考生不需要关注输入命令格式的合法性，只需要实现命令处理函数。对于涉及多个参数的命令，多个参数同时出错的情况不作为考察点。
2.1 系统初始化
命令格式：r
功能说明：将购物卡金额和积分分别初始化为3000、150；
约束说明：系统在任意阶段均可执行r初始化系统；
输出说明：输出操作成功提示（执行完r命令后系统会自动输出操作结果，考生不需要再次调用输出函数），例：
 
命令
输出
r
S001
2.2 挑选商品
命令格式：o 商品序号-商品数量
    功能说明：
（1）   每次挑选只能指定一种商品，且商品数量不超过100（0<每次挑选商品数量<=100），同一种商品可以多次挑选；
（2）   挑选成功则生成购物车中的一条商品订单，输出：“S002”；
（3）   如果输入的“商品序号”或“商品数量”参数不合法，输出“E002”。参数错误直接返回不再进行其他处理；
（4）   购物车中最多容纳5条商品订单，挑选时如果购物车已满，则挑选失败，输出“E003”；
（5）   在挑选商品阶段不校验购物卡余额是否足够；
 
    约束说明：
（1）   系统在任意阶段都可以挑选商品；
（2）   购物车中的同一种商品的订单记录不合并；
 
    输出说明：如果挑选成功，输出操作提示。例，挑选6本书籍：
 
命令
输出
o 2-6
S002
2.3 删除商品订单记录
命令格式：c 商品序号-商品数量
功能说明：
（1）   在结账前可以删除购物车中的订单以取消挑选，商品数量不超过100（0<每次删除商品数量<=100），每次只能删除一条，可以执行多次删除操作；
（2）   只能删除购物车中与删除命令输入的“商品序号”、“商品数量”完全匹配的订单记录；
（3）   如果输入的“商品序号”或“商品数量”参数不在系统允许的范围内，输出“E002”。参数错误直接返回不再进行其他处理；
（4）   如果购物车为空，输出“E005”；
（5）   如果购物车中不存在待删除订单，输出“E004”；
（6）   如果购物车中存在多条相同（“商品序号”和“商品数量”都相同）的订单记录，则只删除购物车中的一条记录；
 
输出说明：如果删除成功，输出操作提示。例，从购物车中删除6本书籍的订单记录：
 
命令
输出
c 2-6
S003
2.4 结算
命令格式：b
功能说明：
（1）   系统根据“商品优惠细则”自动调整商品的单项和总价优惠方案，使得用户消费金额最少。当两种总价优惠方案花费金额相同时，优选“折上折”。
（2）   如果购物车为空，输出“E005”；
（3）   如果购物卡余额或积分不足以购买购物车商品时，输出“E006”；
 
输出说明：如果结算成功，输出结果中包含本次购买所需的消费金额和消费积分以及新增的积分。例：
 
命令
输出
说明
b
800 
0
80
消费金额
消费积分
新增积分
2.5 查询
命令格式：l 查询类别
功能说明：
（1）   查询购物卡信息（余额、积分）和购物车中的订单信息；
（2）   查询类别：0表示购物卡信息查询，1表示购物车订单查询；如果“查询类别参数错误，输出“E002”。“查询类别”参数错误时，不进行下面的处理。
 
输出说明：
（1）   “查询类别”为0时，输出购物卡余额和积分，例：
 
命令
输出
说明
l 0
3000
150
余额
积分
 
（2）   “查询类别”为1时，输出购物车中的订单数以及每种商品的总数，例：
 
命令
输出
说明
l 1
4
2
1
10
订单数
食品
服装
书籍
2.6结束
        命令格式：e 系统结束      功能说明：一次购物完成，系统结束。
 
 
题目类别:	 字符串 
难度:	 挑战 
运行时间限制:	无限制
内存限制:	无限制
阶段:	 入职前练习 
输入:	 
依照说明中的命令码格式输入命令
 
 
输出:	 
输出执行结果
 
 
样例输入:	
r
o 1-100
e
                   
样例输出:	
S001
S002
                   
答案提示:	
3 附录：
3.1 命令汇总
命令
命令格式
示例
说明
r
r
r
Reset，初始化购物卡金额和积分
o
o 商品序号-商品数量
o 0-2
Order，挑选一种商品
c
c 商品序号-商品数量
c 2-1
Cancel，删除购物车中的单条商品订单记录
b
b
b
Buy，按照系统生成的最佳优惠方案扣除购物卡金额并更新购物卡积分
l
l 查询类别
l 0
List，购物卡信息查询或购物车订单查询
e
e
e
系统结束
3.2 返回码汇总
返回码描述
含义
说明
E001
非法命令
考试系统使用，考生不用关注
E002
参数错误
“商品序号”参数不合法；
“商品数量”参数不合法；
“查询类别”参数不合法；
E003
购物车已满
购物车中订单数量已经达到5条，不能再挑选商品
E004
待删除的订单不存在
在购物车中没有找到要删除的商品订单
E005
购物车中没有商品订单
删除商品订单或结算时，购物车中没有订单
E006
购物卡余额或积分不足
购物卡余额或积分不足
S001
初始化成功
初始化操作成功，考试系统使用，考生不用关注
S002
订单已经加入到购物车
挑选商品操作成功
S003
订单已从购物车中删除
从购物车中删除商品订单成功
3.3 基本用例
编号
测试步骤
预期输出
1
r
o 1-100
o 2-50
o 0-1
o 1-100
o 2-50
e
S001 
S002 
S002 
S002 
S002 
S002
2
r
o 0-101
e
S001 
E002
3
r
o 1-100
o 2-50
o 0-1
o 1-100
o 2-50
o 2-50
e
S001 
S002
S002
S002
S002
S002
E003
 
4
r
o 0-1
o 2-10
o 1-5
l 1
c 2-10
c 1-5
c 0-1
l 1
e
S001
S002
S002
S002
3
1
5
10
S003
S003
S003
0
0
0
0
5
r
o 2-50
o 0-1
c 1-200
e
S001
S002
S002
E002
6
r
c 0-50
e
S001
E005
7
r
o 0-1
c 0-2
c 0-1
l 1
e
S001
S002
E004
S003
0
0
0
0
8
r
o 2-1
o 1-1
o 2-10
o 2-10
c 2-10
l 1
e
S001
S002
S002
S002
S002
S003
3
0
1
11
9
r
o 1-7
b
l 0
e
S001
S002
544
0
54
2456
204
10
r
o 1-5
o 0-10
b
l 0
e
S001
S002
S002
442
120
44
2558
74
11
r
o 1-2
o 0-10
o 2-3
b
e
S001
S002
S002
S002
327
0
32
12
r
o 1-5
o 0-2
b
e
S001
S002
S002
380
120
38
13
r
o 0-1
c 0-1
o 2-30
b
e
S001
S002
S003
S002
450
0
45
14
r
o 1-3
c 1-3
b
l 0
b
e
S001
S002
S003
E005
3000
150
E005
15
r
o 2-100
o 2-100
o 2-12
o 2-50
b
c 2-12
b
l 0
e
S001
S002
S002
S002
S002
E006
S003
3000
0
300
0
450
16
r
o 0-9
o 1-1
b
o 0-15
o 1-2
b
o 0-19
o 1-4
b
o 0-20
o 1-5
b
e
S001
S002
S002
201
0
20
S002
S002
332
0
33
S002
S002
451
120
45
S002
S002
515
0
51
