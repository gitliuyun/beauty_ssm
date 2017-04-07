<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                白名单列表
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
                            <th>公交</th>
                            <th>地铁</th>
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
								<td>${machine.recordtime}</td>
								<td>${machine.cardnumber}</td>
								<td>${machine.busnumber}</td>
								<td>${machine.subwaynumber}</td>
								<td>${machine.usedinotherindustry}</td>
								<td>${machine.hascomplain}</td>
								<td>${machine.isformal}</td>
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
</script>
