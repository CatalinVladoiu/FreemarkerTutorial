<div id="mychart">
	<div style="position: absolute; height: 400px; width: 400px;" class="yui3-widget yui3-piechart" id="yui_3_3_0pr3_1_136059298034034">
		<div style="position: absolute;" class="yui3-piechart-content yui3-widget-content-expanded" id="yui_3_3_0pr3_1_136059298034037">
			<div style="position: absolute; height: 400px; width: 400px;" class="yui3-widget yui3-graph" id="yui_3_3_0pr3_1_136059298034047">
				<div class="yui3-graph-content yui3-widget-content-expanded" id="yui_3_3_0pr3_1_136059298034050">
					<svg id="yui_3_3_0pr3_1_1360592980340283" height="400" width="400" style="position: absolute; top: 0px; overflow: visible; left: 0px; width: 400px; height: 400px; z-index: 2;" pointer-events="none"><path id="series_0_0" class="yui3-seriesmarker" y="0" x="0" fill-opacity="1" fill="#66007f" style="width: 400px; height: 400px; visibility: visible;" height="400" width="400" stroke="none" d=" M200, 200 L400, 190 Q396 110 338 55 280 0 200 0  L200, 200 Z" pointer-events="visiblePainted"></path><path id="series_0_1" class="yui3-seriesmarker" y="0" x="0" fill-opacity="1" fill="#a86f41" style="width: 400px; height: 400px; visibility: visible;" height="400" width="400" stroke="none" d=" M200, 200 L400, 197 Q400 193 400 190  L200, 200 Z" pointer-events="visiblePainted"></path><path id="series_0_2" class="yui3-seriesmarker" y="0" x="0" fill-opacity="1" fill="#295454" style="width: 400px; height: 400px; visibility: visible;" height="400" width="400" stroke="none" d=" M200, 200 L1, 221 Q9 301 71 353 132 405 212 400 292 395 347 336 401 277 400 197  L200, 200 Z" pointer-events="visiblePainted"></path><path id="series_0_3" class="yui3-seriesmarker" y="0" x="0" fill-opacity="1" fill="#996ab2" style="width: 400px; height: 400px; visibility: visible;" height="400" width="400" stroke="none" d=" M200, 200 L0, 190 Q-1 205 1 221  L200, 200 Z" pointer-events="visiblePainted"></path><path id="series_0_4" class="yui3-seriesmarker" y="0" x="0" fill-opacity="1" fill="#e8cdb7" style="width: 400px; height: 400px; visibility: visible;" height="400" width="400" stroke="none" d=" M200, 200 L200, 0 Q120 0 62 55 4 110 0 190  L200, 200 Z" pointer-events="visiblePainted"></path></svg></div>
					</div>
					<div class="yui3-widget-hidden" style="font-size: 85%; opacity: 0.83; position: absolute; padding: 2px 5px 4px 2px; background-color: rgb(255, 255, 255); border: 1px solid rgb(219, 220, 204); z-index: 3; white-space: nowrap; top: -10000px; left: -10000px;" id="yui_3_3_0pr3_1_136059298034034_tooltip">
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
(function() {
    YUI().use('charts', function (Y) 
    { 
        // Create data 
        var myDataValues = [
                {day:"Monday", taxes:2000}, 
                {day:"Tuesday", taxes:50}, 
                {day:"Wednesday", taxes:4000}, 
                {day:"Thursday", taxes:200}, 
                {day:"Friday", taxes:2000}
        ];				

        var pieGraph = new Y.Chart({
                render:"#mychart", 
                categoryKey:"day", 
                seriesKeys:["taxes"], 
                dataProvider:myDataValues, 
                type:"pie", 
                seriesCollection:[
                    {
                        categoryKey:"day",
                        valueKey:"taxes"
                    }
                ]
            });
    });
})();
</script>
