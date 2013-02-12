 <html>
	<head>
		<script src="http://yui.yahooapis.com/2.6.0/build/utilities/utilities.js"></script>
		<script src="http://yui.yahooapis.com/2.6.0/build/calendar/calendar-min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.6.0/build/assets/skins/sam/skin.css">
		<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.8.1/build/cssgrids/grids-min.css">
		<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.8.1/build/cssbutton/cssbutton.css">
	</head>
    <body class="yui-skin-sam">
      <table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td>Birthdate:</td>
			<td>
				<input type="text" name="birthdate" id="birthdate" autocomplete="off" size="35" />
			</td>
		</tr>
      </table>
      <div id="cal1Container" style="display:none"/>
    </body>
</html>
<script>
(function() {
    var Dom = YAHOO.util.Dom,
        Event = YAHOO.util.Event,
        cal1,
        over_cal = false,
        cur_field = '';

    var init = function() {
        cal1 = new YAHOO.widget.Calendar("cal1","cal1Container");
        cal1.selectEvent.subscribe(getDate, cal1, true);
        cal1.renderEvent.subscribe(setupListeners, cal1, true);
        Event.addListener(['birthdate'], 'focus', showCal);
        Event.addListener(['birthdate'], 'blur', hideCal);
        cal1.render();
    }

    var setupListeners = function() {
        Event.addListener('cal1Container', 'mouseover', function() {
            over_cal = true;
        });
        Event.addListener('cal1Container', 'mouseout', function() {
            over_cal = false;
        });
    }

    var getDate = function() {
            var calDate = this.getSelectedDates()[0];
            calDate = (calDate.getMonth() + 1) + '/' + calDate.getDate() + '/' + calDate.getFullYear();
            cur_field.value = calDate;            
            over_cal = false;
            hideCal();
    }

    var showCal = function(ev) {
        var tar = Event.getTarget(ev);
        cur_field = tar;
    
        var xy = Dom.getXY(tar),
            date = Dom.get(tar).value;
        if (date) {
            cal1.cfg.setProperty('selected', date);
            cal1.cfg.setProperty('pagedate', new Date(date), true);
        } else {
            cal1.cfg.setProperty('selected', '');
            cal1.cfg.setProperty('pagedate', new Date(), true);
        }
        cal1.render();
        Dom.setStyle('cal1Container', 'display', 'block');
        xy[1] = xy[1] + 20;
        Dom.setXY('cal1Container', xy);
    }

    var hideCal = function() {
        if (!over_cal) {
            Dom.setStyle('cal1Container', 'display', 'none');
        }
    }

    Event.addListener(window, 'load', init);
})();
</script>