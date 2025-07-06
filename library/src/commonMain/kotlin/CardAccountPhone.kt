package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountPhone: ImageVector
    get() {
        if (_CardAccountPhone != null) {
            return _CardAccountPhone!!
        }
        _CardAccountPhone = ImageVector.Builder(
            name = "CardAccountPhone",
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
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                moveTo(14f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 15f, 6f, 13.9f, 8f, 13.9f)
                curveTo(10f, 13.9f, 14f, 15f, 14f, 17f)
                verticalLineTo(18f)
                moveTo(17.85f, 14f)
                horizontalLineTo(19.5f)
                lineTo(21f, 16f)
                lineTo(19f, 18f)
                curveTo(17.7f, 17f, 16.73f, 15.61f, 16.28f, 14f)
                curveTo(16.1f, 13.36f, 16f, 12.69f, 16f, 12f)
                curveTo(16f, 11.31f, 16.1f, 10.64f, 16.28f, 10f)
                curveTo(16.73f, 8.38f, 17.7f, 7f, 19f, 6f)
                lineTo(21f, 8f)
                lineTo(19.5f, 10f)
                horizontalLineTo(17.85f)
                curveTo(17.63f, 10.63f, 17.5f, 11.3f, 17.5f, 12f)
                curveTo(17.5f, 12.7f, 17.63f, 13.37f, 17.85f, 14f)
                close()
            }
        }.build()

        return _CardAccountPhone!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountPhone: ImageVector? = null
