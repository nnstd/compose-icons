package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Redo: ImageVector
    get() {
        if (_Redo != null) {
            return _Redo!!
        }
        _Redo = ImageVector.Builder(
            name = "Redo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.4f, 10.6f)
                curveTo(16.55f, 9f, 14.15f, 8f, 11.5f, 8f)
                curveTo(6.85f, 8f, 2.92f, 11.03f, 1.54f, 15.22f)
                lineTo(3.9f, 16f)
                curveTo(4.95f, 12.81f, 7.95f, 10.5f, 11.5f, 10.5f)
                curveTo(13.45f, 10.5f, 15.23f, 11.22f, 16.62f, 12.38f)
                lineTo(13f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                lineTo(18.4f, 10.6f)
                close()
            }
        }.build()

        return _Redo!!
    }

@Suppress("ObjectPropertyName")
private var _Redo: ImageVector? = null
