package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyFace: ImageVector
    get() {
        if (_BabyFace != null) {
            return _BabyFace!!
        }
        _BabyFace = ImageVector.Builder(
            name = "BabyFace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                curveTo(1f, 10.19f, 2.2f, 8.66f, 3.86f, 8.17f)
                curveTo(5.29f, 5.11f, 8.4f, 3f, 12f, 3f)
                curveTo(15.6f, 3f, 18.71f, 5.11f, 20.15f, 8.17f)
                curveTo(21.8f, 8.66f, 23f, 10.19f, 23f, 12f)
                curveTo(23f, 13.81f, 21.8f, 15.34f, 20.15f, 15.83f)
                curveTo(18.71f, 18.89f, 15.6f, 21f, 12f, 21f)
                curveTo(8.4f, 21f, 5.29f, 18.89f, 3.86f, 15.83f)
                curveTo(2.2f, 15.34f, 1f, 13.81f, 1f, 12f)
                moveTo(14.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 9.25f)
                moveTo(9.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 9.25f)
                moveTo(7.5f, 14f)
                curveTo(8.26f, 15.77f, 10f, 17f, 12f, 17f)
                curveTo(14f, 17f, 15.74f, 15.77f, 16.5f, 14f)
                horizontalLineTo(7.5f)
                moveTo(3f, 12f)
                curveTo(3f, 12.82f, 3.5f, 13.53f, 4.21f, 13.84f)
                curveTo(4.07f, 13.25f, 4f, 12.63f, 4f, 12f)
                curveTo(4f, 11.37f, 4.07f, 10.75f, 4.21f, 10.16f)
                curveTo(3.5f, 10.47f, 3f, 11.18f, 3f, 12f)
                moveTo(21f, 12f)
                curveTo(21f, 11.18f, 20.5f, 10.47f, 19.79f, 10.16f)
                curveTo(19.93f, 10.75f, 20f, 11.37f, 20f, 12f)
                curveTo(20f, 12.63f, 19.93f, 13.25f, 19.79f, 13.84f)
                curveTo(20.5f, 13.53f, 21f, 12.82f, 21f, 12f)
                close()
            }
        }.build()

        return _BabyFace!!
    }

@Suppress("ObjectPropertyName")
private var _BabyFace: ImageVector? = null
