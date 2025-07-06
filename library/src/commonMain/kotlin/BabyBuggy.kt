package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyBuggy: ImageVector
    get() {
        if (_BabyBuggy != null) {
            return _BabyBuggy!!
        }
        _BabyBuggy = ImageVector.Builder(
            name = "BabyBuggy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20f)
                moveTo(7f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                moveTo(17.61f, 3f)
                curveTo(16.95f, 3f, 16.44f, 3.2f, 16f, 3.5f)
                curveTo(15.32f, 3.91f, 14.88f, 4.59f, 14.47f, 5.07f)
                lineTo(5.71f, 15.35f)
                curveTo(5.16f, 16f, 5.62f, 17f, 6.47f, 17f)
                horizontalLineTo(14f)
                curveTo(15.11f, 17f, 16f, 16.1f, 16f, 15f)
                verticalLineTo(6.38f)
                curveTo(16.58f, 5.7f, 16.93f, 5f, 17.61f, 5f)
                curveTo(18.38f, 5f, 19f, 5.66f, 19f, 6.5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(6.5f)
                curveTo(21f, 4.56f, 19.5f, 3f, 17.61f, 3f)
                moveTo(8.86f, 3.09f)
                curveTo(7.04f, 3.16f, 5.23f, 3.76f, 3.68f, 4.9f)
                lineTo(8.44f, 9.66f)
                lineTo(12.32f, 5.1f)
                curveTo(12.59f, 4.78f, 12.91f, 4.38f, 13.3f, 4f)
                curveTo(12.14f, 3.45f, 10.9f, 3.15f, 9.65f, 3.09f)
                curveTo(9.39f, 3.08f, 9.12f, 3.08f, 8.86f, 3.09f)
                close()
            }
        }.build()

        return _BabyBuggy!!
    }

@Suppress("ObjectPropertyName")
private var _BabyBuggy: ImageVector? = null
