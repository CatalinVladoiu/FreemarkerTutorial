<table>
	<tr>
		<td><label>Contacts add</label>
			<form name="user" action="add" method="post">
			   	 <table>
						<tr>
							<td>First Name:</td>
							<td colspan="2"><input type="text" name="firstname" /> </td>
							<#--<td><errors path="firstname" cssClass="errorMsg" /></td>-->
						</tr>
						<tr>
							<td>Last Name:</td>
							<td colspan="2"><input type="text" name="lastname" /></td>
							<#--<td><form:errors path="lastname" cssClass="errorMsg" /></td>-->
						</tr>
						<tr>
							<td>Email:</td>
							<td colspan="2"><input type="text" name="email" /></td>
							<#--<td><form:errors path="email" cssClass="errorMsg" /></td>-->
						</tr>
						<tr>
							<td>Telephone:</td>
							<td colspan="2"> <input type="text" name="telephone" /> </td>
							<#--<td><form:errors path="telephone" cssClass="errorMsg" /></td>-->
						</tr>
						<tr>
							<td>Gender:</td> 
							<td colspan="2">
								<select name="gender">
									<#list genders as g> 
						            	<option value="${g.genderValue}"> ${g.genderLabel}</option>
						             </#list>
						         </select>
						     </td>
						     <#--<td><form:errors path="gender" cssClass="errorMsg" /></td>-->
						</tr>
						<tr>
							<td>Birthdate:</td>
							<td>
								<input type="text" name="birthdate" id="birthdate" autocomplete="off" size="35" />
							</td>
							<td id="cal1Container" style="display:none"/>
						</tr>
						<tr>
							<td>
								<input id="submitContactBtn" class="yui3-button add-contact-button" type="submit" value="Save" />
							</td>
						</tr>
					</table>    
				</form>
			</td>
		</tr>
</table>
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
            calDate = calDate.getFullYear() + '-' + (calDate.getMonth() + 1) + '-' + calDate.getDate();
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