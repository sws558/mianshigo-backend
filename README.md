# 🧠 智能面试刷题平台 

![Build](https://img.shields.io/badge/build-passing-brightgreen) 
![License](https://img.shields.io/badge/license-MIT-blue)
![Tech Stack](https://img.shields.io/badge/tech-java%20spring%20redis%20ai-orange)

> 🚀 一个融合了 **AI 技术** 的智能面试刷题平台，支持题目推荐、错题分析、知识点讲解、语音读题、智能解析等功能，帮助开发者高效准备技术面试！

---

## 🔍 项目简介

这是一个基于 Java 的全栈智能面试刷题平台，采用现代化架构设计，结合 Redis、Elasticsearch、MySQL、LangChain4j 等多种技术，打造了一个**高可用、高性能、智能化**的学习系统。

我们不仅提供基础的题目练习和管理功能，更引入了 **AI 赋能的个性化学习体验**，让刷题不再是“死记硬背”，而是“理解 + 推荐 + 反馈”的闭环过程。

---

## 🚀 核心亮点

| 功能模块 | 描述 |
|----------|------|
| 💡 **AI 题目推荐** | 基于用户行为数据，使用 LangChain4j + LLM 推荐最适合当前水平的题目 |
| 📚 **智能解析生成** | 对每道题自动生成多角度解析，甚至可解释代码运行逻辑（LLM 支持） |
| 🗣️ **语音读题 & 语音输入** | 支持语音朗读题目，并可通过语音输入答案（TTS + STT 集成） |
| 📊 **错题自动总结** | 结合 AI 分析错误原因，生成针对性的知识点复习建议 |
| 🤖 **AI 面试模拟官** | 提供虚拟面试官角色，进行实时问答与评分反馈 |
| 🌐 **多端适配** | 支持 Web / App / 小程序，随时随地刷题 |

---

## 🧰 技术架构

### 后端技术栈

- **Java 17+**
- **Spring Boot 3.x**
- **MyBatis Plus + MyBatis X 插件**
- **Redis + Redisson**
- **Elasticsearch 8.x**
- **LangChain4j**（本地或 OpenAI 大模型接入）
- **Nacos + Sentinel + Druid**

### 前端技术栈

- **Next.js + React 18**
- **Tailwind CSS + Headless UI**
- **WebSocket 实时通信**
- **SSG / SSR 支持 SEO 优化**

---

## 🤖 AI 功能详解

###  🧠 基于 LangChain4j 的 AI 题目解析

通过集成 [LangChain4j](https://github.com/langchain4j/langchain4j)，我们将每一道编程题交给语言模型进行深度理解并输出：

- ✅ 题意解析
- ✅ 示例解读
- ✅ 解法思路
- ✅ 时间复杂度分析
- ✅ 关键 API 说明

  ## 🧱 数据库设计

本系统使用 MySQL 作为核心数据库，主要包含以下核心表：

| 表名             | 描述                                               |
|------------------|----------------------------------------------------|
| `user`           | 用户信息表，包含用户基础信息及 AI 偏好配置         |
| `question`       | 题目表，使用 JSON 字段存储标签、难度、解析等内容   |
| `question_bank`  | 题库表，包含 AI 推荐权重字段，用于个性化推荐       |
| `record`         | 刷题记录表，用于 AI 推荐模型训练与行为分析         |
| `ai_log`         | AI 调用日志表，记录每次调用模型的输入输出，便于调试和监控 |

---

## ⚙️ 性能优化策略

为了保证系统的高性能和低延迟响应，我们在多个层面进行了性能优化：

- ✅ **Redis 缓存高频题目与解析**：减少数据库压力，提升访问速度。
- ✅ **BitMap 实现年度打卡签到统计**：通过 Redis 的 BitMap 结构高效统计用户每日刷题情况。
- ✅ **Elasticsearch 全文检索题目**：支持关键词模糊搜索、标签匹配等复杂查询。
- ✅ **定时任务同步 MySQL 到 ES**：确保搜索数据与数据库内容保持一致。
- ✅ **Nginx 反向代理前后端分离部署**：提高安全性与负载能力。

---

## 📦 项目部署

我们采用现代化 DevOps 工具链进行项目部署，支持从开发到生产的全生命周期管理：

- 🐳 **Docker Compose**：一键启动本地开发环境，集成 MySQL、Redis、ES 等服务。
- 🌌 **Kubernetes**：支持生产级高可用部署，具备自动扩缩容能力。
- 🔄 **GitHub Actions CI/CD 流水线**：自动化构建、测试、部署流程，保障代码质量与发布效率。
