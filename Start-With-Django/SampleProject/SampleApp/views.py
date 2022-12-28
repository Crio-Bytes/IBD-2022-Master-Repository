from django.shortcuts import render
from django.http.response import JsonResponse

def home(request) : 
    response = {"msg" : "Hey there!"}
    return JsonResponse(response)
# Create your views here.
