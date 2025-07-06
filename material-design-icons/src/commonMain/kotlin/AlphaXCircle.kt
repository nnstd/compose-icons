package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaXCircle: ImageVector
    get() {
        if (_AlphaXCircle != null) {
            return _AlphaXCircle!!
        }
        _AlphaXCircle = ImageVector.Builder(
            name = "AlphaXCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 12f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                lineTo(12f, 14.5f)
                lineTo(13f, 17f)
                horizontalLineTo(15f)
                lineTo(13f, 12f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 9.5f)
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

        return _AlphaXCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaXCircle: ImageVector? = null
