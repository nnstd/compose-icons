package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Facebook: ImageVector
    get() {
        if (_Facebook != null) {
            return _Facebook!!
        }
        _Facebook = ImageVector.Builder(
            name = "Facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.04f)
                curveTo(6.5f, 2.04f, 2f, 6.53f, 2f, 12.06f)
                curveTo(2f, 17.06f, 5.66f, 21.21f, 10.44f, 21.96f)
                verticalLineTo(14.96f)
                horizontalLineTo(7.9f)
                verticalLineTo(12.06f)
                horizontalLineTo(10.44f)
                verticalLineTo(9.85f)
                curveTo(10.44f, 7.34f, 11.93f, 5.96f, 14.22f, 5.96f)
                curveTo(15.31f, 5.96f, 16.45f, 6.15f, 16.45f, 6.15f)
                verticalLineTo(8.62f)
                horizontalLineTo(15.19f)
                curveTo(13.95f, 8.62f, 13.56f, 9.39f, 13.56f, 10.18f)
                verticalLineTo(12.06f)
                horizontalLineTo(16.34f)
                lineTo(15.89f, 14.96f)
                horizontalLineTo(13.56f)
                verticalLineTo(21.96f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12.06f)
                curveTo(22f, 6.53f, 17.5f, 2.04f, 12f, 2.04f)
                close()
            }
        }.build()

        return _Facebook!!
    }

@Suppress("ObjectPropertyName")
private var _Facebook: ImageVector? = null
