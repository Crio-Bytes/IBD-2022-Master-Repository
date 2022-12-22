provider "aws" {
region = "<your_region_name>"
profile = "Nitesh"
}

# Launching instance
resource "aws_instance" "os1"{
ami="<your_ami_id>"
instance_type = "t2.micro"
security_groups = [ "<your_scurity_group_name>" ]
tags={
Name="<your_ami_instance_name>"
}
} 

# To retrieve the detail information about the instance
output "os1"{
value = aws_instance.os1
}

#To retrieve the public ip of instance
output "os2"{
value = aws_instance.os1.public_ip
}

#To retrieve the availability zone of an instance
output "os3"{
value = aws_instance.os1.availability_zone
}

# Launching EBS Volume
resource "aws_ebs_volume" "st1"{
availability_zone= aws_instance.os1.availability_zone
size = 5
tags = {
name = "<Name_your_ebs_volume>"
}
}

# To check about volume in detail
output "os4"{
value=aws_ebs_volume.st1
}

# Attach Volume to EC2 instance
resource "aws_volume_attachment" "ebs_att"{
device_name="/dev/sdh"
volume_id=aws_ebs_volume.st1.id
instance_id=aws_instance.os1.id
}

# To check in detail about volume attachment
output "os5"{
value=aws_volume_attachment.ebs_att
}
