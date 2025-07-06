package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EngineOffOutline: ImageVector
    get() {
        if (_EngineOffOutline != null) {
            return _EngineOffOutline!!
        }
        _EngineOffOutline = ImageVector.Builder(
            name = "EngineOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 3.77f)
                lineTo(6.87f, 8.14f)
                lineTo(5f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                lineTo(10f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(19.27f)
                lineTo(21.23f, 22.5f)
                lineTo(22.5f, 21.22f)
                lineTo(3.78f, 2.5f)
                lineTo(2.5f, 3.77f)
                moveTo(16f, 18f)
                horizontalLineTo(11f)
                lineTo(9f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                lineTo(8f, 10f)
                horizontalLineTo(8.73f)
                lineTo(16f, 17.27f)
                verticalLineTo(18f)
                moveTo(23f, 9f)
                verticalLineTo(19f)
                horizontalLineTo(22.82f)
                lineTo(16f, 12.18f)
                verticalLineTo(10f)
                horizontalLineTo(13.82f)
                lineTo(7.82f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _EngineOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EngineOffOutline: ImageVector? = null
