import request from '@/utils/request'

// 查询工程项目表J列表
export function listJ(query) {
  return request({
    url: '/spj/J/list',
    method: 'get',
    params: query
  })
}

// 查询工程项目表J详细
export function getJ(jno) {
  return request({
    url: '/spj/J/' + jno,
    method: 'get'
  })
}

// 新增工程项目表J
export function addJ(data) {
  return request({
    url: '/spj/J',
    method: 'post',
    data: data
  })
}

// 修改工程项目表J
export function updateJ(data) {
  return request({
    url: '/spj/J',
    method: 'put',
    data: data
  })
}

// 删除工程项目表J
export function delJ(jno) {
  return request({
    url: '/spj/J/' + jno,
    method: 'delete'
  })
}
