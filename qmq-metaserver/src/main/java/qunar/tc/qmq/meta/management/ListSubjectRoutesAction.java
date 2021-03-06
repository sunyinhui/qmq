/*
 * Copyright 2018 Qunar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.com.qunar.pay.trade.api.card.service.usercard.UserCardQueryFacade
 */

package qunar.tc.qmq.meta.management;

import qunar.tc.qmq.meta.store.Store;

import javax.servlet.http.HttpServletRequest;

/**
 * @author keli.wang
 * @since 2017/10/20
 */
public class ListSubjectRoutesAction implements MetaManagementAction {
    private final Store store;

    public ListSubjectRoutesAction(final Store store) {
        this.store = store;
    }

    @Override
    public Object handleAction(HttpServletRequest req) {
        return store.getAllSubjectRoutes();
    }
}
