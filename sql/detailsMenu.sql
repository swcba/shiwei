-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情', '3', '1', '/system/details', 'C', '0', 'system:details:view', '#', 'admin', sysdate(), '', null, '订单详情菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情查询', @parentId, '1',  '#',  'F', '0', 'system:details:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情新增', @parentId, '2',  '#',  'F', '0', 'system:details:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情修改', @parentId, '3',  '#',  'F', '0', 'system:details:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情删除', @parentId, '4',  '#',  'F', '0', 'system:details:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单详情导出', @parentId, '5',  '#',  'F', '0', 'system:details:export',       '#', 'admin', sysdate(), '', null, '');
