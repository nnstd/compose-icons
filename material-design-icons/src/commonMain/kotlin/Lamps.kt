package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lamps: ImageVector
    get() {
        if (_Lamps != null) {
            return _Lamps!!
        }
        _Lamps = ImageVector.Builder(
            name = "Lamps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineTo(12f, 9f)
                horizontalLineTo(2f)
                lineTo(4f, 2f)
                moveTo(6f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                moveTo(20f, 8f)
                lineTo(22f, 15f)
                horizontalLineTo(12f)
                lineTo(14f, 8f)
                moveTo(16f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Lamps!!
    }

@Suppress("ObjectPropertyName")
private var _Lamps: ImageVector? = null
