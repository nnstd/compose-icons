package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountMailOutline: ImageVector
    get() {
        if (_CardAccountMailOutline != null) {
            return _CardAccountMailOutline!!
        }
        _CardAccountMailOutline = ImageVector.Builder(
            name = "CardAccountMailOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3f)
                moveTo(22f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(21f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(20f, 8f)
                lineTo(17.5f, 9.75f)
                lineTo(15f, 8f)
                verticalLineTo(7f)
                lineTo(17.5f, 8.75f)
                lineTo(20f, 7f)
                verticalLineTo(8f)
                moveTo(9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                moveTo(9f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 8f)
                moveTo(15f, 16.59f)
                curveTo(15f, 14.09f, 11.03f, 13f, 9f, 13f)
                curveTo(6.97f, 13f, 3f, 14.09f, 3f, 16.59f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16.59f)
                moveTo(5.5f, 16f)
                curveTo(6.22f, 15.5f, 7.7f, 15f, 9f, 15f)
                curveTo(10.3f, 15f, 11.77f, 15.5f, 12.5f, 16f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()

        return _CardAccountMailOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountMailOutline: ImageVector? = null
