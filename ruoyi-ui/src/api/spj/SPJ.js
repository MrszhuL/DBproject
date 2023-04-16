import request from '@/utils/request'

// 查询供应情况表SPJ列表
export function listSPJ(query) {
  return request({
    url: '/spj/SPJ/list',
    method: 'get',
    params: query
  })
}

// 查询供应情况表SPJ详细
export function getSPJ(sno) {
  return request({
    url: '/spj/SPJ/' + sno,
    method: 'get'
  })
}

// 新增供应情况表SPJ
export function addSPJ(data) {
  return request({
    url: '/spj/SPJ',
    method: 'post',
    data: data
  })
}

// 修改供应情况表SPJ
export function updateSPJ(data) {
  return request({
    url: '/spj/SPJ',
    method: 'put',
    data: data
  })
}

// 删除供应情况表SPJ
export function delSPJ(sno) {
  return request({
    url: '/spj/SPJ/' + sno,
    method: 'delete'
  })
}
