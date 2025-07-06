package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HotTub: ImageVector
    get() {
        if (_HotTub != null) {
            return _HotTub!!
        }
        _HotTub = ImageVector.Builder(
            name = "HotTub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                moveTo(11.15f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(11.25f)
                curveTo(5f, 10f, 6f, 9f, 7.25f, 9f)
                horizontalLineTo(7.28f)
                curveTo(7.62f, 9f, 7.95f, 9.09f, 8.24f, 9.23f)
                curveTo(8.5f, 9.35f, 8.74f, 9.5f, 8.93f, 9.73f)
                lineTo(10.33f, 11.28f)
                curveTo(10.56f, 11.54f, 10.84f, 11.78f, 11.15f, 12f)
                moveTo(7f, 20f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                moveTo(11f, 20f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                moveTo(15f, 20f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(19f, 20f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                moveTo(18.65f, 5.86f)
                curveTo(19.68f, 6.86f, 20.16f, 8.21f, 19.95f, 9.57f)
                lineTo(19.89f, 10f)
                horizontalLineTo(18f)
                lineTo(18.09f, 9.41f)
                curveTo(18.24f, 8.62f, 18f, 7.83f, 17.42f, 7.21f)
                lineTo(17.35f, 7.15f)
                curveTo(16.32f, 6.14f, 15.85f, 4.79f, 16.05f, 3.43f)
                lineTo(16.11f, 3f)
                horizontalLineTo(18f)
                lineTo(17.91f, 3.59f)
                curveTo(17.76f, 4.38f, 18f, 5.17f, 18.58f, 5.79f)
                lineTo(18.65f, 5.86f)
                moveTo(14.65f, 5.86f)
                curveTo(15.68f, 6.86f, 16.16f, 8.21f, 15.95f, 9.57f)
                lineTo(15.89f, 10f)
                horizontalLineTo(14f)
                lineTo(14.09f, 9.41f)
                curveTo(14.24f, 8.62f, 14f, 7.83f, 13.42f, 7.21f)
                lineTo(13.35f, 7.15f)
                curveTo(12.32f, 6.14f, 11.85f, 4.79f, 12.05f, 3.43f)
                lineTo(12.11f, 3f)
                horizontalLineTo(14f)
                lineTo(13.91f, 3.59f)
                curveTo(13.76f, 4.38f, 14f, 5.17f, 14.58f, 5.79f)
                lineTo(14.65f, 5.86f)
                close()
            }
        }.build()

        return _HotTub!!
    }

@Suppress("ObjectPropertyName")
private var _HotTub: ImageVector? = null
