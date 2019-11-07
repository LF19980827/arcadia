## 用户模块

### 登录:

​	请求地址 : /login

​	参数:

| 参数名   | 类型   | 意义     |
| -------- | ------ | -------- |
| username | string | 用户名   |
| password | string | 登录密码 |

​	响应参数:

| 参数名       | 类型   | 意义            |
| ------------ | ------ | --------------- |
| errorMessage | string | OK / "错误信息" |
|              |        |                 |
|              |        |                 |

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



### 注册:

请求地址: /register

请求参数:

| 参数名    | 类型   | 意义   |
| --------- | ------ | ------ |
| username  | string | 用户名 |
| password  | string | 密码   |
| telephone | string | 手机号 |
|           |        |        |

响应参数:

| 参数名       | 类型   | 意义            |
| ------------ | ------ | --------------- |
| errorMessage | string | OK / "错误信息" |
|              |        |                 |

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

