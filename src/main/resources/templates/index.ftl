<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>杭州天气历史记录</title>
</head>
<body>
	<h1>杭州市天气历史记录</h1>
	<table border="1">
		<tr>
			<td>城市</td>
			<td>白天天气</td>
			<td>夜间天气</td>
			<td>最高温</td>
			<td>最低温</td>
			<td>日期</td>
		</tr>
		<#list weatherlist as weather>
			<tr>
				<td> ${city.cityname} </td>
				<td> ${weather.txt_d} </td>
				<td> ${weather.txt_n} </td>
				<td> ${weather.max} </td>
				<td> ${weather.min} </td>
				<td> ${weather.date} </td>
			</tr>
		</#list>
	</table>
</body>
</html>