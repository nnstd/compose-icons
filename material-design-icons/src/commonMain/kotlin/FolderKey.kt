package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderKey: ImageVector
    get() {
        if (_FolderKey != null) {
            return _FolderKey!!
        }
        _FolderKey = ImageVector.Builder(
            name = "FolderKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                moveTo(11f, 10f)
                curveTo(12.3f, 10f, 13.4f, 10.8f, 13.8f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(13.8f)
                curveTo(13.4f, 15.2f, 12.3f, 16f, 11f, 16f)
                curveTo(9.3f, 16f, 8f, 14.7f, 8f, 13f)
                reflectiveCurveTo(9.3f, 10f, 11f, 10f)
                moveTo(11f, 12f)
                curveTo(10.4f, 12f, 10f, 12.4f, 10f, 13f)
                curveTo(10f, 13.6f, 10.4f, 14f, 11f, 14f)
                curveTo(11.6f, 14f, 12f, 13.6f, 12f, 13f)
                reflectiveCurveTo(11.6f, 12f, 11f, 12f)
                close()
            }
        }.build()

        return _FolderKey!!
    }

@Suppress("ObjectPropertyName")
private var _FolderKey: ImageVector? = null
