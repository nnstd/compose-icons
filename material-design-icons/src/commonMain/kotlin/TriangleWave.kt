package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleWave: ImageVector
    get() {
        if (_TriangleWave != null) {
            return _TriangleWave!!
        }
        _TriangleWave = ImageVector.Builder(
            name = "TriangleWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                lineTo(17f, 22f)
                lineTo(7.1f, 6.04f)
                lineTo(4.24f, 12f)
                horizontalLineTo(2f)
                lineTo(7f, 2f)
                lineTo(16.9f, 17.96f)
                lineTo(19.76f, 12f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _TriangleWave!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleWave: ImageVector? = null
