package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Airballoon: ImageVector
    get() {
        if (_Airballoon != null) {
            return _Airballoon!!
        }
        _Airballoon = ImageVector.Builder(
            name = "Airballoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 23f)
                horizontalLineTo(11f)
                moveTo(12f, 1f)
                curveTo(12.71f, 1f, 13.39f, 1.09f, 14.05f, 1.26f)
                curveTo(15.22f, 2.83f, 16f, 5.71f, 16f, 9f)
                curveTo(16f, 11.28f, 15.62f, 13.37f, 15f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                curveTo(8.38f, 13.37f, 8f, 11.28f, 8f, 9f)
                curveTo(8f, 5.71f, 8.78f, 2.83f, 9.95f, 1.26f)
                curveTo(10.61f, 1.09f, 11.29f, 1f, 12f, 1f)
                moveTo(20f, 8f)
                curveTo(20f, 11.18f, 18.15f, 15.92f, 15.46f, 17.21f)
                curveTo(16.41f, 15.39f, 17f, 11.83f, 17f, 9f)
                curveTo(17f, 6.17f, 16.41f, 3.61f, 15.46f, 1.79f)
                curveTo(18.15f, 3.08f, 20f, 4.82f, 20f, 8f)
                moveTo(4f, 8f)
                curveTo(4f, 4.82f, 5.85f, 3.08f, 8.54f, 1.79f)
                curveTo(7.59f, 3.61f, 7f, 6.17f, 7f, 9f)
                curveTo(7f, 11.83f, 7.59f, 15.39f, 8.54f, 17.21f)
                curveTo(5.85f, 15.92f, 4f, 11.18f, 4f, 8f)
                close()
            }
        }.build()

        return _Airballoon!!
    }

@Suppress("ObjectPropertyName")
private var _Airballoon: ImageVector? = null
