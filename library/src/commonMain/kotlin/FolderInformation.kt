package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderInformation: ImageVector
    get() {
        if (_FolderInformation != null) {
            return _FolderInformation!!
        }
        _FolderInformation = ImageVector.Builder(
            name = "FolderInformation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.1f)
                verticalLineTo(8f)
                curveTo(21f, 6.9f, 20.1f, 6f, 19f, 6f)
                horizontalLineTo(11f)
                lineTo(9f, 4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(10.3f)
                curveTo(11.6f, 21.9f, 13.8f, 23f, 16f, 23f)
                curveTo(19.9f, 23f, 23f, 19.9f, 23f, 16f)
                curveTo(23f, 14.2f, 22.3f, 12.4f, 21f, 11.1f)
                moveTo(16f, 21f)
                curveTo(13.2f, 21f, 11f, 18.8f, 11f, 16f)
                reflectiveCurveTo(13.2f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.2f, 21f, 16f)
                reflectiveCurveTo(18.8f, 21f, 16f, 21f)
                moveTo(17f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                moveTo(17f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _FolderInformation!!
    }

@Suppress("ObjectPropertyName")
private var _FolderInformation: ImageVector? = null
