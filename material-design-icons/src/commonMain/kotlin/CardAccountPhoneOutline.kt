package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountPhoneOutline: ImageVector
    get() {
        if (_CardAccountPhoneOutline != null) {
            return _CardAccountPhoneOutline!!
        }
        _CardAccountPhoneOutline = ImageVector.Builder(
            name = "CardAccountPhoneOutline",
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
                moveTo(19f, 18f)
                lineTo(21f, 16f)
                lineTo(19.5f, 14f)
                horizontalLineTo(17.85f)
                curveTo(17.63f, 13.37f, 17.5f, 12.7f, 17.5f, 12f)
                curveTo(17.5f, 11.3f, 17.63f, 10.63f, 17.85f, 10f)
                horizontalLineTo(19.5f)
                lineTo(21f, 8f)
                lineTo(19f, 6f)
                curveTo(17.7f, 7f, 16.73f, 8.38f, 16.28f, 10f)
                curveTo(16.1f, 10.64f, 16f, 11.31f, 16f, 12f)
                curveTo(16f, 12.69f, 16.1f, 13.36f, 16.28f, 14f)
                curveTo(16.73f, 15.61f, 17.7f, 17f, 19f, 18f)
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

        return _CardAccountPhoneOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountPhoneOutline: ImageVector? = null
