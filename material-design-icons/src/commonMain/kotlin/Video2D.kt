package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Video2D: ImageVector
    get() {
        if (_Video2D != null) {
            return _Video2D!!
        }
        _Video2D = ImageVector.Builder(
            name = "Video2D",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                horizontalLineTo(16f)
                curveTo(17.66f, 7f, 19f, 8.34f, 19f, 10f)
                verticalLineTo(14f)
                curveTo(19f, 15.66f, 17.66f, 17f, 16f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(16f, 15f)
                curveTo(16.55f, 15f, 17f, 14.55f, 17f, 14f)
                verticalLineTo(10f)
                curveTo(17f, 9.45f, 16.55f, 9f, 16f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                moveTo(5f, 7f)
                horizontalLineTo(9f)
                curveTo(10.11f, 7f, 11f, 7.9f, 11f, 9f)
                verticalLineTo(11f)
                curveTo(11f, 12.11f, 10.11f, 13f, 9f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                curveTo(5f, 11.9f, 5.9f, 11f, 7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _Video2D!!
    }

@Suppress("ObjectPropertyName")
private var _Video2D: ImageVector? = null
