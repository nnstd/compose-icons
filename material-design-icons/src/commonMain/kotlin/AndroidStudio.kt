package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AndroidStudio: ImageVector
    get() {
        if (_AndroidStudio != null) {
            return _AndroidStudio!!
        }
        _AndroidStudio = ImageVector.Builder(
            name = "AndroidStudio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
                verticalLineTo(9f)
                lineTo(14.56f, 9.44f)
                lineTo(16.2f, 12.28f)
                curveTo(17.31f, 11.19f, 18f, 9.68f, 18f, 8f)
                horizontalLineTo(20f)
                curveTo(20f, 10.42f, 18.93f, 12.59f, 17.23f, 14.06f)
                lineTo(20.37f, 19.5f)
                lineTo(20.5f, 21.72f)
                lineTo(18.63f, 20.5f)
                lineTo(15.56f, 15.17f)
                curveTo(14.5f, 15.7f, 13.28f, 16f, 12f, 16f)
                curveTo(10.72f, 16f, 9.5f, 15.7f, 8.44f, 15.17f)
                lineTo(5.37f, 20.5f)
                lineTo(3.5f, 21.72f)
                lineTo(3.63f, 19.5f)
                lineTo(9.44f, 9.44f)
                lineTo(9f, 9f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                moveTo(9.44f, 13.43f)
                curveTo(10.22f, 13.8f, 11.09f, 14f, 12f, 14f)
                curveTo(12.91f, 14f, 13.78f, 13.8f, 14.56f, 13.43f)
                lineTo(13.1f, 10.9f)
                horizontalLineTo(13.09f)
                curveTo(12.47f, 11.5f, 11.53f, 11.5f, 10.91f, 10.9f)
                horizontalLineTo(10.9f)
                lineTo(9.44f, 13.43f)
                moveTo(12f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
        }.build()

        return _AndroidStudio!!
    }

@Suppress("ObjectPropertyName")
private var _AndroidStudio: ImageVector? = null
