package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaHCircle: ImageVector
    get() {
        if (_AlphaHCircle != null) {
            return _AlphaHCircle!!
        }
        _AlphaHCircle = ImageVector.Builder(
            name = "AlphaHCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(9f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaHCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaHCircle: ImageVector? = null
