from django.http import JsonResponse

def hi_resource(reqeust,*args,**kwargs):
    response_data = {
        'name':'Hi i am Nithish'
        }
    return JsonResponse(response_data)