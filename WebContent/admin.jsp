<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<frameset rows="100px,*,19px" framespacing="0" border="0" frameborder="0">
	<frame src="manage/home/top.html" scrolling="no" noresize />
	<frameset cols="178px,*" framespacing="0" border="0" frameborder="no">
		<frame noresize src="manage/home/left.html" scrolling="yes" />
		<frame noresize name="right" src="manage/home/right.html" scrolling="yes" />
	</frameset>
	<frame noresize name="status_bar" scrolling="no" src="manage/home/bottom.html" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
