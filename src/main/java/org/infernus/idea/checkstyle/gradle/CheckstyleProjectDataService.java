package org.infernus.idea.checkstyle.gradle;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.intellij.openapi.externalSystem.model.DataNode;
import com.intellij.openapi.externalSystem.model.Key;
import com.intellij.openapi.externalSystem.model.project.ProjectData;
import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider;
import com.intellij.openapi.externalSystem.service.project.manage.ProjectDataService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import org.infernus.idea.checkstyle.PluginConfigDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Received Checkstyle-IDEA settings from IntelliJ's Gradle extension.
 *
 * @author Thomas Jensen
 */
public class CheckstyleProjectDataService
        implements ProjectDataService<Map<String, String>, PluginConfigDto>
{
    @NotNull
    @SuppressWarnings("unchecked")
    public static final Key<Map<String, String>> KEY = Key.create((Class<Map<String, String>>) new HashMap<String,
            String>().getClass(), 1);

    public final Computable.PredefinedValueComputable<Collection<PluginConfigDto>> EMPTY_LIST = new Computable
            .PredefinedValueComputable<>(Collections.<PluginConfigDto>emptyList());


    @NotNull
    @Override
    public Key<Map<String, String>> getTargetDataKey() {
        return KEY;
    }


    @Override
    public void importData(@NotNull final Collection<DataNode<Map<String, String>>> toImport, @Nullable final
    ProjectData projectData, @NotNull final Project project, @NotNull final IdeModifiableModelsProvider
            modelsProvider) {
        // TODO implement importData()
    }


    @NotNull
    @Override
    public Computable<Collection<PluginConfigDto>> computeOrphanData(
            @NotNull final Collection<DataNode<Map<String, String>>> toImport,
            @NotNull final ProjectData projectData, @NotNull final Project project,
            @NotNull final IdeModifiableModelsProvider modelsProvider) {
        return EMPTY_LIST;
    }


    @Override
    public void removeData(@NotNull final Computable<Collection<PluginConfigDto>> toRemove, @NotNull final
    Collection<DataNode<Map<String, String>>> toIgnore, @NotNull final ProjectData projectData, @NotNull final
    Project project, @NotNull final IdeModifiableModelsProvider modelsProvider) {
        // do nothing
    }
}
