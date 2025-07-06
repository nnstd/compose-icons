package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePercentOutline: ImageVector
    get() {
        if (_FilePercentOutline != null) {
            return _FilePercentOutline!!
        }
        _FilePercentOutline = ImageVector.Builder(
            name = "FilePercentOutline",
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
                moveTo(10f, 11.5f)
                curveTo(10f, 12.33f, 9.33f, 13f, 8.5f, 13f)
                reflectiveCurveTo(7f, 12.33f, 7f, 11.5f)
                reflectiveCurveTo(7.67f, 10f, 8.5f, 10f)
                reflectiveCurveTo(10f, 10.67f, 10f, 11.5f)
                moveTo(16f, 17.5f)
                curveTo(16f, 18.33f, 15.33f, 19f, 14.5f, 19f)
                reflectiveCurveTo(13f, 18.33f, 13f, 17.5f)
                reflectiveCurveTo(13.67f, 16f, 14.5f, 16f)
                reflectiveCurveTo(16f, 16.67f, 16f, 17.5f)
                moveTo(16f, 11.35f)
                lineTo(8.37f, 19f)
                lineTo(7f, 17.65f)
                lineTo(14.65f, 10f)
                lineTo(16f, 11.35f)
                close()
            }
        }.build()

        return _FilePercentOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilePercentOutline: ImageVector? = null
