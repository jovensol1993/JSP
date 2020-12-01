$(document).ready(function() {
	$('.title').click(function() {
		var nno = $(this).attr('id'); // nno
		console.log(nno); // 잘들어감
		$('#nno2').val(nno);
		$('#detail').submit();
	});
	
	$('.delbtn').click(function(){
		var sno = $(this).arrt('id').substring(1);
		$('#nno').val(sno);
		$('#noticeDelProc').submit();
	})
	
	$('.editbtn').click(function(){
		var sno = $(this).arrt('id').substring(1);
		$('#nno3').val(sno);
		$('#edit').submit();
	})
//
//	$('.btn').click(function() {
//		var title = $(this).attr('id');
//		$.ajax({
//			url: 'cls/project/notice.cls',
//			type: 'POST',
//			dataType: 'json',
//			data: {
//				title: title
//			},
//			success: function(data) {
//				var contents = data.contents;
//				console.log(contents);
//				$('#contents').html(contents);
//			},
//			error: function() {
//				alert('헤헤')
//			}
//
//		});
//	});
//	
//	$('.hitbutton').click(function() {
//		var nno = $('#nno').text();
//		console.log(nno);
//		$('#nno').val(nno);
//	});	
//	
	
	
});