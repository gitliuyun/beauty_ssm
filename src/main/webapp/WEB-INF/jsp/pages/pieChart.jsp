<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <!-- /.col-lg-12 -->
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                机型使用百分比
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="flot-chart">
                    <div class="flot-chart-content" id="flot-pie-chart"></div>
                </div>
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-6 -->
</div>
<script src="<%=path%>/resource/vendor/flot/excanvas.min.js"></script>
<script src="<%=path%>/resource/vendor/flot/jquery.flot.js"></script>
<script src="<%=path%>/resource/vendor/flot/jquery.flot.pie.js"></script>
<script src="<%=path%>/resource/vendor/flot/jquery.flot.resize.js"></script>
<script src="<%=path%>/resource/vendor/flot/jquery.flot.time.js"></script>
<script src="<%=path%>/resource/vendor/flot-tooltip/jquery.flot.tooltip.min.js"></script>
<script src="<%=path%>/resource/data/flot-data.js"></script>
<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>
