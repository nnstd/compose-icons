package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaVCircle: ImageVector
    get() {
        if (_AlphaVCircle != null) {
            return _AlphaVCircle!!
        }
        _AlphaVCircle = ImageVector.Builder(
            name = "AlphaVCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 17f)
                horizontalLineTo(13f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 12f)
                lineTo(11f, 7f)
                horizontalLineTo(9f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _AlphaVCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaVCircle: ImageVector? = null
