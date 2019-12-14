

[TOC]

## 1、user(用户登陆信息表)

| 列名          | 含义   | 数据类型    | 备注                        |
| ------------- | ------ | ----------- | --------------------------- |
| user_id       | 用户ID | INT(11)     | 主键、外键（userMessage表） |
| user_name     | 用户名 | VARCHAR(15) |                             |
| user_password | 密码   | VARCHAR(11) |                             |
| user_mobile   | 手机号 | VARCHAR(11) |                             |

## 2、userMessage（用户资料表）

| 列名      | 含义     | 数据类型     | 备注       |
| --------- | -------- | ------------ | ---------- |
| user_id   | 用户ID   | INT(11)      | 主键、自增 |
| u_name    | 姓名     | VARCHAR(40)  |            |
| u_gender  | 性别     | VARCHAR(1)   |            |
| u_birth   | 生日     | DATE         |            |
| u_address | 住址     | VARCHAR(100) |            |
| u_career  | 职业     | VARCHAR(20)  |            |
| u_intro   | 个人简介 | VARCHAR(200) |            |

## 3、collection（用户收藏表）

| 列名          | 含义         | 数据类型    | 备注                  |
| ------------- | ------------ | ----------- | --------------------- |
| col_id        | 收藏记录的ID | INT(11)     | 主键、自增            |
| col_user_id   | 用户ID       | INT(11)     | 外键（userMessage表） |
| col_time      | 收藏时间     | DATETIME    |                       |
| col_post      | 帖子的ID     | INT(11)     | 外键（post表）        |
| col_post_time | 帖子发布时间 | DATETIME    |                       |
| col_title     | 帖子标题     | VARCHAR(50) |                       |

## 4、attention（关注信息表）

| 列名           | 含义             | 数据类型 | 备注                  |
| -------------- | ---------------- | -------- | --------------------- |
| att_id         | 关注记录的ID     | INT(11)  | 主键、自增            |
| att_user_id    | 关注者ID         | INT(11)  | 外键（userMessage表） |
| att_be_user_id | 被关注者ID       | INT(11)  | 外键（userMessage表） |
| att_time       | （开始）关注时间 | DATETIME |                       |

## 5、history（活动轨迹表）

| 列名            | 含义       | 数据类型     | 备注                                             |
| --------------- | ---------- | ------------ | ------------------------------------------------ |
| history_id      | 活动记录ID | INT(11)      | 主键、自增                                       |
| history_user_id | 用户ID     | INT(11)      | 外键（userMessage表）                            |
| history_kind    | 活动的种类 | INT(1)       | 1（表白墙）、2（失物招领）、3（帖子）、4（回复） |
| history_kind_id | 活动的ID   | INT(11)      | 对应的ID                                         |
| history_title   | 活动的标题 | VARCHAR(50)  |                                                  |
| history_body    | 活动的内容 | VARCHAR(200) |                                                  |
| history_time    | 活动的时间 | DATETIME     |                                                  |

## 6、message（系统通知表）

| 列名      | 含义         | 数据类型     | 备注                  |
| --------- | ------------ | ------------ | --------------------- |
| msg_id    | 通知记录ID   | INT(11)      | 主键、自增            |
| msg_user  | 通知接收者ID | INT(11)      | 外键（userMessage表） |
| msg_title | 通知标题     | VARCHAR(50)  |                       |
| msg_body  | 通知内容     | VARCHAR(200) |                       |
| msg_sign  | 通知标记     | INT(1)       | 0（未读）、1（已读）  |
| msg_time  | 通知发布时间 | DATETIME     |                       |

## 7、love（表白信息表）

| 列名             | 含义         | 数据类型     | 备注                  |
| ---------------- | ------------ | ------------ | --------------------- |
| love_id          | 表白记录ID   | INT(11)      | 主键、自增            |
| love_user_id     | 表白者ID     | INT(11)      | 外键（userMessage表） |
| love_intro       | 表白内容     | VARCHAR(200) |                       |
| love_sign        | 点赞数       | INT(11)      |                       |
| love_user_status | 表白者状态   | BIT(1)       | 0（正常）、1（匿名）  |
| love_time        | 表白发布时间 | DATETIME     |                       |

## 8、lost（失物招领表）

| 列名         | 含义         | 数据类型     | 备注                  |
| ------------ | ------------ | ------------ | --------------------- |
| lost_id      | 信息记录ID   | INT(11)      | 主键、自增            |
| lost_title   | 信息标题     | VARCHAR(50)  |                       |
| lost_intro   | 信息内容     | VARCHAR(200) |                       |
| lost_sign    |              | INT(11)      | 暂不使用（保留）      |
| lost_user_id | 信息发布者ID | INT(11)      | 外键（userMessage表） |
| lost_time    | 信息发布时间 | DATETIME     |                       |

## 9、post（帖子信息表）

| 列名           | 含义         | 数据类型     | 备注                  |
| -------------- | ------------ | ------------ | --------------------- |
| post_id        | 帖子记录ID   | INT(11)      | 主键、自增            |
| post_kind      | 帖子类型     | INT(11)      | 暂不使用（保留）      |
| post_user_id   | 帖子发布者   | INT(11)      | 外键（userMessage表） |
| post_title     | 帖子标题     | VARCHAR(50)  |                       |
| post_intro     | 帖子内容     | VARCHAR(200) |                       |
| post_time      | 帖子发布时间 | DATETIME     |                       |
| post_page_view | 帖子访问量   | int          | 非空,默认为0          |

## 10、reply（帖子回复信息表）

| 列名          | 含义         | 数据类型     | 备注                  |
| ------------- | ------------ | ------------ | --------------------- |
| reply_id      | 回复记录ID   | INT(11)      | 主键、自增            |
| reply_post_id | 回复的帖子ID | INT(11)      | 外键（post表）        |
| reply_time    | 回复时间     | DATETIME     |                       |
| reply_intro   | 回复内容     | VARCHAR(200) |                       |
| reply_user_id | 回复者ID     | INT(11)      | 外键（userMessage表） |

## 11、club（社团信息表）

| 列名         | 含义         | 数据类型     | 备注                  |
| ------------ | ------------ | ------------ | --------------------- |
| club_id      | 社团ID       | INT(11)      | 主键、自增            |
| club_name    | 社团名称     | VARCHAR(25)  |                       |
| club_kind    | 社团类型     | VARCHAR(20)  | 暂不使用（保留）      |
| club_intro   | 社团简介     | VARCHAR(200) |                       |
| club_manager | 社团负责人ID | INT(11)      | 外键（userMessage表） |
| club_time    | 社团创建时间 | DATETIME     |                       |

## 12、activity（社团活动信息表）

| 列名             | 含义     | 数据类型     | 备注             |
| ---------------- | -------- | ------------ | ---------------- |
| activity_id      | 活动ID   | INT(11)      | 主键、自增       |
| activity_name    | 活动名称 | VARCHAR(100) |                  |
| activity_time    | 活动时间 | DATE         |                  |
| activity_club_id | 承办社团 | INT(11)      | 外键（club表）   |
| activity_intro   | 活动简介 | VARCHAR(200) |                  |
| activity_sign    | 活动状态 | INT(11)      | 暂不使用（保留） |

