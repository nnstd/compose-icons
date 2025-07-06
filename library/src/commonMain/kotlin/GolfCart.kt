package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GolfCart: ImageVector
    get() {
        if (_GolfCart != null) {
            return _GolfCart!!
        }
        _GolfCart = ImageVector.Builder(
            name = "GolfCart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.89f, 12.37f)
                lineTo(18.25f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(12.54f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.89f, 12.37f)
                moveTo(6f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20.5f)
                moveTo(15.53f, 12f)
                lineTo(14.38f, 10.28f)
                lineTo(15.8f, 9.33f)
                lineTo(14.7f, 7.67f)
                lineTo(10.2f, 10.67f)
                lineTo(11.3f, 12.33f)
                lineTo(12.73f, 11.38f)
                lineTo(13.88f, 13.12f)
                lineTo(13f, 14f)
                horizontalLineTo(10.2f)
                lineTo(5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(16.2f)
                lineTo(17.75f, 12f)
                moveTo(18f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.5f)
                close()
            }
        }.build()

        return _GolfCart!!
    }

@Suppress("ObjectPropertyName")
private var _GolfCart: ImageVector? = null
