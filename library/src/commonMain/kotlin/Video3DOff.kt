package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Video3DOff: ImageVector
    get() {
        if (_Video3DOff != null) {
            return _Video3DOff!!
        }
        _Video3DOff = ImageVector.Builder(
            name = "Video3DOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.61f, 2f)
                lineTo(21.35f, 20.74f)
                lineTo(19.94f, 22.15f)
                lineTo(14.8f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15.2f)
                lineTo(11f, 13.23f)
                verticalLineTo(15.21f)
                curveTo(10.93f, 15.68f, 10.74f, 16.08f, 10.41f, 16.41f)
                curveTo(10.08f, 16.73f, 9.68f, 16.93f, 9.21f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(8.8f)
                lineTo(6.79f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7.23f)
                lineTo(1.2f, 3.41f)
                lineTo(2.61f, 2f)
                moveTo(16f, 7f)
                horizontalLineTo(16.22f)
                curveTo(17f, 7.07f, 17.63f, 7.36f, 18.14f, 7.88f)
                curveTo(18.65f, 8.39f, 18.93f, 9f, 19f, 9.76f)
                verticalLineTo(14.24f)
                curveTo(18.95f, 14.63f, 18.87f, 15f, 18.72f, 15.3f)
                lineTo(17f, 13.6f)
                verticalLineTo(9.85f)
                curveTo(16.95f, 9.63f, 16.84f, 9.44f, 16.69f, 9.28f)
                curveTo(16.53f, 9.13f, 16.34f, 9.03f, 16.12f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11.59f)
                lineTo(13f, 9.57f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Video3DOff!!
    }

@Suppress("ObjectPropertyName")
private var _Video3DOff: ImageVector? = null
