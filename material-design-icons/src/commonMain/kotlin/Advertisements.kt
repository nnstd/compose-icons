package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Advertisements: ImageVector
    get() {
        if (_Advertisements != null) {
            return _Advertisements!!
        }
        _Advertisements = ImageVector.Builder(
            name = "Advertisements",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                curveTo(17.9f, 7f, 17f, 7.9f, 17f, 9f)
                verticalLineTo(11f)
                curveTo(17f, 12.1f, 17.9f, 13f, 19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                curveTo(22.1f, 17f, 23f, 16.1f, 23f, 15f)
                verticalLineTo(13f)
                curveTo(23f, 11.9f, 22.1f, 11f, 21f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(9f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                curveTo(14.1f, 17f, 15f, 16.1f, 15f, 15f)
                verticalLineTo(9f)
                curveTo(15f, 7.9f, 14.1f, 7f, 13f, 7f)
                horizontalLineTo(9f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(3f, 7f)
                curveTo(1.9f, 7f, 1f, 7.9f, 1f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                curveTo(7f, 7.9f, 6.1f, 7f, 5f, 7f)
                horizontalLineTo(3f)
                moveTo(3f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Advertisements!!
    }

@Suppress("ObjectPropertyName")
private var _Advertisements: ImageVector? = null
