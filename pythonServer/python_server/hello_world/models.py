from django.db import models

# Create your models here.
class hello_world(models.Model):
    name = models.CharField(max_length=20)