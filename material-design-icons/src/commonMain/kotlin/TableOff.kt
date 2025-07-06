package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableOff: ImageVector
    get() {
        if (_TableOff != null) {
            return _TableOff!!
        }
        _TableOff = ImageVector.Builder(
            name = "TableOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3.22f, 5.11f)
                curveTo(3.08f, 5.38f, 3f, 5.68f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 19.11f, 3.9f, 20f, 5f, 20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10.11f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(10.11f, 12f)
                moveTo(11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                moveTo(13f, 18f)
                verticalLineTo(14.89f)
                lineTo(16.11f, 18f)
                horizontalLineTo(13f)
                moveTo(13f, 9.8f)
                lineTo(7.2f, 4f)
                horizontalLineTo(19f)
                curveTo(20.11f, 4f, 21f, 4.89f, 21f, 6f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(14f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(9.8f)
                close()
            }
        }.build()

        return _TableOff!!
    }

@Suppress("ObjectPropertyName")
private var _TableOff: ImageVector? = null
