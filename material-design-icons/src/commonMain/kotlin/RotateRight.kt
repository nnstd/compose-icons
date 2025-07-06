package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RotateRight: ImageVector
    get() {
        if (_RotateRight != null) {
            return _RotateRight!!
        }
        _RotateRight = ImageVector.Builder(
            name = "RotateRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.89f, 15.5f)
                lineTo(18.31f, 16.89f)
                curveTo(19.21f, 15.73f, 19.76f, 14.39f, 19.93f, 13f)
                horizontalLineTo(17.91f)
                curveTo(17.77f, 13.87f, 17.43f, 14.72f, 16.89f, 15.5f)
                moveTo(13f, 17.9f)
                verticalLineTo(19.92f)
                curveTo(14.39f, 19.75f, 15.74f, 19.21f, 16.9f, 18.31f)
                lineTo(15.46f, 16.87f)
                curveTo(14.71f, 17.41f, 13.87f, 17.76f, 13f, 17.9f)
                moveTo(19.93f, 11f)
                curveTo(19.76f, 9.61f, 19.21f, 8.27f, 18.31f, 7.11f)
                lineTo(16.89f, 8.53f)
                curveTo(17.43f, 9.28f, 17.77f, 10.13f, 17.91f, 11f)
                moveTo(15.55f, 5.55f)
                lineTo(11f, 1f)
                verticalLineTo(4.07f)
                curveTo(7.06f, 4.56f, 4f, 7.92f, 4f, 12f)
                curveTo(4f, 16.08f, 7.05f, 19.44f, 11f, 19.93f)
                verticalLineTo(17.91f)
                curveTo(8.16f, 17.43f, 6f, 14.97f, 6f, 12f)
                curveTo(6f, 9.03f, 8.16f, 6.57f, 11f, 6.09f)
                verticalLineTo(10f)
                lineTo(15.55f, 5.55f)
                close()
            }
        }.build()

        return _RotateRight!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight: ImageVector? = null
