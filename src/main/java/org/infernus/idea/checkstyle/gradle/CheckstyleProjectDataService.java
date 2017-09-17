package org.infernus.idea.checkstyle.gradle;

import java.util.Collection;
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
 * TODO Purpose of this type, in one sentence, ending with a dot.
 * <p>Further, arbitrarily elaborate description. HTML allowed.
 *
 * @author Thomas Jensen
 */
public class CheckstyleProjectDataService
        implements ProjectDataService<Map<String, String>, PluginConfigDto>
{
    @NotNull
    @Override
    public Key<Map<String, String>> getTargetDataKey() {
        // TODO implement getTargetDataKey()
        return null;
    }

    @Override
    public void importData(@NotNull final Collection<DataNode<Map<String, String>>> toImport, @Nullable final
    ProjectData projectData, @NotNull final Project project, @NotNull final IdeModifiableModelsProvider
            modelsProvider) {
        // TODO implement importData()

    }

    @NotNull
    @Override
    public Computable<Collection<PluginConfigDto>> computeOrphanData(@NotNull final Collection<DataNode<Map<String,
            String>>> toImport, @NotNull final ProjectData projectData, @NotNull final Project project, @NotNull
    final IdeModifiableModelsProvider modelsProvider) {
        // TODO implement computeOrphanData()
        return null;
    }

    @Override
    public void removeData(@NotNull final Computable<Collection<PluginConfigDto>> toRemove, @NotNull final
    Collection<DataNode<Map<String, String>>> toIgnore, @NotNull final ProjectData projectData, @NotNull final
    Project project, @NotNull final IdeModifiableModelsProvider modelsProvider) {
        // TODO implement removeData()

    }
}
