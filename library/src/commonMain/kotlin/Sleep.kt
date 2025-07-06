package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sleep: ImageVector
    get() {
        if (_Sleep != null) {
            return _Sleep!!
        }
        _Sleep = ImageVector.Builder(
            name = "Sleep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                lineTo(20.39f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                lineTo(19.62f, 10f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                moveTo(15f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                lineTo(12.39f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                lineTo(11.62f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(7f, 20f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                lineTo(4.39f, 14f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                lineTo(3.62f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Sleep!!
    }

@Suppress("ObjectPropertyName")
private var _Sleep: ImageVector? = null
