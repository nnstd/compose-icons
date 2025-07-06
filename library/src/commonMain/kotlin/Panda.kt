package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Panda: ImageVector
    get() {
        if (_Panda != null) {
            return _Panda!!
        }
        _Panda = ImageVector.Builder(
            name = "Panda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(13.74f, 3f, 15.36f, 3.5f, 16.74f, 4.35f)
                curveTo(17.38f, 3.53f, 18.38f, 3f, 19.5f, 3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.5f)
                curveTo(23f, 8f, 22.05f, 9.28f, 20.72f, 9.78f)
                curveTo(20.9f, 10.5f, 21f, 11.23f, 21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                curveTo(3f, 11.23f, 3.1f, 10.5f, 3.28f, 9.78f)
                curveTo(1.95f, 9.28f, 1f, 8f, 1f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 3f)
                curveTo(5.62f, 3f, 6.62f, 3.53f, 7.26f, 4.35f)
                curveTo(8.64f, 3.5f, 10.26f, 3f, 12f, 3f)
                moveTo(12f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(16.19f, 10.3f)
                curveTo(16.55f, 11.63f, 16.08f, 12.91f, 15.15f, 13.16f)
                curveTo(14.21f, 13.42f, 13.17f, 12.54f, 12.81f, 11.2f)
                curveTo(12.45f, 9.87f, 12.92f, 8.59f, 13.85f, 8.34f)
                curveTo(14.79f, 8.09f, 15.83f, 8.96f, 16.19f, 10.3f)
                moveTo(7.81f, 10.3f)
                curveTo(8.17f, 8.96f, 9.21f, 8.09f, 10.15f, 8.34f)
                curveTo(11.08f, 8.59f, 11.55f, 9.87f, 11.19f, 11.2f)
                curveTo(10.83f, 12.54f, 9.79f, 13.42f, 8.85f, 13.16f)
                curveTo(7.92f, 12.91f, 7.45f, 11.63f, 7.81f, 10.3f)
                moveTo(12f, 14f)
                curveTo(12.6f, 14f, 13.13f, 14.19f, 13.5f, 14.5f)
                lineTo(12.5f, 15.5f)
                curveTo(12.5f, 15.92f, 12.84f, 16.25f, 13.25f, 16.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 15f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.25f, 17.25f)
                curveTo(12.76f, 17.25f, 12.32f, 17.05f, 12f, 16.72f)
                curveTo(11.68f, 17.05f, 11.24f, 17.25f, 10.75f, 17.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 15f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.75f, 16.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 15.5f)
                lineTo(10.5f, 14.5f)
                curveTo(10.87f, 14.19f, 11.4f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _Panda!!
    }

@Suppress("ObjectPropertyName")
private var _Panda: ImageVector? = null
