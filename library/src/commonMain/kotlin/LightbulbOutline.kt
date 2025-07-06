package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOutline: ImageVector
    get() {
        if (_LightbulbOutline != null) {
            return _LightbulbOutline!!
        }
        _LightbulbOutline = ImageVector.Builder(
            name = "LightbulbOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                curveTo(19f, 11.38f, 17.81f, 13.47f, 16f, 14.74f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                verticalLineTo(14.74f)
                curveTo(6.19f, 13.47f, 5f, 11.38f, 5f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(9f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 22f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                moveTo(12f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                curveTo(7f, 11.05f, 8.23f, 12.81f, 10f, 13.58f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(13.58f)
                curveTo(15.77f, 12.81f, 17f, 11.05f, 17f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _LightbulbOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOutline: ImageVector? = null
