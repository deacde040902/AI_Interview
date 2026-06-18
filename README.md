AI_Interview 是一个集成了简历分析、模拟面试和知识库管理的智能面试辅助平台。系统利用大语言模型（LLM）和向量数据库技术，为求职者和 HR 提供智能化的简历评估和面试练习服务。

## 技术栈

### 后端技术

| 技术                  | 版本  | 说明                      |
| --------------------- | ----- | ------------------------- |
| Spring Boot           | 4.0   | 应用框架                  |
| Java                  | 21    | 开发语言                  |
| Spring AI             | 2.0   | AI 集成框架               |
| PostgreSQL + pgvector | 14+   | 关系数据库 + 向量存储     |
| Redis                 | 6+    | 缓存 + 消息队列（Stream） |
| Apache Tika           | 2.9.2 | 文档解析                  |
| iText 8               | 8.0.5 | PDF 导出                  |
| MapStruct             | 1.6.3 | 对象映射                  |
| Gradle                | 8.14  | 构建工具                  |
### 前端技术

| 技术          | 版本  | 说明     |
| ------------- | ----- | -------- |
| React         | 18.3  | UI 框架  |
| TypeScript    | 5.6   | 开发语言 |
| Vite          | 5.4   | 构建工具 |
| Tailwind CSS  | 4.1   | 样式框架 |
| React Router  | 7.11  | 路由管理 |


## 功能特性


## 效果展示

### 简历与面试

上传简历：
<img width="1763" height="899" alt="image" src="https://github.com/user-attachments/assets/d1676c51-3019-4cc3-a499-2c3770e923cb" />
简历库：
<img width="1763" height="899" alt="image" src="https://github.com/user-attachments/assets/c37fc38d-616f-495e-be3f-a76c155ecc48" />
简历分析详情：
<img width="2692" height="4719" alt="image" src="https://github.com/user-attachments/assets/62c4ec5e-d236-473a-983c-da3947310e94" />
模拟面试：
<img width="1763" height="954" alt="image" src="https://github.com/user-attachments/assets/227430e2-cde4-4b37-ba55-b13900da1419" />

面试记录：
<img width="1763" height="899" alt="image" src="https://github.com/user-attachments/assets/318038f5-ed75-4286-a4bf-d4a2489d5d61" />


### 知识库

知识库管理：

<img width="1763" height="899" alt="image" src="https://github.com/user-attachments/assets/18bd1bf9-b4d3-4ce7-82f5-6bcf18a5e246" />


问答助手：

<img width="1763" height="991" alt="image" src="https://github.com/user-attachments/assets/55696f71-708f-4784-8ee5-b00f5b87f30d" />









## 启动服务

## Docker 快速部署

本项目提供了完整的 Docker 支持，可以一键启动所有服务（前后端、数据库、中间件）。

### 1. 前置准备
- 安装 [Docker](https://www.docker.com/products/docker-desktop/) 和 Docker Compose
- 申请阿里云百炼 API Key（用于 AI 对话功能）

### 2. 快速启动
在项目根目录下执行：

```bash
# 1. 复制环境变量配置文件
cp .env.example .env

# 2. 编辑 .env 文件，填入 AI 配置
# vim .env
# 必填：AI_BAILIAN_API_KEY=your_key_here
# 可选：AI_MODEL=qwen-plus        # 默认值为 qwen-plus
#        # 也可以改为 qwen-max、qwen-long 等其他可用模型

# 3. 构建并启动所有服务
docker-compose up -d --build
```

## 使用场景

| 用户角色        | 使用场景                               |
| --------------- | -------------------------------------- |
| **求职者**      | 上传简历获取分析建议，进行模拟面试练习 |
| **HR/招聘人员** | 批量分析简历，评估候选人能力           |
| **培训机构**    | 提供面试培训服务，管理知识库资源       |

