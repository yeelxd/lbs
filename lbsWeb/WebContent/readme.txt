底层架构：
	SpringMVC+Spring+MyBatus3+C3P0(DataSource)+EHCache(Cache)
	spring-framework-4.0.6.RELEASE
	mybatis-3.2.7
	c3p0-0.9.2.1
	ehcache-2.8.3

数据库：
	MySQL
	mysql-installer-community-5.6.20.0.msi

UI:
	FreeMarker+Bootstrap
	freemarker-2.3.20
	JQuery1.11
	bootstrap-3.2.0	
	
设计层级：
	controller+service+dao+mapper(model)
	
日志系统：
	slf4j+log4j
	slf4j-1.7.7
	log4j-1.2.17
	
相关约定：
	1、后台使用现有框架，前台使用Bootstrap搭建，然后统一使用FreeMarker进行数据的渲染和展现；
	2、为访问权限的安全考虑，相关UI资源和页面放置到WEB-INF文件夹下面，如freemarker，pages，resources等；
	3、

	