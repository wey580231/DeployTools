# DeployTools
## 问题记录：
1. >PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target.<br/>
    产生的原因是因为BoshDirector的API采用了HTTPS加密的方式来进行连接，这使得Okhttp在进行连接的时候会查找是否存在证书文件，因为没有证书所以出现异常。
## 解决方法：
1. 目前就找到2个方法一个是设置okhttp忽略所有证书的验证，另一个是将浏览器中生成的证书加载进okhttp生成client中进行连接。

