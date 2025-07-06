package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stomach: ImageVector
    get() {
        if (_Stomach != null) {
            return _Stomach!!
        }
        _Stomach = ImageVector.Builder(
            name = "Stomach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                curveTo(4.67f, 19.85f, 6.07f, 22f, 12f, 22f)
                curveTo(14.36f, 22f, 17.07f, 21.93f, 19f, 20f)
                curveTo(20f, 19f, 22f, 17f, 22f, 11f)
                reflectiveCurveTo(20f, 4f, 18f, 4f)
                curveTo(16.62f, 4f, 15f, 4f, 14f, 6f)
                verticalLineTo(6.03f)
                arcTo(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.13f, 6.95f)
                curveTo(11f, 6.81f, 11f, 6.37f, 11f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                curveTo(13f, 9f, 13f, 10.78f, 13f, 12f)
                curveTo(13f, 13.89f, 12.5f, 15.26f, 11f, 16f)
                curveTo(8.69f, 17.15f, 6.39f, 17f, 5.61f, 15.47f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.14f, 14.87f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Stomach!!
    }

@Suppress("ObjectPropertyName")
private var _Stomach: ImageVector? = null
