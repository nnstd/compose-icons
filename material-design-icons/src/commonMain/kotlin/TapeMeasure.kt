package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TapeMeasure: ImageVector
    get() {
        if (_TapeMeasure != null) {
            return _TapeMeasure!!
        }
        _TapeMeasure = ImageVector.Builder(
            name = "TapeMeasure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                moveTo(9f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                moveTo(17f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                lineTo(22f, 21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _TapeMeasure!!
    }

@Suppress("ObjectPropertyName")
private var _TapeMeasure: ImageVector? = null
