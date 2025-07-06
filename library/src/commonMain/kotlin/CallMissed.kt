package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CallMissed: ImageVector
    get() {
        if (_CallMissed != null) {
            return _CallMissed!!
        }
        _CallMissed = ImageVector.Builder(
            name = "CallMissed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.59f, 7f)
                lineTo(12f, 14.59f)
                lineTo(6.41f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(10.41f)
                lineTo(12f, 17.41f)
                lineTo(21f, 8.41f)
            }
        }.build()

        return _CallMissed!!
    }

@Suppress("ObjectPropertyName")
private var _CallMissed: ImageVector? = null
