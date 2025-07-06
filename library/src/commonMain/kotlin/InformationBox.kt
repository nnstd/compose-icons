package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationBox: ImageVector
    get() {
        if (_InformationBox != null) {
            return _InformationBox!!
        }
        _InformationBox = ImageVector.Builder(
            name = "InformationBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(13f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 17f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _InformationBox!!
    }

@Suppress("ObjectPropertyName")
private var _InformationBox: ImageVector? = null
