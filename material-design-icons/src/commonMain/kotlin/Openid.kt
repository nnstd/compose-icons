package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Openid: ImageVector
    get() {
        if (_Openid != null) {
            return _Openid!!
        }
        _Openid = ImageVector.Builder(
            name = "Openid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                lineTo(11f, 3.5f)
                verticalLineTo(19.94f)
                curveTo(7f, 19.5f, 4f, 17.46f, 4f, 15f)
                curveTo(4f, 12.75f, 6.5f, 10.85f, 10f, 10.22f)
                verticalLineTo(8.19f)
                curveTo(4.86f, 8.88f, 1f, 11.66f, 1f, 15f)
                curveTo(1f, 18.56f, 5.36f, 21.5f, 11f, 21.94f)
                curveTo(11.03f, 21.94f, 11.06f, 21.94f, 11.09f, 21.94f)
                lineTo(14f, 20.5f)
                verticalLineTo(2f)
                moveTo(15f, 8.19f)
                verticalLineTo(10.22f)
                curveTo(16.15f, 10.43f, 17.18f, 10.77f, 18.06f, 11.22f)
                lineTo(16.5f, 12f)
                lineTo(23f, 13.5f)
                lineTo(22.5f, 9f)
                lineTo(20.5f, 10f)
                curveTo(19f, 9.12f, 17.12f, 8.47f, 15f, 8.19f)
                close()
            }
        }.build()

        return _Openid!!
    }

@Suppress("ObjectPropertyName")
private var _Openid: ImageVector? = null
