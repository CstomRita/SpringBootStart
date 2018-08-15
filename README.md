## SpringBootStart
SpringBootMaven项目配置(包括必要的Maven依赖等等)

# 創建選擇Spring Initalizer工程，添加Web下web模塊

group cn.cst（公司包裝等）

artifact 工程名

# 提供了必要的配置信息：

1 SpringBoot的唯一配置文件就是main/resource下的application.properties（yml）文件在其中配置mybatis,連接池等信息

2 在Application入口處配置構建SQLsession的相關代碼

3 resources下構建mybatis文件夾存放映射的mapper.xml

4 pom.xml必要的jar包



# 調用SQL語句執行過程：

 1 mapper下的接口方法通過和xml文件的映射獲取SQL語句
 
 2 Service下的具體實現類serviceimpl通過@autowired自動裝配mapper對象，調用mapper.方法；並未serviceimpl創建對外接口service
 
 3 Controller通過@autowired裝配service對象，調用service.方法獲取數據庫SQL語句結果
 
