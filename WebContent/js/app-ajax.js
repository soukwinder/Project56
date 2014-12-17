function moeder(){
$(document).ready(function() {
    $('#moederbord').click(function() {
    	$.ajax({
    		url: 'MyServlet',
    		type: 'GET',
    		datatype: 'html',
    		success : function(result) {
    			jQuery("#moederbordResponse").html(result);
    			
            }
        });
    });
});
}

function moe(){
	var e = window.event,
	moe = e.target || e.srcElement;
	console.log(moe.id);
	var element = document.getElementById(moe.id);
	var text = element.innerText || element.textContent;
	element.innerHTML = text;
	document.getElementById("moe_k").innerHTML = text;
	console.log(text);
}

function proces(){
	$(document).ready(function() {
	    $('#processor').click(function() {
	    	$.ajax({
	    		url: 'Processor',
	    		type: 'GET',
	    		datatype: 'html',
	    		success : function(result) {
	    			jQuery("#processorResponse").html(result);
	    			
	            }
	        });
	    });
	});
	}

	function pro(){
		var e = window.event,
		moe = e.target || e.srcElement;
		console.log(moe.id);
		var element = document.getElementById(moe.id);
		var text = element.innerText || element.textContent;
		element.innerHTML = text;
		document.getElementById("pro_k").innerHTML = text;
		console.log(text);
	}

	
	
	
	$(document).ready(function() {
		   $('#moederbord').mouseenter(function() {
		       $(this).animate({
		           height: '+=10px'
		       });
		   });
		   $('#moederbord').mouseleave(function() {
		       $(this).animate({
		           height: '-=10px'
		       }); 
		   });
	});
	$(document).ready(function() {
		   $('#processor').mouseenter(function() {
		       $(this).animate({
		           height: '+=10px'
		       });
		   });
		   $('#processor').mouseleave(function() {
		       $(this).animate({
		           height: '-=10px'
		       }); 
		   });
	});

