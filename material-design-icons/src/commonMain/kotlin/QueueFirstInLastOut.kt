package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.QueueFirstInLastOut: ImageVector
    get() {
        if (_QueueFirstInLastOut != null) {
            return _QueueFirstInLastOut!!
        }
        _QueueFirstInLastOut = ImageVector.Builder(
            name = "QueueFirstInLastOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(6f, 10.5f)
                horizontalLineTo(18f)
                verticalLineTo(12.5f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                moveTo(6f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(9f, 19f)
                horizontalLineTo(15f)
                lineTo(12f, 22f)
                lineTo(9f, 19f)
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                lineTo(12f, 5f)
                lineTo(9f, 2f)
                close()
            }
        }.build()

        return _QueueFirstInLastOut!!
    }

@Suppress("ObjectPropertyName")
private var _QueueFirstInLastOut: ImageVector? = null
