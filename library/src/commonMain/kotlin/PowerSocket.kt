package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocket: ImageVector
    get() {
        if (_PowerSocket != null) {
            return _PowerSocket!!
        }
        _PowerSocket = ImageVector.Builder(
            name = "PowerSocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(7f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(8.83f, 7f)
                horizontalLineTo(15.2f)
                lineTo(19f, 10.8f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(10.8f)
                moveTo(8f, 5f)
                lineTo(3f, 10f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                lineTo(16f, 5f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _PowerSocket!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocket: ImageVector? = null
