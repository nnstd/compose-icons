package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OctagramMinus: ImageVector
    get() {
        if (_OctagramMinus != null) {
            return _OctagramMinus!!
        }
        _OctagramMinus = ImageVector.Builder(
            name = "OctagramMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.12f, 12f)
                lineTo(20.63f, 13.22f)
                curveTo(20.11f, 13.08f, 19.56f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 19.56f, 13.08f, 20.11f, 13.22f, 20.63f)
                lineTo(12f, 20.12f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(15f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _OctagramMinus!!
    }

@Suppress("ObjectPropertyName")
private var _OctagramMinus: ImageVector? = null
