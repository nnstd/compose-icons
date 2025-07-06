package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaYCircle: ImageVector
    get() {
        if (_AlphaYCircle != null) {
            return _AlphaYCircle!!
        }
        _AlphaYCircle = ImageVector.Builder(
            name = "AlphaYCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 10f)
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

        return _AlphaYCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaYCircle: ImageVector? = null
