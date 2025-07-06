package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMultiplePlus: ImageVector
    get() {
        if (_FolderMultiplePlus != null) {
            return _FolderMultiplePlus!!
        }
        _FolderMultiplePlus = ImageVector.Builder(
            name = "FolderMultiplePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                curveTo(0f, 21.1f, 0.9f, 22f, 2f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                moveTo(22f, 4f)
                horizontalLineTo(14f)
                lineTo(12f, 2f)
                horizontalLineTo(6f)
                curveTo(5.6f, 2f, 5.2f, 2.1f, 4.9f, 2.3f)
                lineTo(4.3f, 2.9f)
                curveTo(4.1f, 3.2f, 4f, 3.6f, 4f, 4f)
                verticalLineTo(16f)
                curveTo(4f, 16.4f, 4.1f, 16.8f, 4.3f, 17.1f)
                curveTo(4.4f, 17.2f, 4.5f, 17.3f, 4.5f, 17.4f)
                curveTo(5f, 17.8f, 5.5f, 18f, 6f, 18f)
                horizontalLineTo(22f)
                curveTo(23.1f, 18f, 24f, 17.1f, 24f, 16f)
                verticalLineTo(6f)
                curveTo(24f, 4.9f, 23.1f, 4f, 22f, 4f)
                moveTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FolderMultiplePlus!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMultiplePlus: ImageVector? = null
