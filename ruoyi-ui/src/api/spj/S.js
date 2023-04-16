import request from '@/utils/request'

// 查询供应商S列表
export function listS(query) {
  return request({
    url: '/spj/S/list',
    method: 'get',
    params: query
  })
}

// 查询供应商S详细
export function getS(sno) {
  return request({
    url: '/spj/S/' + sno,
    method: 'get'
  })
}

// 新增供应商S
export function addS(data) {
  return request({
    url: '/spj/S',
    method: 'post',
    data: data
  })
}

// 修改供应商S
export function updateS(data) {
  return request({
    url: '/spj/S',
    method: 'put',
    data: data
  })
}

// 删除供应商S
export function delS(sno) {
  return request({
    url: '/spj/S/' + sno,
    method: 'delete'
  })
}
