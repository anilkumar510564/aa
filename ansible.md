#check the ip address of the node
ifconfig

#
apt-get install ansible

#create a key
ssh key-gen

#connecting to noce using ip and name
ssh copy-id ip@name

#to exit from the node
exit

---

- name: learning handler concept

  hosts: all

  become: yes



  tasks:

    - name: Install apache httpd  (state=present is optional)

      apt:

        name: apache2

        state: present



    - name: display apche configs

      shell:

        cmd: ls -la | grep /var/www/html



---
- name: Install git on all nodes
hosts: all
become: yes
tasks:
- name: Install git
apt:
name: git
state: present
update_cache: yes




- name: Install apache2
apt:
name: apache2
state: present



- name: Restart Apache
service:
name: apache2
state: restarted

    - name: now install and config done

    shell: ls -la

    notify:

    - restart apache again



  handlers:

    - name: restart apache again

      service:

        name: apache2

        state: restarted
        
        
# to run the playbook
ansible--playbook abc.yml
