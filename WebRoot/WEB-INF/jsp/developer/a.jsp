<%@ page contentType="text/html;charset=GB2312" language="java"%>
<script language="JScript">
	var o = 1;
	function goResize() {
		var d = document.body,
			e = event,
			m = event.srcElement;
		o ?
			new function() {
				moveBy(e.clientX - e.screenX, e.clientY - e.screenY);resizeBy(screen.availWidth - d.offsetWidth, screen.availHeight - d.offsetHeight);
				m.value = "ȡ��";
				o = 0
			} :
			new function() {
				moveTo(0, 0);resizeTo(screen.availWidth, screen.availHeight);
				m.value = "ȫ��";
				o = 1
			}
	}
</script>
<input type="button" value="ȫ��" onclick="goResize()">