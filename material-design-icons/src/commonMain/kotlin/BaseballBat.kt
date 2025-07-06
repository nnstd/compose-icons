package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BaseballBat: ImageVector
    get() {
        if (_BaseballBat != null) {
            return _BaseballBat!!
        }
        _BaseballBat = ImageVector.Builder(
            name = "BaseballBat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                curveTo(19.72f, 2f, 19.5f, 2.11f, 19.29f, 2.29f)
                lineTo(9.79f, 11.79f)
                curveTo(9.75f, 11.83f, 9.72f, 11.87f, 7.23f, 15.35f)
                lineTo(4f, 18.59f)
                lineTo(3.71f, 18.29f)
                curveTo(3.5f, 18.1f, 3.26f, 18f, 3f, 18f)
                curveTo(2.44f, 18f, 2f, 18.44f, 2f, 19f)
                curveTo(2f, 19.26f, 2.1f, 19.5f, 2.29f, 19.71f)
                lineTo(4.29f, 21.71f)
                curveTo(4.68f, 22.11f, 5.31f, 22.12f, 5.71f, 21.74f)
                curveTo(6.11f, 21.35f, 6.12f, 20.72f, 5.71f, 20.29f)
                lineTo(5.41f, 20f)
                lineTo(8.64f, 16.77f)
                lineTo(12.21f, 14.21f)
                lineTo(21.71f, 4.71f)
                curveTo(22.1f, 4.32f, 22.1f, 3.68f, 21.71f, 3.29f)
                lineTo(20.71f, 2.29f)
                curveTo(20.5f, 2.1f, 20.26f, 2f, 20f, 2f)
                moveTo(18.5f, 13f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 13f)
                close()
            }
        }.build()

        return _BaseballBat!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballBat: ImageVector? = null
