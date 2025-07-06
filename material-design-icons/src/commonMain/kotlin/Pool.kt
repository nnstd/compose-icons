package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pool: ImageVector
    get() {
        if (_Pool != null) {
            return _Pool!!
        }
        _Pool = ImageVector.Builder(
            name = "Pool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                curveTo(3.67f, 14.25f, 5.33f, 13.5f, 7f, 13.17f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                curveTo(11.31f, 2f, 12.42f, 2.83f, 12.83f, 4f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 2f)
                curveTo(18.31f, 2f, 19.42f, 2.83f, 19.83f, 4f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                verticalLineTo(14.94f)
                curveTo(18f, 14.62f, 20f, 13f, 22f, 13f)
                verticalLineTo(15f)
                curveTo(19.78f, 15f, 17.56f, 17f, 15.33f, 17f)
                curveTo(13.11f, 17f, 10.89f, 15f, 8.67f, 15f)
                curveTo(6.44f, 15f, 4.22f, 16f, 2f, 17f)
                verticalLineTo(15f)
                moveTo(14f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                moveTo(14f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                curveTo(10.67f, 13.16f, 12.33f, 14.31f, 14f, 14.79f)
                verticalLineTo(12f)
                moveTo(2f, 19f)
                curveTo(4.22f, 18f, 6.44f, 17f, 8.67f, 17f)
                curveTo(10.89f, 17f, 13.11f, 19f, 15.33f, 19f)
                curveTo(17.56f, 19f, 19.78f, 17f, 22f, 17f)
                verticalLineTo(19f)
                curveTo(19.78f, 19f, 17.56f, 21f, 15.33f, 21f)
                curveTo(13.11f, 21f, 10.89f, 19f, 8.67f, 19f)
                curveTo(6.44f, 19f, 4.22f, 20f, 2f, 21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Pool!!
    }

@Suppress("ObjectPropertyName")
private var _Pool: ImageVector? = null
