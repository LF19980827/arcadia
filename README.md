## 1、用户登陆模块

### 1.1 登录

​	请求地址 : /login

​	参数:

| 参数名   | 类型   | 意义     |
| -------- | ------ | -------- |
| username | string | 用户名   |
| password | string | 登录密码 |

​	响应参数:

| 参数名       | 类型   | 意义       |
| ------------ | ------ | ---------- |
| errorMessage | string | "错误信息" |
| code         | string | 状态信息   |
|              |        |            |

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
| telephone | string | 手机号 |
| password  | string | 密码   |

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
| username  | string | 用户名 |
| password  | string | 密码   |
| telephone | string | 手机号 |
|           |        |        |

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
|             |        |        |

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



