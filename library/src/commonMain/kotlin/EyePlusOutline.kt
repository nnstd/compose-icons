package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyePlusOutline: ImageVector
    get() {
        if (_EyePlusOutline != null) {
            return _EyePlusOutline!!
        }
        _EyePlusOutline = ImageVector.Builder(
            name = "EyePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                curveTo(7f, 4.5f, 2.73f, 7.61f, 1f, 12f)
                curveTo(2.73f, 16.39f, 7f, 19.5f, 12f, 19.5f)
                curveTo(12.36f, 19.5f, 12.72f, 19.5f, 13.08f, 19.45f)
                curveTo(13.03f, 19.13f, 13f, 18.82f, 13f, 18.5f)
                curveTo(13f, 18.14f, 13.04f, 17.78f, 13.1f, 17.42f)
                curveTo(12.74f, 17.46f, 12.37f, 17.5f, 12f, 17.5f)
                curveTo(8.24f, 17.5f, 4.83f, 15.36f, 3.18f, 12f)
                curveTo(4.83f, 8.64f, 8.24f, 6.5f, 12f, 6.5f)
                curveTo(15.76f, 6.5f, 19.17f, 8.64f, 20.82f, 12f)
                curveTo(20.7f, 12.24f, 20.56f, 12.45f, 20.43f, 12.68f)
                curveTo(21.09f, 12.84f, 21.72f, 13.11f, 22.29f, 13.5f)
                curveTo(22.56f, 13f, 22.8f, 12.5f, 23f, 12f)
                curveTo(21.27f, 7.61f, 17f, 4.5f, 12f, 4.5f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(18f, 14.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(15f)
                verticalLineTo(19.5f)
                horizontalLineTo(18f)
                verticalLineTo(22.5f)
                horizontalLineTo(20f)
                verticalLineTo(19.5f)
                horizontalLineTo(23f)
                verticalLineTo(17.5f)
                horizontalLineTo(20f)
                verticalLineTo(14.5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _EyePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyePlusOutline: ImageVector? = null
