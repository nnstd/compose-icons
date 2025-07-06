package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMultiplePlusOutline: ImageVector
    get() {
        if (_FolderMultiplePlusOutline != null) {
            return _FolderMultiplePlusOutline!!
        }
        _FolderMultiplePlusOutline = ImageVector.Builder(
            name = "FolderMultiplePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                curveTo(23.1f, 4f, 24f, 4.9f, 24f, 6f)
                verticalLineTo(16f)
                curveTo(24f, 17.1f, 23.1f, 18f, 22f, 18f)
                horizontalLineTo(6f)
                curveTo(4.9f, 18f, 4f, 17.1f, 4f, 16f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                lineTo(14f, 4f)
                horizontalLineTo(22f)
                moveTo(2f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                curveTo(0.9f, 22f, 0f, 21.1f, 0f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                moveTo(6f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                moveTo(14f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FolderMultiplePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMultiplePlusOutline: ImageVector? = null
