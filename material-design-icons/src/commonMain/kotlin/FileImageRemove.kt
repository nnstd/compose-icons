package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImageRemove: ImageVector
    get() {
        if (_FileImageRemove != null) {
            return _FileImageRemove!!
        }
        _FileImageRemove = ImageVector.Builder(
            name = "FileImageRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                horizontalLineTo(6f)
                lineTo(12f, 14f)
                lineTo(13.88f, 15.88f)
                curveTo(14.5f, 14.9f, 15.36f, 14.1f, 16.4f, 13.6f)
                lineTo(18f, 12f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.21f, 20.72f, 13.09f, 20f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(8f, 9f)
                curveTo(9.11f, 9f, 10f, 9.9f, 10f, 11f)
                reflectiveCurveTo(9.11f, 13f, 8f, 13f)
                reflectiveCurveTo(6f, 12.11f, 6f, 11f)
                reflectiveCurveTo(6.9f, 9f, 8f, 9f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _FileImageRemove!!
    }

@Suppress("ObjectPropertyName")
private var _FileImageRemove: ImageVector? = null
