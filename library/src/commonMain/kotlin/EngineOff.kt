package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EngineOff: ImageVector
    get() {
        if (_EngineOff != null) {
            return _EngineOff!!
        }
        _EngineOff = ImageVector.Builder(
            name = "EngineOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.78f, 2.5f)
                lineTo(21.5f, 20.22f)
                lineTo(20.23f, 21.5f)
                lineTo(18f, 19.27f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                lineTo(8f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                lineTo(6.87f, 8.14f)
                lineTo(2.5f, 3.77f)
                lineTo(3.78f, 2.5f)
                moveTo(20f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(7.82f)
                lineTo(22.82f, 19f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _EngineOff!!
    }

@Suppress("ObjectPropertyName")
private var _EngineOff: ImageVector? = null
