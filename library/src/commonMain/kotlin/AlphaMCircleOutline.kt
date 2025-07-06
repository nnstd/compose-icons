package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaMCircleOutline: ImageVector
    get() {
        if (_AlphaMCircleOutline != null) {
            return _AlphaMCircleOutline!!
        }
        _AlphaMCircleOutline = ImageVector.Builder(
            name = "AlphaMCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _AlphaMCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaMCircleOutline: ImageVector? = null
