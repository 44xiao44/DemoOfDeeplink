中文：
被调用方：
1 配置 AndroidManifest.xml
2 在activity中接受参数

调用方：
1浏览器调用 直接把参数输入到地址（亲测opera可用，目前国内很多浏览器不支持。。。。）
2android app调用：startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("deeplink://z78e.com.cn/open?a=bck")));


english

target app need：
1 edit AndroidManifest.xml like this demo
2 Accept parameters in activity like MainActivity.java

caller：
1 if call app by broswer , just input url into url address of broswer. some borswer not suport at china.
2 if call app by app ,you can write code in your app like this : startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("deeplink://z78e.com.cn/open?a=bck")));