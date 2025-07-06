package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaBCircle: ImageVector
    get() {
        if (_AlphaBCircle != null) {
            return _AlphaBCircle!!
        }
        _AlphaBCircle = ImageVector.Builder(
            name = "AlphaBCircle",
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
                moveTo(15f, 10.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                verticalLineTo(13.5f)
                curveTo(15f, 12.7f, 14.3f, 12f, 13.5f, 12f)
                curveTo(14.3f, 12f, 15f, 11.3f, 15f, 10.5f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _AlphaBCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaBCircle: ImageVector? = null
