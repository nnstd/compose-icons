package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RemoteOff: ImageVector
    get() {
        if (_RemoteOff != null) {
            return _RemoteOff!!
        }
        _RemoteOff = ImageVector.Builder(
            name = "RemoteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(21f, 21.72f)
                lineTo(19.73f, 23f)
                lineTo(16f, 19.27f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 23f)
                horizontalLineTo(9f)
                curveTo(8.46f, 23f, 8f, 22.55f, 8f, 22f)
                verticalLineTo(11.27f)
                lineTo(2f, 5.27f)
                moveTo(12f, 0f)
                curveTo(15.05f, 0f, 17.8f, 1.23f, 19.77f, 3.23f)
                lineTo(18.36f, 4.64f)
                curveTo(16.75f, 3f, 14.5f, 2f, 12f, 2f)
                curveTo(9.72f, 2f, 7.64f, 2.85f, 6.06f, 4.24f)
                lineTo(4.64f, 2.82f)
                curveTo(6.59f, 1.07f, 9.17f, 0f, 12f, 0f)
                moveTo(12f, 4f)
                curveTo(13.94f, 4f, 15.69f, 4.78f, 16.95f, 6.05f)
                lineTo(15.55f, 7.46f)
                curveTo(14.64f, 6.56f, 13.39f, 6f, 12f, 6f)
                curveTo(10.83f, 6f, 9.76f, 6.4f, 8.9f, 7.08f)
                lineTo(7.5f, 5.66f)
                curveTo(8.7f, 4.62f, 10.28f, 4f, 12f, 4f)
                moveTo(15f, 9f)
                curveTo(15.56f, 9f, 16f, 9.45f, 16f, 10f)
                verticalLineTo(14.18f)
                lineTo(13.5f, 11.69f)
                lineTo(13.31f, 11.5f)
                lineTo(10.82f, 9f)
                horizontalLineTo(15f)
                moveTo(10.03f, 13.3f)
                curveTo(10.16f, 14.16f, 10.84f, 14.85f, 11.71f, 15f)
                lineTo(10.03f, 13.3f)
                close()
            }
        }.build()

        return _RemoteOff!!
    }

@Suppress("ObjectPropertyName")
private var _RemoteOff: ImageVector? = null
