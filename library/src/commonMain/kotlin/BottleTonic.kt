package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleTonic: ImageVector
    get() {
        if (_BottleTonic != null) {
            return _BottleTonic!!
        }
        _BottleTonic = ImageVector.Builder(
            name = "BottleTonic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                lineTo(10f, 2f)
                horizontalLineTo(14f)
                lineTo(13f, 4f)
                moveTo(19f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                curveTo(5f, 10.24f, 7.24f, 8f, 10f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                curveTo(16.76f, 8f, 19f, 10.24f, 19f, 13f)
                close()
            }
        }.build()

        return _BottleTonic!!
    }

@Suppress("ObjectPropertyName")
private var _BottleTonic: ImageVector? = null
