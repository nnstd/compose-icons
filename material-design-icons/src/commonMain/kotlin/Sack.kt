package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sack: ImageVector
    get() {
        if (_Sack != null) {
            return _Sack!!
        }
        _Sack = ImageVector.Builder(
            name = "Sack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                curveTo(20f, 11f, 21f, 18f, 21f, 18f)
                curveTo(21f, 18f, 22f, 22f, 16f, 22f)
                curveTo(10f, 22f, 8f, 22f, 8f, 22f)
                curveTo(2f, 22f, 3f, 18f, 3f, 18f)
                curveTo(3f, 18f, 4f, 11f, 8f, 9f)
                moveTo(14f, 4f)
                lineTo(12f, 2f)
                lineTo(10f, 4f)
                lineTo(6f, 2f)
                lineTo(8f, 7f)
                horizontalLineTo(16f)
                lineTo(18f, 2f)
                lineTo(14f, 4f)
                close()
            }
        }.build()

        return _Sack!!
    }

@Suppress("ObjectPropertyName")
private var _Sack: ImageVector? = null
