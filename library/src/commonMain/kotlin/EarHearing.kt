package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarHearing: ImageVector
    get() {
        if (_EarHearing != null) {
            return _EarHearing!!
        }
        _EarHearing = ImageVector.Builder(
            name = "EarHearing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20f)
                curveTo(16.71f, 20f, 16.44f, 19.94f, 16.24f, 19.85f)
                curveTo(15.53f, 19.5f, 15.03f, 18.97f, 14.53f, 17.47f)
                curveTo(14f, 15.91f, 13.06f, 15.18f, 12.14f, 14.47f)
                curveTo(11.35f, 13.86f, 10.53f, 13.23f, 9.82f, 11.94f)
                curveTo(9.29f, 11f, 9f, 9.93f, 9f, 9f)
                curveTo(9f, 6.2f, 11.2f, 4f, 14f, 4f)
                curveTo(16.8f, 4f, 19f, 6.2f, 19f, 9f)
                horizontalLineTo(21f)
                curveTo(21f, 5.07f, 17.93f, 2f, 14f, 2f)
                curveTo(10.07f, 2f, 7f, 5.07f, 7f, 9f)
                curveTo(7f, 10.26f, 7.38f, 11.65f, 8.07f, 12.9f)
                curveTo(9f, 14.55f, 10.05f, 15.38f, 10.92f, 16.05f)
                curveTo(11.73f, 16.67f, 12.31f, 17.12f, 12.63f, 18.1f)
                curveTo(13.23f, 19.92f, 14f, 20.94f, 15.36f, 21.65f)
                curveTo(15.87f, 21.88f, 16.43f, 22f, 17f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20f)
                moveTo(7.64f, 2.64f)
                lineTo(6.22f, 1.22f)
                curveTo(4.23f, 3.21f, 3f, 5.96f, 3f, 9f)
                curveTo(3f, 12.04f, 4.23f, 14.79f, 6.22f, 16.78f)
                lineTo(7.63f, 15.37f)
                curveTo(6f, 13.74f, 5f, 11.5f, 5f, 9f)
                curveTo(5f, 6.5f, 6f, 4.26f, 7.64f, 2.64f)
                moveTo(11.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 9f)
                close()
            }
        }.build()

        return _EarHearing!!
    }

@Suppress("ObjectPropertyName")
private var _EarHearing: ImageVector? = null
