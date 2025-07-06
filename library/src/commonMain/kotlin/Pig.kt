package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pig: ImageVector
    get() {
        if (_Pig != null) {
            return _Pig!!
        }
        _Pig = ImageVector.Builder(
            name = "Pig",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 9f)
                moveTo(14.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 9f)
                moveTo(12f, 4f)
                lineTo(12.68f, 4.03f)
                curveTo(13.62f, 3.24f, 14.82f, 2.59f, 15.72f, 2.35f)
                curveTo(17.59f, 1.85f, 20.88f, 2.23f, 21.31f, 3.83f)
                curveTo(21.62f, 5f, 20.6f, 6.45f, 19.03f, 7.38f)
                curveTo(20.26f, 8.92f, 21f, 10.87f, 21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                curveTo(3f, 10.87f, 3.74f, 8.92f, 4.97f, 7.38f)
                curveTo(3.4f, 6.45f, 2.38f, 5f, 2.69f, 3.83f)
                curveTo(3.12f, 2.23f, 6.41f, 1.85f, 8.28f, 2.35f)
                curveTo(9.18f, 2.59f, 10.38f, 3.24f, 11.32f, 4.03f)
                lineTo(12f, 4f)
                moveTo(10f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                moveTo(14f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
                moveTo(12f, 13f)
                curveTo(9.24f, 13f, 7f, 15.34f, 7f, 17f)
                curveTo(7f, 18.66f, 9.24f, 20f, 12f, 20f)
                curveTo(14.76f, 20f, 17f, 18.66f, 17f, 17f)
                curveTo(17f, 15.34f, 14.76f, 13f, 12f, 13f)
                moveTo(7.76f, 4.28f)
                curveTo(7.31f, 4.16f, 4.59f, 4.35f, 4.59f, 4.35f)
                curveTo(4.59f, 4.35f, 6.8f, 6.1f, 7.24f, 6.22f)
                curveTo(7.69f, 6.34f, 9.77f, 6.43f, 9.91f, 5.9f)
                curveTo(10.06f, 5.36f, 8.2f, 4.4f, 7.76f, 4.28f)
                moveTo(16.24f, 4.28f)
                curveTo(15.8f, 4.4f, 13.94f, 5.36f, 14.09f, 5.9f)
                curveTo(14.23f, 6.43f, 16.31f, 6.34f, 16.76f, 6.22f)
                curveTo(17.2f, 6.1f, 19.41f, 4.35f, 19.41f, 4.35f)
                curveTo(19.41f, 4.35f, 16.69f, 4.16f, 16.24f, 4.28f)
                close()
            }
        }.build()

        return _Pig!!
    }

@Suppress("ObjectPropertyName")
private var _Pig: ImageVector? = null
