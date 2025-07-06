package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Iobroker: ImageVector
    get() {
        if (_Iobroker != null) {
            return _Iobroker!!
        }
        _Iobroker = ImageVector.Builder(
            name = "Iobroker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(11.5f, 2f, 11f, 2.04f, 10.5f, 2.11f)
                verticalLineTo(4.85f)
                curveTo(11f, 4.75f, 11.5f, 4.7f, 12f, 4.7f)
                curveTo(12.5f, 4.7f, 13f, 4.75f, 13.5f, 4.85f)
                verticalLineTo(2.12f)
                curveTo(13f, 2.04f, 12.5f, 2f, 12f, 2f)
                moveTo(9.82f, 2.25f)
                curveTo(5.4f, 3.25f, 2.11f, 7.24f, 2.11f, 12f)
                curveTo(2.11f, 17.5f, 6.53f, 22f, 12f, 22f)
                curveTo(17.47f, 22f, 21.89f, 17.5f, 21.89f, 12f)
                curveTo(21.89f, 7.24f, 18.6f, 3.25f, 14.19f, 2.25f)
                verticalLineTo(5.03f)
                curveTo(17.17f, 5.96f, 19.34f, 8.73f, 19.34f, 12f)
                curveTo(19.34f, 16f, 16.05f, 19.3f, 12f, 19.3f)
                curveTo(7.96f, 19.3f, 4.67f, 16f, 4.67f, 12f)
                curveTo(4.67f, 8.73f, 6.84f, 5.96f, 9.82f, 5.03f)
                moveTo(12f, 5.45f)
                curveTo(11.5f, 5.45f, 11f, 5.5f, 10.5f, 5.62f)
                verticalLineTo(18.27f)
                curveTo(11f, 18.38f, 11.5f, 18.44f, 12f, 18.44f)
                curveTo(12.5f, 18.44f, 13f, 18.39f, 13.5f, 18.27f)
                verticalLineTo(5.62f)
                curveTo(13f, 5.5f, 12.5f, 5.45f, 12f, 5.45f)
                close()
            }
        }.build()

        return _Iobroker!!
    }

@Suppress("ObjectPropertyName")
private var _Iobroker: ImageVector? = null
