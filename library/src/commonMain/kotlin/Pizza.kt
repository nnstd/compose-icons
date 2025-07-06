package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pizza: ImageVector
    get() {
        if (_Pizza != null) {
            return _Pizza!!
        }
        _Pizza = ImageVector.Builder(
            name = "Pizza",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                curveTo(10f, 11.89f, 10.9f, 11f, 12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(7f, 7f)
                curveTo(7f, 5.89f, 7.89f, 5f, 9f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                curveTo(7.89f, 9f, 7f, 8.1f, 7f, 7f)
                moveTo(12f, 2f)
                curveTo(8.43f, 2f, 5.23f, 3.54f, 3f, 6f)
                lineTo(12f, 22f)
                lineTo(21f, 6f)
                curveTo(18.78f, 3.54f, 15.57f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Pizza!!
    }

@Suppress("ObjectPropertyName")
private var _Pizza: ImageVector? = null
