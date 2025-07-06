package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Clippy: ImageVector
    get() {
        if (_Clippy != null) {
            return _Clippy!!
        }
        _Clippy = ImageVector.Builder(
            name = "Clippy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15.5f)
                verticalLineTo(13.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.75f, 13f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 13.75f)
                verticalLineTo(15.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15.5f)
                verticalLineTo(11.89f)
                curveTo(12.63f, 11.61f, 12f, 10.87f, 12f, 10f)
                curveTo(12f, 8.9f, 13f, 8f, 14.25f, 8f)
                curveTo(15.5f, 8f, 16.5f, 8.9f, 16.5f, 10f)
                curveTo(16.5f, 10.87f, 15.87f, 11.61f, 15f, 11.89f)
                verticalLineTo(15.5f)
                moveTo(8.25f, 8f)
                curveTo(9.5f, 8f, 10.5f, 8.9f, 10.5f, 10f)
                curveTo(10.5f, 10.87f, 9.87f, 11.61f, 9f, 11.89f)
                verticalLineTo(17.25f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.25f, 20.5f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 17.25f)
                verticalLineTo(13.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.25f, 13f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13.75f)
                verticalLineTo(17.25f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.25f, 22f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17.25f)
                verticalLineTo(11.89f)
                curveTo(6.63f, 11.61f, 6f, 10.87f, 6f, 10f)
                curveTo(6f, 8.9f, 7f, 8f, 8.25f, 8f)
                moveTo(10.06f, 6.13f)
                lineTo(9.63f, 7.59f)
                curveTo(9.22f, 7.37f, 8.75f, 7.25f, 8.25f, 7.25f)
                curveTo(7.34f, 7.25f, 6.53f, 7.65f, 6.03f, 8.27f)
                lineTo(4.83f, 7.37f)
                curveTo(5.46f, 6.57f, 6.41f, 6f, 7.5f, 5.81f)
                verticalLineTo(5.75f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.25f, 2f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.75f)
                verticalLineTo(5.81f)
                curveTo(16.09f, 6f, 17.04f, 6.57f, 17.67f, 7.37f)
                lineTo(16.47f, 8.27f)
                curveTo(15.97f, 7.65f, 15.16f, 7.25f, 14.25f, 7.25f)
                curveTo(13.75f, 7.25f, 13.28f, 7.37f, 12.87f, 7.59f)
                lineTo(12.44f, 6.13f)
                curveTo(12.77f, 6f, 13.13f, 5.87f, 13.5f, 5.81f)
                verticalLineTo(5.75f)
                curveTo(13.5f, 4.5f, 12.5f, 3.5f, 11.25f, 3.5f)
                curveTo(10f, 3.5f, 9f, 4.5f, 9f, 5.75f)
                verticalLineTo(5.81f)
                curveTo(9.37f, 5.87f, 9.73f, 6f, 10.06f, 6.13f)
                moveTo(14.25f, 9.25f)
                curveTo(13.7f, 9.25f, 13.25f, 9.59f, 13.25f, 10f)
                curveTo(13.25f, 10.41f, 13.7f, 10.75f, 14.25f, 10.75f)
                curveTo(14.8f, 10.75f, 15.25f, 10.41f, 15.25f, 10f)
                curveTo(15.25f, 9.59f, 14.8f, 9.25f, 14.25f, 9.25f)
                moveTo(8.25f, 9.25f)
                curveTo(7.7f, 9.25f, 7.25f, 9.59f, 7.25f, 10f)
                curveTo(7.25f, 10.41f, 7.7f, 10.75f, 8.25f, 10.75f)
                curveTo(8.8f, 10.75f, 9.25f, 10.41f, 9.25f, 10f)
                curveTo(9.25f, 9.59f, 8.8f, 9.25f, 8.25f, 9.25f)
                close()
            }
        }.build()

        return _Clippy!!
    }

@Suppress("ObjectPropertyName")
private var _Clippy: ImageVector? = null
