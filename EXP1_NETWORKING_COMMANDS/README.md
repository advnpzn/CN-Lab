# Networking Commands

## `netstat`
+ **Netstat** is a common command line TCP/IP networking available in most versions of 
_Windows, Linux, UNIX_ and other operating systems. 
Netstat provides information and statistics about protocols in use and current TCP/IP network 
connections. The Windows help screen (analogous to a Linux or UNIX for netstat reads as follows:
displays protocol statistics and current TCP/IP network connections.
```
 Proto  Local Address          Foreign Address        State
  TCP    127.0.0.1:12856        na1r:12857             ESTABLISHED
  TCP    127.0.0.1:12857        na1r:12856             ESTABLISHED
  TCP    127.0.0.1:12858        na1r:12859             ESTABLISHED
  TCP    127.0.0.1:12859        na1r:12858             ESTABLISHED
  TCP    ----------------       ----------:5228        ESTABLISHED
  TCP    ----------------       ---------------:https  ESTABLISHED
  TCP    ----------------       -------------:https    ESTABLISHED
  TCP    ----------------       -------------:https    ESTABLISHED
  TCP    ----------------       -------------:https    TIME_WAIT
  TCP    192.128.1.4:1959       25:https               ESTABLISHED
 
```

## `ipconfig`
+ In Windows, `ipconfig` is a console application designed to run from the Windows command 
prompt. This utility allows you to get the IP address information of a Windows computer. 
 Using `ipconfig`
From the command prompt, type `ipconfig` to run the utility with default options. The output of the 
default command contains the IP address, network mask, and gateway for all physical and virtual 
network adapter.

```
Windows IP Configuration


Ethernet adapter Ethernet:

   Connection-specific DNS Suffix  . :
   IPv6 Address. . . . . . . . . . . : fe01:5cb1:ab1e:8143:579e:8401:9dc0:5677
   Link-local IPv6 Address . . . . . : fe80::8d38:32b9:466e:a99%13
   IPv4 Address. . . . . . . . . . . : 133.165.1.1
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 2606:4700:d0::a29f:c006
                                       192.168.1.1

Wireless LAN adapter Local Area Connection* 9:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . :

Wireless LAN adapter Local Area Connection* 10:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . :

Wireless LAN adapter Wi-Fi:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . :

Ethernet adapter Bluetooth Network Connection:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . :
```

## `nslookup`
+ The `nslookup` (which stands for name server lookup) command is a network utility program used 
to obtain information about internet servers. It finds name server information for domains by querying 
the Domain Name System.
The `nslookup` command is a powerful tool for diagnosing DNS problems. You know you're 
experiencing a DNS problem when you can access a resource by specifying its IP address but not its 
DNS name.

```
nslookup github.com
Server:  dns.google
Address:  8.8.8.8

Non-authoritative answer:
Name:    github.com
Address:  13.234.176.102
```

## `tracaert`
+ Traceroute uses Internet Control Message Protocol (ICMP) echo packets with variable time to live 
(TTL) values. The response time of each hop is calculated. To guarantee accuracy, each hop is queried 
multiple times (usually three times) to better measure the response of that particular hop.
Traceroute is a network diagnostic tool used to track the pathway taken by a packet on an IP network 
from source to destination. Traceroute also records the time taken for each hop the packet makes 
during its route to the destination. Traceroute uses Internet Control Message Protocol (ICMP) echo 
packets with variable time to live (TTL) values

```
tracert google.com

Tracing route to google.com [216.58.196.78]
over a maximum of 30 hops:

  1    29 ms    29 ms    28 ms  172.16.0.1
  2     *        *        *     Request timed out.
  3    31 ms    30 ms    29 ms  172.70.216.2
  4    31 ms    31 ms    31 ms  142.250.166.162
  5    42 ms    34 ms    32 ms  72.14.238.215
  6    30 ms    31 ms    32 ms  209.85.255.209
  7    30 ms    29 ms    29 ms  kul01s09-in-f78.1e100.net [216.58.196.78]

Trace complete.
```
