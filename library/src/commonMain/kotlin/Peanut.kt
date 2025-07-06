package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Peanut: ImageVector
    get() {
        if (_Peanut != null) {
            return _Peanut!!
        }
        _Peanut = ImageVector.Builder(
            name = "Peanut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12.77f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.86f, 10.12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 2.12f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.11f, 10.12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12.72f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.81f, 21.87f)
                arcTo(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12.77f)
                moveTo(13f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                moveTo(11f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18f)
                moveTo(12f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(14f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19f)
                close()
            }
        }.build()

        return _Peanut!!
    }

@Suppress("ObjectPropertyName")
private var _Peanut: ImageVector? = null
