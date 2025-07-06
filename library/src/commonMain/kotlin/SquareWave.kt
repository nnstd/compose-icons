package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareWave: ImageVector
    get() {
        if (_SquareWave != null) {
            return _SquareWave!!
        }
        _SquareWave = ImageVector.Builder(
            name = "SquareWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _SquareWave!!
    }

@Suppress("ObjectPropertyName")
private var _SquareWave: ImageVector? = null
