package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sale: ImageVector
    get() {
        if (_Sale != null) {
            return _Sale!!
        }
        _Sale = ImageVector.Builder(
            name = "Sale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.65f, 2.85f)
                lineTo(19.26f, 6.71f)
                lineTo(22.77f, 8.5f)
                lineTo(21f, 12f)
                lineTo(22.78f, 15.5f)
                lineTo(19.24f, 17.29f)
                lineTo(18.63f, 21.15f)
                lineTo(14.74f, 20.54f)
                lineTo(11.97f, 23.3f)
                lineTo(9.19f, 20.5f)
                lineTo(5.33f, 21.14f)
                lineTo(4.71f, 17.25f)
                lineTo(1.22f, 15.47f)
                lineTo(3f, 11.97f)
                lineTo(1.23f, 8.5f)
                lineTo(4.74f, 6.69f)
                lineTo(5.35f, 2.86f)
                lineTo(9.22f, 3.5f)
                lineTo(12f, 0.69f)
                lineTo(14.77f, 3.46f)
                lineTo(18.65f, 2.85f)
                moveTo(9.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 7f)
                moveTo(14.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 14f)
                moveTo(8.41f, 17f)
                lineTo(17f, 8.41f)
                lineTo(15.59f, 7f)
                lineTo(7f, 15.59f)
                lineTo(8.41f, 17f)
                close()
            }
        }.build()

        return _Sale!!
    }

@Suppress("ObjectPropertyName")
private var _Sale: ImageVector? = null
