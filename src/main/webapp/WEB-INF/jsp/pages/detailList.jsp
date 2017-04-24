<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                白名单详情
                <button type="button" class="btn btn-outline btn-default" onclick="exportExcel('${deviceType}')">导出</button>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>交易类型</th>
                            <th>行业类型</th>
                            <th>单位代码</th>
                            <th>商户代码</th>
                            <th>单位名称</th>
                            <th>总笔数</th>
                            <th>总金额</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="detail" items="${detailList}">
							<tr class="odd gradeX">
								<td>${detail.transtype}</td>
								<td>${detail.industrycode}</td>
								<td>${detail.unitid}</td>
								<td>${detail.shopno}</td>
								<td>${detail.unitName}</td>
								<td>${detail.totalnum}</td>
								<td>${detail.totalsum}</td>
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
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
    
    function exportExcel(deviceType){
    	var url = "<%=basePath%>/infoManage/exportExcel";
    	var param = {"deviceType":deviceType};
    	$.post(url, param, function(msg){
    		if (msg == "OK") {
    			alert("导出成功，请到D:\\temp查看导出文件");
    		}
    	});
    }
</script>
