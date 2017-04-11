<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                白名单列表  <button onclick="analyzeAll()">分析所有机型</button>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>机型</th>
                            <th>厂商</th>
                            <th>登记时间</th>
                            <th>开卡数量</th>
                            <th>公交数量</th>
                            <th>地铁数量</th>
                            <th>其他行业是否使用</th>
                            <th>客户投诉</th>
                            <th>是否正式</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="machine" items="${machineList}">
							<tr class="odd gradeX">
								<td>${machine.devicetype}</td>
								<td>${machine.devicecompany}</td>
								<td><fmt:formatDate value="${machine.recordtime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
								<td>${machine.cardnumber}</td>
								<td>${machine.busnumber}</td>
								<td>${machine.subwaynumber}</td>
								<td>${machine.usedinotherindustry}</td>
								<td>${machine.hascomplain}</td>
								<td>${machine.isformal}</td>
								<td><a href="javascript:void(0)" onclick="showDetail('${machine.devicetype}')">详情</a>
								<a href="javascript:void(0)" onclick="analyze('${machine.devicetype}')">分析</a>
								</td>
							</tr>
						</c:forEach>
                    </tbody>
                </table>
               
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<script>
    function showDetail(deviceType){
    	var url = "<%=basePath%>/infoManage/detailList";
    	var param = {"deviceType":deviceType};
    	$.post(url, param, function(data){
    		$("#page-content").html(data);
    	});
    }
    
    function analyze(deviceType){
    	var url = "<%=basePath%>/infoManage/analyze";
    	var param = {"deviceType":deviceType};
    	$.post(url, param, function(){
   			jumpByAjax('/infoManage/machineList');
    	});
    }
    
    function analyzeAll(){
    	var url = "<%=basePath%>/infoManage/analyzeAll";
    	var param = {};
    	$.post(url, param, function(){
   			jumpByAjax('/infoManage/machineList');
    	});
    }
    
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
    
</script>
