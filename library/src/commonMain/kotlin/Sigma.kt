package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sigma: ImageVector
    get() {
        if (_Sigma != null) {
            return _Sigma!!
        }
        _Sigma = ImageVector.Builder(
            name = "Sigma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                horizontalLineTo(8.83f)
                lineTo(14.83f, 12f)
                lineTo(8.83f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                lineTo(12f, 12f)
                lineTo(6f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Sigma!!
    }

@Suppress("ObjectPropertyName")
private var _Sigma: ImageVector? = null
