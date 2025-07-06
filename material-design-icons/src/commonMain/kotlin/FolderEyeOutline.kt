package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderEyeOutline: ImageVector
    get() {
        if (_FolderEyeOutline != null) {
            return _FolderEyeOutline!!
        }
        _FolderEyeOutline = ImageVector.Builder(
            name = "FolderEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.3f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.9f, 22f, 8f)
                verticalLineTo(14.6f)
                curveTo(21.4f, 14.2f, 20.7f, 13.8f, 20f, 13.5f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(9.3f)
                curveTo(9.3f, 18.1f, 9.2f, 18.2f, 9.2f, 18.3f)
                lineTo(8.8f, 19f)
                lineTo(9.1f, 19.7f)
                curveTo(9.2f, 19.8f, 9.2f, 19.9f, 9.3f, 20f)
                moveTo(23f, 19f)
                curveTo(22.1f, 21.3f, 19.7f, 23f, 17f, 23f)
                reflectiveCurveTo(11.9f, 21.3f, 11f, 19f)
                curveTo(11.9f, 16.7f, 14.3f, 15f, 17f, 15f)
                reflectiveCurveTo(22.1f, 16.7f, 23f, 19f)
                moveTo(19.5f, 19f)
                curveTo(19.5f, 17.6f, 18.4f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(14.5f, 17.6f, 14.5f, 19f)
                reflectiveCurveTo(15.6f, 21.5f, 17f, 21.5f)
                reflectiveCurveTo(19.5f, 20.4f, 19.5f, 19f)
                moveTo(17f, 18f)
                curveTo(16.4f, 18f, 16f, 18.4f, 16f, 19f)
                reflectiveCurveTo(16.4f, 20f, 17f, 20f)
                reflectiveCurveTo(18f, 19.6f, 18f, 19f)
                reflectiveCurveTo(17.6f, 18f, 17f, 18f)
            }
        }.build()

        return _FolderEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderEyeOutline: ImageVector? = null
