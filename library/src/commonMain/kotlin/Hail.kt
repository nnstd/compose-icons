package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hail: ImageVector
    get() {
        if (_Hail != null) {
            return _Hail!!
        }
        _Hail = ImageVector.Builder(
            name = "Hail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                moveTo(19f, 2.39f)
                curveTo(18.92f, 3.86f, 18.55f, 5.13f, 17.86f, 6.21f)
                curveTo(17.17f, 7.29f, 16.22f, 8f, 15f, 8.39f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(10.08f)
                curveTo(8.72f, 10.17f, 8.5f, 10.28f, 8.39f, 10.41f)
                curveTo(7.45f, 11.16f, 7f, 12.19f, 7f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(13.5f)
                curveTo(5f, 11.53f, 5.72f, 9.94f, 7.13f, 8.72f)
                curveTo(8.53f, 7.56f, 10.16f, 7f, 12f, 7f)
                curveTo(13.41f, 7f, 14.56f, 6.64f, 15.47f, 5.95f)
                curveTo(16.5f, 5.11f, 17f, 3.95f, 17f, 2.5f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(2.39f)
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _Hail!!
    }

@Suppress("ObjectPropertyName")
private var _Hail: ImageVector? = null
