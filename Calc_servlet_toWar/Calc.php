<!DOCTYPE HTML>
<html>
<head>
     <title>My calculator SERVLET</title>
</head>
<body bgcolor="palegreen" leftmargin="100" topmargin="100" align="center">

<input type="text" id="x" /><p>
<input type="text" id="action" /><p>
<input type="text" id="y" /><p>
<input type="text" id="out" /><p>
<input type="button" value="=" id = "button" style="width:172Px;height:22Px"/>


<script   src="https://code.jquery.com/jquery-1.12.4.min.js"   integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="   crossorigin="anonymous"></script>

<script>
  $(function(){
	 $("#button").on('click',function(){
		 $.ajax({
			 method:"POST",
			 url:"myCalcServlet",
			 data:{num1:$("#x").val(),op:$("#action").val(),num2:$("#y").val()}
		 }).done(function(data){
			 $("#out").val(data);
		 })
	 });
 
  });
</script>

</body>
</html>