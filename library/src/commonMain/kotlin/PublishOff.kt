package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PublishOff: ImageVector
    get() {
        if (_PublishOff != null) {
            return _PublishOff!!
        }
        _PublishOff = ImageVector.Builder(
            name = "PublishOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(15f, 16.9f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                lineTo(8.6f, 10.4f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(19f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6f)
                horizontalLineTo(19f)
                moveTo(17.2f, 14f)
                horizontalLineTo(19f)
                lineTo(12f, 7f)
                lineTo(11.1f, 7.9f)
                lineTo(17.2f, 14f)
                close()
            }
        }.build()

        return _PublishOff!!
    }

@Suppress("ObjectPropertyName")
private var _PublishOff: ImageVector? = null
