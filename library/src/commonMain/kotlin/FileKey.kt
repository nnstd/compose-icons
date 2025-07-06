package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileKey: ImageVector
    get() {
        if (_FileKey != null) {
            return _FileKey!!
        }
        _FileKey = ImageVector.Builder(
            name = "FileKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                curveTo(11f, 16.6f, 10.6f, 17f, 10f, 17f)
                reflectiveCurveTo(9f, 16.6f, 9f, 16f)
                curveTo(9f, 15.4f, 9.4f, 15f, 10f, 15f)
                reflectiveCurveTo(11f, 15.4f, 11f, 16f)
                moveTo(20f, 8f)
                verticalLineTo(20f)
                curveTo(20f, 21.1f, 19.1f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                moveTo(18f, 15f)
                horizontalLineTo(12.8f)
                curveTo(12.2f, 13.4f, 10.5f, 12.6f, 9f, 13.2f)
                curveTo(7.4f, 13.8f, 6.6f, 15.5f, 7.2f, 17f)
                reflectiveCurveTo(9.5f, 19.4f, 11f, 18.8f)
                curveTo(11.9f, 18.5f, 12.5f, 17.8f, 12.8f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                moveTo(18.5f, 9f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _FileKey!!
    }

@Suppress("ObjectPropertyName")
private var _FileKey: ImageVector? = null
