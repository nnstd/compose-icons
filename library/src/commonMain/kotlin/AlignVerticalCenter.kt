package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignVerticalCenter: ImageVector
    get() {
        if (_AlignVerticalCenter != null) {
            return _AlignVerticalCenter!!
        }
        _AlignVerticalCenter = ImageVector.Builder(
            name = "AlignVerticalCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(1.8f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _AlignVerticalCenter!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalCenter: ImageVector? = null
