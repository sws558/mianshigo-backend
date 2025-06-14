# 🧠 智能面试刷题平台 —— 用 AI 让你秒过技术面！

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

### 1. 🧠 基于 LangChain4j 的 AI 题目解析

通过集成 [LangChain4j](https://github.com/langchain4j/langchain4j)，我们将每一道编程题交给语言模型进行深度理解并输出：

- ✅ 题意解析
- ✅ 示例解读
- ✅ 解法思路
- ✅ 时间复杂度分析
- ✅ 关键 API 说明

```java
// 示例：调用 LangChain4j 进行题目解析
AiService aiService = AiServices.create(QuestionExplainer.class, model);
String explanation = aiService.explainQuestion("两数之和", "给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的两个整数，并返回它们的数组下标。");
