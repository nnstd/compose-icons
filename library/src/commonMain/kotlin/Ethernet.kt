package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ethernet: ImageVector
    get() {
        if (_Ethernet != null) {
            return _Ethernet!!
        }
        _Ethernet = ImageVector.Builder(
            name = "Ethernet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(4.38f, 3f)
                horizontalLineTo(19.63f)
                curveTo(20.94f, 3f, 22f, 4.06f, 22f, 5.38f)
                verticalLineTo(19.63f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.63f, 22f)
                horizontalLineTo(4.38f)
                curveTo(3.06f, 22f, 2f, 20.94f, 2f, 19.63f)
                verticalLineTo(5.38f)
                curveTo(2f, 4.06f, 3.06f, 3f, 4.38f, 3f)
                close()
            }
        }.build()

        return _Ethernet!!
    }

@Suppress("ObjectPropertyName")
private var _Ethernet: ImageVector? = null
