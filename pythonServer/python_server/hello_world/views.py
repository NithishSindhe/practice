from http.client import HTTPResponse
from django.http import HttpResponse

from django.http import JsonResponse
from django.shortcuts import render

# Create your views here.

def home_view(request,*args,**kwargs):
    return HttpResponse("<h1>practice django git project</h1>")
    # return "this is nithish"
def Get_view(reqeust,*args,**kwargs):
    # return HttpResponse("hello this is Nithish")
    # return "this is nithish"
    response_data = {
        'name':'minion'
        }
    return JsonResponse(response_data)