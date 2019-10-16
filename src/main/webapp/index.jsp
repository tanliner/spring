<html>
<script>
    function selectUser() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        };
        xmlhttp.open("POST", "person/selectPerson", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=1");
    }
</script>
<body>
<h2>Hello World!</h2>

<p id="test">click 'Click Me' button, here will show response if server running</p>
<button type="button" onclick="selectUser()">Click Me</button>
</body>
</html>
