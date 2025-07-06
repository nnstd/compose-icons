package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileAccountOutline: ImageVector
    get() {
        if (_FileAccountOutline != null) {
            return _FileAccountOutline!!
        }
        _FileAccountOutline = ImageVector.Builder(
            name = "FileAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(13f, 13f)
                curveTo(13f, 14.1f, 12.1f, 15f, 11f, 15f)
                reflectiveCurveTo(9f, 14.1f, 9f, 13f)
                reflectiveCurveTo(9.9f, 11f, 11f, 11f)
                reflectiveCurveTo(13f, 11.9f, 13f, 13f)
                moveTo(15f, 18f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                curveTo(7f, 16.67f, 9.67f, 16f, 11f, 16f)
                reflectiveCurveTo(15f, 16.67f, 15f, 18f)
                close()
            }
        }.build()

        return _FileAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileAccountOutline: ImageVector? = null
