[TOC]

## 1、用户登陆模块

（已测试）

### 1.1 登录
 
​	请求地址 : /login

​	请求参数:

| 参数名   | 类型   | 意义     |
| -------- | ------ | -------- |
| username | String | 用户名   |
| password | String | 登录密码 |

​	响应参数:

| 参数名        | 类型    | 意义                |
| ------------- | ------- | ------------------- |
| errorMessage  | String  | "错误信息"          |
| code          | String  | 状态信息            |
| sessionUserId | Integer | 用户ID（session中） |

eg1:



```json
{
    "code": "success",
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "用户名密码格式错误"
}
```



### 1.2 注册

请求地址: /register

请求参数:

| 参数名    | 类型   | 意义   |
| --------- | ------ | ------ |
| username  | String | 用户名 |
| password  | String | 密码   |
| telephone | String | 手机号 |

响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "格式错误"
}
```



### 1.3 忘记密码

请求地址: /forget

请求参数:

| 参数名    | 类型   | 意义   |
| --------- | ------ | ------ |
| password  | string | 密码   |
| telephone | string | 手机号 |

响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "格式错误"
}
```



### 1.4 修改密码

请求地址:  /modifyPassword 

请求参数:

| 参数名      | 类型   | 意义   |
| ----------- | ------ | ------ |
| username    | string | 用户名 |
| oldpassword | string | 旧密码 |
| newpassword | string | 新密码 |

响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "用户名或密码错误"
}
```



## 2、社团活动模块（待定）

### 2.1 展示所有社团活动

查询所有未结束的活动（按时间排序）

请求地址 :

​	参数:

| 参数名      | 类型 | 意义     |
| ----------- | ---- | -------- |
| presentTime | date | 现在时间 |
|             |      |          |

​	响应参数:

| 参数名       | 类型           | 意义                 |
| ------------ | -------------- | -------------------- |
| errorMessage | string         | "错误信息"           |
| code         | string         | 状态信息             |
| allActivity  | List<Activity> | 所有未结束的活动信息 |

eg1:



### 2.2 展示所有已结束的活动信息
查询所有已结束的活动（按时间排序）

​	请求地址 : 

​	参数:

| 参数名      | 类型 | 意义     |
| ----------- | ---- | -------- |
| presentTime | date | 现在时间 |
|             |      |          |

​	响应参数:

| 参数名       | 类型           | 意义                 |
| ------------ | -------------- | -------------------- |
| errorMessage | string         | "错误信息"           |
| code         | string         | 状态信息             |
| allActivity  | List<Activity> | 所有已结束的活动信息 |

eg1:



### 2.3 按时间搜索活动（按时间排序）

​	请求地址 :

​	参数:

| 参数名    | 类型 | 意义     |
| --------- | ---- | -------- |
| startTime | date | 开始时间 |
| endTime   | date | 结束时间 |

​	响应参数:

| 参数名       | 类型           | 意义               |
| ------------ | -------------- | ------------------ |
| errorMessage | string         | "错误信息"         |
| code         | string         | 状态信息           |
| activitys    | List<Activity> | 符合要求的活动信息 |

eg1:



### 2.4 按名称模糊搜索的活动（按时间排序）

​	请求地址 : 

​	参数:

| 参数名      | 类型   | 意义               |
| ----------- | ------ | ------------------ |
| likeActName | String | 模糊查询的活动名称 |
|             |        |                    |

​	响应参数:

| 参数名       | 类型           | 意义               |
| ------------ | -------------- | ------------------ |
| errorMessage | string         | "错误信息"         |
| code         | string         | 状态信息           |
| activitys    | List<Activity> | 符合要求的活动信息 |

eg1:



### 2.5 按所属社团查询活动（按时间排序）

​	请求地址 : 

​	参数:

| 参数名   | 类型   | 意义         |
| -------- | ------ | ------------ |
| clubName | String | 所属社团名称 |
|          |        |              |

​	响应参数:

| 参数名       | 类型           | 意义               |
| ------------ | -------------- | ------------------ |
| errorMessage | string         | "错误信息"         |
| code         | string         | 状态信息           |
| activitys    | List<Activity> | 符合要求的活动信息 |

eg1:



### 2.6 查询登陆者是否为社团负责人

​	请求地址 :

​	参数:

| 参数名        | 类型    | 意义                    |
| ------------- | ------- | ----------------------- |
| sessionUserId | Integer | 在session中的登陆者的id |
|               |         |                         |

​	响应参数:

| 参数名       | 类型       | 意义                 |
| ------------ | ---------- | -------------------- |
| errorMessage | string     | "错误信息"           |
| code         | string     | 状态信息             |
| clubs        | List<Club> | 负责人负责的社团信息 |

eg1:



### 2.7 按ID查询活动信息

​	请求地址 : 

​	参数:

| 参数名     | 类型    | 意义   |
| ---------- | ------- | ------ |
| activityId | Integer | 活动ID |
|            |         |        |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
| club         | Club   | 社团信息   |

eg1:





### 2.8 增加社团活动

​	请求地址 :

​	参数:

| 参数名      | 类型     | 意义           |
| ----------- | -------- | -------------- |
| newActivity | Activity | 新增活动的信息 |
|             |          |                |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 2.9 修改社团活动信息

​	请求地址 :

​	参数:

| 参数名         | 类型     | 意义           |
| -------------- | -------- | -------------- |
| updateActivity | Activity | 修改活动的信息 |
|                |          |                |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:





### 2.10 删除社团活动

​	请求地址 :

​	参数:

| 参数名        | 类型    | 意义         |
| ------------- | ------- | ------------ |
| delActivityId | Integer | 删除的活动ID |
|               |         |              |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



## 3、社团信息模块（待定）

​	/*添加社团logo*/

### 3.1 查询所有社团

​	请求地址 :

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型       | 意义         |
| ------------ | ---------- | ------------ |
| errorMessage | string     | "错误信息"   |
| code         | string     | 状态信息     |
| allClub      | List<Club> | 所有社团信息 |

eg1:



### 3.2 按名称模糊查询社团

​	请求地址 : 

​	参数:

| 参数名       | 类型   | 意义               |
| ------------ | ------ | ------------------ |
| likeClubName | String | 模糊查询的社团名称 |
|              |        |                    |

​	响应参数:

| 参数名       | 类型       | 意义               |
| ------------ | ---------- | ------------------ |
| errorMessage | string     | "错误信息"         |
| code         | string     | 状态信息           |
| clubs        | List<Club> | 符合条件的社团信息 |

eg1:



### 3.3 按类型查询社团

​	请求地址 :

​	参数:

| 参数名   | 类型   | 意义     |
| -------- | ------ | -------- |
| clubKind | String | 社团类型 |
|          |        |          |

​	响应参数:

| 参数名       | 类型       | 意义               |
| ------------ | ---------- | ------------------ |
| errorMessage | string     | "错误信息"         |
| code         | string     | 状态信息           |
| clubs        | List<Club> | 符合条件的社团信息 |

eg1:



### 3.4 按ID查询社团

​	请求地址 : 

​	参数:

| 参数名 | 类型    | 意义   |
| ------ | ------- | ------ |
| clubId | Integer | 社团ID |
|        |         |        |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
| club         | Club   | 社团信息   |

eg1:





### 3.5 新增社团

​	请求地址 :  

​	参数:

| 参数名  | 类型 | 意义         |
| ------- | ---- | ------------ |
| newClub | Club | 新增社团信息 |
|         |      |              |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 3.6 修改社团

​	请求地址 :  

​	参数:

| 参数名     | 类型 | 意义         |
| ---------- | ---- | ------------ |
| updateClub | Club | 修改社团信息 |
|            |      |              |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 3.7 删除社团

​	请求地址 : 

​	参数:

| 参数名    | 类型    | 意义   |
| --------- | ------- | ------ |
| delclubId | Integer | 社团ID |
|           |         |        |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



## 4、失物招领模块（待定）

​	/*删除lostSign标记*/

### 4.1 查询所有失物信息

​	请求地址 :

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型               | 意义         |
| ------------ | ------------------ | ------------ |
| errorMessage | string             | "错误信息"   |
| code         | string             | 状态信息     |
| allLost      | List<LostAndFound> | 所有失物信息 |

eg1:



### 4.2 按发布时间查询失物信息

​	请求地址 : 

​	参数:

| 参数名    | 类型 | 意义                  |
| --------- | ---- | --------------------- |
| startTime | date | 开始时间              |
| endTime   | date | 结束时间              |
| hisKind   | int  | 失物招领的种类编号(1) |

​	响应参数:

| 参数名       | 类型               | 意义               |
| ------------ | ------------------ | ------------------ |
| errorMessage | string             | "错误信息"         |
| code         | string             | 状态信息           |
| losts        | List<LostAndFound> | 符合要求的失物信息 |

eg1:



### 4.3 根据发布者ID查询失物信息

​	请求地址 :

​	参数:

| 参数名        | 类型    | 意义                    |
| ------------- | ------- | ----------------------- |
| sessionUserId | Integer | 在session中的登陆者的id |
|               |         |                         |

​	响应参数:

| 参数名       | 类型               | 意义               |
| ------------ | ------------------ | ------------------ |
| errorMessage | string             | "错误信息"         |
| code         | string             | 状态信息           |
| losts        | List<LostAndFound> | 符合要求的失物信息 |

eg1:



### 4.4 根据ID查询失物信息

​	请求地址 : 

​	参数:

| 参数名 | 类型    | 意义       |
| ------ | ------- | ---------- |
| lostId | Integer | 失物信息ID |
|        |         |            |

​	响应参数:

| 参数名       | 类型         | 意义       |
| ------------ | ------------ | ---------- |
| errorMessage | string       | "错误信息" |
| code         | string       | 状态信息   |
| lost         | LostAndFound | 失物信息   |

eg1:



### 4.5 新增失物信息

​	请求地址 : 

​	参数:

| 参数名 | 类型         | 意义           |
| ------ | ------------ | -------------- |
| lost   | LostAndFound | 新增的失物信息 |
|        |              |                |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 4.6 修改失物信息

​	请求地址 :

​	参数:

| 参数名 | 类型         | 意义           |
| ------ | ------------ | -------------- |
| lost   | LostAndFound | 修改的失物信息 |
|        |              |                |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 4.7 删除失物信息

​	请求地址 :

​	参数:

| 参数名    | 类型    | 意义       |
| --------- | ------- | ---------- |
| delLostId | Integer | 失物信息ID |
|           |         |            |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



## 5、表白墙模块（待定）

/*删除表白标记*/

发布者标记：0为匿名，1为非匿名

### 5.1 查询所有表白信息

​	请求地址 :

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型       | 意义         |
| ------------ | ---------- | ------------ |
| errorMessage | string     | "错误信息"   |
| code         | string     | 状态信息     |
| allLove      | List<Love> | 所有表白信息 |

eg1:



### 5.2 按发布时间查询表白信息

​	请求地址 : 

​	参数:

| 参数名    | 类型 | 意义              |
| --------- | ---- | ----------------- |
| startTime | date | 开始时间          |
| endTime   | date | 结束时间          |
| hisKind   | int  | 表白的种类编号(2) |

​	响应参数:

| 参数名       | 类型       | 意义               |
| ------------ | ---------- | ------------------ |
| errorMessage | string     | "错误信息"         |
| code         | string     | 状态信息           |
| loves        | List<Love> | 符合要求的表白信息 |

eg1:



### 5.3 根据发布者ID查询表白信息

​	请求地址 :

​	参数:

| 参数名        | 类型    | 意义                    |
| ------------- | ------- | ----------------------- |
| sessionUserId | Integer | 在session中的登陆者的id |
|               |         |                         |

​	响应参数:

| 参数名       | 类型       | 意义               |
| ------------ | ---------- | ------------------ |
| errorMessage | string     | "错误信息"         |
| code         | string     | 状态信息           |
| loves        | List<Love> | 符合要求的表白信息 |

eg1:



### 5.4 根据ID查询表白信息

​	请求地址 :

​	参数:

| 参数名 | 类型    | 意义       |
| ------ | ------- | ---------- |
| loveId | Integer | 表白信息ID |
|        |         |            |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
| love         | Love   | 表白信息   |

eg1:



### 5.5 新增表白信息

​	请求地址 :

​	参数:

| 参数名 | 类型 | 意义           |
| ------ | ---- | -------------- |
| love   | Love | 新增的表白信息 |
|        |      |                |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:





### 5.6 删除表白信息

​	请求地址 : /revealFeelings

​	参数:

| 参数名    | 类型    | 意义       |
| --------- | ------- | ---------- |
| delLoveId | Integer | 表白信息ID |
|           |         |            |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



## 6、个人信息模块

### 6.1 展示个人资料

​	查询个人资料信息

​	请求地址 : /userMessage/getMessage

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
|                     |         |        |

​	响应参数:

| 参数名       | 类型        | 意义         |
| ------------ | ----------- | ------------ |
| errorMessage | String      | "错误信息"   |
| code         | String      | 状态信息     |
| data         | UserMessage | 个人资料信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "userId": 2,
        "uName": "峰",
        "uGender": "男",
        "uBirth": "1998-08-26T00:00:00.000+0000",
        "uAddress": "陕西西安",
        "uCareer": "无",
        "uIntro": "aaa111"
    }
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "未登录，请先登陆"
}
```



### 6.2 修改个人资料

​	修改个人资料信息

​	请求地址 : /userMessage/updateMessage

​	请求参数:

| 参数名              | 类型    | 意义     |
| ------------------- | ------- | -------- |
| userId（session中） | Integer | 用户id   |
| userId              | Integer | 用户id   |
| uName               | String  | 姓名     |
| uGender             | String  | 性别     |
| uBirth              | Date    | 生日     |
| uAddress            | String  | 地址     |
| uCareer             | String  | 职业     |
| uIntro              | String  | 个人介绍 |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.3 展示个人收藏界面

​	（1）查询个人收藏的信息

​	（2）使用分页插件返回分页信息

​	（3）查询结果按收藏时间降序

​	请求地址 : /collection/showCollections

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| page                | Integer | 第几页 |

​	响应参数:

| 参数名       | 类型                 | 意义           |
| ------------ | -------------------- | -------------- |
| errorMessage | string               | "错误信息"     |
| code         | string               | 状态信息       |
| data         | PageInfo<Collection> | 查询的结果信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "total": 1,
        "list": [
            {
                "colId": 1,
                "colUserId": 2,
                "colTime": "2019-12-13T13:10:10.000+0000",
                "colPost": 1,
                "colPostTime": "2019-12-13T04:02:36.000+0000",
                "colTitle": "测试标题"
            }
        ],
        "pageNum": 1,
        "pageSize": 10,
        "size": 1,
        "startRow": 1,
        "endRow": 1,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.4 点击收藏消息查看详情

​	查询个人收藏详情

​	请求地址 : 

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| colPost             | Integer | 帖子ID |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 6.5 取消收藏

​	删除收藏信息

​	请求地址 : 

​	请求参数:

| 参数名              | 类型    | 意义       |
| ------------------- | ------- | ---------- |
| userId（session中） | Integer | 用户id     |
| colId               | Integer | 收藏记录ID |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.6 展示我的关注界面

​	查询关注信息

​	请求地址 : /attention/showAttentions

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| page                | Integer | 第几页 |

​	响应参数:

| 参数名       | 类型                | 意义           |
| ------------ | ------------------- | -------------- |
| errorMessage | string              | "错误信息"     |
| code         | string              | 状态信息       |
| data         | PageInfo<Attention> | 查询的结果信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "total": 3,
        "list": [
            {
                "attId": 1,
                "attUserId": 2,
                "attBeUserId": 1,
                "attTime": "2019-12-13T13:00:01.000+0000"
            },
            {
                "attId": 2,
                "attUserId": 2,
                "attBeUserId": 3,
                "attTime": "2019-12-13T13:00:01.000+0000"
            },
            {
                "attId": 3,
                "attUserId": 2,
                "attBeUserId": 4,
                "attTime": "2019-12-13T13:00:01.000+0000"
            }
        ],
        "pageNum": 1,
        "pageSize": 10,
        "size": 3,
        "startRow": 1,
        "endRow": 3,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.7 点击关注

​	请求地址 : /attention/insertAttention

​	请求参数:

| 参数名              | 类型    | 意义       |
| ------------------- | ------- | ---------- |
| userId（session中） | Integer | 用户id     |
| attUserId           | Integer | 关注者ID   |
| attBeUserId         | Integer | 被关注者ID |
| attTime             | Date    | 关注时间   |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.8 取消关注

​	删除关注信息

​	请求地址 : /attention/delAttention

​	请求参数:

| 参数名              | 类型    | 意义       |
| ------------------- | ------- | ---------- |
| userId（session中） | Integer | 用户id     |
| attId               | Integer | 关注记录ID |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.9 展示我的粉丝界面

​	查询粉丝信息

​	请求地址 : /attention/showBeAttentions

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| page                | Integer | 第几页 |

​	响应参数:

| 参数名       | 类型                | 意义           |
| ------------ | ------------------- | -------------- |
| errorMessage | string              | "错误信息"     |
| code         | string              | 状态信息       |
| data         | PageInfo<Attention> | 查询的结果信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "total": 1,
        "list": [
            {
                "attId": 5,
                "attUserId": 3,
                "attBeUserId": 2,
                "attTime": "2019-12-13T13:00:01.000+0000"
            }
        ],
        "pageNum": 1,
        "pageSize": 10,
        "size": 1,
        "startRow": 1,
        "endRow": 1,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.11 展示活动轨迹界面

​	查询个人历史发布

​	请求地址 : /history/showHistories

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| page                | Integer | 第几页 |

​	响应参数:

| 参数名       | 类型              | 意义           |
| ------------ | ----------------- | -------------- |
| errorMessage | string            | "错误信息"     |
| code         | string            | 状态信息       |
| data         | PageInfo<History> | 查询的结果信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "total": 0,
        "list": [],
        "pageNum": 1,
        "pageSize": 10,
        "size": 0,
        "startRow": 0,
        "endRow": 0,
        "pages": 0,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [],
        "navigateFirstPage": 0,
        "navigateLastPage": 0
    }
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.12 删除一个用户活动记录

​	删除一个活动轨迹

​	请求地址 :/history/delHistory

​	请求参数:

| 参数名              | 类型    | 意义           |
| ------------------- | ------- | -------------- |
| userId（session中） | Integer | 用户id         |
| historyId           | Integer | 用户活动记录ID |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.13 展示系统通知界面

​	查询系统通知信息

​	请求地址 : /message/showMessages

​	请求参数:

| 参数名              | 类型    | 意义   |
| ------------------- | ------- | ------ |
| userId（session中） | Integer | 用户id |
| page                | Integer | 第几页 |

​	响应参数:

| 参数名       | 类型              | 意义           |
| ------------ | ----------------- | -------------- |
| errorMessage | string            | "错误信息"     |
| code         | string            | 状态信息       |
| data         | PageInfo<Message> | 查询的结果信息 |

eg1:

```json
{
    "code": "success",
    "data": {
        "total": 3,
        "list": [
            {
                "msgId": 1,
                "msgUser": 2,
                "msgTitle": "欢迎新用户",
                "msgBody": "欢迎lfuser加入arcadia论坛！！！",
                "msgSign": null,
                "msgTime": "2019-11-10T04:00:00.000+0000"
            },
            {
                "msgId": 2,
                "msgUser": 2,
                "msgTitle": "测试消息1",
                "msgBody": "欢迎lfuser加入arcadia论坛！！！",
                "msgSign": null,
                "msgTime": "2019-11-10T04:00:00.000+0000"
            },
            {
                "msgId": 3,
                "msgUser": 2,
                "msgTitle": "测试消息2",
                "msgBody": "欢迎lfuser加入arcadia论坛！！！",
                "msgSign": null,
                "msgTime": "2019-11-10T04:00:00.000+0000"
            }
        ],
        "pageNum": 1,
        "pageSize": 10,
        "size": 3,
        "startRow": 1,
        "endRow": 3,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}
```

eg2：

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.14 标记已读消息通知（待定）

​	

​	请求地址 : 

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 6.16 新增消息通知

​	请求地址 : /message/insertMessage

​	参数:

| 参数名              | 类型    | 意义             |
| ------------------- | ------- | ---------------- |
| userId（session中） | Integer | 用户id           |
| msgUser             | Integer | 通知接收者的ID   |
| msgTitle            | String  | 通知标题         |
| msgBody             | String  | 通知内容         |
| msgSign             | Integer | 通知状态（待定） |
| msgTime             | Date    | 通知时间         |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 6.16 删除消息通知

​	

​	请求地址 : 

​	参数:

| 参数名              | 类型    | 意义           |
| ------------------- | ------- | -------------- |
| userId（session中） | Integer | 用户id         |
| msgId               | Integer | 系统通知记录ID |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```json
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



## 7、校园论坛模块

### 7.1 提交新帖

​	请求地址 : /submitNewPost

​	参数:

| 参数名     | 类型   | 意义                              |
| ---------- | ------ | --------------------------------- |
| postTitle  | String | 帖子标题,是不超过50字符的字符串   |
| postIntro  | String | 帖子内容,是不超过200字符的字符串  |
| postUserId | String | 贴主的uid,非必须,目的在于方便调试 |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```



### 7.2 展示校园论坛界面

​	请求地址 : 

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:



### 7.3 收藏帖子

​	(1) 如何防止重复添加相同的收藏信息

​	请求地址 : /collection/insertCollection

​	请求参数:

| 参数名              | 类型    | 意义         |
| ------------------- | ------- | ------------ |
| userId（session中） | Integer | 用户id       |
| colUserId           | Integer | 用户id       |
| colTime             | Date    | 收藏时间     |
| colPost             | Integer | 帖子ID       |
| colPostTime         | Date    | 帖子发布时间 |
| colTitle            | String  | 帖子标题     |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```

eg2:

```
{
    "code": "error",
    "errorMessage": "登陆已失效"
}
```



### 7.4 回复帖子

​	请求地址 : /replyPost

​	参数:

| 参数名      | 类型    | 意义                       |
| ----------- | ------- | -------------------------- |
| replyPostId | Integer | 回复的帖子的id             |
| replyIntro  | String  | 回复的内容                 |
| replyUserID | String  | 回复者的id,非必需,方便测试 |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

```json
{
    "code": "success"
}
```



### 7.4 展示帖子详情信息

​	请求地址 : 

​	参数:

| 参数名 | 类型 | 意义 |
| ------ | ---- | ---- |
|        |      |      |
|        |      |      |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

eg1:

