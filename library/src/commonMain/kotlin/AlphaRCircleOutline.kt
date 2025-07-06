package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaRCircleOutline: ImageVector
    get() {
        if (_AlphaRCircleOutline != null) {
            return _AlphaRCircleOutline!!
        }
        _AlphaRCircleOutline = ImageVector.Builder(
            name = "AlphaRCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                verticalLineTo(11f)
                curveTo(15f, 11.84f, 14.5f, 12.55f, 13.76f, 12.85f)
                lineTo(15f, 17f)
                horizontalLineTo(13f)
                lineTo(11.8f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 16.41f, 7.58f, 20f, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _AlphaRCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaRCircleOutline: ImageVector? = null
