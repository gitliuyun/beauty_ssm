<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                交易信息维护
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>交易日志文件名</th>
                            <th>文件内序号</th>
                            <th>TSM单位代码</th>
                            <th>文件版本</th>
                            <th>打包时间</th>
                            <th>卡号</th>
                            <th>卡类型</th>
                            <th>卡交易日期</th>
                            <th>汇总笔数</th>
                            <th>汇总金额</th>
                            <th>交易行业</th>
                            <th>单位代码</th>
                            <th>商户代码</th>
                            <th>发卡类型</th>
                            <th>TSM单位代码</th>
                            <th>手机号码</th>
                            <th>白名单产品品牌</th>
                            <th>白名单产品型号</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="transaction" items="${transactionList}">
							<tr class="odd gradeX">
								<td>${transaction.fileid}</td>
								<td>${transaction.fileno}</td>
								<td>${transaction.unitno}</td>
								<td>${transaction.filever}</td>
								<td>${transaction.birthdate}</td>
								<td>${transaction.cardno}</td>
								<td>${transaction.cardtype}</td>
								<td>${transaction.transdate}</td>
								<td>${transaction.totalnum}</td>
								<td>${transaction.totalsum}</td>
								<td>${transaction.industrycode}</td>
								<td>${transaction.unitid}</td>
								<td>${transaction.shopno}</td>
								<td>${transaction.kktype}</td>
								<td>${transaction.unitcode}</td>
								<td>${transaction.mobileno}</td>
								<td>${transaction.productcompany}</td>
								<td>${transaction.productmodel}</td>
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
