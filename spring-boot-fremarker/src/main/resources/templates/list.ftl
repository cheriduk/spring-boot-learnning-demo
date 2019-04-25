<!DOCTYPE html>
<html lang="en">
<head>
    <title>Hello World!</title>
</head>
<body>
<center>
    <p>
        welcome ${name} to freemarker!
    </p>

    <h4>烧烤小分队成员：</h4>
       <#list friends as item>
               姓名：${item.name} , 年龄:${item.age},爱好:${item.love}
           <br>
       </#list>
</center>
</body>
</html>