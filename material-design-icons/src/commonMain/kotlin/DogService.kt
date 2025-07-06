package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DogService: ImageVector
    get() {
        if (_DogService != null) {
            return _DogService!!
        }
        _DogService = ImageVector.Builder(
            name = "DogService",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                lineTo(17f, 11f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                lineTo(6f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                lineTo(5f, 14f)
                verticalLineTo(11f)
                lineTo(2f, 8f)
                lineTo(3f, 7f)
                lineTo(5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13f)
                horizontalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                verticalLineTo(9f)
                lineTo(14f, 8f)
                moveTo(19f, 5f)
                verticalLineTo(3f)
                lineTo(15f, 7f)
                lineTo(18f, 10f)
                lineTo(19f, 9f)
                lineTo(20f, 10f)
                lineTo(22f, 8f)
                lineTo(19f, 5f)
                moveTo(11.5f, 9.5f)
                lineTo(4.5f, 2.5f)
                curveTo(4.23f, 2.22f, 3.79f, 2.22f, 3.5f, 2.5f)
                verticalLineTo(2.5f)
                curveTo(3.22f, 2.77f, 3.22f, 3.21f, 3.5f, 3.5f)
                lineTo(10.5f, 10.5f)
                curveTo(10.77f, 10.78f, 11.21f, 10.78f, 11.5f, 10.5f)
                verticalLineTo(10.5f)
                curveTo(11.78f, 10.23f, 11.78f, 9.79f, 11.5f, 9.5f)
                close()
            }
        }.build()

        return _DogService!!
    }

@Suppress("ObjectPropertyName")
private var _DogService: ImageVector? = null
