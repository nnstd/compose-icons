package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaICircle: ImageVector
    get() {
        if (_AlphaICircle != null) {
            return _AlphaICircle!!
        }
        _AlphaICircle = ImageVector.Builder(
            name = "AlphaICircle",
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
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _AlphaICircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaICircle: ImageVector? = null
