package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignHorizontalCenter: ImageVector
    get() {
        if (_AlignHorizontalCenter != null) {
            return _AlignHorizontalCenter!!
        }
        _AlignHorizontalCenter = ImageVector.Builder(
            name = "AlignHorizontalCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _AlignHorizontalCenter!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalCenter: ImageVector? = null
