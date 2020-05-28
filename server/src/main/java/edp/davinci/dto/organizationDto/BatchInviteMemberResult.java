/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2020 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 */

package edp.davinci.dto.organizationDto;

import com.alibaba.fastjson.annotation.JSONField;
import edp.davinci.dto.userDto.UserBaseInfo;
import lombok.Data;

import java.util.Set;

@Data
public class BatchInviteMemberResult {

    @JSONField(serialize = false)
    private int status;

    private Set<UserBaseInfo> successes;
    private Set<Long> notUsers;
    private Set<UserBaseInfo> exists;
}
