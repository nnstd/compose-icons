package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Oil: ImageVector
    get() {
        if (_Oil != null) {
            return _Oil!!
        }
        _Oil = ImageVector.Builder(
            name = "Oil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.5f)
                curveTo(22f, 12.5f, 24f, 14.67f, 24f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16f)
                curveTo(20f, 14.67f, 22f, 12.5f, 22f, 12.5f)
                moveTo(6f, 6f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                curveTo(11.74f, 10f, 12.39f, 10.4f, 12.73f, 11f)
                lineTo(19.24f, 7.24f)
                lineTo(22.5f, 9.13f)
                curveTo(23f, 9.4f, 23.14f, 10f, 22.87f, 10.5f)
                curveTo(22.59f, 10.97f, 22f, 11.14f, 21.5f, 10.86f)
                lineTo(19.4f, 9.65f)
                lineTo(15.75f, 15.97f)
                curveTo(15.41f, 16.58f, 14.75f, 17f, 14f, 17f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                moveTo(5f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                lineTo(16.06f, 11.43f)
                lineTo(12.6f, 13.43f)
                lineTo(11.69f, 12f)
                horizontalLineTo(5f)
                moveTo(0.38f, 9.21f)
                lineTo(2.09f, 7.5f)
                curveTo(2.5f, 7.11f, 3.11f, 7.11f, 3.5f, 7.5f)
                curveTo(3.89f, 7.89f, 3.89f, 8.5f, 3.5f, 8.91f)
                lineTo(1.79f, 10.62f)
                curveTo(1.4f, 11f, 0.77f, 11f, 0.38f, 10.62f)
                curveTo(0f, 10.23f, 0f, 9.6f, 0.38f, 9.21f)
                close()
            }
        }.build()

        return _Oil!!
    }

@Suppress("ObjectPropertyName")
private var _Oil: ImageVector? = null
