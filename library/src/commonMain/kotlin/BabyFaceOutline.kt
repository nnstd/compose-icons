package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyFaceOutline: ImageVector
    get() {
        if (_BabyFaceOutline != null) {
            return _BabyFaceOutline!!
        }
        _BabyFaceOutline = ImageVector.Builder(
            name = "BabyFaceOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 9.25f)
                moveTo(9.5f, 9.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 9.25f)
                moveTo(7.5f, 14f)
                horizontalLineTo(16.5f)
                curveTo(15.74f, 15.77f, 14f, 17f, 12f, 17f)
                curveTo(10f, 17f, 8.26f, 15.77f, 7.5f, 14f)
                moveTo(1f, 12f)
                curveTo(1f, 10.19f, 2.2f, 8.66f, 3.86f, 8.17f)
                curveTo(5.29f, 5.11f, 8.4f, 3f, 12f, 3f)
                curveTo(15.6f, 3f, 18.71f, 5.11f, 20.15f, 8.17f)
                curveTo(21.8f, 8.66f, 23f, 10.19f, 23f, 12f)
                curveTo(23f, 13.81f, 21.8f, 15.34f, 20.15f, 15.83f)
                curveTo(18.71f, 18.89f, 15.6f, 21f, 12f, 21f)
                curveTo(8.4f, 21f, 5.29f, 18.89f, 3.86f, 15.83f)
                curveTo(2.2f, 15.34f, 1f, 13.81f, 1f, 12f)
                moveTo(12f, 5f)
                curveTo(8.82f, 5f, 6.14f, 7.12f, 5.28f, 10f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                horizontalLineTo(5.28f)
                curveTo(6.14f, 16.88f, 8.82f, 19f, 12f, 19f)
                curveTo(15.18f, 19f, 17.86f, 16.88f, 18.72f, 14f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                horizontalLineTo(18.72f)
                curveTo(17.86f, 7.12f, 15.18f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _BabyFaceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BabyFaceOutline: ImageVector? = null
