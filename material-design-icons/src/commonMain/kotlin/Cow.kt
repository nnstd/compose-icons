package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cow: ImageVector
    get() {
        if (_Cow != null) {
            return _Cow!!
        }
        _Cow = ImageVector.Builder(
            name = "Cow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 18f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 19f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 18f)
                moveTo(13.5f, 18f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 19f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 18f)
                moveTo(10f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                moveTo(14f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                moveTo(18f, 18f)
                curveTo(18f, 20.21f, 15.31f, 22f, 12f, 22f)
                curveTo(8.69f, 22f, 6f, 20.21f, 6f, 18f)
                curveTo(6f, 17.1f, 6.45f, 16.27f, 7.2f, 15.6f)
                curveTo(6.45f, 14.6f, 6f, 13.35f, 6f, 12f)
                lineTo(6.12f, 10.78f)
                curveTo(5.58f, 10.93f, 4.93f, 10.93f, 4.4f, 10.78f)
                curveTo(3.38f, 10.5f, 1.84f, 9.35f, 2.07f, 8.55f)
                curveTo(2.3f, 7.75f, 4.21f, 7.6f, 5.23f, 7.9f)
                curveTo(5.82f, 8.07f, 6.45f, 8.5f, 6.82f, 8.96f)
                lineTo(7.39f, 8.15f)
                curveTo(6.79f, 7.05f, 7f, 4f, 10f, 3f)
                lineTo(9.91f, 3.14f)
                verticalLineTo(3.14f)
                curveTo(9.63f, 3.58f, 8.91f, 4.97f, 9.67f, 6.47f)
                curveTo(10.39f, 6.17f, 11.17f, 6f, 12f, 6f)
                curveTo(12.83f, 6f, 13.61f, 6.17f, 14.33f, 6.47f)
                curveTo(15.09f, 4.97f, 14.37f, 3.58f, 14.09f, 3.14f)
                lineTo(14f, 3f)
                curveTo(17f, 4f, 17.21f, 7.05f, 16.61f, 8.15f)
                lineTo(17.18f, 8.96f)
                curveTo(17.55f, 8.5f, 18.18f, 8.07f, 18.77f, 7.9f)
                curveTo(19.79f, 7.6f, 21.7f, 7.75f, 21.93f, 8.55f)
                curveTo(22.16f, 9.35f, 20.62f, 10.5f, 19.6f, 10.78f)
                curveTo(19.07f, 10.93f, 18.42f, 10.93f, 17.88f, 10.78f)
                lineTo(18f, 12f)
                curveTo(18f, 13.35f, 17.55f, 14.6f, 16.8f, 15.6f)
                curveTo(17.55f, 16.27f, 18f, 17.1f, 18f, 18f)
                moveTo(12f, 16f)
                curveTo(9.79f, 16f, 8f, 16.9f, 8f, 18f)
                curveTo(8f, 19.1f, 9.79f, 20f, 12f, 20f)
                curveTo(14.21f, 20f, 16f, 19.1f, 16f, 18f)
                curveTo(16f, 16.9f, 14.21f, 16f, 12f, 16f)
                moveTo(12f, 14f)
                curveTo(13.12f, 14f, 14.17f, 14.21f, 15.07f, 14.56f)
                curveTo(15.65f, 13.87f, 16f, 13f, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                curveTo(8f, 13f, 8.35f, 13.87f, 8.93f, 14.56f)
                curveTo(9.83f, 14.21f, 10.88f, 14f, 12f, 14f)
                moveTo(14.09f, 3.14f)
                verticalLineTo(3.14f)
                close()
            }
        }.build()

        return _Cow!!
    }

@Suppress("ObjectPropertyName")
private var _Cow: ImageVector? = null
