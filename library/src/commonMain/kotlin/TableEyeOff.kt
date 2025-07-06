package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableEyeOff: ImageVector
    get() {
        if (_TableEyeOff != null) {
            return _TableEyeOff!!
        }
        _TableEyeOff = ImageVector.Builder(
            name = "TableEyeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.8f)
                lineTo(6.2f, 3f)
                horizontalLineTo(18f)
                curveTo(19.1f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(12.59f)
                curveTo(19.07f, 12.21f, 18.06f, 12f, 17f, 12f)
                curveTo(16.45f, 12f, 15.91f, 12.07f, 15.38f, 12.18f)
                lineTo(14.2f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8.8f)
                moveTo(17.09f, 13.89f)
                lineTo(22.31f, 19.11f)
                curveTo(22.58f, 18.73f, 22.82f, 18.32f, 23f, 17.88f)
                curveTo(22.07f, 15.57f, 19.78f, 13.92f, 17.09f, 13.89f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.5f, 21.37f)
                curveTo(18.71f, 21.69f, 17.88f, 21.88f, 17f, 21.88f)
                curveTo(14.27f, 21.88f, 11.94f, 20.22f, 11f, 17.88f)
                curveTo(11.45f, 16.76f, 12.23f, 15.8f, 13.21f, 15.1f)
                lineTo(11.93f, 13.82f)
                curveTo(11.19f, 14.42f, 10.53f, 15.14f, 10f, 15.97f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(9.42f)
                curveTo(9.26f, 17.32f, 9.12f, 17.66f, 9f, 18f)
                curveTo(9.12f, 18.34f, 9.26f, 18.68f, 9.42f, 19f)
                horizontalLineTo(4f)
                curveTo(2.9f, 19f, 2f, 18.1f, 2f, 17f)
                verticalLineTo(5f)
                curveTo(2f, 4.68f, 2.08f, 4.38f, 2.22f, 4.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9.11f, 11f)
                lineTo(5.11f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                moveTo(18.18f, 20.07f)
                lineTo(14.81f, 16.7f)
                curveTo(14.61f, 17.05f, 14.5f, 17.45f, 14.5f, 17.88f)
                curveTo(14.5f, 19.26f, 15.62f, 20.38f, 17f, 20.38f)
                curveTo(17.43f, 20.38f, 17.83f, 20.27f, 18.18f, 20.07f)
                close()
            }
        }.build()

        return _TableEyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _TableEyeOff: ImageVector? = null
