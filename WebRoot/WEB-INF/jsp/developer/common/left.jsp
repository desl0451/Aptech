<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
	<div class="menu_section">
		<h3>General</h3>

		<ul class="nav side-menu">
			<li>
				<a><i class="fa fa-home"></i> 个人信息 <span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/stu/flatform/main">个人信息</a></li>
					<li><a href="index2.html">其它学员信息</a></li>
				</ul>
			</li>

			<li>
				<a><i class="fa fa-table"></i> 班级学员 <span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="tables.html">所在班级学员信息</a></li>
					<li><a href="tables_dynamic.html">XXXXX</a></li>
				</ul>
			</li>
			
			<li>
				<a><i class="fa fa-bar-chart-o"></i> 数据分析 <span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/chart/scattergraph">学员成绩</a></li>
					<li><a href="chartjs2.html">成绩查询</a></li>
				</ul>
			</li>
		</ul>
	</div>
</div>
